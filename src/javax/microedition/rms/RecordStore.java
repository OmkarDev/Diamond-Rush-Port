package javax.microedition.rms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import utils.Utils;

public class RecordStore {

	public static final int AUTHMODE_ANY = 1;
	public static final int AUTHMODE_PRIVATE = 0;

//	private String appname;

//	private static String rmsPath;

	private String rmsFile;

	private File file;

	private int version = 0;

	private int nextid = 0;

	private Vector<byte[]> records;

	private int lastModified = 0;

	private RecordStore(String recordStoreName, boolean createIfNecessary) throws Exception {
		// System.out.println("> RecordStore "+recordStoreName);

		records = new Vector<byte[]>();

		records.add(new byte[] {}); // dummy record (record ids start at 1)

		int count;
		int offset;
		int reclen;

//		name = recordStoreName;

//		rmsPath = Utils.save_folder;
		rmsFile = Utils.save_folder + "/" + recordStoreName;

		try // Check Record Store File
		{
			file = new File(rmsFile);
			if (!file.exists()) {
				if (createIfNecessary) {
					// System.out.println("> Creating New Record Store
					// "+appname+"/"+recordStoreName);
					file.createNewFile();
					version = 1;
					nextid = 1;
					count = 0;
					save();
					nextid = 1;
				} else {
					throw (new Exception("Record Store Doesn't Exist: " + rmsFile));
				}
			}
		} catch (Exception e) {
			// System.out.println("> Problem Opening Record Store (createIfNecessary
			// "+createIfNecessary+"): "+rmsFile);
			System.out.println(e.getMessage());
			throw (new Exception(
					"Problem Opening Record Store (createIfNecessary " + createIfNecessary + "): " + rmsFile));
		}

		try // Read Records
		{
			Path path = Paths.get(file.getAbsolutePath());
			byte[] data = Files.readAllBytes(path);

			if (data.length >= 4) {
				offset = 0;
				version = getUInt16(data, offset);
				offset += 2;
				nextid = getUInt16(data, offset);
				offset += 2;
				count = getUInt16(data, offset);
				offset += 2;
				for (int i = 0; i < count; i++) {
					reclen = getUInt16(data, offset);
					offset += 2;

					loadRecord(data, offset, reclen);
					offset += reclen;
				}
			}
		} catch (Exception e) {
			System.out.println("Problem Reading Record Store: " + rmsFile);
			System.out.println(e.getMessage());
			throw (new Exception("Problem Reading Record Store: " + rmsFile));
		}
	}

	private void save() {
		byte[] temp = new byte[2];
		try {
			FileOutputStream fout = new FileOutputStream(rmsFile);

			// version //
			setUInt16(temp, 0, version);
			fout.write(temp);
			// next record id //
			setUInt16(temp, 0, nextid);
			fout.write(temp);
			// record count //
			setUInt16(temp, 0, records.size() - 1);
			fout.write(temp);

			// records //
			for (int i = 1; i < records.size(); i++) {
				setUInt16(temp, 0, records.get(i).length);
				fout.write(temp);
				fout.write(records.get(i));
			}

			fout.close();
		} catch (Exception e) {
			System.out.println("Problem Saving RecordStore");
			e.printStackTrace();
		}
	}

	private void loadRecord(byte[] data, int offset, int numBytes) {
		byte[] rec = Arrays.copyOfRange(data, offset, offset + numBytes);
		if (rec == null) {
			rec = new byte[] {};
		}
		records.addElement(rec);
	}

	private int getUInt16(byte[] data, int offset) {
		int out = 0;

		out |= (((int) data[offset]) & 0xFF) << 8;
		out |= (((int) data[offset + 1]) & 0xFF);

		return out | 0x00000000;
	}

	private void setUInt16(byte[] data, int offset, int val) {
		data[offset] = (byte) ((val >> 8) & 0xFF);
		data[offset + 1] = (byte) ((val) & 0xFF);
	}

	public int addRecord(byte[] data, int offset, int numBytes) throws Exception {
		// System.out.println("> Add Record "+nextid+ " to "+name);
		System.out.println("ADDING RECORD");
		try {
			byte[] rec = Arrays.copyOfRange(data, offset, offset + numBytes);
			records.addElement(rec);

			lastModified = nextid;
			nextid++;
			version++;

			save();
			return lastModified;
		} catch (Exception e) {
			// System.out.println("> Add Record Failed");
			throw (new Exception("Can't Add RMS Record"));
		}
	}

	public void closeRecordStore() {
		System.out.println("CLOSING RECORD");
	}

	public void deleteRecord(int recordId) {
		version++;
		// System.out.println("> Delete Record");
		records.set(recordId, new byte[] {});
		save();
	}

	public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("OPENING RECORD " + recordStoreName);

		return new RecordStore(recordStoreName, createIfNecessary);
	}

	public int getNextRecordID() {
		// System.out.println("> getNextRecordID");
		return nextid;
	}

	public int getNumRecords() {
		// System.out.println("> getNumRecords");
		int count = 0;
		for (int i = 1; i < records.size(); i++) // count deleted records
		{
			if (records.get(i).length == 0) {
				count++;
			}
		}
		count = records.size() - (1 + count);
		if (count < 0) {
			count = 0;
		}
		return count;
	}

	public byte[] getRecord(int recordId) throws Exception {
		System.out.println("> getRecord(" + recordId + ")");
		if (recordId >= records.size()) {
			// System.out.println("getRecord Invalid RecordId "+recordId);
			throw (new Exception("(A) Invalid Record ID: " + recordId));
		}
		try {
			byte[] t = records.get(recordId);
			if (t.length == 0) {
				return null;
			}
			return t;
		} catch (Exception e) {
			System.out.println("(getRecord) Record Store Exception: " + recordId);
			e.printStackTrace();
			throw (new Exception());
		}
	}

	public int getRecord(int recordId, byte[] buffer, int offset) throws Exception {
		System.out.println("> getRecord(id, buffer, offset)");
		byte[] temp = getRecord(recordId);

		if (temp == null) {
			return 0;
		}

		int len = temp.length;

		while (offset + len > buffer.length) {
			len--;
		}

		for (int i = 0; i < len; i++) {
			buffer[offset + i] = temp[i];
		}
		return len;
	}

	public void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws Exception {
		System.out.println("SETTING RECORD");
		// System.out.println("> Set Record "+recordId+" in "+name);
		if (recordId >= records.size()) {
			throw (new Exception("(C) Invalid Record ID: " + recordId));
		}
		try {
			byte[] rec = Arrays.copyOfRange(newData, offset, offset + numBytes);
			records.set(recordId, rec);
		} catch (Exception e) {
			System.out.println("Problem in Set Record");
			e.printStackTrace();
		}
		lastModified = recordId;
		save();
	}

}
