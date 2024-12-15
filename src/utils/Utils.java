package utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {
	public static final int SCALE = 3;
	public static final int WIDTH = 240;
	public static final int HEIGHT = 320;

	public static String jar_folder = null;
	public static String save_folder = null;
	
	public static <T> void print(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void print(byte[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void printAsChar(byte[] arr) {
		for (int i = 0; i < arr.length; i++) {
			char c = (char) arr[i];
			if (Character.isLetter(c) || c == ' ') {
				System.out.print(c);
			}
		}
		System.out.println();
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static BufferedImage deepCopy(BufferedImage original) {
		BufferedImage copy = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
		Graphics2D g = copy.createGraphics();
		g.drawImage(original, 0, 0, null);
		g.dispose();
		return copy;
	}

	public static void printInHex(byte[] var1) {
		for (int i = 0; i < var1.length; i++) {
			System.out.print(Integer.toHexString(var1[i]) + " ");
		}
		System.out.println();

	}

	public static InputStream deepCopy(InputStream inputStream) throws IOException {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[4];
		int bytesRead;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			byteArrayOutputStream.write(buffer, 0, bytesRead);
		}
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
	}
}
