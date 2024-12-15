import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.microedition.lcdui.Graphics;

import utils.Utils;

public final class c {
	public static long a_long = 1000L;
	public static String a_String = "/demoSpr.bin";
	public static String b_String = "/demo.f";
	public static a[] a_a_Array = null;
	public byte[][] a_byte_2d_Array = (byte[][]) null;
	public int a_int = 0;
	public long b_long;
	public byte[] a_byte_Array = null;
	public int b_int;
	public boolean a_boolean = false;
	public int c_int = 0;
	public int d_int = 0;
	public int e_int = 0;
	public int f_int = 0;
	public int g_int = -1;
	public boolean b_boolean = false;
	public i a_i = null;
	public final short[] a_short_Array = new short[16];
	public int h_int;

	public c(i i) {
		this.a_i = i;
	}

	private void a_void_Graphics_byte_Array_int(Graphics graphics, byte[] arr, int integer) {
		if (arr != null) {
			byte var13;
			switch (var13 = arr[integer + 0]) {
			case 1:
				int var45 = this.b_int;
				short var29 = (short) i.a_int_byte_Array_int(arr, integer + 2);
				short var32 = (short) i.a_int_byte_Array_int(arr, integer + 4);
				short var41 = (short) i.a_int_byte_Array_int(arr, integer + 6);
				short var35 = (short) i.a_int_byte_Array_int(arr, integer + 8);
				short var37 = (short) i.a_int_byte_Array_int(arr, integer + 10);
				if (var35 == 10000) {
					var35 = (short) this.a_i.at_int;
				}

				if (var37 == 10000) {
					var37 = (short) this.a_i.au_int;
				}

				if (var45 > var41) {
					var45 = var41;
				}

				int var19;
				int var20;
				label97: {
					var29 = (short) (var29 - 108);
					var32 = (short) (var32 - 118);
					this.a_i.at_int = (short) ((var29 * var45 + var35 * (var41 - var45)) / var41);
					this.a_i.au_int = (short) ((var32 * var45 + var37 * (var41 - var45)) / var41);
					var19 = this.a_i.av_int * 24 - 240;
					var20 = this.a_i.aw_int * 24 - 320 + 60;
					i var10000;
					int var10001;
					if (this.a_i.at_int > var19) {
						var10000 = this.a_i;
						var10001 = var19;
					} else {
						if (this.a_i.at_int >= 0) {
							break label97;
						}

						var10000 = this.a_i;
						var10001 = 0;
					}

					var10000.at_int = var10001;
				}

				label91: {
					i var50;
					int var51;
					if (this.a_i.au_int > var20) {
						var50 = this.a_i;
						var51 = var20;
					} else {
						if (this.a_i.au_int >= 0) {
							break label91;
						}

						var50 = this.a_i;
						var51 = 0;
					}

					var50.au_int = var51;
				}

				this.a_i.ar_int = this.a_i.at_int;
				this.a_i.as_int = this.a_i.au_int;
				if (this.a_i.ar_int > var19) {
					this.a_i.ar_int -= var19;
				}

				if (this.a_i.as_int > var20) {
					this.a_i.as_int = var20;
					return;
				}

				if (this.a_i.as_int < 0) {
					return;
				}
				break;
			case 2:
				i.a_a_Array[41].e_int = 2;
				short var39 = (short) i.a_int_byte_Array_int(arr, integer + 6);
				short var38;
				if ((var38 = (short) i.a_int_byte_Array_int(arr, integer + 4)) == 10000) {
					var38 = -240;
				}

				int var23 = arr[integer + 8] & 255;
				int var48 = arr[integer + 9] & 255;
				int var24 = var23 * i.a_int_a(i.a_a_Array[41]) + 4 - 2;
				i.a_void_Graphics_int_int_int_int_int_int(graphics, var38, var39, 226, var24, 73, 0);
				String var49 = null;

				try {
					var49 = new String(arr, integer + 11, (short) i.a_int_byte_Array_int(arr, integer + 2),
							"ISO-8859-1");
				} catch (Exception exception) {
					exception.printStackTrace();
				}

				this.a_void_String_int(var49, 222);
				this.a_void_Graphics_String_int_int_int_int(graphics, var49, var38 + 2, var39 + 2, var48,
						var48 + var23);
				if (i.aO_int / 2 % 4 < 2) {
					graphics.drawImage(i.b_Image_2d_Array[0][9], var38 + 226 - 10, var39 + var24 - 5, 17);
				}

				graphics.setClip(0, 0, 240, 320);
				break;
			case 4:
				int var44 = this.b_int;
				short var34 = (short) i.a_int_byte_Array_int(arr, integer + 2);
				short var36 = (short) i.a_int_byte_Array_int(arr, integer + 4);
				short var28 = (short) i.a_int_byte_Array_int(arr, integer + 6);
				short var31 = (short) i.a_int_byte_Array_int(arr, integer + 6);
				short var40 = (short) i.a_int_byte_Array_int(arr, integer + 14);
				if (var44 > var40) {
					var44 = var40;
				}

				short var8 = (short) ((var28 * var44 + var34 * (var40 - var44)) / var40);
				short var9 = (short) ((var31 * var44 + var36 * (var40 - var44)) / var40);
				short var11 = (short) i.a_int_byte_Array_int(arr, integer + 10);
				short var12 = (short) i.a_int_byte_Array_int(arr, integer + 12);
				a_a_Array[var11].a_void_Graphics_int_int_int_int_int_int(graphics, var12, var8, var9, 0, 0, 0);
				return;
			case 12:
				int var43 = this.b_int;
				graphics.setColor(16777215);
				if (var43 > 5) {
					var43 = 5;
				}

				int var15 = this.a_i.aP_int * 24;
				int var16 = this.a_i.aQ_int * 24;
				int var46 = this.c_int;
				int var47 = this.d_int;
				graphics.fillRect(((var15 - this.a_i.ar_int) * (5 - var43) + var46 * var43) / 5,
						((var16 - this.a_i.as_int) * (5 - var43) + var47 * var43) / 5, 102 * var43 / 5, 38 * var43 / 5);
				return;
			case 13:
				int var42 = this.b_int;
				short var4 = (short) i.a_int_byte_Array_int(arr, integer + 2);
				short var5 = (short) i.a_int_byte_Array_int(arr, integer + 4);
				short var10 = (short) i.a_int_byte_Array_int(arr, integer + 6);
				short var6 = (short) i.a_int_byte_Array_int(arr, integer + 8);
				short var7 = (short) i.a_int_byte_Array_int(arr, integer + 10);
				if (var42 > var10) {
					var42 = var10;
				}

				short var17 = (short) ((var4 * var42 + var6 * (var10 - var42)) / var10);
				short var18 = (short) ((var5 * var42 + var7 * (var10 - var42)) / var10);
				if (var13 == 13) {
					this.c_int = var17;
					this.d_int = var18;
					return;
				}
				break;
			case 18:
				if (arr[integer + 7] != 0) {
					int var14 = (arr[integer + 3] & 255) + ((arr[integer + 3 + 1] & 255) << 8)
							+ ((arr[integer + 3 + 2] & 255) << 16);
					graphics.setColor(var14);
					graphics.fillRect(0, 0, 240, 320);
					return;
				}
				break;
			case 27:
				i.a_a_Array[41].e_int = 2;
				int var21 = arr[integer + 6] & 255;
				i.a_void_Graphics_int_int_int_int_int_int_int_int(graphics, 6, 239, 226, 35, 73, 1,
						i.a_int_a_String_int(i.a_a_Array[41], i.a_String_Array[70], 0) + 10, 15);
				String var22 = null;

				try {
					var22 = new String(arr, integer + 8, (short) i.a_int_byte_Array_int(arr, integer + 2),
							"ISO-8859-1");
				} catch (Exception exception) {
					exception.printStackTrace();
				}

				this.a_void_String_int(var22, 196);
				this.a_void_Graphics_String_int_int_int_int(graphics, var22, 22, 241, var21, var21 + 2);
				i.a_a_Array[41].a_void_Graphics_String_int_int_int(graphics, i.a_String_Array[70], 19, 221, 20);
				if (i.aO_int / 2 % 4 < 2) {
					graphics.drawImage(i.b_Image_2d_Array[0][9], 223, 230, 17);
					return;
				}
			}
		}
	}

