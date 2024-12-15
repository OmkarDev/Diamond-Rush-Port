import javax.microedition.lcdui.Graphics;

public final class g {
	public int a_int;
	public int b_int;
	public int c_int;
	public int d_int;
	public int e_int;
	public a a_a;
	public int f_int;
	public int g_int;
	public int h_int;
	public g a_g;

	public g() {
	}

	public g(a a, int integer2, int integer3, g g) {
		this.a_int = integer2 << 0;
		this.b_int = integer3 << 0;
		this.a_a = a;
		this.a_g = g;
	}

	public final void a_void_int(int integer) {
		if (integer != this.f_int) {
			this.f_int = integer;
			this.g_int = 0;
			this.h_int = 0;
			this.c_int = 0;
			this.d_int = 0;
		}
	}

	public final void a_void() {
		int var1 = (this.a_a.b_short_Array[this.f_int] + this.g_int) * 5;
		this.c_int = (this.a_a.f_byte_Array[var1 + 2] << 0) * 1 / 1;
		if ((this.e_int & 1) != 0) {
			this.c_int = -this.c_int;
		}

		this.d_int = (this.a_a.f_byte_Array[var1 + 3] << 0) * 1 / 1;
		if ((this.e_int & 2) != 0) {
			this.d_int = -this.d_int;
		}

		this.a_int = this.a_int + this.c_int;
		this.b_int = this.b_int + this.d_int;
	}

	public final boolean a_boolean() {
		int var1;
		return this.g_int != this.a_a.a_int_int(this.f_int) - 1 ? false : (var1 = this.a_a.a_int_int_int(this.f_int, this.g_int)) == 0 || this.h_int == var1 - 1;
	}

	public final void a_void_Graphics(Graphics graphics) {
		if (this.a_a != null) {
			int var2 = this.a_int;
			int var3 = this.b_int;
			g var10000 = this;

			g var4;
			while ((var4 = var10000.a_g) != null) {
				var2 += var4.a_int;
				var3 += var4.b_int;
				var10000 = var4;
			}

			var2 = a_int_int(var2) + 0;
			var3 = b_int_int(var3) + 0;
			if (this.h_int >= 0) {
				this.a_a.a_void_Graphics_int_int_int_int_int_int_int(graphics, this.f_int, this.g_int, var2, var3, this.e_int, 0, 0);
			} else if (this.f_int >= 0) {
				this.a_a.a_void_Graphics_int_int_int_int(graphics, this.f_int, var2, var3, this.e_int);
			} else {
				if (this.g_int >= 0) {
					this.a_a.a_void_Graphics_int_int_int_int_int_int(graphics, this.g_int, var2, var3, this.e_int, 0, 0);
				}
			}
		}
	}

	public final void b_void() {
		if (this.a_a != null) {
			if (this.h_int >= 0) {
				int var1;
				if ((var1 = this.a_a.a_int_int_int(this.f_int, this.g_int)) != 0) {
					this.h_int++;
					if (var1 <= this.h_int) {
						this.h_int = 0;
						this.g_int++;
						if (this.g_int >= this.a_a.a_int_int(this.f_int)) {
							this.g_int = 0;
							this.c_int = 0;
							this.d_int = 0;
						}
					}
				}
			}
		}
	}

	private static int a_int_int(int integer) {
		return (integer >> 0) * 1 / 1;
	}

	private static int b_int_int(int integer) {
		return (integer >> 0) * 1 / 1;
	}
}
