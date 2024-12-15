import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

import utils.Utils;

public final class h implements Runnable, PlayerListener {
	public static int a_int = -1;
	public static int b_int = -1;
	public static int c_int;
	public static int d_int;
	public static int e_int = -1;
	public long a_long = 0L;
	public static Player[] a_Player_Array;
	public static boolean a_boolean;
	public static boolean b_boolean;
	public static boolean c_boolean = false;
	public ByteArrayInputStream a_ByteArrayInputStream;
	public InputStream a_InputStream;
	public byte[] a_byte_Array;
	public Thread a_Thread;

	public final void a_void_int(int integer) {
		if (a_Player_Array == null) {
			a_Player_Array = new Player[21];
		}

		try {
			byte[] var3 = new byte[i.a_int_byte_Array_int(this.a_byte_Array, integer * 8 + 4)];
			this.a_InputStream.read(var3);
			this.a_ByteArrayInputStream = new ByteArrayInputStream(var3);
			a_Player_Array[integer] = Manager.createPlayer(this.a_ByteArrayInputStream, "audio/midi");
			a_Player_Array[integer].addPlayerListener(this);
			a_Player_Array[integer].realize();
			((VolumeControl) a_Player_Array[integer].getControl("VolumeControl")).setLevel(100);
			this.a_ByteArrayInputStream.close();
			this.a_ByteArrayInputStream = null;
			System.gc();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public final void a_void() {
		b_boolean = false;
		this.a_Thread = new Thread(this);
		this.a_Thread.setPriority(1);
		this.a_Thread.start();
	}

	public final void b_void() {
		if (a_Player_Array == null) {
			try {
				System.out.println("snd.f loaded");
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/snd.f"));
				this.a_InputStream.skip(1L);
				this.a_byte_Array = new byte[168];
				this.a_InputStream.read(this.a_byte_Array);
				return;
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public final void c_void() {
		try {
			a_int = -1;
			e_int = -1;
			c_int = 0;
			this.a_InputStream.close();
			this.a_InputStream = null;
			this.a_byte_Array = null;
			System.gc();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public final void d_void() {
		if (a_Player_Array != null) {
			this.e_void();
			int var1 = a_Player_Array.length;
			for (int var2 = 0; var2 < var1; var2++) {
				if (a_Player_Array[var2] != null) {
					a_Player_Array[var2].close();
					a_Player_Array[var2] = null;
				}
			}
		}

		a_Player_Array = null;
		b_boolean = true;
	}

	private static int a_int_int(int integer) {
		switch (integer) {
		case 0:
		case 5:
		case 6:
		case 10:
		case 14:
			return 10;
		case 1:
		case 2:
		case 4:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			return 30;
		case 3:
		case 7:
		case 8:
		case 9:
		case 11:
		case 12:
		case 13:
			return 20;
		default:
			return 0;
		}
	}

	private static boolean a_boolean_int(int integer) {
		switch (integer) {
		case 0:
		case 5:
		case 6:
		case 7:
		case 8:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14: {
			return false;
		}
		default: {
			return true;
		}
		}
	}

	public final synchronized void run() {
		while (!b_boolean) {
			try {
				this.wait();
			} catch (Exception exception) {
				exception.printStackTrace();
			}

			if (c_boolean) {
				try {
					if (a_boolean_int(a_int)) {
						a_Player_Array[a_int].deallocate();
						e_int = -1;
					}
					a_int = -1;
					c_boolean = false;
				} catch (Exception exception) {
					exception.printStackTrace();
				} finally {
					c_int = 0;
				}
			}

			if (b_int != -1) {
				try {
					if (e_int != -1 && b_int != e_int) {
						a_Player_Array[e_int].deallocate();
						e_int = -1;
					}

					if (e_int == -1) {
						a_Player_Array[b_int].prefetch();
						e_int = b_int;
					}
					a_Player_Array[b_int].start();
					a_int = b_int;
					c_int = d_int;
					this.a_long = System.currentTimeMillis();
				} catch (Exception exception) {
					exception.printStackTrace();
				} finally {
					b_int = -1;
				}
			}
		}
	}

	public final synchronized void b_void_int(int integer) {
		if (a_boolean) {
			if (a_int != -1) {
				if (c_int >= a_int_int(integer)
						&& (c_int != a_int_int(integer) || Math.abs(System.currentTimeMillis() - this.a_long) <= 50L)) {
					return;
				}
				c_boolean = true;
			} else {
				c_int = 0;
			}

			int var2 = a_int_int(integer);
			if ((var2) >= c_int) {
				b_int = integer;
				d_int = var2;
				this.notify();
			}
		}
	}

	public final synchronized void e_void() {
		if (a_int != -1) {
			c_boolean = true;
		}

		this.notify();
	}

	public static synchronized boolean a_boolean() {
		return a_int != -1;
	}

	public final void playerUpdate(Player player, String string, Object object) {
		if (a_Player_Array != null && a_int != -1 && string.equals("endOfMedia")) {
			this.e_void();
		}
	}
}