	private void a_void_byte_Array_int(byte[] arr, int integer) {
		short var3 = (short) arr[integer + 0];
		switch (var3) {
		case 2:
			String var10 = null;

			try {
				var10 = new String(arr, integer + 11, (short) i.a_int_byte_Array_int(arr, integer + 2), "ISO-8859-1");
			} catch (Exception exception) {
				exception.printStackTrace();
			}

			this.a_void_String_int(var10, 222);
			short var11 = (short) (arr[integer + 9] & 255);
			short var12 = (short) (arr[integer + 8] & 255);
			byte[] var10000;
			int var10001;
			byte var10002;
			if (var11 + var12 >= this.h_int) {
				var10000 = arr;
				var10001 = integer + 10;
				var10002 = 1;
			} else {
				var10000 = arr;
				var10001 = integer + 9;
				var10002 = (byte) (var11 + var12);
			}

			var10000[var10001] = var10002;
		default:
			return;
		case 7:
			arr[integer + 1] = 1;
			return;
		case 27:
			if (!i.D_boolean) {
				String var4 = null;

				try {
					var4 = new String(arr, integer + 8, (short) i.a_int_byte_Array_int(arr, integer + 2), "ISO-8859-1");
				} catch (Exception exception) {
					exception.printStackTrace();
				}

				this.a_void_String_int(var4, 196);
				short var5 = (short) (arr[integer + 6] & 255);
				if (var5 + 2 >= this.h_int) {
					arr[integer + 7] = 1;
				} else {
					arr[integer + 6] = (byte) (var5 + 2);
				}
			}
		}
	}

