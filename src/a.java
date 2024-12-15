import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class a {
	public static int[] a_int_Array = new int[4096];
	public byte[] a_byte_Array;
	public byte[] b_byte_Array;
	public short[] a_short_Array;
	public byte[] c_byte_Array;
	public byte[] d_byte_Array;
	public byte[] e_byte_Array;
	public short[] b_short_Array;
	public byte[] f_byte_Array;
	public int[][] a_int_2d_Array;
	public int[][] b_int_2d_Array;
	public int a_int;
	public int b_int;
	public boolean a_boolean;
	public short a_short;
	public byte[] g_byte_Array;
	public short[] c_short_Array;
	public Image[][] a_Image_2d_Array;
	public static int c_int;
	public static int d_int;
	public static byte[] h_byte_Array;
	public int e_int = 0;
	public static int f_int = -1;
	public static int g_int = -1;

	public final void a_void_byte_Array_int(byte[] byArray, int n) {
		try {
			int n2;
			int n3;
			int n4;
			int n5;
			int n6;
			int n7;
			int n8;
			int n9;
			short s;
			System.gc();
			++n;
			++n;
			++n;
			++n;
			++n;
			int n10 = ++n;
			int n11 = ++n;
			++n;
			short s2 = (short) ((byArray[n10] & 0xFF) + ((byArray[n11] & 0xFF) << 8));
			if (s2 > 0) {
				this.a_byte_Array = new byte[s2 << 1];
				System.arraycopy(byArray, n, this.a_byte_Array, 0, this.a_byte_Array.length);
				n += this.a_byte_Array.length;
			}
			if ((s = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
				this.d_byte_Array = new byte[s << 2];
				System.arraycopy(byArray, n, this.d_byte_Array, 0, this.d_byte_Array.length);
				n += this.d_byte_Array.length;
			}
			if ((n9 = (int) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
				this.b_byte_Array = new byte[n9];
				this.a_short_Array = new short[n9];
				for (n8 = 0; n8 < n9; ++n8) {
					this.b_byte_Array[n8] = byArray[n++];
					int n12 = ++n;
					int n13 = ++n;
					++n;
					this.a_short_Array[n8] = (short) ((byArray[n12] & 0xFF) + ((byArray[n13] & 0xFF) << 8));
				}
				n8 = n9 << 2;
				this.c_byte_Array = new byte[n8];
				for (n7 = 0; n7 < n8; ++n7) {
					this.c_byte_Array[n7] = byArray[n++];
				}
			}
			short s3 = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
			n8 = s3;
			if (s3 > 0) {
				this.f_byte_Array = new byte[n8 * 5];
				System.arraycopy(byArray, n, this.f_byte_Array, 0, this.f_byte_Array.length);
				n += this.f_byte_Array.length;
			}
			short s4 = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
			n7 = s4;
			if (s4 > 0) {
				this.e_byte_Array = new byte[n7];
				this.b_short_Array = new short[n7];
				for (n6 = 0; n6 < n7; ++n6) {
					this.e_byte_Array[n6] = byArray[n++];
					int n14 = ++n;
					int n15 = ++n;
					++n;
					this.b_short_Array[n6] = (short) ((byArray[n14] & 0xFF) + ((byArray[n15] & 0xFF) << 8));
				}
			}
			if (s2 <= 0) {
				System.gc();
				return;
			}
			n6 = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
			this.a_int = byArray[n++] & 0xFF;
			int n16 = byArray[n++] & 0xFF;
			this.b_int_2d_Array = new int[16][];
			block11: for (n5 = 0; n5 < this.a_int; ++n5) {
				this.b_int_2d_Array[n5] = new int[n16];
				switch (n6) {
				case -30584: {
					for (n4 = 0; n4 < n16; ++n4) {
						n3 = byArray[n++] & 0xFF;
						n3 += (byArray[n++] & 0xFF) << 8;
						n3 += (byArray[n++] & 0xFF) << 16;
						if (((n3 += (byArray[n++] & 0xFF) << 24) & 0xFF000000) != -16777216) {
							this.a_boolean = true;
						}
						this.b_int_2d_Array[n5][n4] = n3;
					}
					continue block11;
				}
				case 17476: {
					for (n4 = 0; n4 < n16; ++n4) {
						n3 = byArray[n++] & 0xFF;
						if (((n3 += (byArray[n++] & 0xFF) << 8) & 0xF000) != 61440) {
							this.a_boolean = true;
						}
						this.b_int_2d_Array[n5][n4] = (n3 & 0xF000) << 16 | (n3 & 0xF000) << 12 | (n3 & 0xF00) << 12
								| (n3 & 0xF00) << 8 | (n3 & 0xF0) << 8 | (n3 & 0xF0) << 4 | (n3 & 0xF) << 4 | n3 & 0xF;
					}
					continue block11;
				}
				case 21781: {
					for (n4 = 0; n4 < n16; ++n4) {
						n3 = byArray[n++] & 0xFF;
						int n17 = n++;
						n2 = -16777216;
						if (((n3 += (byArray[n17] & 0xFF) << 8) & 0x8000) != 32768) {
							n2 = 0;
							this.a_boolean = true;
						}
						this.b_int_2d_Array[n5][n4] = n2 | (n3 & 0x7C00) << 9 | (n3 & 0x3E0) << 6 | (n3 & 0x1F) << 3;
					}
					continue block11;
				}
				case 25861: {
					for (n4 = 0; n4 < n16; ++n4) {
						n3 = byArray[n++] & 0xFF;
						int n18 = n++;
						n2 = -16777216;
						if ((n3 += (byArray[n18] & 0xFF) << 8) == 63519) {
							n2 = 0;
							this.a_boolean = true;
						}
						this.b_int_2d_Array[n5][n4] = n2 | (n3 & 0xF800) << 8 | (n3 & 0x7E0) << 5 | (n3 & 0x1F) << 3;
					}
					continue block11;
				}
				}
			}
			this.a_short = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
			if (s2 > 0) {
				this.c_short_Array = new short[s2];
				n5 = 0;
				n4 = n;
				for (n3 = 0; n3 < s2; ++n3) {
					n2 = (short) ((byArray[n4++] & 0xFF) + ((byArray[n4++] & 0xFF) << 8));
					this.c_short_Array[n3] = (short) n5;
					n4 += n2;
					n5 += n2;
				}
				this.g_byte_Array = new byte[n5];
				for (n3 = 0; n3 < s2; ++n3) {
					n2 = (short) ((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
					System.arraycopy(byArray, n, this.g_byte_Array, this.c_short_Array[n3] & 0xFFFF, n2);
					n += n2;
				}
			}
			System.gc();
			return;
		} catch (Exception exception) {
			exception.printStackTrace();
			return;
		}
	}

	public final void a_void_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		if (this.a_byte_Array != null) {
			if (integer3 == -1) {
				integer3 = (this.a_byte_Array.length >> 1) - 1;
			}

			if (this.a_Image_2d_Array == null) {
				this.a_Image_2d_Array = new Image[this.a_int][];
			}

			if (this.a_Image_2d_Array[integer1] == null) {
				this.a_Image_2d_Array[integer1] = new Image[this.a_byte_Array.length >> 1];
			}

			if (integer4 >= 0) {
				for (int var5 = integer2; var5 <= integer3; var5++) {
					this.a_Image_2d_Array[integer1][var5] = this.a_Image_2d_Array[integer4][var5];
				}
			} else {
				int var14 = this.b_int;
				this.b_int = integer1;
				System.gc();

				for (int var6 = integer2; var6 <= integer3; var6++) {
					int var7 = var6 << 1;
					int var8 = this.a_byte_Array[var7] & 255;
					int var9 = this.a_byte_Array[var7 + 1] & 255;
					int[] var10;
					if (var8 > 0 && var9 > 0 && (var10 = this.a_int_Array_int(var6)) != null) {
						boolean var11 = false;
						int var12 = var8 * var9;

						for (int var13 = 0; var13 < var12; var13++) {
							if ((var10[var13] & 0xFF000000) != -16777216) {
								var11 = true;
								break;
							}
						}

						this.a_Image_2d_Array[integer1][var6] = Image.createRGBImage(var10, var8, var9, var11);
					}
				}

				System.gc();
				this.b_int = var14;
			}

			System.gc();
		}
	}

	public final void a_void_int(int integer) {
		if (this.a_byte_Array != null) {
			if (this.a_Image_2d_Array != null) {
				if (this.a_Image_2d_Array[integer] != null) {
					for (int var2 = 0; var2 < this.a_Image_2d_Array[integer].length; var2++) {
						this.a_Image_2d_Array[integer][var2] = null;
					}

					this.a_Image_2d_Array[integer] = null;
					this.a_int--;
				}
			}
		}
	}

	public final String toString() {
		int var2 = 0;
		for (int var3 = 0; var3 < this.a_byte_Array.length / 2; var3++) {
			var2 += 2 * (this.a_byte_Array[2 * var3] & 255) * (this.a_byte_Array[2 * var3 + 1] & 255);
		}
		return "raw/full: " + this.g_byte_Array.length + "/" + var2;
	}

	public final int a_int_int_int(int integer1, int integer2) {
		return this.f_byte_Array[(this.b_short_Array[integer1] + integer2) * 5 + 1] & 0xFF;
	}

	public final int a_int_int(int integer) {
		return this.e_byte_Array[integer] & 0xFF;
	}

	public final int b_int_int(int integer) {
		return this.b_byte_Array[integer] & 0xFF;
	}

	public final int a_int_String(String string) {
		int var2 = 1;
		int var3 = string.length();

		for (int var4 = string.indexOf(10); var4 != -1; var4 = var4 < var3 - 1 ? string.indexOf(10, var4 + 1) : -1) {
			var2++;
		}

		return this.e_int * (var2 - 1) + this.a_byte_Array[1] * var2;
	}

	public final void a_void_Graphics_int_int_int_int_int_int_int(Graphics graphics, int integer2, int integer3,
			int integer4, int integer5, int integer6, int integer7, int integer8) {
		int var9 = (this.b_short_Array[integer2] + integer3) * 5;
		int var10 = this.f_byte_Array[var9] & 255;
		if ((integer6 & 32) != 0) {
			integer7 = (integer6 & 1) != 0 ? integer7 + this.f_byte_Array[var9 + 2]
					: integer7 - this.f_byte_Array[var9 + 2];
			integer8 = (integer6 & 2) != 0 ? integer8 + this.f_byte_Array[var9 + 3]
					: integer8 - this.f_byte_Array[var9 + 3];
		}

		this.a_void_Graphics_int_int_int_int_int_int(graphics, var10, integer4 - integer7, integer5 - integer8,
				integer6 ^ this.f_byte_Array[var9 + 4] & 15, integer7, integer8);
	}

	public final void a_void_Graphics_int_int_int_int_int_int(Graphics graphics, int integer2, int integer3,
			int integer4, int integer5, int integer6, int integer7) {
		int var8 = this.b_byte_Array[integer2] & 255;

		for (int var9 = 0; var9 < var8; var9++) {
			this.a_void_Graphics_int_int_int_int_int(graphics, integer2, var9, integer3, integer4, integer5);
		}
	}

	public final void a_void_Graphics_int_int_int_int_int(Graphics graphics, int integer2, int integer3, int integer4,
			int integer5, int integer6) {
		int var7 = this.a_short_Array[integer2] + integer3 << 2;
		int var8 = this.d_byte_Array[var7 + 3] & 255;
		int var9 = this.d_byte_Array[var7] & 255;
		integer4 = (integer6 & 1) != 0 ? integer4 - this.d_byte_Array[var7 + 1]
				: integer4 + this.d_byte_Array[var7 + 1];
		integer5 = (integer6 & 2) != 0 ? integer5 - this.d_byte_Array[var7 + 2]
				: integer5 + this.d_byte_Array[var7 + 2];
		if ((integer6 & 1) != 0) {
			integer4 -= this.a_byte_Array[var9 << 1] & 255;
		}

		if ((integer6 & 2) != 0) {
			integer5 -= this.a_byte_Array[(var9 << 1) + 1] & 255;
		}

		this.a_void_Graphics_int_int_int_int(graphics, var9, integer4, integer5, integer6 ^ var8 & 15);
	}

	public final void a_void_Graphics_int_int_int_int(Graphics graphics, int integer2, int integer3, int integer4,
			int integer5) {
		int var6 = integer2 << 1;
		int var7 = this.a_byte_Array[var6] & 255;
		int var8 = this.a_byte_Array[var6 + 1] & 255;
		if (var7 > 0 && var8 > 0) {
			Image var9 = null;
			if (this.a_Image_2d_Array != null && this.a_Image_2d_Array[this.b_int] != null) {
				var9 = this.a_Image_2d_Array[this.b_int][integer2];
			}

			if (var9 == null) {
				int[] var10;
				if ((var10 = this.a_int_Array_int(integer2)) == null) {
					return;
				}

				var9 = Image.createRGBImage(var10, var7, var8, this.a_boolean);
			}

			var7 = var9.getWidth();
			var8 = var9.getHeight();
			Graphics var10000;
			Image var10001;
			byte var10002;
			byte var10003;
			int var10004;
			int var10005;
			byte var10006;
			if ((integer5 & 1) != 0) {
				if ((integer5 & 2) != 0) {
					var10000 = graphics;
					var10001 = var9;
					var10002 = 0;
					var10003 = 0;
					var10004 = var7;
					var10005 = var8;
					var10006 = 3;
				} else {
					var10000 = graphics;
					var10001 = var9;
					var10002 = 0;
					var10003 = 0;
					var10004 = var7;
					var10005 = var8;
					var10006 = 2;
				}
			} else if ((integer5 & 2) != 0) {
				var10000 = graphics;
				var10001 = var9;
				var10002 = 0;
				var10003 = 0;
				var10004 = var7;
				var10005 = var8;
				var10006 = 1;
			} else {
				var10000 = graphics;
				var10001 = var9;
				var10002 = 0;
				var10003 = 0;
				var10004 = var7;
				var10005 = var8;
				var10006 = 0;
			}

			var10000.drawRegion(var10001, var10002, var10003, var10004, var10005, var10006, integer3, integer4, 0);
		}
	}

	private int[] a_int_Array_int(int integer) {
		if (this.g_byte_Array != null && this.c_short_Array != null) {
			int var2 = integer << 1;
			int var3 = this.a_byte_Array[var2] & 255;
			int var4 = this.a_byte_Array[var2 + 1] & 255;
			int[] var5 = a_int_Array;
			int[] var6;
			if ((var6 = this.b_int_2d_Array[this.b_int]) == null) {
				return null;
			} else {
				byte[] var7 = this.g_byte_Array;
				int var8 = this.c_short_Array[integer] & '\uffff';
				int var9 = 0;
				int var10 = var3 * var4;
				if (this.a_short != 10225) {
					if (this.a_short == 5632) {
						while (var9 < var10) {
							var5[var9++] = var6[var7[var8] >> 4 & 15];
							var5[var9++] = var6[var7[var8] & 15];
							var8++;
						}
					} else if (this.a_short == 1024) {
						while (var9 < var10) {
							var5[var9++] = var6[var7[var8] >> 6 & 3];
							var5[var9++] = var6[var7[var8] >> 4 & 3];
							var5[var9++] = var6[var7[var8] >> 2 & 3];
							var5[var9++] = var6[var7[var8] & 3];
							var8++;
						}
					} else if (this.a_short == 512) {
						while (var9 < var10) {
							var5[var9++] = var6[var7[var8] >> 7 & 1];
							var5[var9++] = var6[var7[var8] >> 6 & 1];
							var5[var9++] = var6[var7[var8] >> 5 & 1];
							var5[var9++] = var6[var7[var8] >> 4 & 1];
							var5[var9++] = var6[var7[var8] >> 3 & 1];
							var5[var9++] = var6[var7[var8] >> 2 & 1];
							var5[var9++] = var6[var7[var8] >> 1 & 1];
							var5[var9++] = var6[var7[var8] & 1];
							var8++;
						}
					} else if (this.a_short == 22018) {
						while (var9 < var10) {
							var5[var9++] = var6[var7[var8++] & 255];
						}
					} else if (this.a_short == 22258) {
						while (var9 < var10) {
							int var26;
							if ((var26 = var7[var8++] & 255) > 127) {
								var26 -= 128;

								while (var26-- > 0) {
									var5[var9++] = var6[var7[var8++] & 255];
								}
							} else {
								int var28 = var6[var7[var8++] & 255];

								while (var26-- > 0) {
									var5[var9++] = var28;
								}
							}
						}
					}
				} else {
					while (var9 < var10) {
						int var11;
						if ((var11 = var7[var8++] & 255) > 127) {
							int var12 = var7[var8++] & 255;
							int var13 = var6[var12];
							var11 -= 128;

							while (var11-- > 0) {
								var5[var9++] = var13;
							}
						} else {
							var5[var9++] = var6[var11];
						}
					}
				}

				return var5;
			}
		} else {
			return null;
		}
	}

	public final void a_void_String(String string) {
		a.c_int = 0;
		a.d_int = (this.a_byte_Array[1] & 0xFF);
		int integer3 = 0;
		int integer4 = (a.f_int >= 0) ? a.f_int : 0;
		for (int n3 = (a.g_int >= 0) ? a.g_int : string.length(), i = integer4; i < n3; ++i) {
			int n5 = 0;
			int n6 = 0;
			Label_0275: {
				int integer7;
				int char2;
				int n4;
				if ((integer7 = string.charAt(i)) > 32) {
					n4 = (char2 = (a.h_byte_Array[integer7] & 0xFF));
				} else {
					if (integer7 == 32) {
						n5 = integer3;
						n6 = (this.a_byte_Array[0] & 0xFF);
						break Label_0275;
					}
					if (integer7 == 10) {
						if (integer3 > a.c_int) {
							a.c_int = integer3;
						}
						integer3 = 0;
						a.d_int += this.e_int + (this.a_byte_Array[1] & 0xFF);
						continue;
					}
					if (integer7 == 1) {
						++i;
						continue;
					}
					if (integer7 != 2) {
						continue;
					}
					++i;
					n4 = (char2 = string.charAt(i));
				}
				integer7 = char2;
				int n8;
				int n9;
				if (n4 >= this.b_int_int(0)) {
					int integer8 = integer7 - this.b_int_int(0);
					n5 = integer3;
					n8 = (this.c_byte_Array[(integer8 << 2) + 2] & 0xFF);
					n9 = (this.c_byte_Array[integer8 << 2] & 0xFF);
				} else {
					int integer8 = (this.d_byte_Array[integer7 << 2] & 0xFF) << 1;
					n5 = integer3;
					n8 = (this.a_byte_Array[integer8] & 0xFF);
					n9 = this.d_byte_Array[(integer7 << 2) + 1];
				}
				n6 = n8 - n9;
			}
			integer3 = n5 + (n6 + this.d_byte_Array[1]);
		}
		if (integer3 > a.c_int) {
			a.c_int = integer3;
		}
		if (a.c_int > 0) {
			a.c_int -= this.d_byte_Array[1];
		}
	}

	public final void a_void_Graphics_String_int_int_int(Graphics graphics, String string, int integer4, int integer5,
			int integer6) {
		integer5 -= this.d_byte_Array[2];
		Label_0087: {
			if ((integer6 & 0x2B) != 0x0) {
				this.a_void_String(string);
				Label_0054: {
					int n;
					int c;
					if ((integer6 & 0x8) != 0x0) {
						n = integer4;
						c = a.c_int;
					} else {
						if ((integer6 & 0x1) == 0x0) {
							break Label_0054;
						}
						n = integer4;
						c = a.c_int >> 1;
					}
					integer4 = n - c;
				}
				int n2;
				int d;
				if ((integer6 & 0x20) != 0x0) {
					n2 = integer5;
					d = a.d_int;
				} else {
					if ((integer6 & 0x2) == 0x0) {
						break Label_0087;
					}
					n2 = integer5;
					d = a.d_int >> 1;
				}
				integer5 = n2 - d;
			}
		}
		int integer7 = integer4;
		int integer8 = integer5;
		int integer9 = this.b_int;
		int integer10 = (a.f_int >= 0) ? a.f_int : 0;
		for (int n6 = (a.g_int >= 0) ? a.g_int : string.length(), i = integer10; i < n6; ++i) {
			int n8 = 0;
			int n9 = 0;
			Label_0386: {
				int integer13;
				int char2;
				int n7;
				if ((integer13 = string.charAt(i)) > 32) {
					n7 = (char2 = (a.h_byte_Array[integer13] & 0xFF));
				} else {
					if (integer13 == 32) {
						n8 = integer7;
						n9 = (this.a_byte_Array[0] & 0xFF);
						break Label_0386;
					}
					if (integer13 == 10) {
						integer7 = integer4;
						integer8 += this.e_int + (this.a_byte_Array[1] & 0xFF);
						continue;
					}
					if (integer13 == 1) {
						++i;
						this.b_int = string.charAt(i);
						continue;
					}
					if (integer13 != 2) {
						continue;
					}
					++i;
					n7 = (char2 = string.charAt(i));
				}
				integer13 = char2;
				int n10;
				int n11;
				if (n7 >= this.b_int_int(0)) {
					int integer14 = integer13 - this.b_int_int(0);
					this.a_void_Graphics_int_int_int_int_int_int(graphics, integer14, integer7, integer8, 0, 0, 0);
					n8 = integer7;
					n10 = (this.c_byte_Array[(integer14 << 2) + 2] & 0xFF);
					n11 = (this.c_byte_Array[integer14 << 2] & 0xFF);
				} else {
					int integer14 = (this.d_byte_Array[integer13 << 2] & 0xFF) << 1;
					this.a_void_Graphics_int_int_int_int_int(graphics, 0, integer13, integer7, integer8, 0);
					n8 = integer7;
					n10 = (this.a_byte_Array[integer14] & 0xFF);
					n11 = this.d_byte_Array[(integer13 << 2) + 1];
				}
				n9 = n10 - n11;
			}
			integer7 = n8 + (n9 + this.d_byte_Array[1]);
		}
		this.b_int = integer9;
	}

	public final void b_void_Graphics_String_int_int_int(Graphics graphics, String string, int integer3, int integer4,
			int integer5) {
		int var6 = 0;
		int var7 = string.length();
		int[] var8 = new int[100];

		for (int var9 = 0; var9 < var7; var9++) {
			if (string.charAt(var9) == '\n') {
				var8[var6++] = var9;
			}
		}

		int var12;
		label33: {
			var8[var6++] = var7;
			var12 = this.e_int + (this.a_byte_Array[1] & 255);
			int var14;
			int var10000;
			if ((integer5 & 32) != 0) {
				var10000 = integer4;
				var14 = var12 * (var6 - 1);
			} else {
				if ((integer5 & 2) == 0) {
					break label33;
				}

				var10000 = integer4;
				var14 = var12 * (var6 - 1) >> 1;
			}

			integer4 = var10000 - var14;
		}

		for (int var10 = 0; var10 < var6; var10++) {
			f_int = var10 > 0 ? var8[var10 - 1] + 1 : 0;
			g_int = var8[var10];
			this.a_void_Graphics_String_int_int_int(graphics, string, integer3, integer4 + var10 * var12, integer5);
		}

		f_int = -1;
		g_int = -1;
	}

	public final void a_void_boolean(boolean boolean1) {
		this.a_byte_Array = null;
		this.b_byte_Array = null;
		this.a_short_Array = null;
		this.c_byte_Array = null;
		this.d_byte_Array = null;
		this.e_byte_Array = null;
		this.b_short_Array = null;
		this.f_byte_Array = null;
		if (this.a_int_2d_Array != null) {
			for (int var2 = 0; var2 < this.a_int_2d_Array.length; var2++) {
				this.a_int_2d_Array[var2] = null;
			}

			this.a_int_2d_Array = (int[][]) null;
		}

		if (this.b_int_2d_Array != null) {
			for (int var4 = 0; var4 < this.b_int_2d_Array.length; var4++) {
				this.b_int_2d_Array[var4] = null;
			}

			this.b_int_2d_Array = (int[][]) null;
		}

		this.g_byte_Array = null;
		this.c_short_Array = null;
		if (boolean1 && this.a_Image_2d_Array != null) {
			for (int var5 = 0; var5 < this.a_Image_2d_Array.length; var5++) {
				if (this.a_Image_2d_Array[var5] != null) {
					for (int var3 = 0; var3 < this.a_Image_2d_Array[var5].length; var3++) {
						this.a_Image_2d_Array[var5][var3] = null;
					}
				}
			}

			this.a_Image_2d_Array = (Image[][]) null;
		}
	}
}
