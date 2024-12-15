import javax.microedition.lcdui.Graphics;

public final class b {
	public static byte[][] a_byte_2d_Array;
	public static byte a_byte = 0;
	public static byte b_byte = 4;
	public static int a_int = 0;
	public static byte[][] b_byte_2d_Array;
	public static byte c_byte = 0;
	public static byte d_byte = 2;
	public static boolean a_boolean = false;
	public static int b_int = 0;

	public static void a_void_int(int integer) {
		a_byte = (byte)(a_byte + b_byte);
		if (a_byte > 24) {
			a_byte = 0;

			for (int var1 = 12; var1 >= 1; var1--) {
				for (int var2 = 0; var2 < 12; var2++) {
					a_byte_2d_Array[var2][var1] = a_byte_2d_Array[var2][var1 - 1];
				}
			}

			b_void_int(integer);
		}

		if (a_boolean) {
			c_byte = (byte)(c_byte + d_byte);
			if (c_byte > 24) {
				c_byte = 0;

				for (int var3 = 12; var3 >= 1; var3--) {
					for (int var4 = 0; var4 < 12; var4++) {
						b_byte_2d_Array[var4][var3] = b_byte_2d_Array[var4][var3 - 1];
					}
				}

				b_void_int(integer);
			}
		}
	}

	public static void b_void_int(int integer) {
		for (int var1 = 0; var1 < 12; var1++) {
			a_byte_2d_Array[var1][0] = 0;
		}

		if (a_boolean) {
			for (int var4 = 0; var4 < 12; var4++) {
				b_byte_2d_Array[var4][0] = 0;
			}
		}

		int var2 = 0;

		for (int var3 = 0; var3 < integer; var3++) {
			int var5;
			do {
				var5 = d.getRandomInteger(0, 12);
			} while (a_byte_2d_Array[var5][0] != 0);

			var2 = d.getRandomInteger(1, 3);
			a_byte_2d_Array[var5][0] = (byte)var2;
		}

		if (a_boolean) {
			for (int var9 = 0; var9 < integer; var9++) {
				int var6;
				do {
					var6 = d.getRandomInteger(0, 12);
				} while (b_byte_2d_Array[var6][0] != 0);

				var2 = d.getRandomInteger(1, 3);
				b_byte_2d_Array[var6][0] = (byte)var2;
			}
		}
	}

	public static void a_void_Graphics(Graphics graphics) {
		for (int var1 = 0; var1 < 12; var1++) {
			for (int var2 = 0; var2 < 13; var2++) {
				a var10000;
				int var10002;
				if (a_byte_2d_Array[var1][var2] == 1) {
					var10000 = i.a_a_Array[i.a_int_int(2)];
					var10002 = a_int;
				} else {
					if (a_byte_2d_Array[var1][var2] != 2) {
						continue;
					}

					var10000 = i.a_a_Array[i.a_int_int(2)];
					var10002 = 0;
				}

				var10000.a_void_Graphics_int_int_int_int_int_int(graphics, var10002, var1 * 24, (var2 - 1) * 24 + a_byte, 0, 0, 0);
			}
		}

		if (a_boolean) {
			for (int var3 = 0; var3 < 12; var3++) {
				for (int var4 = 0; var4 < 13; var4++) {
					if (b_byte_2d_Array[var3][var4] == 1 || b_byte_2d_Array[var3][var4] == 2) {
						i.a_a_Array[i.a_int_int(2)].a_void_Graphics_int_int_int_int_int_int(graphics, 0, var3 * 24, (var4 - 1) * 24 + c_byte, 0, 0, 0);
					}
				}
			}
		}

		a_int = (a_int + 1) % b_int;
	}
}