	public final void a_void() {
		if (this.a_byte_Array != null) {
			if (Math.abs(this.b_long - System.currentTimeMillis()) >= a_long) {
				if (this.a_byte_Array[0] == 0) {
					byte var1 = this.a_byte_Array[1];
					int var2 = 2 + var1 * 4;

					for (int var3 = 0; var3 < var1; var3++) {
						int var4 = i.b_int_byte_Array_int(this.a_byte_Array, 2 + var3 * 4);
						this.a_void_byte_Array_int(this.a_byte_Array, var2);
						var2 += var4;
					}
				} else {
					this.a_void_byte_Array_int(this.a_byte_Array, 0);
				}
			}
		}
	}

	public final void a_void_Graphics(Graphics graphics) {
		if (!this.b_boolean) {
			switch (this.a_byte()) {
			case 25:
			case 26:
				if (this.a_byte_2d_Array == null || this.a_int >= this.a_byte_2d_Array.length) {
					return;
				}
				break;
			default:
				graphics.setColor(0);
				graphics.fillRect(0, 0, 240, 42);
				graphics.fillRect(0, 278, 240, 42);
				i.a_a_Array[41].a_void_Graphics_String_int_int_int(graphics, i.a_String_Array[53], 5, 315, 36);
			}

			if (this.a_byte_Array[0] == 0) {
				byte var2 = this.a_byte_Array[1];
				int var3 = 2 + var2 * 4;

				for (int var4 = 0; var4 < var2; var4++) {
					int var5 = i.b_int_byte_Array_int(this.a_byte_Array, 2 + var4 * 4);
					this.a_void_Graphics_byte_Array_int(graphics, this.a_byte_Array, var3);
					var3 += var5;
				}
			} else {
				this.a_void_Graphics_byte_Array_int(graphics, this.a_byte_Array, 0);
			}

			if (this.a_boolean) {
				graphics.setColor(0);
				graphics.fillRect(this.c_int - 3, this.d_int - 3, 109, 45);
				a_a_Array[this.f_int].a_void_Graphics_int_int_int_int_int_int_int(graphics, 0,
						this.b_int % a_a_Array[this.f_int].a_int_int(0), this.c_int, this.d_int, 0, 0, 0);
				a_a_Array[0].a_void_Graphics_int_int_int_int_int_int(graphics, this.e_int, this.c_int + 0, this.d_int,
						0, 0, 0);
				if (this.g_int >= 0) {
					a_a_Array[1].a_void_Graphics_int_int_int_int_int_int(graphics, this.g_int, this.c_int + 90,
							this.d_int + -6, 0, 0, 0);
				}
			}
		}
	}

	public final byte[] a_byte_Array() {
		this.a_void_byte_2d_Array(this.a_byte_2d_Array);
		this.a_boolean = false;
		this.c_int = 0;
		this.d_int = 0;
		this.e_int = 0;
		this.f_int = 0;
		this.g_int = -1;
		this.b_boolean = false;
		this.a_int = 0;
		this.b_long = System.currentTimeMillis();
		return this.b_byte_Array();
	}

