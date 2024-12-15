import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e {
	public static Image[] a_Image_Array;
	public static a a_a;
	public static a b_a;
	public static String[] a_String_Array;
	public static String[] b_String_Array;
	public static int a_int;
	public static int b_int;
	public static int c_int;
	public boolean a_boolean;
	public int d_int;

	public e() {
		a_Image_Array = new Image[5];
		a_String_Array = new String[5];
	}

	private static void a_void_String(String string) {
		if (string != null) {
			try {
				if (i.a_GloftDIRU.platformRequest(string)) {
					i.a_GloftDIRU.destroyApp(true);
				}
			} catch (Exception var2) {
				var2.printStackTrace();
			}
		}
	}

	public static void a_void() {
		b_a = i.a_a_Array[41];
		b_a.e_int = 1;
		a_a = i.a_a_String_int("/tips.f", 0);
		if (b_String_Array == null) {
			b_String_Array = i.a_String_Array_String_int("/lang_IGA.f", 15);
			b_String_Array[7] = i.a_String_String_int(b_String_Array[7], 170);
			b_String_Array[8] = i.a_String_String_int(b_String_Array[8], 170);
			b_String_Array[9] = i.a_String_String_int(b_String_Array[9], 170);
		}

		int var3 = 10;

		for (int var1 = 0; var3 <= 14; var1++) {
			a_String_Array[var1] = i.a_GloftDIRU.getAppProperty(b_String_Array[var3]);
			if (a_String_Array[var1] != null
					&& (a_String_Array[var1].compareTo("no") == 0 || a_String_Array[var1].compareTo("") == 0)) {
				a_String_Array[var1] = null;
			}

			var3++;
		}

		b_String_Array[3] = b_String_Array[3] + "\n\u0001\u0001" + b_String_Array[4] + "\n\u0001\u0000"
				+ b_String_Array[5];
		b_String_Array[7] = new String("\u0001\u0000" + b_String_Array[7]);

		try {
			for (int var4 = 0; var4 < 4; var4++) {
				a_Image_Array[var4] = Image.createImage("/ad" + (var4 + 1));
			}

			i.a_g_Array[0] = new g(i.a_a_String_int("/ui.f", 0), 0, 0, null);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		a_int = 0;
		i.b_void_int(3);
	}

	private static void a_void_int(int integer) {
		a_int += integer;
		if (a_int == 3 && a_String_Array[a_int] == null) {
			a_int += integer;
		}

		byte var10000;
		if (a_int < 0) {
			var10000 = 4;
		} else {
			if (a_int != 5) {
				return;
			}

			var10000 = 0;
		}

		a_int = var10000;
	}

	private static void a_void_Graphics_int(Graphics graphics, int integer) {
		if (e.a_String_Array[e.a_int] == null) {
			return;
		}
		if (e.b_int % 30 < 15) {
			return;
		}
		String[] array;
		int n;
		if (e.a_int >= 3) {
			array = e.b_String_Array;
			n = 8;
		} else {
			array = e.b_String_Array;
			n = 9;
		}
		String string3 = array[n];
		e.b_a.a_void_String(string3);
		int integer4 = a.c_int + 2;
		int integer5 = e.b_a.a_int_String(string3);
		int n3;
		int n4;
		if (integer != 0) {
			n3 = 320 + integer >> 1;
			n4 = (integer5 >> 1) + 4;
		} else {
			n3 = 160;
			n4 = integer5 >> 1;
		}
		int integer6 = n3 - n4;
		graphics.setClip(0, 0, 240, 320);
		graphics.setColor(16711680);
		graphics.fillRect(120 - (integer4 >> 1) - 4, integer6 - 4, integer4 + 8, integer5 + 8);
		e.b_a.b_void_Graphics_String_int_int_int(graphics, string3, 120, integer6, 1);
	}

	private static void b_void_Graphics(Graphics graphics) {
		byte var10 = 99;
		short var12 = 189;
		graphics.setClip(0, 0, 240, 320);

		for (int var13 = 0; var13 < 16; var13++) {
			graphics.setColor(var10 << 16 | 0 | var12);
			graphics.fillRect(0, 160 + 160 * var13 / 16, 240, 21);
			graphics.fillRect(0, 160 - 160 * (var13 + 1) / 16, 240, 21);
			var10 -= 4;
			var12 -= 8;
		}
	}

	public final void a_void_Graphics(Graphics graphics) {
		b_void_Graphics(graphics);
		int var2 = 0;
		if (a_int != 3) {
			g var3 = i.a_g_Array[0];
			(var3).a_a.a_void_Graphics_int_int_int_int_int_int(graphics, 11, 120, 15, 0, 0, 0);
		}

		int var10000;
		switch (a_int) {
		case 3:
			graphics.drawImage(a_Image_Array[a_int], 120, 15, 17);
			b_a.b_void_Graphics_String_int_int_int(graphics, b_String_Array[3], 120, 160, 3);
			b_a.a_void_String(b_String_Array[3]);
			var10000 = 160 + (a.d_int >> 1) + 4;
			break;
		case 4:
			b_a.b_void_Graphics_String_int_int_int(graphics, "\n\u0001\u0002" + b_String_Array[6], 120, 35, 17);
			b_a.b_void_Graphics_String_int_int_int(graphics, b_String_Array[7], 120, 150, 3);
			b_a.a_void_String(b_String_Array[7]);
			var10000 = 160 + (a.d_int >> 1) + 4;
			break;
		default:
			graphics.drawImage(a_Image_Array[a_int], 120, 240, 33);
			b_a.b_void_Graphics_String_int_int_int(graphics, b_String_Array[a_int], 120, 242, 17);
			var10000 = 0;
		}

		var2 = var10000;
		i.a_i.a_void();
		if (a_String_Array[a_int] != null) {
			i.a_i.b_void();
		}

		a_void_Graphics_int(graphics, var2);
		if (i.a_boolean_int(16388)) {
			a_void_int(-1);
		} else if (i.a_boolean_int(65544)) {
			a_void_int(1);
		} else if (i.a_boolean_int(32944)) {
			a_void_String(a_String_Array[a_int]);
		} else if (i.a_boolean_int(64)) {
			i.a_i.a_void_int(0);
			c_int = 2;
			i.W_int = 0;
		}

		a_a.a_void_Graphics_int_int_int_int_int_int_int(graphics, i.a_boolean_int(16388) ? 2 : 0,
				b_int % a_a.a_int_int(0), 20 + this.d_int, 160, 0, 0, 0);
		a_a.a_void_Graphics_int_int_int_int_int_int_int(graphics, i.a_boolean_int(65544) ? 3 : 1,
				b_int % a_a.a_int_int(1), 220 - this.d_int, 160, 0, 0, 0);
		this.d_int = this.d_int + (this.a_boolean ? -1 : 1);
		if (this.d_int > 3 || this.d_int < 1) {
			this.a_boolean = !this.a_boolean;
		}

		i.W_int = 0;
	}

	public static void b_void() {
		int var1 = a_Image_Array.length;

		for (int var2 = 0; var2 < var1; var2++) {
			a_Image_Array[var2] = null;
		}

		a_Image_Array = null;
		var1 = a_String_Array.length;

		for (int var3 = 0; var3 < var1; var3++) {
			a_String_Array[var3] = null;
		}

		a_String_Array = null;
		var1 = b_String_Array.length;

		for (int var4 = 0; var4 < var1; var4++) {
			b_String_Array[var4] = null;
		}

		b_String_Array = null;
		b_a = null;
		a_a = null;
		c_int = 0;
		System.gc();
	}
}