	private void b_void_byte_Array_int(byte[] arr, int integer) {
		if (arr[integer + 0] != 0) {
			arr[integer + 1] = 0;
			byte[] var10000;
			int var10001;
			byte var10002;
			switch (arr[integer + 0]) {
			case 2:
				arr[integer + 9] = 0;
				a_void_byte_Array_int_short(arr, integer + 4, (short) -240);
				var10000 = arr;
				var10001 = integer;
				var10002 = 10;
				break;
			case 27:
				arr[integer + 6] = 0;
				a_void_byte_Array_int_short(arr, integer + 4, (short) -240);
				var10000 = arr;
				var10001 = integer;
				var10002 = 7;
				break;
			default:
				return;
			}

			var10000[var10001 + var10002] = 0;
		} else {
			byte var3 = arr[integer + 1];
			int var4 = integer + 2 + var3 * 4;

			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = i.b_int_byte_Array_int(arr, integer + 2 + var5 * 4);
				this.b_void_byte_Array_int(arr, var4);
				var4 += var6;
			}
		}
	}

	private void a_void_byte_2d_Array(byte[][] arr) {
		for (int var2 = 0; var2 < arr.length; var2++) {
			this.b_void_byte_Array_int(arr[var2], 0);
		}
	}

	public final byte[] b_byte_Array() {
		this.b_int = 0;
		c var10000;
		byte[] var10001;
		if (this.a_byte_2d_Array != null && this.a_int < this.a_byte_2d_Array.length) {
			var10000 = this;
			var10001 = this.a_byte_2d_Array[this.a_int++];
		} else {
			var10000 = this;
			var10001 = null;
		}

		var10000.a_byte_Array = var10001;
		return this.a_byte_Array;
	}

	public final void b_void() {
		if (this.a_byte_Array[0] == 0) {
			byte var1 = this.a_byte_Array[1];
			int var2 = 2 + var1 * 4;

			for (int var3 = 0; var3 < var1; var3++) {
				int var4 = i.b_int_byte_Array_int(this.a_byte_Array, 2 + var3 * 4);
				this.c_void_byte_Array_int(this.a_byte_Array, var2);
				var2 += var4;
			}
		} else {
			this.c_void_byte_Array_int(this.a_byte_Array, 0);
		}

		this.b_int++;
	}

	private void c_void_byte_Array_int(byte[] arr, int integer) {
		short var7 = (short) arr[integer + 0];
		if (this.b_boolean) {
			switch (var7) {
			case 5:
			case 9:
			case 10:
			case 25:
			case 26:
				break;
			default:
				arr[integer + 1] = 1;
				return;
			}
		}

		switch (var7) {
		case 1:
			if ((short) i.a_int_byte_Array_int(arr, integer + 8) == 10000) {
				a_void_byte_Array_int_short(arr, integer + 8, (short) this.a_i.at_int);
			}

			if ((short) i.a_int_byte_Array_int(arr, integer + 10) == 10000) {
				a_void_byte_Array_int_short(arr, integer + 10, (short) this.a_i.au_int);
			}

			short var22 = (short) i.a_int_byte_Array_int(arr, integer + 6);
			if (this.b_int > var22) {
				arr[integer + 1] = 1;
				return;
			}
			break;
		case 2:
			short var17;
			if ((var17 = (short) i.a_int_byte_Array_int(arr, integer + 4)) == 10000) {
				var17 = -226;
			}

			var17 = (short) (var17 + 30);
			if (arr[integer + 10] == 0) {
				if (var17 > 7) {
					var17 = 7;
				}
			} else if (var17 > 240) {
				arr[integer + 1] = 1;
			}

			a_void_byte_Array_int_short(arr, integer + 4, var17);
		case 3:
		case 7:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		default:
			break;
		case 4:
			short var21 = (short) i.a_int_byte_Array_int(arr, integer + 14);
			if (this.b_int > var21) {
				arr[integer + 1] = 1;
				return;
			}
			break;
		case 5:
			i.a_void_short_short_byte_int((short) i.a_int_byte_Array_int(arr, integer + 2),
					(short) i.a_int_byte_Array_int(arr, integer + 4), arr[integer + 6], 0);
			arr[integer + 1] = 1;
			return;
		case 6:
			if (this.b_int > i.b_int_byte_Array_int(arr, integer + 2)) {
				arr[integer + 1] = 1;
				return;
			}
			break;
		case 8:
			return;
		case 9:
			i.a_void_short_short_byte_int((short) i.a_int_byte_Array_int(arr, integer + 2),
					(short) i.a_int_byte_Array_int(arr, integer + 4), (byte) 0,
					(short) i.a_int_byte_Array_int(arr, integer + 6));
			arr[integer + 1] = 1;
			return;
		case 10:
			byte var6 = arr[integer + 2];
			if (this.b_int == 0) {
				this.a_i.aS_int = this.a_i.aS_int & -8 | var6;
				this.a_i.j_byte = var6;
			} else if (this.a_i.aR_int <= 0) {
				this.a_i.j_byte = 0;
				arr[integer + 1] = 1;
			}

			this.a_i.c_void();
			return;
		case 11:
			this.f_int = (short) i.a_int_byte_Array_int(arr, integer + 4);
			this.e_int = (short) i.a_int_byte_Array_int(arr, integer + 2);
			arr[integer + 1] = 1;
			return;
		case 12:
			short var16 = (short) i.a_int_byte_Array_int(arr, integer + 2);
			short var20 = (short) i.a_int_byte_Array_int(arr, integer + 4);
			this.c_int = var16;
			this.d_int = var20;
			if (this.b_int > 5) {
				arr[integer + 1] = 1;
				this.a_boolean = true;
				return;
			}
			break;
		case 13:
			if ((short) i.a_int_byte_Array_int(arr, integer + 8) == 10000) {
				a_void_byte_Array_int_short(arr, integer + 8, (short) this.c_int);
			}

			if ((short) i.a_int_byte_Array_int(arr, integer + 10) == 10000) {
				a_void_byte_Array_int_short(arr, integer + 10, (short) this.d_int);
			}

			short var5 = (short) i.a_int_byte_Array_int(arr, integer + 6);
			if (this.b_int > var5) {
				arr[integer + 1] = 1;
				return;
			}
			break;
		case 14:
		case 15:
			this.a_boolean = var7 == 14;
			arr[integer + 1] = 1;
			return;
		case 16:
		case 17:
		case 18:
			if (this.b_int % 2 == 0) {
				return;
			}

			int var8 = integer + (var7 == 18 ? 2 : 4);
			byte var9 = arr[var8];
			short var10 = -1;
			int var11 = integer + (var7 == 18 ? 7 : 5);
			boolean var12 = arr[var11] != 0;
			if (var7 != 18) {
				var10 = (short) i.a_int_byte_Array_int(arr, integer + 2);
			}

			if (var12) {
				var12 = false;
				this.g_int = -1;
				if (--var9 == 0) {
					arr[integer + 1] = 1;
					if (var7 != 18) {
						this.g_int = var7 == 16 ? var10 : -1;
					}
				}
			} else if (var9 > 0) {
				var12 = true;
				if (var7 != 18) {
					this.g_int = var10;
				}
			} else {
				arr[integer + 1] = 1;
			}

			arr[var11] = (byte) (var12 ? 1 : 0);
			arr[var8] = var9;
			return;
		case 25:
			short var15 = (short) i.a_int_byte_Array_int(arr, integer + 2);
			short var19 = (short) i.a_int_byte_Array_int(arr, integer + 4);
			byte var23 = arr[integer + 6];
			byte var14 = arr[integer + 7];
			i.a_int_2d_Array[var15][var19] = var14 << 8 | var23;
			arr[integer + 1] = 1;
			return;
		case 26:
			short var3 = (short) i.a_int_byte_Array_int(arr, integer + 2);
			short var4 = (short) i.a_int_byte_Array_int(arr, integer + 4);
			int var13 = i.b_int_byte_Array_int(arr, integer + 6);
			i.b_int_2d_Array[var3][var4] = var13;
			arr[integer + 1] = 1;
			return;
		case 27:
			if (arr[integer + 7] != 0) {
				arr[integer + 1] = 1;
				return;
			}
		}
	}

	public final boolean a_boolean() {
		boolean var1 = true;
		if (this.a_byte_Array[0] == 0) {
			byte var2 = this.a_byte_Array[1];
			int var3 = 2 + var2 * 4;

			for (int var4 = 0; var4 < var2; var4++) {
				int var5 = i.b_int_byte_Array_int(this.a_byte_Array, 2 + var4 * 4);
				if (!(var1 = var1 && this.a_byte_Array[var3 + 1] == 1)) {
					break;
				}

				var3 += var5;
			}
		} else {
			var1 = this.a_byte_Array[1] == 1;
		}

		return var1;
	}

	private byte a_byte() {
		return this.a_byte_Array == null ? -1 : this.a_byte_Array[0];
	}

	public final void a_void_int(int integer) {
		try {
			ByteArrayInputStream var2 = new ByteArrayInputStream(i.a_byte_Array_String_int(b_String, 0));
			byte[] var3 = new byte[4];
			var2.read(var3, 0, 2);
			boolean var4 = false;

			do {
				var2.read(var3, 0, 2);
				if ((short) i.a_int_byte_Array_int(var3, 0) != integer) {
					var2.skip(2L);
					var2.read(var3, 0, 4);
					int var40 = i.b_int_byte_Array_int(var3, 0);
					var2.skip((long) var40);
				} else {
					var2.read(var3, 0, 2);
					short var6 = (short) i.a_int_byte_Array_int(var3, 0);
					var2.read(var3, 0, 4);
					var3 = new byte[i.b_int_byte_Array_int(var3, 0)];
					var2.read(var3);
					var2.close();
					var2 = null;
					var4 = true;
					int var8 = 0;
					short var9 = (short) i.a_int_byte_Array_int(var3, 0);
					var8 += 2;
					if (var9 != 0) {
						short[] var10 = new short[var9];

						for (int var11 = 0; var11 < var9; var11++) {
							var10[var11] = (short) i.a_int_byte_Array_int(var3, var8);
							var8 += 2;
						}

						for (int var13 = 1; var13 < var9; var13++) {
							short var72 = var10[var13];
							int var10000 = var13;

							while (true) {
								int var12 = var10000;
								if (var10000 <= 0 || var10[var12 - 1] <= var72) {
									var10[var12] = var72;
									break;
								}

								var10[var12] = var10[var12 - 1];
								var10000 = var12 - 1;
							}
						}

						InputStream var75 = Utils.deepCopy(getClass().getResourceAsStream("/res" + a_String));
						byte[] var14 = new byte[4];
						var75.read(var14, 0, 2);
						short var15 = (short) i.a_int_byte_Array_int(var14, 0);
						if (a_a_Array == null) {
							a_a_Array = new a[var15];
						}

						for (int var16 = 0; var16 < var9; var16++) {
							short var17 = var10[var16];
							boolean var18 = false;

							while (!var18) {
								var75.read(var14, 0, 2);
								short var19 = (short) i.a_int_byte_Array_int(var14, 0);
								if (var17 == var19) {
									var18 = true;
								}

								var75.read(var14, 0, 4);
								int var20 = i.b_int_byte_Array_int(var14, 0);
								if (!var18 && a_a_Array[var17] != null) {
									var75.skip((long) var20);
								} else {
									var14 = new byte[var20];
									var75.read(var14);
									a_a_Array[var17] = new a();
									a_a_Array[var17].a_void_byte_Array_int(var14, 0);
									a_a_Array[var17].a_void_int_int_int_int(0, 0, -1, -1);
									a_a_Array[var17].g_byte_Array = null;
								}
							}
						}

						var75.close();
					}

					byte[][] var71 = new byte[var6][];
					int var73 = 0;
					byte[][] var74 = (byte[][]) null;
					int var76 = 0;
					Object var77 = null;
					int var79 = 0;

					for (int var80 = 0; var80 < var6 || var79 != 0; var80++) {
						if (var79 == 0) {
							var77 = var71;
						} else {
							var77 = var74;
							var79--;
							var80--;
						}

						int var81;
						byte[] var82;
						label95: {
							var81 = var3[var8++] & 255;
							var82 = null;
							byte[] var112;
							switch (var81) {
							case 0:
								var74 = new byte[var79 = (short) (var3[var8++] & 255)][];
								var112 = null;
								break;
							case 1:
								short var98 = (short) (i.a_int_byte_Array_int(var3, var8) * 24);
								var8 += 2;
								short var105 = (short) (i.a_int_byte_Array_int(var3, var8) * 24);
								var8 += 2;
								short var107 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[12], 2, var98);
								a_void_byte_Array_int_short(var82, 4, var105);
								a_void_byte_Array_int_short(var82, 6, var107);
								a_void_byte_Array_int_short(var82, 8, (short) 10000);
								a_void_byte_Array_int_short(var82, 10, (short) 10000);
								break label95;
							case 2:
								short var36 = (short) (var3[var8++] & 255);
								short var104 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var109 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[11 + var109], 2, var109);
								a_void_byte_Array_int_short(var82, 4, (short) 10000);
								a_void_byte_Array_int_short(var82, 6, var104);
								var82[8] = (byte) var36;
								var82[9] = 0;
								var82[10] = 0;
								System.arraycopy(var3, var8, var82, 11, var109);
								var8 += var109;
							case 3:
							case 8:
							case 19:
							case 20:
							case 21:
							case 22:
							case 23:
							case 24:
							default:
								break label95;
							case 4:
								short var26 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var27 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var28 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var29 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var30 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var91 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var106 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[16], 2, var26);
								a_void_byte_Array_int_short(var82, 4, var27);
								a_void_byte_Array_int_short(var82, 6, var28);
								a_void_byte_Array_int_short(var82, 8, var29);
								a_void_byte_Array_int_short(var82, 10, var30);
								a_void_byte_Array_int_short(var82, 12, var91);
								a_void_byte_Array_int_short(var82, 14, var106);
								break label95;
							case 5:
								short var97 = (short) i.a_int_byte_Array_int(var3, var8);
								int var58 = var8 + 2;
								short var103 = (short) i.a_int_byte_Array_int(var3, var58);
								var8 = var58 + 2;
								short var108 = (short) (var3[var8++] & 255);
								a_void_byte_Array_int_short(var82 = new byte[7], 2, var97);
								a_void_byte_Array_int_short(var82, 4, var103);
								var82[6] = (byte) var108;
								break label95;
							case 6:
								int var31 = i.b_int_byte_Array_int(var3, var8);
								var8 += 4;
								a_void_byte_Array_int_int(var82 = new byte[6], 2, var31);
								break label95;
							case 7:
								var112 = new byte[2];
								break;
							case 9:
								short var96 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var102 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var37 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[8], 2, var96);
								a_void_byte_Array_int_short(var82, 4, var102);
								a_void_byte_Array_int_short(var82, 6, var37);
								break label95;
							case 10:
								short var38 = (short) (var3[var8++] & 255);
								(var82 = new byte[3])[2] = (byte) var38;
								break label95;
							case 11:
								short var90 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var22 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[6], 2, var90);
								a_void_byte_Array_int_short(var82, 4, var22);
								break label95;
							case 12:
								short var95 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var101 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[6], 2, var95);
								a_void_byte_Array_int_short(var82, 4, var101);
								break label95;
							case 13:
								short var94 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var100 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var25 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[12], 2, var94);
								a_void_byte_Array_int_short(var82, 4, var100);
								a_void_byte_Array_int_short(var82, 6, var25);
								a_void_byte_Array_int_short(var82, 8, (short) 10000);
								a_void_byte_Array_int_short(var82, 10, (short) 10000);
								break label95;
							case 14:
							case 15:
								var112 = new byte[2];
								break;
							case 16:
							case 17:
								short var21 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var85 = (short) (var3[var8++] & 255);
								a_void_byte_Array_int_short(var82 = new byte[6], 2, var21);
								a_void_byte_Array_int_short(var82, 4, var85);
								var82[5] = 0;
								break label95;
							case 18:
								short var84 = (short) (var3[var8++] & 255);
								int var87 = (var3[var8++] & 255) + ((var3[var8++] & 255) << 8)
										+ ((var3[var8++] & 255) << 16);
								a_void_byte_Array_int_short(var82 = new byte[8], 2, var84);
								a_void_byte_Array_int_int(var82, 3, var87);
								var82[7] = 0;
								break label95;
							case 25:
								short var93 = (short) i.a_int_byte_Array_int(var3, var8);
								int var45 = var8 + 2;
								short var99 = (short) i.a_int_byte_Array_int(var3, var45);
								var8 = var45 + 2;
								short var33 = (short) (var3[var8++] & 255);
								short var34 = (short) (var3[var8++] & 255);
								a_void_byte_Array_int_short(var82 = new byte[8], 2, var93);
								a_void_byte_Array_int_short(var82, 4, var99);
								var82[6] = (byte) var33;
								var82[7] = (byte) var34;
								break label95;
							case 26:
								short var23 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								short var24 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								int var32 = i.b_int_byte_Array_int(var3, var8);
								var8 += 4;
								a_void_byte_Array_int_short(var82 = new byte[10], 2, var23);
								a_void_byte_Array_int_short(var82, 4, var24);
								a_void_byte_Array_int_int(var82, 6, var32);
								break label95;
							case 27:
								short var35 = (short) i.a_int_byte_Array_int(var3, var8);
								var8 += 2;
								a_void_byte_Array_int_short(var82 = new byte[8 + var35], 2, var35);
								a_void_byte_Array_int_short(var82, 4, (short) 10000);
								var82[6] = 0;
								var82[7] = 0;
								System.arraycopy(var3, var8, var82, 8, var35);
								var8 += var35;
								break label95;
							}

							var82 = var112;
						}

						if (var82 != null) {
							var82[0] = (byte) (var81 & 0xFF);
							var82[1] = 0;
							if (var77 == var74) {
								((Object[]) var77)[var76] = var82;
								var76++;
							} else {
								((Object[]) var77)[var73] = var82;
								var73++;
							}
						}

						if (var77 == var74 && var79 == 0) {
							int var86 = 0;

							for (int var88 = 0; var88 < var74.length; var88++) {
								var86 += var74[var88].length;
							}

							(var82 = new byte[2 + var74.length * 4 + var86])[0] = 0;
							var82[1] = (byte) var74.length;
							int var89 = 2 + var74.length * 4;

							for (int var92 = 0; var92 < var74.length; var92++) {
								a_void_byte_Array_int_int(var82, 2 + var92 * 4, var74[var92].length);
								System.arraycopy(var74[var92], 0, var82, var89, var74[var92].length);
								var89 += var74[var92].length;
							}

							var71[var73] = var82;
							var76 = 0;
							var74 = (byte[][]) null;
							var73++;
						}
					}

					this.a_byte_2d_Array = var71;
				}
			} while (!var4);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void a_void_Graphics_String_int_int_int_int(Graphics graphics, String string, int integer3, int integer4,
			int integer5, int integer6) {
		int var7 = i.a_a_Array[41].e_int + (i.a_a_Array[41].a_byte_Array[1] & 255);
		if (integer6 > this.h_int) {
			integer6 = this.h_int;
		}

		for (int var8 = integer5; var8 < integer6; var8++) {
			a.f_int = var8 > 0 ? this.a_short_Array[var8 - 1] + 1 : 0;
			a.g_int = this.a_short_Array[var8];
			i.a_a_Array[41].a_void_Graphics_String_int_int_int(graphics, string, integer3,
					integer4 + (var8 - integer5) * var7, 4);
		}

		a.f_int = -1;
		a.g_int = -1;
	}

	private void a_void_String_int(String string, int integer) {
		this.h_int = 0;
		int var3 = string.length();
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < var3; var6++) {
			label60: {
				char var7;
				if ((var7 = string.charAt(var6)) > ' ') {
					int var8 = a.h_byte_Array[var7] & 255;
					int var12 = (i.a_a_Array[41].d_byte_Array[var8 << 2] & 255) << 1;
					var4 += (i.a_a_Array[41].a_byte_Array[var12] & 255) - i.a_a_Array[41].d_byte_Array[(var8 << 2) + 1]
							+ i.a_a_Array[41].d_byte_Array[1];
				} else {
					if (var7 != ' ' || var6 + 1 >= var3 || string.charAt(var6 + 1) != '?'
							&& string.charAt(var6 + 1) != '!' && string.charAt(var6 + 1) != ':') {
						if (var7 != ' ') {
							if (var7 == '\n') {
								var4 = 0;
								this.a_short_Array[this.h_int++] = (short) var6;
							}
							continue;
						}

						var4 += (i.a_a_Array[41].a_byte_Array[0] & 255) + i.a_a_Array[41].d_byte_Array[1];
						break label60;
					}

					var4 += (i.a_a_Array[41].a_byte_Array[0] & 255) + i.a_a_Array[41].d_byte_Array[1];
					int var9 = a.h_byte_Array[string.charAt(var6 + 1)] & 255;
					int var10 = (i.a_a_Array[41].d_byte_Array[var9 << 2] & 255) << 1;
					var4 += (i.a_a_Array[41].a_byte_Array[var10] & 255) - i.a_a_Array[41].d_byte_Array[(var9 << 2) + 1]
							+ i.a_a_Array[41].d_byte_Array[1];
				}

				if (var4 > integer) {
					var6 = var5 - 1;
					this.a_short_Array[this.h_int++] = (short) var6;
					var4 = 0;
				}

				if (string.charAt(var6) != ' ') {
					continue;
				}
			}

			var5 = var6 + 1;
		}

		this.a_short_Array[this.h_int++] = (short) var3;
	}

	private static void a_void_byte_Array_int_short(byte[] arr, int integer, short short3) {
		arr[integer] = (byte) (short3 & 255);
		arr[integer + 1] = (byte) (short3 >> 8 & 0xFF);
	}

	private static void a_void_byte_Array_int_int(byte[] arr, int integer2, int integer3) {
		arr[integer2] = (byte) (integer3 & 0xFF);
		arr[integer2 + 1] = (byte) (integer3 >> 8 & 0xFF);
		arr[integer2 + 2] = (byte) (integer3 >> 16 & 0xFF);
		arr[integer2 + 3] = (byte) (integer3 >> 24 & 0xFF);
	}
}
