import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.RecordStore;

import utils.Utils;

public final class i extends GameCanvas implements Runnable {
	public static i a_i;
	public int a_int = 40;
	public int b_int;
	public boolean a_boolean = false;
	public boolean b_boolean;
	public int c_int = 0;
	public int d_int;
	public String a_String;
	public boolean c_boolean;
	public int e_int;
	public int f_int;
	public int g_int;
	public int h_int;
	public int i_int;
	public String b_String;
	public String c_String;
	public int j_int;
	public boolean d_boolean;
	public boolean e_boolean;
	public byte a_byte;
	public int k_int;
	public int l_int;
	public int m_int;
	public int n_int;
	public int o_int;
	public int p_int;
	public int q_int;
	public static boolean[] a_boolean_Array = new boolean[] { true, false, false };
	public int r_int;
	public static boolean[] b_boolean_Array = new boolean[] { false, false, false };
	public boolean f_boolean;
	public int s_int;
	public int t_int;
	public int u_int;
	public int v_int;
	public int w_int;
	public int x_int;
	public int y_int;
	public int z_int;
	public boolean g_boolean;
	public int A_int;
	public int B_int;
	public int C_int;
	public int D_int;
	public int E_int;
	public int F_int;
	public int G_int;
	public int H_int;
	public boolean h_boolean;
	public boolean i_boolean;
	public int I_int;
	public int J_int;
	public int K_int;
	public int L_int;
	public int M_int;
	public int N_int;
	public int O_int;
	public byte b_byte;
	public byte c_byte;
	public byte d_byte;
	public byte e_byte;
	public byte f_byte;
	public byte g_byte;
	public boolean j_boolean;
	public int P_int;
	public int Q_int;
	public int R_int;
	public static byte[] a_byte_Array = new byte[16];
	public static byte[] b_byte_Array = new byte[8];
	public static byte[] c_byte_Array = new byte[8];
	public int S_int;
	public int T_int;
	public byte h_byte;
	public static boolean k_boolean;
	public int U_int;
	public int V_int;
	public static int W_int;
	public boolean l_boolean;
	public boolean m_boolean;
	public int X_int;
	public int Y_int;
	public static byte[] d_byte_Array;
	public byte i_byte;
	public int Z_int;
	public int aa_int;
	public int ab_int;
	public int ac_int;
	public boolean n_boolean;
	public int ad_int;
	public int ae_int;
	public int af_int;
	public int ag_int;
	public int ah_int;
	public int ai_int;
	public boolean o_boolean;
	public boolean p_boolean;
	public boolean q_boolean;
	public boolean r_boolean;
	public int aj_int;
	public int ak_int;
	public static byte[] e_byte_Array;
	public int al_int;
	public int am_int;
	public int an_int;
	public byte j_byte;
	public byte k_byte;
	public int ao_int;
	public int ap_int;
	public int aq_int;
	public int ar_int;
	public int as_int;
	public int at_int;
	public int au_int;
	public int av_int;
	public int aw_int;
	public int ax_int;
	public int ay_int;
	public int az_int;
	public int aA_int;
	public int aB_int;
	public int aC_int;
	public int aD_int;
	public int aE_int;
	public int aF_int;
	public int aG_int;
	public int aH_int;
	public int aI_int;
	public int aJ_int;
	public int aK_int;
	public int aL_int;
	public static byte l_byte = 0;
	public int aM_int;
	public static byte m_byte = l_byte;
	public boolean s_boolean;
	public static int aN_int;
	public static int aO_int;
	public long a_long;
	public boolean t_boolean;
	public int aP_int;
	public int aQ_int;
	public int aR_int;
	public int aS_int;
	public int aT_int;
	public boolean u_boolean;
	public int aU_int;
	public int aV_int;
	public boolean v_boolean;
	public byte n_byte;
	public int aW_int;
	public long b_long;
	public int aX_int;
	public int aY_int;
	public int aZ_int;
	public int ba_int;
	public int bb_int;
	public int bc_int;
	public int bd_int;
	public int be_int;
	public int bf_int;
	public byte o_byte;
	public int bg_int;
	public int bh_int;
	public int bi_int;
	public int bj_int;
	public int bk_int;
	public int bl_int;
	public int bm_int;
	public boolean w_boolean;
	public int bn_int;
	public boolean x_boolean;
	public int bo_int;
	public int bp_int;
	public int bq_int;
	public int br_int;
	public int bs_int;
	public int bt_int;
	public int bu_int;
	public int bv_int;
	public int bw_int;
	public int bx_int;
	public int by_int;
	public int bz_int;
	public int bA_int;
	public int bB_int;
	public int bC_int;
	public boolean y_boolean;
	public int bD_int;
	public int bE_int;
	public int bF_int;
	public int bG_int;
	public int bH_int;
	public int bI_int;
	public int bJ_int;
	public int bK_int;
	public int bL_int;
	public int bM_int;
	public int bN_int;
	public int bO_int;
	public int bP_int;
	public int bQ_int;
	public int bR_int;
	public int bS_int;
	public int bT_int;
	public int bU_int;
	public int bV_int;
	public int bW_int;
	public int bX_int;
	public int bY_int;
	public int bZ_int;
	public int ca_int;
	public int cb_int;
	public boolean z_boolean;
	public int cc_int;
	public int cd_int;
	public InputStream a_InputStream;
	public byte p_byte;
	public byte q_byte;
	public boolean A_boolean;
	public int ce_int;
	public int cf_int;
	public int cg_int;
	public int ch_int;
	public Graphics a_Graphics;
	public static Image a_Image;
	public static Image b_Image;
	public static Image c_Image;
	public static Image[][] a_Image_2d_Array;
	public static Image[][] b_Image_2d_Array;
	public static a[] a_a_Array;
	public static a a_a;
	public static byte[] f_byte_Array;
	public static g[] a_g_Array;
	public static a b_a;
	public static byte[] g_byte_Array = new byte[] { 0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0 };
	public static byte[] h_byte_Array = new byte[] { 0, 3, 4, 1, 2, 5, 6 };
	public long c_long;
	public long d_long;
	public boolean B_boolean;
	public static byte[] i_byte_Array = null;
	public static byte[] j_byte_Array = null;
	public static int[][] a_int_2d_Array;
	public static int[][] b_int_2d_Array;
	public static byte[][] a_byte_2d_Array;
	public static byte[][] b_byte_2d_Array;
	public static byte[][] c_byte_2d_Array;
	public static byte[] k_byte_Array;
	public boolean C_boolean;
	public int ci_int;
	public int cj_int;
	public int ck_int;
	public int cl_int;
	public static byte[] l_byte_Array;
	public static byte[] m_byte_Array;
	public static int cm_int;
	public static int cn_int;
	public static byte[] n_byte_Array;
	public static int[][] c_int_2d_Array;
	public static int[][] d_int_2d_Array;
	public static byte[][] d_byte_2d_Array;
	public static byte[][] e_byte_2d_Array;
	public static byte[] o_byte_Array;
	public final h a_h;
	public c a_c;
	public static c[] a_c_Array = null;
	public static byte[] p_byte_Array = null;
	public final Thread a_Thread;
	public static GloftDIRU a_GloftDIRU;
	public int co_int;
	public int cp_int;
	public int cq_int;
	public int cr_int;
	public int cs_int;
	public static a c_a;
	public int ct_int;
	public byte r_byte;
	public static boolean D_boolean = false;
	public long e_long;
	public long f_long;
	public long g_long;
	public boolean E_boolean;
	public boolean F_boolean;
	public boolean G_boolean;
	public boolean H_boolean;
	public boolean I_boolean;
	public boolean J_boolean;
	public boolean K_boolean;
	public boolean L_boolean;
	public boolean M_boolean;
	public int cu_int;
	public int cv_int;
	public int cw_int;
	public boolean N_boolean;
	public boolean O_boolean;
	public int cx_int;
	public int cy_int;
	public boolean P_boolean;
	public boolean Q_boolean;
	public int cz_int;
	public int cA_int;
	public boolean R_boolean;
	public boolean S_boolean;
	public int cB_int;
	public static Image d_Image = null;
	public static Graphics b_Graphics = null;
	public static int cC_int = 0;
	public static int cD_int = 0;
	public static int cE_int = -1;
	public static int cF_int = -1;
	public static int cG_int = -1;
	public static int cH_int = -1;
	public int cI_int;
	public int cJ_int;
	public int cK_int;
	public int cL_int;
	public static Image e_Image = null;
	public static int cM_int = 0;
	public static int cN_int = 0;
	public static int cO_int = 0;
	public int cP_int;
	public int cQ_int;
	public int cR_int;
	public int cS_int;
	public boolean T_boolean;
	public int cT_int;
	public int cU_int;
	public int cV_int;
	public int cW_int;
	public int cX_int;
	public int cY_int;
	public int cZ_int;
	public int da_int;
	public long h_long;
	public int db_int;
	public static Image f_Image = null;
	public static boolean U_boolean = false;
	public static boolean V_boolean = true;
	public long i_long;
	public boolean W_boolean;
	public boolean X_boolean;
	public boolean Y_boolean;
	public boolean Z_boolean;
	public boolean aa_boolean;
	public int dc_int;
	public int[] a_int_Array;
	public static byte s_byte = 0;
	public static final int[] b_int_Array = new int[] { 512, 16384, 131072, 131072, 4096 };
	public static int dd_int = 0;
	public static int de_int = 0;
	public static int df_int = 0;
	public byte t_byte;
	public byte u_byte;
	public boolean ab_boolean;
	public static byte[] q_byte_Array = new byte[16];
	public static byte[] r_byte_Array = new byte[16];
	public long j_long;
	public boolean ac_boolean;
	public int dg_int;
	public boolean ad_boolean;
	public long k_long;
	public long l_long;
	public boolean ae_boolean;
	public boolean af_boolean;
	public long m_long;
	public boolean ag_boolean;
	public boolean ah_boolean;
	public boolean ai_boolean;
	public boolean aj_boolean;
	public String d_String;
	public int dh_int;
	public int di_int;
	public int dj_int;
	public int dk_int;
	public static boolean ak_boolean = false;
	public static int dl_int;
	public static int dm_int;
	public static int dn_int;
	public static int do_int;
	public e a_e;
	public boolean al_boolean;
	public boolean am_boolean;
	public int dp_int;
	public int dq_int;
	public int dr_int;
	public byte v_byte;
	public int ds_int;
	public int dt_int;
	public int du_int;
	public int dv_int;
	public int dw_int;
	public byte w_byte;
	public int dx_int;
	public int dy_int;
	public byte x_byte;
	public byte y_byte;
	public int dz_int;
	public int dA_int;
	public int dB_int;
	public byte z_byte;
	public int dC_int;
	public int dD_int;
	public int dE_int;
	public byte A_byte;
	public int dF_int;
	public int dG_int;
	public static a d_a;
	public static int[][] e_int_2d_Array;
	public static long[] a_long_Array = new long[15];
	public static long[] b_long_Array = new long[15];
	public static int[][] f_int_2d_Array;
	public static long[] c_long_Array;
	public static long[] d_long_Array;
	public static boolean an_boolean;
	public int dH_int;
	public int dI_int;
	public static long[][] a_long_2d_Array;
	public static StringBuffer a_StringBuffer;
	public static StringBuffer b_StringBuffer;
	public static StringBuffer c_StringBuffer;
	public static Image g_Image;
	public static Graphics c_Graphics;
	public int dJ_int;
	public int dK_int;
	public int dL_int;
	public int dM_int;
	public int dN_int;
	public int dO_int;
	public int dP_int;
	public int dQ_int;
	public int dR_int;
	public int dS_int;
	public int dT_int;
	public boolean ao_boolean;
	public boolean ap_boolean;
	public int dU_int;
	public int dV_int;
	public int dW_int;
	public int dX_int;
	public static int dY_int;
	public int dZ_int;
	public int ea_int;
	public int eb_int;
	public int ec_int;
	public int ed_int;
	public int ee_int;
	public int ef_int;
	public int eg_int;
	public boolean aq_boolean;
	public boolean ar_boolean;
	public boolean as_boolean;
	public int[] c_int_Array;
	public int eh_int;
	public int ei_int;
	public int ej_int;
	public int ek_int;
	public int el_int;
	public boolean at_boolean;
	public boolean au_boolean;
	public boolean av_boolean;
	public long n_long;
	public int em_int;
	public String e_String;
	public StringBuffer d_StringBuffer;
	public boolean aw_boolean;
	public boolean ax_boolean;
	public int en_int;
	public int eo_int;
	public static final short[][] a_short_2d_Array = new short[][] { { 0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6 },
			{ 0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6 }, { 0, 28, 1, 29, 2, 30, 3, 31 }, { 0, 32, 1, 33 },
			{ 0, 45, 1, 46 }, { 0, 33, 1, 50 }, { 0, 25, 4, 27 }, { 0, 101, 1, 100 } };
	public static final int[] d_int_Array = new int[] { 28, 29, 30 };
	public static final int[][] g_int_2d_Array = new int[][] { { 8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23 },
			{ 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22 },
			{ 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47 } };
	public static String[] a_String_Array;
	public static byte[] s_byte_Array = null;
	public static final String[] b_String_Array = new String[] { "/w0.bin", "/w1.bin", "/w2.bin" };
	public static int ep_int = 0;
	public long o_long;
	public String f_String;
	public int eq_int;
	public int er_int;
	public int es_int;
	public int et_int;

	public i(GloftDIRU gloftDIRU) {
		super(false);
		this.d_int = f.a_int_Array[this.c_int];
		this.a_String = "";
		this.c_boolean = true;
		this.e_int = 0;
		this.f_int = 0;
		this.g_int = 0;
		this.h_int = this.f_int;
		this.i_int = this.g_int;
		this.b_String = "";
		this.c_String = "";
		this.j_int = -1;
		this.d_boolean = false;
		this.e_boolean = true;
		this.a_byte = 0;
		this.k_int = 0;
		this.l_int = 0;
		this.m_int = 0;
		this.n_int = 0;
		this.o_int = 0;
		this.p_int = 0;
		this.q_int = 0;
		this.r_int = 0;
		this.f_boolean = false;
		this.s_int = -1;
		this.t_int = 10;
		this.u_int = 10;
		this.v_int = 0;
		this.w_int = 0;
		this.x_int = 0;
		this.y_int = 0;
		this.z_int = 0;
		this.g_boolean = false;
		this.A_int = 0;
		this.B_int = -1;
		this.C_int = -1;
		this.D_int = 0;
		this.E_int = 0;
		this.F_int = 0;
		this.G_int = 0;
		this.H_int = 0;
		this.h_boolean = false;
		this.i_boolean = false;
		this.I_int = 0;
		this.J_int = 0;
		this.K_int = 0;
		this.L_int = 0;
		this.M_int = 0;
		this.N_int = 0;
		this.O_int = 0;
		this.b_byte = 1;
		this.c_byte = 1;
		this.d_byte = 3;
		this.e_byte = 3;
		this.f_byte = 2;
		this.g_byte = 0;
		this.j_boolean = false;
		this.V_int = 0;
		this.l_boolean = true;
		this.i_byte = 0;
		this.Z_int = 0;
		this.o_boolean = false;
		this.p_boolean = false;
		this.q_boolean = false;
		this.r_boolean = false;
		this.j_byte = 0;
		this.k_byte = 0;
		this.s_boolean = false;
		this.aY_int = 0;
		this.ba_int = 0;
		this.bm_int = -1;
		this.bD_int = 0;
		this.bW_int = 0;
		this.bX_int = 0;
		this.bY_int = 0;
		this.bZ_int = 0;
		this.ca_int = 0;
		this.cb_int = 0;
		this.A_boolean = false;
		this.B_boolean = false;
		this.a_c = null;
		this.co_int = -1;
		this.cp_int = -1;
		this.r_byte = 0;
		this.E_boolean = false;
		this.F_boolean = false;
		this.G_boolean = false;
		this.H_boolean = false;
		this.I_boolean = false;
		this.J_boolean = false;
		this.K_boolean = false;
		this.L_boolean = false;
		this.M_boolean = false;
		this.cu_int = -1;
		this.O_boolean = false;
		this.P_boolean = false;
		this.Q_boolean = false;
		this.cP_int = -1;
		this.cQ_int = -1;
		this.cR_int = -1;
		this.cS_int = -1;
		this.T_boolean = true;
		this.cW_int = 2;
		this.cX_int = 0;
		this.cZ_int = 3;
		this.da_int = -1;
		this.h_long = 0L;
		this.db_int = -1;
		this.i_long = 0L;
		this.aa_boolean = false;
		this.dc_int = 0;
		this.a_int_Array = new int[] { 0, 0, 0, 0, 0 };
		this.ab_boolean = false;
		this.j_long = 0L;
		this.dg_int = 0;
		this.k_long = 0L;
		this.l_long = 0L;
		this.ae_boolean = false;
		this.af_boolean = false;
		this.aj_boolean = false;
		this.dh_int = 0;
		this.al_boolean = false;
		this.am_boolean = true;
		this.dp_int = -1;
		this.dy_int = -1;
		this.x_byte = 3;
		this.dJ_int = 100;
		this.ao_boolean = true;
		this.aq_boolean = true;
		this.ar_boolean = true;
		this.as_boolean = true;
		this.ej_int = 2;
		this.el_int = 2;
		this.au_boolean = true;
		this.av_boolean = true;
		this.n_long = 0L;
		this.em_int = -1;
		this.d_StringBuffer = new StringBuffer();
		this.aw_boolean = true;
		this.ax_boolean = true;
		this.o_long = System.currentTimeMillis();
		a_i = this;
		this.ay_int = -1;
		this.aA_int = -1;
		this.aC_int = -1;
		a_g_Array = new g[6];
		a_a_Array = new a[61];
		this.ci_void();
		a_Image_2d_Array = new Image[33][];
		b_Image_2d_Array = new Image[2][];
		a_GloftDIRU = gloftDIRU;
		this.a_h = new h();
		k_boolean = true;
		this.setFullScreenMode(true);
		this.B_void();
		this.a_Thread = new Thread(this);
		this.a_Thread.start();
	}

	private void a_void_int_int_int(int integer1, int integer2, int integer3) {
		this.aA_int = -1;
		this.aD_int = -1;
		this.aC_int = -1;
		g var4 = a_g_Array[(this.aS_int & 16384) == 0 ? 0 : 3];
		int var5;
		if ((var5 = (var4).f_int) != 40) {
			if (var5 != 48) {
				if (var5 != 47) {
					if (this.b_long <= 0L && this.aW_int == 0 && this.bi_int == 0 && this.k_byte != 6
							&& (this.aS_int & 112) == 0 || this.aT_int > 0) {
						this.bc_int++;
						this.a_void_byte((byte) (this.n_byte - integer1));
						if (this.bl_int == 0 && this.n_byte == 0) {
							this.k_long = 0L;
							this.co_int = this.bE_int;
							this.cp_int = this.bF_int;
							c_a = null;
						}

						this.aS_int = this.aS_int & -113 | integer2;
						this.C_void_int(5);
						switch (integer2) {
						case 16:
							this.aj_int = this.ak_int = 0;
							this.aT_int = 5;
							a_byte_2d_Array[this.aP_int][this.aQ_int] = 9;
							this.aS_int = this.aS_int & -113 | 0;
							b_int_2d_Array[this.aP_int][this.aQ_int] = 138412032;
							c_byte_2d_Array[this.aP_int][this.aQ_int] = 24;
							return;
						case 64:
							this.n_void_int(1000);
							return;
						}

						this.n_void_int(10);
						if (integer3 != 0) {
							byte var6 = (byte) integer3;

							do {
								int var7 = this.aP_int - g_byte_Array[var6];
								int var8 = this.aQ_int - g_byte_Array[var6 + 8];
								if (a_byte_2d_Array[var7][var8] < 0 && (byte) (a_int_2d_Array[var7][var8] & 0xFF) < 0) {
									this.aP_int = var7;
									this.aQ_int = var8;
									this.aR_int = 18;
									this.j_byte = 0;
									this.aS_int = this.aS_int & -8 | var6 | 2048;
									return;
								}
							} while ((var6 = var6 >= 4 ? 1 : (byte) (var6 + 1)) != integer3);
						}
					}
				}
			}
		}
	}

	private void a_void_byte(byte byte1) {
		label14: {
			this.n_byte = byte1;
			i var10000;
			byte var10001;
			if (this.n_byte <= 0) {
				var10000 = this;
				var10001 = 0;
			} else {
				if (this.n_byte <= i_byte_Array[8]) {
					break label14;
				}

				var10000 = this;
				var10001 = i_byte_Array[8];
			}

			var10000.n_byte = var10001;
		}

		this.B_void();
	}

	public final void a_void_int(int integer) {
		this.bp_int = this.bo_int;
		this.x_boolean = false;
		this.bq_int = 0;
		this.bo_int = integer;
		this.cT_int = 0;
		if (integer >= 0) {
			this.al_void();
		}
	}

	public static boolean a_boolean_int(int integer) {
		return (W_int & integer) != 0;
	}

	public final void keyPressed(int integer) {
		int var2 = g_int_int(integer);
		W_int |= var2;
		this.b_boolean = false;
	}

	public final void keyReleased(int integer) {
		W_int = W_int & ~g_int_int(integer);
		this.b_boolean = true;
	}

	private void g_void() {
		this.a_long = System.currentTimeMillis();
		aN_int = 0;
		aO_int = 0;
		this.Z_int = 0;
	}

	private static void a_void_long(long long1) {
		if (long1 > 0L) {
			System.currentTimeMillis();

			try {
				Thread.sleep(long1);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public final void run() {
		this.a_long = System.currentTimeMillis();
		this.g_void();
		this.H_void();

		while (!this.z_boolean) {
			Thread.yield();
			if (!this.ae_boolean) {
				this.e_long = System.currentTimeMillis();
				try {
					this.h_void();
				} catch (Exception var2) {
					var2.printStackTrace();
					a_void_long(5000L);
				}

				if (this.z_boolean) {
					break;
				}

				if (l_byte != 2) {
					aN_int++;
				}

				this.f_long = System.currentTimeMillis();
				if (this.g_long > 65L) {
					a_void_long(100L - this.g_long - this.f_long);
					this.t_boolean = true;
					this.g_long = 0L;
				} else {
					this.a_void_Graphics(this.getGraphics());

					// unofficial line
					LoaderCustom.canvas = Utils.deepCopy(platformImage.getCanvas());

					this.flushGraphics();
					this.t_boolean = false;
					if (l_byte != 2) {
						aO_int++;
					}
					this.g_long = Math.abs(System.currentTimeMillis() - this.e_long);
					a_void_long(50L - (System.currentTimeMillis() - this.e_long));
				}
			}
		}

		this.A_void();
		this.a_h.d_void();
		a_GloftDIRU.a_void();
	}

	private void h_void() throws Exception {
		this.cJ_void();
		this.aQ_void();
		switch (i.l_byte) {
		case 22: {
			this.cH_void();
			return;
		}
		case 21: {
			this.B_void_int(this.bs_int++);
			this.g_void();
			return;
		}
		case 20: {
			if (i.aN_int > 30) {
				this.A_boolean = true;
				this.I_boolean = true;
				this.G_boolean = true;
				this.ct_void();
				return;
			}
			break;
		}
		case 35: {
			this.q_void_int(this.bs_int++);
			this.g_void();
			if (this.bs_int == 12) {
				i.l_byte = 17;
				this.aM_int = 0;
				this.C_void_int(15);
				return;
			}
			break;
		}
		case 17: {
			this.bi_void();
			return;
		}
		case 31: {
			return;
		}
		case 16: {
			this.B_boolean = true;
			this.t_void();
			i.W_int = 0;
			return;
		}
		case 0: {
			(i.a_g_Array[0] = new g(a_a_String_int("/ui.f", 0), 0, 0, null)).a_void_int(0);
			i.l_byte = 6;
			this.g_void();
			return;
		}
		case 6: {
			if (i.aN_int < 60) {
				i.a_g_Array[0].b_void();
				return;
			}
			i.a_String_Array = a_String_Array_String_int("/lang.f", 115);
			cL_void();
			i.a_a_Array[18] = a_a_String_int("/ui.f", 3);
			this.A_void();
			this.a_void_int(3);
			i.l_byte = 7;
			return;
		}
		case 7: {
			if (this.x_boolean) {
				i.l_byte = 8;
				this.bs_int = 0;
				this.br_int = 32;
				return;
			}
			break;
		}
		case 1: {
			this.be_void();
			return;
		}
		case 3: {
			this.z_boolean = true;
			return;
		}
		case 9: {
			try {
				if ((i.j_byte_Array[0] & 0x1) == 0x0) {
					this.al_boolean = true;
				}
				this.F_void();
				int integer2 = (this.br_int == 8) ? this.bs_int : (this.bs_int - 24);
				this.m_void_int(integer2);
				++integer2;
				++this.bs_int;
				this.X_boolean = true;
				if (integer2 == 8) {
					if (this.E_boolean) {
						i.l_byte = 4;
						if (this.bo_int == -1) {
							this.a_void_int(this.aM_int = 0);
						} else {
							this.aM_int = 2;
						}
					} else {
						i.l_byte = 30;
						this.E_boolean = true;
					}
					this.a_h.b_void_int(19);
				}
			} catch (final Exception ex) {
				ex.printStackTrace();
			}
			this.g_void();
			return;
		}
		case 11: {
			this.I_boolean = true;
			this.G_boolean = true;
			i.l_byte = 5;
			this.Q_boolean = true;
			this.g_void();
			return;
		}
		case 5: {
			if (this.B_boolean && this.bs_int <= 5) {
				this.k_void_int(this.bs_int++);
				for (int integer2 = 0; integer2 < 3; ++integer2) {
					i.b_boolean_Array[integer2] = false;
				}
				for (int integer2 = 1; integer2 < 3; ++integer2) {
					i.a_boolean_Array[integer2] = false;
				}
				this.g_void();
				if (this.bs_int == 5) {
					this.M_boolean = true;
					this.L_boolean = true;
					this.K_boolean = true;
					this.ap_int = 0;
					this.aq_int = 13;
					i.W_int = 0;
				}
			} else {
				this.o_void();
			}
			this.g_void();
			return;
		}
		case 8: {
			this.d_void_int(this.bs_int++);
			this.g_void();
			return;
		}
		case 2:
		case 12: {
			return;
		}
		case 15: {
			this.m_void();
			return;
		}
		case 27: {
			this.n_void();
			return;
		}
		case 28: {
			try {
				this.c_void_int(this.bs_int);
				++this.bs_int;
				if (this.bs_int == 11) {
					i.l_byte = 27;
				}
			} catch (final Exception ex2) {
				ex2.printStackTrace();
			}
			this.g_void();
			return;
		}
		case 29: {
			this.j_void();
			break;
		}
		}
	}

	private void i_void() {
		label25: {
			i var10000;
			byte var10001;
			if (this.O_int >= this.d_byte) {
				var10000 = this;
				var10001 = -1;
			} else {
				if (this.O_int > -this.d_byte) {
					break label25;
				}

				var10000 = this;
				var10001 = 1;
			}

			var10000.b_byte = var10001;
		}

		label19: {
			this.O_int = this.O_int + this.b_byte * this.f_byte;
			i var1;
			byte var2;
			if (this.N_int >= this.e_byte) {
				var1 = this;
				var2 = -1;
			} else {
				if (this.O_int > -this.e_byte) {
					break label19;
				}

				var1 = this;
				var2 = 1;
			}

			var1.c_byte = var2;
		}

		this.N_int = this.N_int + this.c_byte * this.g_byte;
	}

	private void j_void() {
		switch (this.L_int) {
		case 0:
			if (System.currentTimeMillis() - this.a_long >= 3000L) {
				this.L_int++;
				this.g_void();
				return;
			}
			break;
		case 1:
			i var10000;
			boolean var10001;
			if (aN_int % 6 >= 3) {
				this.M_int += 1677721;
				var10000 = this;
				var10001 = false;
			} else {
				var10000 = this;
				var10001 = true;
			}

			var10000.aw_boolean = var10001;
			if (System.currentTimeMillis() - this.a_long >= 5000L) {
				this.L_int++;
				this.aw_boolean = true;
				this.g_void();
				return;
			}
			break;
		case 2:
			this.i_void();
			if (System.currentTimeMillis() - this.a_long >= 10000L) {
				this.N_int = 0;
				this.O_int = 0;
				this.g_void();
				this.L_int++;
				return;
			}
			break;
		case 3:
			if (System.currentTimeMillis() - this.a_long >= 1000L) {
				this.L_int++;
				return;
			}
			break;
		case 4:
			if (System.currentTimeMillis() - this.a_long >= 1000L) {
				this.L_int++;
				return;
			}
			break;
		case 5:
			if (System.currentTimeMillis() - this.a_long >= 1000L) {
				this.L_int++;
				return;
			}
			break;
		case 6:
			if (System.currentTimeMillis() - this.a_long >= 1000L) {
				this.L_int++;
				this.g_void();
				return;
			}
			break;
		case 7:
			if (System.currentTimeMillis() - this.a_long >= 1000L) {
				b.a_byte_2d_Array = new byte[12][13];
				this.L_int++;
				b.b_void_int(3);
				this.a_h.b_void_int(19);
				this.g_void();
				return;
			}
			break;
		case 8:
			b.a_void_int(3);
			this.aw_boolean = true;
			if (System.currentTimeMillis() - this.a_long >= 15000L) {
				this.L_int++;
				this.g_void();
				return;
			}
			break;
		case 9:
			this.aw_boolean = true;
			b.a_void_int(3);
			if (System.currentTimeMillis() - this.a_long >= 12000L) {
				this.L_int++;
				this.g_void();
				return;
			}
			break;
		case 10:
			this.A_void();
			this.a_void_int(0);
			l_byte = 22;
			this.aM_int = 0;
			this.a_h.e_void();
		}
	}

	private void k_void() {
		this.F_boolean = false;
		a_void_a_boolean(a_a_Array[17], true);
		a_a_Array[17] = null;
		int var1 = e.a_Image_Array.length;

		for (int var2 = 0; var2 < var1; var2++) {
			e.a_Image_Array[var2] = null;
		}

		e.a_Image_Array = null;
		a_void_a_boolean(a_a_Array[10], true);
		a_a_Array[10] = null;
		a_void_a_boolean(a_a_Array[46], true);
		a_a_Array[46] = null;
		a_void_a_boolean(a_a_Array[55], true);
		a_a_Array[55] = null;
		a_Image_2d_Array[8] = null;
		a_void_a_boolean(a_a_Array[59], true);
		a_Image_2d_Array[3] = null;
		a_void_a_boolean(a_a_Array[17], true);
		a_a_Array[17] = null;
		System.gc();
	}

	private void c_void_int(int integer) {
		switch (integer) {
		case 0:
			if (this.J_boolean) {
				this.z_void();
				return;
			}
			break;
		case 1:
			if (this.G_boolean) {
				this.cs_void();
				return;
			}
			break;
		case 2:
			if (this.L_boolean) {
				this.K_void();
				return;
			}
			break;
		case 3:
			if (this.K_boolean) {
				System.gc();
				this.K_boolean = false;
				return;
			}
			break;
		case 4:
			this.A_void();
			e.a_Image_Array = a_Image_Array_String_int("/demoui.f", 0);
			if (a_a_Array[10] == null) {
				a_a_Array[10] = a_a_String_int("/mmv.f", 0);
			}

			if (a_a_Array[46] == null) {
				a_a_Array[46] = a_a_String_int("/mmv.f", 5);
			}

			this.o_int = 240 - c_int_a_int(a_a_Array[10], 0) >> 1;
			this.p_int = 320 - b_int_a_int(a_a_Array[10], 0) - 48 >> 1;
			return;
		case 5:
			if (a_a_Array[55] == null) {
				a_a_Array[55] = a_a_String_int("/mmv.f", 4);
				this.m_int = a_int_a_int(a_a_Array[55], 0);
				b_a = a_a_Array[55];
			}

			if (a_a_Array[18] == null) {
				a_a_Array[18] = a_a_String_int("/ui.f", 3);
				return;
			}
			break;
		case 6:
			if (a_a_Array[54] == null) {
				a_a_Array[54] = a_a_String_int("/mmv.f", 1);
			}

			this.v_int = c_int_a_int(a_a_Array[54], 0) >> 1;
			this.w_int = b_int_a_int(a_a_Array[54], 0) >> 1;
			return;
		case 7:
			if (a_a_Array[53] == null) {
				a_a_Array[53] = a_a_String_int("/mmv.f", 2);
				return;
			}
			break;
		case 8:
			if (a_a_Array[52] == null) {
				a_a_Array[52] = a_a_String_int("/mmv.f", 3);
				return;
			}
			break;
		case 9:
			try {
				a var6 = a_a_String_int_int("/" + 0 + ".f", 3, 0);
				a_Image_2d_Array[8] = var6.a_Image_2d_Array[0];
				(var6 = a_a_String_int_int("/cm.f", 2, 0)).a_void_int_int_int_int(0, 0, -1, -1);
				var6.a_void_int_int_int_int(1, 0, 0, -1);
				a_a_Array[59] = var6;
				b.b_int = var6.a_Image_2d_Array[0].length;
				var6.g_byte_Array = null;
				if (a_a_Array[17] == null) {
					a_a_Array[17] = a_a_String_int("/ms.f", 0);
				}

				return;
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
		case 10:
			if (a_a_Array[9] == null) {
				a_a_Array[9] = a_a_String_int("/cm.f", 7);
			}

			this.y_int = a_int_a_int(a_a_Array[9], 5);
			byte var2 = i_byte_Array[2];

			for (int var3 = 0; var3 < 3; var3++) {
				if ((var2 & 1 << var3) != 0) {
					b_boolean_Array[var3] = true;
				}
			}

			label88: {
				this.t_int = 10;
				this.u_int = 10;
				boolean[] var10000;
				byte var10001;
				boolean var10002;
				if (((var2 = i_byte_Array[1]) & 1) != 0) {
					var10000 = a_boolean_Array;
					var10001 = 1;
					var10002 = true;
				} else {
					if (a_int_byte_Array_int(i_byte_Array, 6) >= f.b_int_Array[1]) {
						i_byte_Array[1] = (byte) (i_byte_Array[1] | 1);
						this.G_void();
						this.q_int = 1;
						this.e_int = 1;
						break label88;
					}

					var10000 = a_boolean_Array;
					var10001 = 1;
					var10002 = false;
				}

				var10000[var10001] = var10002;
			}

			label82: {
				boolean[] var8;
				byte var9;
				boolean var10;
				if ((var2 & 2) != 0) {
					var8 = a_boolean_Array;
					var9 = 2;
					var10 = true;
				} else {
					if (a_int_byte_Array_int(i_byte_Array, 6) >= f.b_int_Array[2]) {
						i_byte_Array[1] = (byte) (i_byte_Array[1] | 2);
						this.G_void();
						this.q_int = 2;
						this.e_int = 2;
						break label82;
					}

					var8 = a_boolean_Array;
					var9 = 2;
					var10 = false;
				}

				var8[var9] = var10;
			}

			this.f_int = f.d_int_Array[this.e_int << 1];
			this.g_int = f.d_int_Array[(this.e_int << 1) + 1];
			this.h_int = this.f_int;
			this.i_int = this.g_int;
			this.l_void();
			this.e_boolean = true;
			this.aw_boolean = true;
		}
	}

	private void l_void() {
		i var10000;
		StringBuffer var10001;
		String var10002;
		if (this.e_int == 3) {
			var10000 = this;
			var10001 = new StringBuffer();
			var10002 = a_String_Array[82];
		} else if (b_boolean_int(this.e_int)) {
			var10000 = this;
			var10001 = new StringBuffer();
			var10002 = a_String_Array[82];
		} else {
			var10000 = this;
			var10001 = new StringBuffer().append(f.b_int_Array[this.e_int]).append(" ");
			var10002 = a_String_Array[114].toLowerCase();
		}

		var10000.b_String = var10001.append(var10002).append(" ").append(a_String_Array[79]).toString();
		String[] var3;
		byte var4;
		switch (this.e_int) {
		case 0:
			var10000 = this;
			var3 = a_String_Array;
			var4 = 28;
			break;
		case 1:
			var10000 = this;
			var3 = a_String_Array;
			var4 = 29;
			break;
		case 2:
			var10000 = this;
			var3 = a_String_Array;
			var4 = 30;
			break;
		case 3:
			var10000 = this;
			var3 = a_String_Array;
			var4 = 31;
			break;
		default:
			return;
		}

		var10000.c_String = var3[var4];
	}

	private static boolean b_boolean_int(int integer) {
		return integer != 0 && integer != 3 ? a_int_byte_Array_int(i_byte_Array, 6) >= f.b_int_Array[integer] : true;
	}

	private void m_void() {
		if (this.J_int > 0 || this.K_int > 0) {
			StringBuffer var1 = new StringBuffer();
			if (this.J_int > 0) {
				label29: {
					var1.append(a_String_Array[92]).append("\n");
					byte[] var10000;
					byte var10001;
					byte var10002;
					byte var10003;
					switch (this.J_int) {
					case 1:
						var1.append(a_String_Array[29]);
						var10000 = i_byte_Array;
						var10001 = 2;
						var10002 = i_byte_Array[2];
						var10003 = 8;
						break;
					case 2:
						var1.append(a_String_Array[30]);
						i_byte_Array[2] = (byte) (i_byte_Array[2] | 8);
						var10000 = i_byte_Array;
						var10001 = 2;
						var10002 = i_byte_Array[2];
						var10003 = 16;
						break;
					default:
						break label29;
					}

					var10000[var10001] = (byte) (var10002 | var10003);
				}

				this.G_void();
				this.J_int = 0;
			}

			if (this.K_int > 0) {
				if (var1.length() > 0) {
					var1.append("\n\n");
				}

				var1.append(a_String_Array[99]).append("\n").append(a_String_Array[85 + this.K_int - 1]);
				this.K_int = 0;
			}

			if (var1.length() > 0) {
				this.a_void_String_int_int_int_int_int(var1.toString(), -1, -1, 5000, 4273165, 0);
			}
		}
	}

	// TODO CHANGED
	private void n_void() {
        if (!this.t_boolean) {
            this.h_int = this.f_int;
            this.i_int = this.g_int;
        }
        if (this.d_boolean) {
            W_int = 0;
            int n = this.k_int - this.f_int;
            int n2 = this.l_int - this.g_int;
            this.f_int += n / (8 - this.a_byte);
            this.g_int += n2 / (8 - this.a_byte);
            this.a_byte = (byte)(this.a_byte + 1);
            if (this.a_byte == 8) {
                this.f_int = this.k_int;
                this.g_int = this.l_int;
                this.d_boolean = false;
                this.a_byte = 0;
                this.e_boolean = true;
                this.l_void();
                return;
            }
        } else {
            switch (this.j_int) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.e_int) {
                        case 0: {
                            this.F_boolean = true;
                            this.G_boolean = true;
                            this.a_h.e_void();
                            this.ap_int = 0;
                            this.j_boolean = false;
                            l_byte = (byte)15;
                            dY_int = this.b_int_int(this.ap_int);
                            this.ct_void();
                            break;
                        }
                        case 1: {
                            if (!i.b_boolean_int(this.e_int)) break;
                            this.F_boolean = true;
                            this.G_boolean = true;
                            this.a_h.e_void();
                            this.ap_int = 1;
                            this.aq_int = 0;
                            l_byte = (byte)15;
                            dY_int = this.b_int_int(this.ap_int);
                            this.ct_void();
                            this.n_boolean = true;
                            this.j_boolean = false;
                            if (i_byte_Array[9] >= 1) break;
                            i.i_byte_Array[9] = 1;
                            break;
                        }
                        case 2: {
                            if (!i.b_boolean_int(this.e_int)) break;
                            this.F_boolean = true;
                            this.G_boolean = true;
                            this.a_h.e_void();
                            this.ap_int = 2;
                            this.aq_int = 0;
                            this.j_boolean = false;
                            l_byte = (byte)15;
                            dY_int = this.b_int_int(this.ap_int);
                            this.ct_void();
                            this.n_boolean = true;
                            if (i_byte_Array[9] >= 2) break;
                            i.i_byte_Array[9] = 2;
                            break;
                        }
                        case 3: {
                            l_byte = (byte)18;
                        }
                    }
                    break;
                }
                default: {
                    int n = f.a_byte_2d_Array[this.j_int][this.e_int];
                    if (n == -1) break;
                    this.e_int = n;
                    this.d_boolean = true;
                    this.k_int = f.d_int_Array[this.e_int * 2];
                    this.l_int = f.d_int_Array[this.e_int * 2 + 1];
                }
            }
            this.j_int = -1;
        }
    }


	private void d_void_int(int integer) {
		if (integer < 21) {
			if (integer == 0) {
				this.a_h.b_void();
			}

			this.a_h.a_void_int(integer);
			if (integer == 20) {
				this.a_h.c_void();
			}

			System.gc();
		} else {
			switch (integer) {
			case 21:
				a_a_Array[9] = a_a_String_int("/cm.f", 7);
				return;
			case 22:
				a_a_Array[0] = a_a_String_int("/ui.f", 2);
				return;
			case 23:
				b_Image_2d_Array[0] = a_Image_Array_String_int_int("/demoui.f", 0, 0);
				b_Image_2d_Array[1] = a_Image_Array_String_int_int("/demoui.f", 0, 1);
				return;
			case 24:
				this.a_h.a_void();
				l_byte = 9;
				this.a_void_int(-1);
				a_StringBuffer = new StringBuffer(a_String_Array[8]);
				a_StringBuffer.delete(a_StringBuffer.length() - 1, a_StringBuffer.length());
				b_StringBuffer = new StringBuffer(a_String_Array[20]);
				b_StringBuffer.delete(b_StringBuffer.length() - 1, b_StringBuffer.length());
				c_StringBuffer = new StringBuffer("1");
			}
		}
	}

	public static String[] a_String_Array_String_int(String string, int integer) {
		byte[] var2 = a_byte_Array_String_int(string, 0);
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		String[] var6 = new String[integer];

		while (var5 < integer) {
			if (var2[var3 + var4] == 0) {
				try {
					var6[var5] = new String(var2, var3, var4, "ISO-8859-1");
				} catch (Exception var8) {
					var8.printStackTrace();
				}

				var3 += var4 + 1;
				var4 = 0;
				var5++;
			} else {
				var4++;
			}
		}

		return var6;
	}

	private void o_void() {
		try {
			int var1 = this.bs_int;
			if (this.B_boolean) {
				var1 -= 5;
			}

			this.bs_int++;
			switch (var1) {
			case 0:
				if (this.M_boolean) {
					this.G_void();
				}

				return;
			case 1:
				if (this.L_boolean) {
					this.K_void();
				}

				return;
			case 2:
				if (this.K_boolean) {
					System.gc();
					this.K_boolean = false;
				}

				return;
			case 3:
				a_a_Array[41].a_void_int(1);
				a_a_Array[41].a_void_int(2);
				return;
			case 4:
				if (this.I_boolean) {
					this.A_void();
				}

				return;
			case 5:
				if (this.G_boolean) {
					this.cs_void();
				}

				return;
			case 6:
				label173: {
					int var11;
					i var10000;
					int var10001;
					if ((var11 = c_int()) < 1) {
						var10000 = this;
						var10001 = var11;
					} else {
						if ((this.V_int + 8) % 8 >= 1) {
							break label173;
						}

						var10000 = this;
						var10001 = 1;
					}

					var10000.V_int = var10001;
				}

				A_void_int(this.V_int % 8);
				return;
			case 7:
				this.D_void();
				return;
			case 8:
				V_void();
				this.M_void();
				return;
			case 9:
				this.bD_void();
				return;
			case 10:
				String var10 = "/" + this.ap_int + ".f";
				System.out.println("loaded "+var10);
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + var10));
				this.cc_int = this.a_InputStream.read();
				n_byte_Array = new byte[this.cc_int << 3];
				this.a_InputStream.read(n_byte_Array);
				return;
			default:
				int var2 = var1 - 10 - 1;
				if ((var2) < 4) {
					this.e_void_int(var2);
					this.bt_int = 0;
				} else {
					var2 -= 4;
					if (var2 >= 0 && var2 < 43) {
						this.g_void_int(var2);
					} else {
						var2 -= 43;
						if (var2 >= 0 && var2 < 8) {
							this.f_void_int(var2);
							if (var2 == 7) {
								this.a_InputStream.close();
								this.a_InputStream = null;
								System.gc();
							}
						} else {
							var2 -= 8;
							if (var2 >= 0 && var2 < 16) {
								if (var2 < a_c_Array.length) {
									a_c_Array[var2] = new c(this);
									a_c_Array[var2].a_void_int(p_byte_Array[var2]);
								}

								if (var2 == 15 && a_c_Array.length >= 16) {
									for (int var14 = 16; var14 < a_c_Array.length; var14++) {
										a_c_Array[var14] = new c(this);
										a_c_Array[var14].a_void_int(p_byte_Array[var14]);
									}
								}
							} else {
								var2 -= 16;
								if (var2 >= 0 && var2 < 3) {
									switch (this.i_byte) {
									case 1:
										this.i_void_int(var2);
										if (var2 == 2) {
											this.a_InputStream.close();
											this.a_InputStream = null;
										}

										return;
									case 2:
									default:
										return;
									case 3:
										if (var2 > 0) {
											return;
										}

										a var13 = a_a_String_int_int("/mmv.f", 1, 0);
										a_Image_2d_Array[31] = var13.a_Image_2d_Array[0];
										a_g_Array[5] = new g(a_a_String_int("/mm1.f", 0), 0, 0, null);
										a_g_Array[5].a_void_int(0);
										return;
									case 4:
										if (var2 >= 2) {
											return;
										}

										this.h_void_int(var2);
										a var12 = a_a_String_int_int("/mmv.f", 3, 0);
										a_Image_2d_Array[32] = var12.a_Image_2d_Array[0];
										a_a_Array[20] = a_a_String_int_int("/gen0.f", 7, 0);
										if (var2 == 1) {
											this.a_InputStream.close();
											this.a_InputStream = null;
										}

										return;
									case 5:
										a var3 = a_a_String_int_int("/mmv.f", 2, 0);
										a_Image_2d_Array[30] = var3.a_Image_2d_Array[0];
										a_a_Array[20] = a_a_String_int_int("/gen0.f", 7, 0);
										a_g_Array[5] = new g(a_a_String_int("/b1.f", 0), 0, 0, null);
										a_g_Array[5].a_void_int(10);
									}
								} else {
									var2 -= 3;
									switch (var2) {
									case 0:
										n_byte_Array = null;
										this.a_void_boolean(a_a_Array[12] != null || a_Image_2d_Array[6] != null
												|| a_a_Array[58] != null || this.i_byte == 1 || this.i_byte == 4
												|| this.i_byte == 5);
										return;
									case 1:
										this.c_long = 0L;
										this.d_long = 0L;
										this.bu_int = 0;
										this.V_int++;
										j_void_int(this.V_int < 3 ? this.V_int : 3);
										this.G_void();
										return;
									case 2:
										c_int_2d_Array = new int[this.av_int][this.aw_int];
										d_byte_2d_Array = new byte[this.av_int][this.aw_int];
										e_byte_2d_Array = new byte[this.av_int][this.aw_int];
										d_int_2d_Array = new int[this.av_int][this.aw_int];
										if (m_byte_Array != null) {
											o_byte_Array = new byte[m_byte_Array.length];
											return;
										}
										break;
									case 3:
										this.cm_void();
										return;
									case 4:
										this.bl_int = 0;
										this.S_int = this.T_int = 0;
										this.cf_void();
										return;
									case 5:
										this.bn_int = aN_int + 60;
										new StringBuffer(a_String_Array[38]).append("\n").append(this.P_int).append(" ")
												.append(a_String_Array[39]).toString();
										this.B_void();
										return;
									case 6:
										a_void_a_boolean(a_a, true);
										a_a = null;
										System.gc();
										return;
									case 7:
										this.B_boolean = false;
										f_byte_Array = null;
										System.gc();
										this.a_h.b_void_int(16 + this.ap_int);
										l_byte = 1;
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private static int a_int() {
		return i_byte_Array[8] - 4;
	}

	private void a_void_boolean(boolean boolean1) {
		try {
			System.out.println("loaded o.f");
			InputStream var2 = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/o.f"));
			byte[] var4 = new byte[(var2).read() << 3];
			var2.read(var4);
			byte[] var6 = new byte[b_int_byte_Array_int(var4, 4)];
			var2.read(var6);
			if (!boolean1) {
				var2.close();
				var2 = null;
				System.gc();
			}

			a var7;
			(var7 = new a()).a_void_byte_Array_int(var6, 0);
			this.cu_int = a_int();
			var7.a_void_int_int_int_int(this.cu_int, 0, -1, -1);
			var7.b_int = this.cu_int;
			var7.g_byte_Array = null;
			a_g_Array[0] = new g(var7, 0, 0, null);
			System.gc();
			if (boolean1) {
				var6 = new byte[b_int_byte_Array_int(var4, 12)];
				var2.read(var6);
				var2.close();
				System.gc();
				(var7 = new a()).a_void_byte_Array_int(var6, 0);
				var7.a_void_int_int_int_int(0, 0, -1, -1);
				var7.g_byte_Array = null;
				a_g_Array[3] = new g(var7, 0, 0, null);
				System.gc();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private int b_int() {
		return a_short_2d_Array[this.bo_int][this.bq_int << 1];
	}

	private void p_void() {
		a_a_Array[41].b_int = 0;
		this.x_boolean = true;
		switch (this.bo_int) {
		case 0:
			this.w_void();
			return;
		case 1:
			this.s_void();
			return;
		case 2:
			this.u_void();
			return;
		case 3:
			this.v_void();
			return;
		case 5:
			this.r_void();
		case 4:
		case 6:
		default:
			return;
		case 7:
			this.q_void();
		}
	}

	private void q_void() {
		switch (this.b_int()) {
		case 0:
			if (this.bp_int == 0) {
				l_byte = 4;
			}

			this.a_void_int(this.bp_int);
			break;
		case 1:
			switch (this.aM_int) {
			case 1:
				this.t_void();
			case 2:
			default:
				break;
			case 3:
				l_byte = 15;
				this.I_boolean = true;
				this.G_boolean = true;
				this.ct_void();
				break;
			case 4:
				this.A_void();
				l_byte = 9;
				this.br_int = 8;
				this.a_void_int(-1);
				this.bs_int = 0;
				break;
			case 5:
				l_byte = 3;
				this.a_h.d_void();
				a_GloftDIRU.notifyDestroyed();
			}
		}

		this.aM_int = -1;
	}

	private void r_void() {
		byte var10000;
		byte var10001;
		byte var10002;
		switch (this.b_int()) {
		case 0:
			h.a_boolean = !h.a_boolean;
			byte var1;
			if (h.a_boolean) {
				var1 = 32;
				this.C_void_int(0);
			} else {
				this.a_h.e_void();
				this.a_h.e_void();
				var1 = 33;
			}

			var10000 = 5;
			var10001 = 0;
			var10002 = var1;
			break;
		case 1:
			k_boolean = !k_boolean;
			byte var2 = 51;
			if (k_boolean) {
				var2 = 50;
				t_void_int(200);
			}

			var10000 = 5;
			var10001 = 1;
			var10002 = var2;
			break;
		default:
			return;
		}

		a_void_int_int_short(var10000, var10001, var10002);
	}

	private void s_void() {
		switch (this.b_int()) {
		case 0:
			l_byte = 1;
			g_Image = null;
			f_Image = null;
			return;
		case 1:
			this.a_void_int(7);
			this.aM_int = 1;
			return;
		case 2:
			this.a_void_int(5);
			return;
		case 3:
			if (this.aq_int != 13 || this.ap_int != 0) {
				this.a_void_int(7);
				this.aM_int = 3;
				return;
			}
			break;
		case 4:
			this.a_void_int(7);
			this.aM_int = 4;
			return;
		case 5:
			this.a_void_int(7);
			this.aM_int = 5;
			return;
		case 6:
			l_byte = 33;
			this.aw_boolean = true;
			return;
		default:
			this.x_boolean = false;
		}
	}

	private void t_void() {
		i var10000;
		byte var10001;
		if (this.B_boolean) {
			var10000 = this;
			var10001 = 97;
		} else {
			var10000 = this;
			var10001 = 92;
		}

		var10000.br_int = var10001;
		this.bs_int = 0;
		this.I_boolean = true;
		this.v_boolean = false;
		l_byte = 11;
		this.aS_int = this.k_byte = this.j_byte = 0;
		this.aA_int = this.aB_int = -1;
		this.b_long = 0L;
	}

	private void u_void() {
		switch (this.b_int()) {
		case 0:
			this.a_h.e_void();
			this.ap_int = 0;
			this.j_boolean = false;
			l_byte = 15;
			dY_int = this.b_int_int(this.ap_int);
			this.G_boolean = true;
			this.ct_void();
			return;
		case 1:
			this.a_h.e_void();
			this.ap_int = 1;
			this.aq_int = 0;
			l_byte = 15;
			dY_int = this.b_int_int(this.ap_int);
			this.G_boolean = true;
			this.ct_void();
			this.n_boolean = true;
			this.j_boolean = false;
			if (i_byte_Array[9] < 1) {
				i_byte_Array[9] = 1;
				return;
			}
			break;
		case 2:
			this.a_h.e_void();
			this.ap_int = 2;
			this.aq_int = 0;
			this.j_boolean = false;
			l_byte = 15;
			dY_int = this.b_int_int(this.ap_int);
			this.G_boolean = true;
			this.ct_void();
			this.n_boolean = true;
			if (i_byte_Array[9] < 2) {
				i_byte_Array[9] = 2;
			}

			if (i_byte_Array[8] < 8) {
				i_byte_Array[8] = 8;
				return;
			}
			break;
		case 3:
			this.a_void_int(4);
			return;
		default:
			l_byte = 3;
			this.a_h.d_void();
			a_GloftDIRU.a_void();
		}
	}

	private void v_void() {
		byte var1;
		label12: {
			var1 = 0;
			byte var10000;
			switch (this.b_int()) {
			case 0:
				h.a_boolean = true;
				var10000 = 32;
				break;
			case 1:
				h.a_boolean = false;
				var10000 = 33;
				break;
			default:
				break label12;
			}

			var1 = var10000;
		}

		this.aM_int = 0;
		a_void_int_int_short(5, 0, var1);
	}

	private void w_void() {
		switch (this.b_int()) {
		case 1:
			this.a_h.e_void();
			this.F_void();
			if (i_byte_Array != null && a_boolean()) {
				this.V_int = 0;
				this.L_boolean = true;
				this.n_boolean = true;
				this.bs_int = 0;
				l_byte = 28;
				return;
			}
		case 0:
			this.a_h.e_void();
			if (!a_boolean()) {
				this.aR_void();
				return;
			}

			this.P_boolean = true;
			this.B_boolean = false;
			l_byte = 31;
			return;
		case 2:
			this.a_void_int(5);
			this.a_h.e_void();
			return;
		case 3:
			l_byte = 33;
			this.a_h.e_void();
			this.aw_boolean = true;
			return;
		case 4:
			l_byte = 22;
			this.aM_int = 0;
			this.a_h.e_void();
			return;
		case 5:
			this.a_void_int(7);
			this.aM_int = 5;
			return;
		case 6:
			l_byte = 10;
			return;
		default:
			this.x_boolean = false;
		}
	}

	private void x_void() {
		this.bq_int--;
		if (this.bq_int < 0) {
			this.bq_int = (a_short_2d_Array[this.bo_int].length >> 1) - 1;
		}
	}

	private void y_void() {
		this.bq_int = (this.bq_int + 1) % (a_short_2d_Array[this.bo_int].length >> 1);
	}

	private void z_void() {
		this.J_boolean = false;
		if (a_c_Array != null) {
			int var1 = a_c_Array.length;

			for (int var2 = 0; var2 < var1; var2++) {
				a_void_c(a_c_Array[var2]);
				a_c_Array[var2] = null;
			}
		}

		a_c_Array = null;
		a_void_a_boolean(a_a_Array[42], true);
		a_void_a_boolean(a_a_Array[43], true);
		System.gc();
	}

	private static void a_void_c(c c2) {
		if (c2 == null) {
			return;
		}
		if (c.a_a_Array != null) {
			for (int n = 0; n < c.a_a_Array.length; ++n) {
				i.a_void_a_boolean(c.a_a_Array[n], true);
				c.a_a_Array[n] = null;
			}
		}
		if (c2.a_byte_2d_Array != null) {
			for (int n = 0; n < c2.a_byte_2d_Array.length; ++n) {
				c2.a_byte_2d_Array[n] = null;
			}
			c2.a_byte_2d_Array = null;
		}
		c2.a_byte_Array = null;
	}

	private static void a_void_a_boolean(a a, boolean boolean2) {
		if (a != null) {
			a.a_void_boolean(boolean2);
		}
	}

	private void A_void() {
		this.I_boolean = false;
		this.m_boolean = true;
		this.C_boolean = false;
		this.dh_int = 0;
		this.d_String = null;
		m_byte_Array = null;
		l_byte_Array = null;
		this.X_int = 0;
		this.Y_int = 0;
		d_byte_Array = null;
		e_byte_Array = null;
		this.a_InputStream = null;
		n_byte_Array = null;
		g_Image = null;
		c_Graphics = null;
		b_Graphics = null;
		d_Image = null;
		p_byte_Array = null;
		k_byte_Array = null;
		if (a_c_Array != null) {
			int var1 = a_c_Array.length;

			for (int var2 = 0; var2 < var1; var2++) {
				a_void_c(a_c_Array[var2]);
				a_c_Array[var2] = null;
			}
		}

		a_c_Array = null;
		if (this.a_c != null) {
			a_void_c(this.a_c);
			this.a_c = null;
		}

		if (a_Image_2d_Array != null) {
			for (int var4 = 0; var4 < 33; var4++) {
				if (a_Image_2d_Array[var4] != null) {
					int var7 = a_Image_2d_Array[var4].length;

					for (int var3 = 0; var3 < var7; var3++) {
						a_Image_2d_Array[var4][var3] = null;
					}

					a_Image_2d_Array[var4] = null;
				}
			}
		}

		a_void_a_boolean(d_a, true);
		System.gc();
		if (a_a_Array != null) {
			for (int var5 = 0; var5 < 61; var5++) {
				if (var5 != 41 && var5 != 0 && var5 != 9 && var5 != 18) {
					a_void_a_boolean(a_a_Array[var5], true);
					a_a_Array[var5] = null;
				}
			}
		}

		if (a_g_Array != null) {
			for (int var6 = 0; var6 < 6; var6++) {
				if (a_g_Array[var6] != null) {
					a_void_a_boolean(a_g_Array[var6].a_a, true);
					a_g_Array[var6].a_a = null;
					a_g_Array[var6] = null;
				}
			}
		}

		b_int_2d_Array = (int[][]) null;
		a_int_2d_Array = (int[][]) null;
		b_byte_2d_Array = (byte[][]) null;
		a_byte_2d_Array = (byte[][]) null;
		c_byte_2d_Array = (byte[][]) null;
		c_int_2d_Array = (int[][]) null;
		d_int_2d_Array = (int[][]) null;
		d_byte_2d_Array = (byte[][]) null;
		e_byte_2d_Array = (byte[][]) null;
		o_byte_Array = null;
		this.c_long = 0L;
		this.bu_int = 0;
		this.ay_int = -1;
		this.aA_int = -1;
		this.aC_int = -1;
		this.aD_int = -1;
		b_a = null;
		this.bK_int = -1;
		this.x_byte = 3;
		e_int_2d_Array = (int[][]) null;
		f_int_2d_Array = (int[][]) null;
		a_long_Array = null;
		c_long_Array = null;
		b_long_Array = null;
		d_long_Array = null;
		this.am_boolean = false;
		this.dp_int = -1;
		this.dq_int = 0;
		this.dr_int = 0;
		this.v_byte = 0;
		this.du_int = 0;
		this.dv_int = 0;
		this.dw_int = 0;
		this.w_byte = 0;
		this.dx_int = 0;
		this.dy_int = -1;
		this.j_boolean = false;
		e_byte_Array = null;
		ak_void();
		System.gc();
	}

	private void B_void() {
		this.m_boolean = true;
	}

	private void e_void_int(int integer) throws Exception {
		a var4;
		label20: {
			byte[] var3 = new byte[b_int_byte_Array_int(n_byte_Array, integer * 8 + 4)];
			this.a_InputStream.read(var3);
			(var4 = new a()).a_void_byte_Array_int(var3, 0);
			var4.a_void_int_int_int_int(0, 0, -1, -1);
			Object var10000;
			byte var10001;
			Object var10002;
			switch (integer) {
			case 0:
				if ((this.d_long & 1L) == 0L) {
					break label20;
				}

				var10000 = a_a_Array;
				var10001 = 60;
				var10002 = var4;
				break;
			case 1:
				if ((this.d_long & 2L) == 0L) {
					break label20;
				}

				var10000 = a_a_Array;
				var10001 = 16;
				var10002 = var4;
				break;
			case 2:
				a_Image_2d_Array[0] = null;
				var10000 = a_a_Array;
				var10001 = 42;
				var10002 = var4;
				break;
			case 3:
				var10000 = a_Image_2d_Array;
				var10001 = 8;
				var10002 = var4.a_Image_2d_Array[0];
				break;
			default:
				break label20;
			}

			((Object[]) var10000)[var10001] = var10002;
		}

		var4.g_byte_Array = null;
	}

	private void f_void_int(int integer) {
		try {
			if (integer == 0) {
				this.a_InputStream.close();
				this.a_InputStream = null;
				System.gc();
				System.out.println("loaded cm.f");
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/cm.f"));
				this.cc_int = this.a_InputStream.read();
				n_byte_Array = new byte[this.cc_int << 3];
				this.a_InputStream.read(n_byte_Array);
			}

			a var4;
			label34: {
				Object var10000;
				byte var10001;
				Object var10002;
				label33: {
					byte[] var3 = new byte[b_int_byte_Array_int(n_byte_Array, integer * 8 + 4)];
					this.a_InputStream.read(var3);
					(var4 = new a()).a_void_byte_Array_int(var3, 0);
					var4.a_void_int_int_int_int(0, 0, -1, -1);
					switch (integer) {
					case 0:
						var10000 = a_Image_2d_Array;
						var10001 = 11;
						break;
					case 1:
						switch (this.ap_int) {
						case 1:
						case 2:
							if (this.ap_int != 0) {
								var4.a_void_int_int_int_int(this.ap_int, 0, -1, -1);
								var4.a_void_int(0);
								var4.b_int = this.ap_int;
							}
						default:
							var10000 = a_a_Array;
							var10001 = 56;
							var10002 = var4;
							break label33;
						}
					case 2:
						var4.a_void_int_int_int_int(1, 0, 0, -1);
						var10000 = a_a_Array;
						var10001 = 59;
						var10002 = var4;
						break label33;
					case 3:
						a_a_Array[13] = var4;
						this.C_void();
						break label34;
					case 4:
						var10000 = a_Image_2d_Array;
						var10001 = 5;
						break;
					case 5:
						var10000 = a_Image_2d_Array;
						var10001 = 18;
						break;
					case 6:
						a_a_Array[43] = var4;
						var10000 = a_Image_2d_Array;
						var10001 = 20;
						var10002 = null;
						break label33;
					default:
						break label34;
					}

					var10002 = var4.a_Image_2d_Array[0];
				}

				((Object[]) var10000)[var10001] = var10002;
			}

			var4.g_byte_Array = null;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void C_void() {
		if ((this.d_long & 1L) == 0L) {
			for (int var1 = 0; var1 < 5; var1++) {
				a_a_Array[13].a_Image_2d_Array[0][var1] = null;
			}
		}
	}

	private void g_void_int(int integer) {
		try {
			if (integer % 10 == 0) {
				this.a_InputStream.close();
				this.a_InputStream = null;
				StringBuffer var2 = new StringBuffer("/gen").append(this.bt_int).append(".f");
				System.out.println("loaded " + var2.toString());
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + var2.toString()));
				this.cc_int = this.a_InputStream.read();
				n_byte_Array = new byte[this.cc_int << 3];
				this.a_InputStream.read(n_byte_Array);
				this.cd_int = 0;
				this.bt_int++;
			}

			int var9 = integer - (this.bt_int - 1) * 10;
			int var3 = b_int_byte_Array_int(n_byte_Array, var9 * 8 + 4);
			if ((this.c_long & 1L << integer) == 0L) {
				this.cd_int += var3;
				return;
			}

			if (this.cd_int != 0) {
				this.a_InputStream.skip((long) this.cd_int);
				this.cd_int = 0;
			}

			byte[] var4 = new byte[var3];
			this.a_InputStream.read(var4);
			a var5;
			(var5 = new a()).a_void_byte_Array_int(var4, 0);
			if ((integer != 28 || this.ag_boolean) && (integer != 24 || this.ai_boolean)) {
				var5.a_void_int_int_int_int(0, 0, -1, -1);
			}

			byte var6;
			byte var7;
			label103: {
				var6 = -1;
				var7 = -1;
				byte var10000;
				switch (integer) {
				case 0:
					var6 = 33;
					break label103;
				case 1:
					var6 = 34;
					break label103;
				case 2:
					if (this.ag_boolean) {
						a_Image_2d_Array[24] = var5.a_Image_2d_Array[0];
					}

					if (this.ah_boolean) {
						var5.a_void_int_int_int_int(1, 0, -1, -1);
						a_Image_2d_Array[25] = var5.a_Image_2d_Array[1];
					}
					break label103;
				case 3:
					var6 = 7;
					break label103;
				case 4:
				case 21:
					if (this.ap_int != 2) {
						var6 = 3;
					}
					break label103;
				case 5:
					var6 = 58;
					break label103;
				case 6:
					var10000 = 21;
					break;
				case 7:
					if (this.ap_int == 2) {
						var5.a_Image_2d_Array = (Image[][]) null;
						var5.a_void_int_int_int_int(1, 0, -1, -1);
						var5.b_int = 1;
					}

					var6 = 20;
					break label103;
				case 8:
					var6 = 5;
					break label103;
				case 9:
					var6 = 12;
					break label103;
				case 10:
					a_g_Array[4] = new g(var5, 0, 0, null);
					a_g_Array[4].a_void_int(0);
					break label103;
				case 11:
					var6 = 11;
					break label103;
				case 12:
					var10000 = 10;
					break;
				case 13:
					var6 = 1;
					break label103;
				case 14:
					var10000 = 6;
					break;
				case 15:
				case 17:
					if ((this.bu_int & 2) != 0) {
						if (this.ap_int == 2) {
							var5.a_Image_2d_Array = (Image[][]) null;
							var5.a_void_int_int_int_int(2, 0, -1, -1);
							var5.b_int = 2;
						}

						var6 = 4;
					}

					if ((this.bu_int & 1) != 0) {
						a_a_Array[21] = new a();
						a_a_Array[21].a_void_byte_Array_int(var4, 0);
						a_a_Array[21].a_void_int_int_int_int(1, 0, -1, -1);
						a_a_Array[21].b_int = 1;
						a_a_Array[21].g_byte_Array = null;
					}
					break label103;
				case 16:
				case 18:
					var6 = 37;
					break label103;
				case 19:
					var10000 = 7;
					break;
				case 20:
					var10000 = 13;
					break;
				case 22:
					var6 = 8;
					break label103;
				case 23:
					var6 = 30;
					break label103;
				case 24:
					a_Image_2d_Array[15] = null;
					var5.a_void_int_int_int_int(1, 0, -1, -1);
					var6 = 57;
					a_Image_2d_Array[14] = null;
					break label103;
				case 25:
					var10000 = 17;
					break;
				case 26:
					d_a = var5;
					break label103;
				case 27:
					var10000 = 19;
					break;
				case 28:
					if (this.ah_boolean) {
						var5.a_void_int_int_int_int(1, 0, -1, -1);
					}

					var6 = 45;
					break label103;
				case 29:
					var10000 = 26;
					break;
				case 30:
					var6 = 15;
					break label103;
				case 31:
					var10000 = 29;
					break;
				case 32:
					var6 = 32;
					break label103;
				case 33:
					var6 = 22;
					break label103;
				case 34:
					var6 = 27;
					break label103;
				case 35:
					var6 = 28;
					break label103;
				case 36:
					var6 = 35;
					break label103;
				case 37:
					var6 = 29;
					break label103;
				case 38:
					var6 = 36;
					break label103;
				case 39:
					var6 = 6;
					break label103;
				case 40:
					var6 = 2;
					break label103;
				case 41:
					var6 = 38;
					break label103;
				case 42:
					var6 = 39;
				default:
					break label103;
				}

				var7 = var10000;
			}

			if (var6 != -1) {
				a_a_Array[var6] = var5;
			}

			if (var7 != -1) {
				a_Image_2d_Array[var7] = var5.a_Image_2d_Array[0];
			}

			var5.g_byte_Array = null;
		} catch (IOException var8) {
			var8.printStackTrace();
		}
	}

	private void h_void_int(int integer) {
		try {
			if (integer == 0) {
				System.out.println("loaded b0.f");
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/b0.f"));
				this.cc_int = this.a_InputStream.read();
				n_byte_Array = new byte[this.cc_int * 8];
				this.a_InputStream.read(n_byte_Array);
			}

			byte[] var3 = new byte[b_int_byte_Array_int(n_byte_Array, integer * 8 + 4)];
			this.a_InputStream.read(var3);
			a var4;
			(var4 = new a()).a_void_byte_Array_int(var3, 0);
			var4.a_void_int_int_int_int(0, 0, -1, -1);
			var4.g_byte_Array = null;
			switch (integer) {
			case 0:
				a_g_Array[5] = new g(var4, 0, 0, null);
				break;
			case 1:
				a_a_Array[40] = var4;
			default:
				return;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void i_void_int(int integer) {
		try {
			if (integer == 0) {
				System.out.println("loaded mm0.f");
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/mm0.f"));
				this.cc_int = this.a_InputStream.read();
				n_byte_Array = new byte[this.cc_int * 8];
				this.a_InputStream.read(n_byte_Array);
			}

			byte[] var3 = new byte[b_int_byte_Array_int(n_byte_Array, integer * 8 + 4)];
			this.a_InputStream.read(var3);
			a var4;
			(var4 = new a()).a_void_byte_Array_int(var3, 0);
			var4.a_void_int_int_int_int(0, 0, -1, -1);
			var4.g_byte_Array = null;
			switch (integer) {
			case 0:
				a_g_Array[1] = new g(var4, 0, 0, null);
				a_g_Array[1].a_void_int(2);
			default:
				return;
			case 1:
				a_g_Array[2] = new g(var4, 0, 0, null);
				a_g_Array[2].a_void_int(0);
				break;
			case 2:
				a_Image_2d_Array[27] = var4.a_Image_2d_Array[0];
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private static int c_int() {
		byte var0 = i_byte_Array[12];
		return var0;
	}

	private static void j_void_int(int integer) {
		i_byte_Array[12] = (byte) integer;
	}

	private static boolean a_boolean() {
		return i_byte_Array == null ? false : i_byte_Array[13] != 0;
	}

	private void b_void_boolean(boolean boolean1) {
		i_byte_Array[13] = (byte) (boolean1 ? 1 : 0);
		this.G_void();
	}

	private void D_void() {
		this.ba_int = this.c_int_int_int(this.ap_int, this.aq_int);
	}

	private void E_void() {
		this.H_boolean = false;
		this.J_void();
		this.a_void_int_int(this.ap_int, dY_int);
		this.b_void_int_int_int(this.ap_int, this.aq_int, this.bb_int + this.b_int_int_int(this.ap_int, this.aq_int));
		this.G_void();
	}

	private void F_void() {
		try {
			RecordStore var1;
			i_byte_Array = (var1 = RecordStore.openRecordStore("DiamondRush", true)).getRecord(1);
			this.cw_int = i_byte_Array.length;
			var1.closeRecordStore();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void G_void() {
		this.M_boolean = false;

		try {
			RecordStore var1;
			if ((var1 = RecordStore.openRecordStore("DiamondRush", true)).getNumRecords() == 0) {
				var1.addRecord(i_byte_Array, 0, this.cw_int);
			} else {
				var1.setRecord(1, i_byte_Array, 0, this.cw_int);
			}

			var1.closeRecordStore();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void H_void() {
		RecordStore var1 = null;

		try {
			var1 = RecordStore.openRecordStore("Preferences", false);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		j_byte_Array = new byte[1];
		if (var1 == null) {
			try {
				var1 = RecordStore.openRecordStore("Preferences", true);
				j_byte_Array[0] = 0;
				this.cv_int = j_byte_Array.length;
				var1.closeRecordStore();
				this.I_void();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		} else {
			try {
				j_byte_Array = var1.getRecord(1);
				this.cv_int = j_byte_Array.length;
				var1.closeRecordStore();
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	private void I_void() {
		try {
			RecordStore var1;
			if ((var1 = RecordStore.openRecordStore("Preferences", true)).getNumRecords() == 0) {
				var1.addRecord(j_byte_Array, 0, this.cv_int);
			} else {
				var1.setRecord(1, j_byte_Array, 0, this.cv_int);
			}

			var1.closeRecordStore();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void k_void_int(int n) {
		try {
			String string = null;
			switch (n) {
			case 0:
			case 1: {
				RecordStore recordStore = null;
				try {
					recordStore = RecordStore.openRecordStore((String) "DiamondRush", (boolean) false);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				if (recordStore == null) {
					this.N_boolean = true;
				} else {
					this.N_boolean = false;
					recordStore.closeRecordStore();
				}
				if (n != 0) {
					i_byte_Array = new byte[1000];
					i.i_byte_Array[3] = 5;
					i.i_byte_Array[8] = 4;
					i.i_byte_Array[9] = 0;
					i.i_byte_Array[10] = 0;
					this.cw_int = 14;
					this.cw_int += 6;
				}
				break;
			}
			case 2: {
				string = "/map_angkor.out";
			}
			case 3: {
				if (string == null) {
					string = "/map_scotland.out";
				}
			}
			case 4: {
				if (string == null) {
					string = "/map_tibet.out";
				}
				System.out.println("loaded "+b_String_Array[n - 2]);
				this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + b_String_Array[n - 2]));
				this.a_InputStream.read();
				int n2 = n - 2;
				int n3 = this.cw_int;
				i.i_byte_Array[14 + n2 * 2] = (byte) (this.cw_int & 0xFF);
				i.i_byte_Array[14 + n2 * 2 + 1] = (byte) (this.cw_int >> 8);
				int n4 = this.a_InputStream.read();
				i.i_byte_Array[this.cw_int++] = (byte) n4;
				i.i_byte_Array[this.cw_int++] = 0;
				this.cu_void();
				this.a_void_String(string);
				i.i_byte_Array[this.cw_int++] = (byte) this.dJ_int;
				this.cs_void();
				this.cw_int += n4 << 1;
				for (int j = 0; j < n4; ++j) {
					int n5;
					int n6;
					int n7 = this.cw_int;
					i.i_byte_Array[n3 + 3 + j * 2] = (byte) (n7 & 0xFF);
					i.i_byte_Array[n3 + 3 + j * 2 + 1] = (byte) (n7 >> 8);
					byte by = 0;
					byte by2 = 0;
					int n8 = i.a_int_InputStream(this.a_InputStream);
					int n9 = i.a_int_InputStream(this.a_InputStream);
					byte[] byArray = new byte[n8 * n9];
					this.a_InputStream.read(byArray);
					for (n6 = 0; n6 < n9; ++n6) {
						for (n5 = 0; n5 < n8; ++n5) {
							if (byArray[n5 + n6 * n8] != 2)
								continue;
							by2 = (byte) (by2 + 1);
						}
					}
					i_byte_Array[0] = (byte) (i_byte_Array[0] + by2);
					i.i_byte_Array[this.cw_int++] = 0;
					i.i_byte_Array[this.cw_int++] = by2;
					i.i_byte_Array[this.cw_int++] = 0;
					this.a_InputStream.skip(n8 * n9);
					n6 = this.cw_int;
					this.cw_int += 2;
					this.a_InputStream.read(byArray);
					for (n5 = 0; n5 < n9; ++n5) {
						for (int k = 0; k < n8; ++k) {
							if (byArray[k + n5 * n8] != 14 && byArray[k + n5 * n8] != 33)
								continue;
							i.i_byte_Array[this.cw_int++] = (byte) k;
							i.i_byte_Array[this.cw_int++] = (byte) n5;
							by = (byte) (by + 1);
						}
					}
					i.i_byte_Array[n6] = 0;
					i.i_byte_Array[n6 + 1] = by;
				}
				this.a_InputStream.close();
				this.a_InputStream = null;
				System.gc();
			}
			default: {
				return;
			}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void J_void() {
		i_byte_Array[3] = (byte) this.ao_int;
		i_byte_Array[11] = this.r_byte;
	}

	private void K_void() {
		this.L_boolean = false;
		this.ao_int = i_byte_Array[3];
		this.r_byte = i_byte_Array[11];
		this.aZ_int = a_int_byte_Array_int(i_byte_Array, 4);
	}

	private byte a_byte_int_int(int integer1, int integer2) {
		int var3 = this.a_int_int_int(integer1, integer2);
		return i_byte_Array[var3 + 2];
	}

	private void a_void_int_int_byte(int integer1, int integer2, byte byte3) {
		int var4 = this.a_int_int_int(integer1, integer2);
		i_byte_Array[var4 + 2] = (byte) (i_byte_Array[var4 + 2] | byte3);
	}

	private void a_void_int_int(int integer1, int integer2) {
		int var3 = c_int_int(integer1) + 1;
		if (i_byte_Array[var3] < integer2) {
			i_byte_Array[var3] = (byte) integer2;
		}
	}

	private int b_int_int(int integer) {
		int var2;
		return (var2 = c_int_int(integer) + 1) >= 0 && var2 <= i_byte_Array.length
				? i_byte_Array[c_int_int(integer) + 1]
				: 0;
	}

	private static int c_int_int(int integer) {
		byte var10000;
		if (integer < 0) {
			var10000 = 0;
		} else {
			if (integer < 3) {
				return a_int_byte_Array_int(i_byte_Array, 14 + integer * 2);
			}

			var10000 = 2;
		}

		byte var1 = var10000;
		return a_int_byte_Array_int(i_byte_Array, 14 + var1 * 2);
	}

	private int d_int_int(int integer) {
		try {
			return i_byte_Array[c_int_int(integer) + 0];
		} catch (Exception exception) {
			exception.printStackTrace();
			return 0;
		}
	}

	private int e_int_int(int integer) {
		return i_byte_Array[c_int_int(integer) + 2];
	}

	private int a_int_int_int(int integer1, int integer2) {
		return a_int_byte_Array_int(i_byte_Array, c_int_int(integer1) + 3 + integer2 * 2);
	}

	private int b_int_int_int(int integer1, int integer2) {
		return i_byte_Array[this.a_int_int_int(integer1, integer2) + 0];
	}

	private void b_void_int_int_int(int integer1, int integer2, int integer3) {
		i_byte_Array[this.a_int_int_int(integer1, integer2) + 0] = (byte) integer3;
	}

	private int c_int_int_int(int integer1, int integer2) {
		return i_byte_Array[this.a_int_int_int(integer1, integer2) + 1];
	}

	private void a_void_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		int var5 = this.a_int_int_int(integer1, integer2);
		byte var6 = i_byte_Array[var5 + 4];

		for (int var7 = 0; var7 < var6; var7++) {
			if (i_byte_Array[var5 + 5 + 2 * var7 + 0] == integer3
					&& i_byte_Array[var5 + 5 + 2 * var7 + 1] == integer4) {
				i_byte_Array[var5 + 5 + 2 * var7 + 0] = 0;
				i_byte_Array[var5 + 5 + 2 * var7 + 1] = 0;
				i_byte_Array[var5 + 3]++;
				return;
			}
		}
	}

	private boolean a_boolean_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		int var5 = this.a_int_int_int(integer1, integer2);
		byte var6 = i_byte_Array[var5 + 4];

		for (int var7 = 0; var7 < var6; var7++) {
			if (i_byte_Array[var5 + 5 + 2 * var7 + 0] == integer3
					&& i_byte_Array[var5 + 5 + 2 * var7 + 1] == integer4) {
				return false;
			}
		}

		return true;
	}

	private void L_void() {
		this.ad_int = 13;
		this.af_int = 4;
		this.ai_int = 408;
		this.i_byte = 5;
		this.c_long |= 128L;
		this.c_long |= 8L;
		this.ad_boolean = false;
		this.D_int = 16;
		this.E_int = 16;
		this.F_int = 19;
		this.G_int = 18;
	}

	private void M_void() throws Exception {
		cE_int = -1;
		D_boolean = false;
		this.c_boolean = true;
		this.ax_int = 0;
		this.bj_int = 0;
		this.c_long = 0L;
		this.d_long = 0L;
		this.Q_int = 0;
		this.R_int = 0;
		this.i_byte = 0;
		this.O_boolean = (this.a_byte_int_int(this.ap_int, this.aq_int) & 2) != 0;
		this.cl_int = 0;
		switch (this.ap_int) {
		case 0:
			if (this.aq_int == 5) {
				this.i_byte = 1;
				this.aa_int = 816;
				this.ab_int = 0;
			} else if (this.aq_int == 13) {
				this.i_byte = 2;
				this.r_boolean = false;
			} else if (this.aq_int == 8) {
				this.i_byte = 4;
				this.ad_int = 0;
				this.af_int = 3;
				this.ag_int = 0;
				this.ae_int = 0;
				this.i_boolean = false;
				this.c_long |= 8L;
				this.c_long |= 1024L;
				this.D_int = 2;
				this.E_int = 12;
				this.F_int = 15;
				this.G_int = 5;
			}
			break;
		case 1:
			if (this.aq_int == 9) {
				this.L_void();
			}
			break;
		case 2:
			if (this.aq_int == 10) {
				this.bx_void();
				this.ah_int = 360;
				this.i_byte = 3;
				this.c_long |= 128L;
				this.c_long |= 8L;
			}
		}

		this.o_boolean = false;
		this.p_boolean = false;
		this.q_boolean = false;
		this.P_int = 0;
		this.be_int = -1;
		this.bf_int = -1;
		this.o_byte = 0;
		this.bg_int = 0;
		this.bh_int = 0;
		this.bi_int = 0;
		this.am_int = 70;
		this.n_byte = i_byte_Array[8];
		this.k_byte = 0;
		this.aZ_int = 0;
		this.bc_int = 0;
		this.bd_int = 0;
		this.bb_int = 0;
		this.aW_int = 0;
		this.aS_int = 0;
		this.aT_int = 0;
		this.aU_int = 0;
		this.aV_int = 0;
		cm_int = -1;
		m_byte_Array = null;
		l_byte_Array = null;
		this.a_InputStream = Utils.deepCopy(getClass().getResourceAsStream("/res" + b_String_Array[this.ap_int]));
		System.out.println("loaded " + b_String_Array[this.ap_int]);
		this.a_InputStream.read();
		boolean var2 = false;
		while (!var2) {
			int var3 = this.a_InputStream.read();
			byte[] var1 = new byte[4];
			for (int var4 = 0; var4 < var3 && !var2; var4++) {
				this.a_InputStream.read(var1);
				int var5 = a_int_byte_Array_int(var1, 0);
				int var6 = a_int_byte_Array_int(var1, 2);
				if (var4 != this.aq_int) {
					this.a_InputStream.skip((long) (var5 * var6 * 3));
				} else {
					this.av_int = var5;
					this.aw_int = var6;
					a_byte_2d_Array = (byte[][]) null;
					c_byte_2d_Array = (byte[][]) null;
					a_int_2d_Array = (int[][]) null;
					System.gc();
					a_byte_2d_Array = new byte[this.av_int][this.aw_int];
					c_byte_2d_Array = new byte[this.av_int][this.aw_int];
					a_int_2d_Array = new int[this.av_int][this.aw_int];
					var1 = new byte[this.av_int * this.aw_int];
					this.a_InputStream.read(var1);

					for (int var7 = 0; var7 < this.av_int; var7++) {
						for (int var8 = 0; var8 < this.aw_int; var8++) {
							a_byte_2d_Array[var7][var8] = var1[var7 + var8 * this.av_int];
						}
					}

					b_byte_2d_Array = new byte[this.av_int][this.aw_int];
					b_int_2d_Array = new int[this.av_int][this.aw_int];
					this.a_InputStream.read(var1);

					for (int var10 = 0; var10 < this.av_int; var10++) {
						for (int var12 = 0; var12 < this.aw_int; var12++) {
							b_int_2d_Array[var10][var12] = var1[var10 + var12 * this.av_int];
						}
					}

					this.a_InputStream.read(var1);

					for (int var11 = 0; var11 < this.av_int; var11++) {
						for (int var13 = 0; var13 < this.aw_int; var13++) {
							a_int_2d_Array[var11][var13] = var1[var11 + var13 * this.av_int];
						}
					}

					var1 = null;
					var2 = true;
				}
			}
		}

		this.a_InputStream.close();
		this.a_InputStream = null;
		this.ar_int = this.at_int = 0;
		this.as_int = this.au_int = 0;
		this.c_void();
		System.gc();
	}

	private void N_void() {
		int var1 = this.dU_int;
		int var2 = this.dV_int;
		long var3;
		int var5 = a_int_long_byte_byte(var3 = a_long_2d_Array[var1][var2], (byte) 6, (byte) 5);
		int var6 = a_int_long_byte_byte(var3, (byte) 11, (byte) 3);
		int var7 = 14;
		if (this.aq_int >= this.dJ_int) {
			this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 2);
		}

		if (var6 > 1) {
			int var8 = 0;

			while (var8 < var6) {
				int var9 = a_int_long_byte_byte(var3, (byte) var7, (byte) 4);
				var7 += 4;
				int var10 = a_int_long_byte_byte(var3, (byte) var7, (byte) 4);
				long var11;
				int var14;
				if (a_int_long_byte_byte(var11 = a_long_2d_Array[var9][var10], (byte) 3, (byte) 3) == 1
						&& (var14 = a_int_long_byte_byte(var11, (byte) 6, (byte) 5)) > var5) {
					dY_int = var14;
					this.cx_int = var1;
					this.cy_int = var2;
					this.a_void_int_int_byte(this.ap_int, dY_int, (byte) 64);
					this.ab_boolean = true;
				}

				var8++;
				var7 += 4;
			}
		} else {
			dY_int = this.aq_int;
		}
	}

	private void a_void_Graphics(Graphics graphics) {
		try {
			this.a_Graphics = graphics;
			this.a_Graphics.setClip(0, 0, 240, 320);
			switch (l_byte) {
			case 0:
			case 3:
			case 11:
			case 13:
			case 14:
			case 19:
			case 23:
			case 26:
			case 32:
			default:
				break;
			case 1:
				this.X_void();
				break;
			case 2:
				this.an_void();
				break;
			case 4:
				this.T_void();
				break;
			case 5:
				if (!this.Q_boolean) {
					this.a_Graphics.setClip(0, 293, 240, 27);
					this.ao_void();
					this.a_Graphics.setClip(0, 0, 240, 320);
				} else {
					this.ao_void();
				}

				if (f_byte_Array != null && this.Q_boolean) {
					this.cr_void();
				}
				break;
			case 6:
				this.aN_void();
				break;
			case 7:
				this.an_void();
				break;
			case 8:
			case 9:
			case 21:
			case 35:
				this.ao_void();
				break;
			case 10:
				this.a_boolean_Graphics(this.a_Graphics);
				break;
			case 12:
				this.U_void();
				break;
			case 15:
				this.cv_void();
				break;
			case 16:
				this.ao_void();
				break;
			case 17:
				this.bg_void();
				break;
			case 18:
				this.cF_void();
				this.aw_boolean = true;
				l_byte = 25;
				this.em_int = this.c_int;
				this.e_String = a_String_Array[110] + " " + a_int_byte_Array_int(i_byte_Array, 4) + " "
						+ a_String_Array[109];
			case 25:
				this.cG_void();
				break;
			case 20:
				a_void_Graphics_a_String_int_int_int_int_boolean(this.a_Graphics, a_a_Array[41], a_String_Array[48],
						120, 160, 3, 20, true);
				break;
			case 22:
				this.cI_void();
				break;
			case 24:
				this.R_void();
				break;
			case 27:
				this.Q_void();
				break;
			case 28:
				this.br_int = 11;
				this.ao_void();
				break;
			case 29:
				this.P_void();
				break;
			case 30:
				this.b_void_Graphics_boolean(this.a_Graphics, true);
				if (aN_int % 20 >= 10) {
					a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[82], 120, 270, 17);
				}
				break;
			case 31:
				if (this.P_boolean) {
					this.P_boolean = false;
					this.a_Graphics.setColor(0);
					this.a_Graphics.fillRect(0, 0, 240, 320);
					a_a_Array[41].e_int = 5;
					a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics,
							a_String_String_int(a_String_Array[this.N_boolean ? 69 : 68], 220), 120, 160, 3);
					this.b_void();
					this.a_void();
				}
				break;
			case 33:
				this.O_void();
				break;
			case 34:
				this.S_void();
			}

			this.cK_void();
		} catch (Throwable var3) {
			var3.printStackTrace();
		}
	}

	private void O_void() {
		if (this.aw_boolean) {
			this.a_Graphics.setColor(0);
			this.a_Graphics.setClip(0, 0, 240, 320);
			this.a_Graphics.fillRect(0, 0, 240, 320);
			a_a_Array[41].e_int = 1;
			String var1 = a_String_String_int(a_String_Array[4] + "\n\n" + a_String_Array[103] + "\n"
					+ a_String_Array[104] + "\n" + a_String_Array[105] + "\n\n" + a_String_Array[106] + "\n\n"
					+ a_String_Array[107] + "\n\n" + a_String_Array[108], 235);
			a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics, var1, 120, 10, 17);
			this.a_void();
			this.aw_boolean = false;
		}
	}

	private void a_void_Graphics_boolean_int_int(Graphics graphics, boolean bl, int n, int n2) {
		int n3;
		graphics.setClip(0, 0, 240, 320);
		int n4 = 0;
		int n5 = 0;
		if (n != 0 || n2 != 0) {
			n4 -= 24;
			n5 -= 24;
		}
		int n6 = 0;
		for (n3 = n5; n3 < 320; n3 += 24) {
			for (int i = n4; i < 240; i += 24) {
				graphics.drawImage(a_Image_2d_Array[8][0], i + n, n3 + n2, 0);
			}
		}
		a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(graphics, 0, this.o_int + n, this.p_int + n2, 0, 0, 0);
		if (bl) {
			for (n3 = 0; n3 < 320; n3 += 24) {
				for (n6 = 0; n6 < 240; n6 += 24) {
					a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(graphics, 16, n6, n3, 0, 0, 0);
				}
			}
		}
	}

	private void a_void_Graphics_boolean(Graphics graphics, boolean boolean2) {
		this.a_void_Graphics_boolean_int_int(graphics, boolean2, 0, 0);
	}

	private void P_void() {
		if (this.aw_boolean) {
			this.a_void_Graphics_boolean_int_int(this.a_Graphics, false, this.N_int, this.O_int);
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 11,
					120 + f.c_int_Array[6] + this.N_int, 136 + f.c_int_Array[7] + this.O_int, 0, 0, 0);
			int var1 = 0;

			for (int var2 = 0; var2 < 3; var2++) {
				var1 = 52 + var2;
				a_a_Array[var1].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0,
						f.c_int_Array[var2 << 1] + 120 - this.v_int + this.N_int,
						f.c_int_Array[(var2 << 1) + 1] + 136 - this.w_int + this.O_int, 0, 0, 0);
			}
		}

		switch (this.L_int) {
		case 1:
			if (!this.aw_boolean) {
				this.a_Graphics.setColor(this.M_int);
				this.a_Graphics.fillRect(0, 0, 240, 320);

				for (int var7 = 0; var7 < 3; var7++) {
					int var5 = 52 + var7;
					a_a_Array[var5].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0,
							f.c_int_Array[var7 << 1] + 120 - this.v_int,
							f.c_int_Array[(var7 << 1) + 1] + 136 - this.w_int, 0, 0, 0);
				}
			}
			break;
		case 2:
			return;
		case 3:
			return;
		case 4:
			return;
		case 5:
			return;
		case 6:
			return;
		case 7:
			return;
		case 8:
			b.a_void_Graphics(this.a_Graphics);
			return;
		case 9:
		case 10:
			b.a_void_Graphics(this.a_Graphics);
			int var4 = a_a_Array[41].e_int;
			a_a_Array[41].e_int = 3;
			String var6 = a_String_String_int(a_String_Array[40] + "\n" + a_String_Array[97], 220);
			a_a_Array[41].a_void_String(var6);
			a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, (240 - a.c_int >> 1) - 3, (320 - a.d_int >> 1) - 3,
					a.c_int + 6, a.d_int + 6, 7096587, 0);
			a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics, var6, 120, 160, 3);
			a_a_Array[41].e_int = var4;
		}
	}

	private void Q_void() {
		if (!this.aw_boolean && !this.e_boolean) {
			this.a_Graphics.setClip(this.h_int + 120, this.i_int + 136, 14, 22);
			a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0, this.o_int, this.p_int, 0, 0, 0);
		} else {
			this.a_Graphics.setClip(0, 0, 240, 320);
			this.a_void_Graphics_boolean(this.a_Graphics, false);
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 11, 120 + f.c_int_Array[6],
					136 + f.c_int_Array[7], 0, 0, 0);
			this.a_void();
			this.b_void();
			a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[27].toLowerCase(), 222,
					311, 10);
			this.aw_boolean = false;
		}

		if (this.q_int != 0) {
			this.e_boolean = false;
			this.aw_boolean = true;

			for (int var1 = 0; var1 < this.q_int; var1++) {
				if (b_boolean_int(var1)) {
					a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var1 + 1, this.o_int,
							this.p_int, 0, 0, 0);
				}
			}

			this.a_Graphics.setClip(0, 0, 240, 320);
			if (this.z_int < this.y_int) {
				a_a_Array[9].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 5, this.z_int,
						f.c_int_Array[this.q_int << 1] + 120 - 12, f.c_int_Array[(this.q_int << 1) + 1] + 124, 0, 0, 0);
				this.z_int++;
			} else {
				if (this.n_int % this.m_int >= this.m_int >> 1) {
					a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, this.q_int + 1, this.o_int,
							this.p_int, 0, 0, 0);
					this.r_int++;
				}

				if (this.r_int >= 15) {
					a_boolean_Array[this.q_int] = true;
					this.r_int = 0;
					this.q_int = 0;
					this.z_int = 0;
					this.l_void();
					this.e_boolean = true;
					this.aw_boolean = false;
				}
			}
		} else {
			for (int var8 = 0; var8 < 3; var8++) {
				if (a_boolean_Array[var8]) {
					a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var8 + 1, this.o_int,
							this.p_int, 0, 0, 0);
				}
			}
		}

		for (int var2 = 0; var2 < 3; var2++) {
			if (b_boolean_Array[var2]) {
				int var9 = 52 + var2;
				if (this.s_int != var2) {
					a_a_Array[var9].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0,
							f.c_int_Array[var2 << 1] + 120 - this.v_int,
							f.c_int_Array[(var2 << 1) + 1] + 136 - this.w_int, 0, 0, 0);
				}
			}
		}

		if (this.s_int != -1) {
			this.aw_boolean = true;
			if (this.c_boolean_int(this.s_int)) {
				this.s_int = -1;
				if (b_boolean_Array[0] && b_boolean_Array[1] && b_boolean_Array[2]) {
					this.g_void();
					this.aw_boolean = true;
					this.g_boolean = true;
					l_byte = 29;
				}
			}
		} else {
			this.n_int = this.n_int % this.m_int;
			this.a_Graphics.setClip(this.f_int + 120, 136 + this.g_int, 14, 22);
			a_a_Array[55].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0, this.n_int, 120 + this.f_int,
					136 + this.g_int, 0, 0, 0);
			this.n_int++;
			if (this.e_boolean) {
				int var10 = a_a_Array[41].e_int;
				a_a_Array[41].e_int = 1;
				String var3 = a_String_String_int(this.b_String + "\n" + this.c_String, 220);
				a_a_Array[41].a_void_String(var3);
				int var4 = (240 - a.c_int >> 1) - 3;
				int var5 = 250 - (a.d_int >> 1) - 3;
				int var6 = a.c_int + 6;
				int var7 = a.d_int + 6;
				this.a_Graphics.setClip(var4, var5, var6, var7);
				a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var4, var5, var6, var7, 7096587, 0);
				a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics, var3, 120, 250, 3);
				a_a_Array[41].e_int = var10;
				this.e_boolean = false;
			}
		}
	}

	private boolean c_boolean_int(int integer) {
		int var2;
		int var3;
		int var4;
		int var6;
		label49: {
			var2 = 52 + integer;
			var3 = f.c_int_Array[integer << 1] + 120;
			int var5 = (var4 = f.c_int_Array[(integer << 1) + 1] + 136) - this.u_int;
			var6 = var3 - this.t_int;
			if (var5 < 0) {
				this.u_int -= 2;
				if (this.u_int > var4) {
					break label49;
				}
			} else {
				if (var5 <= 0) {
					break label49;
				}

				this.u_int += 2;
				if (this.u_int < var4) {
					break label49;
				}
			}

			this.u_int = var4;
		}

		label41: {
			if (var6 < 0) {
				this.t_int -= 3;
				if (this.t_int > var3) {
					break label41;
				}
			} else {
				if (var6 <= 0) {
					break label41;
				}

				this.t_int += 3;
				if (this.t_int < var3) {
					break label41;
				}
			}

			this.t_int = var3;
		}

		a_a_Array[var2].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0, this.t_int - this.v_int,
				this.u_int - this.w_int, 0, 0, 0);
		if (this.t_int == var3 && this.u_int == var4) {
			this.t_int = var3;
			this.u_int = var4;
			if (this.x_int < 20) {
				if (this.x_int % 2 == 1) {
					int var7 = 838860;
					this.a_Graphics.setColor(0 + var7 * this.x_int);
					this.a_Graphics.fillRect(0, 0, 240, 320);
				}

				this.x_int++;
				return false;
			} else if (this.z_int < this.y_int) {
				a_a_Array[9].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 5, this.z_int,
						f.c_int_Array[integer << 1] + 120 - 12, f.c_int_Array[(integer << 1) + 1] + 124, 0, 0, 0);
				this.z_int++;
				return false;
			} else {
				this.z_int = 0;
				this.x_int = 0;
				return true;
			}
		} else {
			return false;
		}
	}

	private void R_void() {
		String var1 = null;
		a var2;
		(var2 = a_a_Array[41]).e_int = 15;
		this.a_Graphics.setColor(0);
		this.a_Graphics.fillRect(0, 0, 240, 320);

		for (int var3 = 0; var3 < 6; var3++) {
			byte var4;
			label45: {
				var4 = -1;
				String var10000;
				switch (var3) {
				case 0:
					var4 = 60;
					var10000 = " 6 - Add " + String.valueOf(this.aZ_int);
					break;
				case 1:
					var4 = 61;
					var10000 = " 7 - Add " + String.valueOf(this.bb_int);
					break;
				case 2:
					var4 = 62;
					var10000 = " 8 - x " + String.valueOf(this.cA_int) + (this.cA_int >= 4 ? " blue potion" : "");
					break;
				case 3:
					var4 = 63;
					var10000 = " 9 - " + a_String_Array[this.R_boolean ? 66 : 67];
					break;
				case 4:
					var4 = 64;
					var10000 = " 0 - " + a_String_Array[this.S_boolean ? 66 : 67];
					break;
				case 5:
					var4 = -1;
					var10000 = "5 to activate lang cheat";
					break;
				default:
					break label45;
				}

				var1 = var10000;
			}

			int var5 = var3 * 35;
			if (var4 >= 0) {
				var2.a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[var4], 110, var5, 17);
			}

			var5 += var2.e_int;
			var2.a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[65], 110, var5, 24);
			var2.a_void_Graphics_String_int_int_int(this.a_Graphics, var1, 110, var5, 20);
		}

		var1 = "Pound - Pass levels ";
		StringBuffer var9;
		String var10001;
		if (this.aa_boolean) {
			var9 = new StringBuffer().append(var1);
			var10001 = "on";
		} else {
			var9 = new StringBuffer().append(var1);
			var10001 = "off";
		}

		var1 = var9.append(var10001).toString();
		var2.a_void_Graphics_String_int_int_int(this.a_Graphics, var1, 110, 290, 17);
		this.a_void();
		this.b_void();
	}

	private void S_void() {
		a var2;
		(var2 = a_a_Array[41]).e_int = 2;
		this.a_Graphics.setColor(0);
		this.a_Graphics.fillRect(0, 0, 240, 320);
		String var1;
		switch (this.dc_int) {
		case 0:
			var1 = "Mix";
			var2.b_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[this.a_int_Array[0]], 10, 5, 20);
			break;
		case 1:
			var1 = "Tips";
			A_void_int(this.a_int_Array[1]);
			this.cr_void();
			break;
		default:
			var1 = "";
		}

		var2.e_int = 2;
		var2.a_void_Graphics_String_int_int_int(this.a_Graphics, var1, 40, 308, 20);
		var2.a_void_Graphics_String_int_int_int(this.a_Graphics, "" + this.a_int_Array[this.dc_int], 120, 308, 20);
		var2.b_void_Graphics_String_int_int_int(this.a_Graphics, "Use up, down, left and right to navigate", 10, 280,
				20);
		this.a_void();
		this.b_void();
	}

	private void T_void() {
		this.an_void();
	}

	private void b_void_Graphics_boolean(Graphics graphics, boolean boolean2) {
		graphics.drawImage(b_Image, 0, 0, 20);
		graphics.drawImage(a_Image, 0, 0, 20);
		if (boolean2) {
			graphics.drawImage(c_Image, 120, 319, 33);
		}
	}

	private void U_void() {
		this.a_Graphics.setColor(0);
		this.a_Graphics.fillRect(0, 0, 240, 320);
		a var1;
		(var1 = a_a_Array[41]).a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[35], 120, 50, 17);
		a var10000;
		Graphics var10001;
		String var10002;
		byte var10003;
		short var10004;
		byte var10005;
		if (this.i_byte == 2) {
			var10000 = var1;
			var10001 = this.a_Graphics;
			var10002 = a_String_Array[26];
			var10003 = 0;
			var10004 = 320;
			var10005 = 36;
		} else {
			var1.a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[1], 0, 320, 36);
			String var2 = a_String_Array[111] + " "
					+ (a_int_byte_Array_int(i_byte_Array, 4) < 500 ? a_int_byte_Array_int(i_byte_Array, 4) : 500) + " "
					+ a_String_Array[109];
			var10000 = var1;
			var10001 = this.a_Graphics;
			var10002 = var2;
			var10003 = 120;
			var10004 = 160;
			var10005 = 17;
		}

		var10000.a_void_Graphics_String_int_int_int(var10001, var10002, var10003, var10004, var10005);
		this.az_void();
	}

	private void b_void_Graphics(Graphics graphics) {
		Graphics var10000;
		int var10001;
		int var10002;
		int var10003;
		int var10004;
		label19: {
			int var2 = this.ar_int % cC_int;
			int var3 = this.as_int % cD_int;
			int var4 = (this.ar_int + 240) % cC_int;
			int var5 = (this.as_int + 260) % cD_int;
			if (var4 > var2) {
				if (var5 > var3) {
					var10000 = graphics;
					var10001 = var2;
					var10002 = var3;
					var10003 = 0;
					var10004 = 0;
					break label19;
				}

				a_void_Graphics_int_int_int_int(graphics, var2, var3, 0, 0);
				var10000 = graphics;
				var10001 = var2;
				var10002 = 0;
				var10003 = 0;
			} else {
				if (var5 > var3) {
					a_void_Graphics_int_int_int_int(graphics, var2, var3, 0, 0);
					var10000 = graphics;
					var10001 = 0;
					var10002 = var3;
					var10003 = 240 - var4;
					var10004 = 0;
					break label19;
				}

				a_void_Graphics_int_int_int_int(graphics, var2, var3, 0, 0);
				a_void_Graphics_int_int_int_int(graphics, var2, 0, 0, 260 - var5);
				a_void_Graphics_int_int_int_int(graphics, 0, var3, 240 - var4, 0);
				var10000 = graphics;
				var10001 = 0;
				var10002 = 0;
				var10003 = 240 - var4;
			}

			var10004 = 260 - var5;
		}

		a_void_Graphics_int_int_int_int(var10000, var10001, var10002, var10003, var10004);
	}

	private static void a_void_Graphics_int_int_int_int(Graphics graphics, int integer2, int integer3, int integer4,
			int integer5) {
		graphics.drawImage(d_Image, integer4 - integer2, integer5 - integer3, 0);
	}

	private static void V_void() {
		cC_int = 264;
		cD_int = 288;
		d_Image = Image.createImage(cC_int, cD_int);
		b_Graphics = d_Image.getGraphics();
	}

	private void b_void_int_int(int integer1, int integer2) {
		int var3 = this.ar_int - this.ar_int % 24;
		int var4 = this.as_int - this.as_int % 24;
		int var5 = this.ar_int + cC_int - 24 - (this.ar_int + cC_int - 24) % 24;
		int var6 = this.as_int + cD_int - 24 - (this.as_int + cD_int - 24) % 24;
		int var7 = integer1 * 24;
		int var8 = integer2 * 24;
		if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
			int var9 = a_int_2d_Array[integer1][integer2] & 0xFF;
			if (a_byte_2d_Array[integer1][integer2] < 80) {
				if (var9 == 4 || var9 == 16 || var9 == 15) {
					this.c_void_int_int(integer1, integer2);
					return;
				}

				b_Graphics.drawImage(a_Image_2d_Array[8][0], var7 % cC_int, var8 % cD_int, 0);
			}
		}
	}

	private void c_void_int_int(int integer1, int integer2) {
		int var3 = this.ar_int - this.ar_int % 24;
		int var4 = this.as_int - this.as_int % 24;
		int var5 = this.ar_int + cC_int - 24 - (this.ar_int + cC_int - 24) % 24;
		int var6 = this.as_int + cD_int - 24 - (this.as_int + cD_int - 24) % 24;
		int var7 = integer1 * 24;
		int var8 = integer2 * 24;
		if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
			this.a_void_int_int_int_int_boolean(var7, var8, var7, var8, false);
		}
	}

	public static int a_int_int(int integer) {
		switch (integer) {
		case 0:
			return 42;
		case 1:
			return 60;
		case 2:
			a_a_Array[59].b_int = 0;
			return 59;
		case 3:
			a_a_Array[59].b_int = 1;
			return 59;
		case 4:
			return 56;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 17:
		case 18:
		case 19:
		case 21:
		default:
			return -1;
		case 14:
			a_a_Array[57].b_int = 1;
			return 57;
		case 15:
			a_a_Array[57].b_int = 0;
			return 57;
		case 16:
			return 58;
		case 20:
			return 43;
		case 22:
			a_a_Array[45].b_int = 0;
			return 45;
		case 23:
			a_a_Array[45].b_int = 1;
			return 45;
		}
	}

	private void a_void_int_int_int_int_boolean(int integer1, int integer2, int integer3, int integer4,
			boolean boolean5) {
		Graphics var6 = null;
		int var9 = 0;
		int var10 = 0;
		var6 = b_Graphics;
		int var7 = cC_int;
		int var8 = cD_int;
		var9 = integer1 % var7;
		var10 = integer2 % var8;
		this.by_int = var10 - 24;
		this.bH_int = integer2 / 24 - 1;

		for (int var11 = integer2; var11 <= integer4; var11 += 24) {
			this.bx_int = var9 - 24;
			this.bG_int = integer1 / 24 - 1;
			this.by_int += 24;
			this.bH_int++;
			if (this.by_int >= var8) {
				this.by_int = 0;
			}

			for (int var12 = integer1; var12 <= integer3; var12 += 24) {
				this.bx_int += 24;
				this.bG_int++;
				if (this.bx_int >= var7) {
					this.bx_int = 0;
				}

				if (this.bG_int >= 0 && this.bG_int < this.av_int && this.bH_int >= 0 && this.bH_int < this.aw_int) {
					this.bI_int = a_byte_2d_Array[this.bG_int][this.bH_int];
					this.bJ_int = a_int_2d_Array[this.bG_int][this.bH_int] & 0xFF;
					if (this.bI_int < 80 && !boolean5) {
						var6.drawImage(a_Image_2d_Array[8][0], this.bx_int, this.by_int, 0);
					}

					label125: if (this.bJ_int > -1 && this.bJ_int < 38) {
						i var10000;
						int var10001;
						switch (this.bJ_int) {
						case 4:
							this.aE_int = 20;
							this.aF_int = 7;
							this.bN_int = this.bO_int = 0;
							break label125;
						case 15:
							if (this.ce_int != 0) {
								break label125;
							}

							this.aE_int = 14;
							var10000 = this;
							var10001 = 0 + this.ce_int * 5 / 10;
							break;
						case 16:
							if (this.ce_int != 9) {
								break label125;
							}

							this.aE_int = 15;
							this.aF_int = 4 - this.ce_int * 5 / 10;
							if (this.aF_int >= 0) {
								break label125;
							}

							var10000 = this;
							var10001 = 0;
							break;
						case 27:
							this.aE_int = 21;
							this.aF_int = 0;
							this.bN_int = this.bO_int = 0;
						default:
							break label125;
						}

						var10000.aF_int = var10001;
					}

					if (this.aE_int != -1) {
						if (a_Image_2d_Array[this.aE_int] == null) {
							a_a_Array[a_int_int(this.aE_int)].a_void_Graphics_int_int_int_int_int_int(var6, this.aF_int,
									this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int, 0, 0);
						} else {
							var6.drawImage(a_Image_2d_Array[this.aE_int][this.aF_int], this.bx_int + this.bN_int,
									this.by_int + this.bO_int, this.bP_int);
						}

						this.bP_int = 0;
						this.aE_int = -1;
						this.bN_int = this.bO_int = 0;
					}

					if (this.bI_int != -1 && !boolean5) {
						label108: {
							byte var13;
							i var17;
							int var18;
							if ((var13 = (byte) (this.bI_int - 80)) >= 0) {
								this.aG_int = 0;
								var17 = this;
								var18 = var13;
							} else {
								switch (this.bI_int) {
								case 0:
									if (b_byte_2d_Array[this.bG_int][this.bH_int] == 0 && (e_int_2d_Array == null
											|| e_int_2d_Array[this.bG_int][this.bH_int] == 0)) {
										this.aA_void();
									}
									break label108;
								case 1:
									if (b_byte_2d_Array[this.bG_int][this.bH_int] == 0 && (e_int_2d_Array == null
											|| e_int_2d_Array[this.bG_int][this.bH_int] == 0)) {
										this.aA_void();
										this.aH_int = this.aH_int - this.bR_int;
										this.bO_int = 0;
									}
									break label108;
								case 10:
									a_a_Array[16].a_void_Graphics_int_int_int_int_int_int(var6, 0, this.bx_int,
											this.by_int, 0, 0, 0);
									break label108;
								case 34:
									if (this.ce_int != 9) {
										break label108;
									}

									this.aG_int = 14;
									var17 = this;
									var18 = 0 + this.ce_int * 5 / 10;
									break;
								case 35:
									if (this.ce_int == 0) {
										this.aG_int = 15;
										this.aH_int = 4 - this.ce_int * 5 / 10;
										if (this.aH_int < 0) {
											var17 = this;
											var18 = 0;
											break;
										}
									}
								default:
									break label108;
								}
							}

							var17.aH_int = var18;
						}

						if (this.aG_int != -1) {
							if (a_Image_2d_Array[this.aG_int] == null) {
								a_a_Array[a_int_int(this.aG_int)].a_void_Graphics_int_int_int_int_int_int(var6,
										this.aH_int, this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int,
										0, 0);
							} else {
								var6.drawImage(a_Image_2d_Array[this.aG_int][this.aH_int], this.bx_int + this.bN_int,
										this.by_int + this.bO_int, this.bP_int);
							}

							this.aG_int = -1;
							this.bP_int = 0;
							this.bN_int = this.bO_int = 0;
						}
					}

					if (this.i_byte == 2) {
						this.d_void_Graphics(var6);
					}
				}
			}
		}
	}

	private void c_void_Graphics(Graphics graphics) {
		for (int var2 = -1; var2 < 12; var2++) {
			for (int var3 = -1; var3 < 12; var3++) {
				this.bG_int = var3 + this.cI_int;
				this.bH_int = var2 + this.cJ_int;
				if (this.bG_int >= 0 && this.bG_int < this.av_int && this.bH_int >= 0 && this.bH_int < this.aw_int) {
					this.bI_int = a_byte_2d_Array[this.bG_int][this.bH_int];
					this.bJ_int = a_int_2d_Array[this.bG_int][this.bH_int] & 0xFF;
					this.bx_int = var3 * 24 - this.cK_int;
					this.by_int = var2 * 24 - this.cL_int;
					this.W_void();
					label163: if (this.bJ_int > -1 && this.bJ_int < 38) {
						label168: {
							i var10000;
							switch (this.bJ_int) {
							case 3:
								int var4;
								if ((var4 = (a_int_2d_Array[this.bG_int][this.bH_int] >> 8) - 1) >= 0) {
									this.aE_int = 12;
									this.aF_int = (byte) var4;
								}
								break label168;
							case 4:
								if (a_int_2d_Array[this.bG_int][this.bH_int] >> 8 >= this.ax_int) {
									this.ag_void();
								}
								break label168;
							case 5:
							case 28:
								this.aE_int = 11;
								this.aF_int = 0;
								break label168;
							case 6:
								this.aC_void();
								if (this.by_int + 24 < 260) {
									graphics.clipRect(this.bx_int, this.by_int, 24, 24);
								}
								break label168;
							case 7:
								this.aH_void();
								break label168;
							case 8:
							case 9:
								this.aG_void();
							case 10:
							case 11:
							case 12:
							case 13:
							case 17:
							case 18:
							case 19:
							case 20:
							case 21:
							case 22:
							case 23:
							case 24:
							case 25:
							case 26:
							case 27:
							case 29:
							case 30:
							case 31:
							case 32:
							case 36:
							default:
								break label168;
							case 14:
							case 33:
								this.l_void_int(this.bJ_int);
								break label168;
							case 15:
								if (this.ce_int != 0 && this.ce_int <= 5) {
									this.aE_int = 14;
									this.aF_int = 0 + this.ce_int * 5 / 10;
								}
								break label168;
							case 16:
								if (this.ce_int != 9 && this.ce_int >= 5) {
									this.aE_int = 15;
									this.aF_int = 4 - this.ce_int * 5 / 10;
									if (this.aF_int < 0) {
										this.aF_int = 0;
									}
								}
								break label168;
							case 34:
								a_a_Array[27].a_void_Graphics_int_int_int_int_int_int_int(graphics, 2, 0, this.bx_int,
										this.by_int, 0, 0, 0);
								break label168;
							case 35:
								var10000 = this;
								break;
							case 37:
								a_a_Array[27].a_void_Graphics_int_int_int_int_int_int_int(graphics, 2, 0, this.bx_int,
										this.by_int, 0, 0, 0);
								var10000 = this;
							}

							var10000.ab_void();
						}

						if (this.aE_int != -1) {
							if (a_Image_2d_Array[this.aE_int] == null) {
								a_a_Array[a_int_int(this.aE_int)].a_void_Graphics_int_int_int_int_int_int(graphics,
										this.aF_int, this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int,
										0, 0);
							} else {
								graphics.drawImage(a_Image_2d_Array[this.aE_int][this.aF_int],
										this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int);
							}

							this.bP_int = 0;
							this.aE_int = -1;
							graphics.setClip(0, -this.bk_int, 240, 260);
						} else {
							if (b_a == null) {
								break label163;
							}

							if (this.bK_int != -1) {
								b_a.a_void_Graphics_int_int_int_int_int_int_int(graphics, this.bK_int, this.bL_int,
										this.bx_int + this.bN_int, this.by_int + this.bO_int, 0, 0, 0);
								this.bK_int = -1;
							}

							b_a = null;
						}

						this.bN_int = this.bO_int = 0;
					}

					if (this.bI_int != -1) {
						byte var7 = (byte) (this.bI_int - 80);
						label153: if ((var7) < 0) {
							int var5 = b_int_2d_Array[this.bG_int][this.bH_int];
							i var8;
							switch (this.bI_int) {
							case 0:
								if ((b_int_2d_Array[this.bG_int][this.bH_int] & -2147483648) == 0) {
									break label153;
								}
							case 8:
								var8 = this;
								break;
							case 1:
								if ((b_int_2d_Array[this.bG_int][this.bH_int] & -2147483648) != 0 || this.bR_int != 0) {
									var8 = this;
									break;
								}
							case 2:
							case 3:
							case 4:
							case 5:
							case 6:
							case 7:
							case 10:
							case 13:
							case 15:
							case 17:
							case 20:
							case 24:
							case 25:
							case 26:
							case 27:
							case 29:
							case 31:
							case 33:
							case 38:
							case 39:
							case 40:
							case 41:
							case 42:
							default:
								break label153;
							case 9:
								this.aA_void();
								if ((b_int_2d_Array[this.bG_int][this.bH_int] & 264241152) == 138412032) {
									this.bN_int = this.bN_int + this.aj_int;
									this.bO_int = this.bO_int + this.ak_int;
								}
								break label153;
							case 11:
								this.aE_void();
								break label153;
							case 12:
								this.af_void();
								break label153;
							case 14:
								this.aI_void();
								break label153;
							case 16:
								this.aJ_void();
								break label153;
							case 18:
								this.ai_void();
								break label153;
							case 19:
								this.c_void_byte((byte) this.bI_int);
								break label153;
							case 21:
								this.ac_void();
								break label153;
							case 22:
								b_a = a_a_Array[12];
								this.bL_int = 1;
								this.b_void_byte((byte) 22);
								break label153;
							case 23:
								b_a = a_a_Array[12];
								this.bL_int = 0;
								this.b_void_byte((byte) 23);
								break label153;
							case 28:
								this.aM_void();
								break label153;
							case 30:
								b_a = a_a_Array[20];
								this.bK_int = 0;
								this.bL_int = 0 + (var5 - 1) * 7 / 16;
								break label153;
							case 32:
								this.aF_void();
								break label153;
							case 34:
								if (this.ce_int != 9 && this.ce_int >= 5) {
									this.aG_int = 14;
									this.aH_int = 0 + this.ce_int * 5 / 10;
								}
								break label153;
							case 35:
								if (this.ce_int != 0 && this.ce_int <= 5) {
									this.aG_int = 15;
									this.aH_int = 4 - this.ce_int * 5 / 10;
									if (this.aH_int < 0) {
										this.aH_int = 0;
									}
								}
								break label153;
							case 36:
								this.aj_void();
								break label153;
							case 37:
								this.aG_int = 17;
								this.aH_int = 0 + (var5 - 1) * 3 / 8;
								break label153;
							case 43:
								this.c_void_byte((byte) this.bI_int);
								break label153;
							case 44:
								this.ae_void();
								this.bL_int = 0;
								break label153;
							case 45:
								this.aK_void();
								break label153;
							case 46:
								this.ad_void();
								break label153;
							case 47:
								var8 = this;
								break;
							case 48:
								this.Z_void();
								break label153;
							case 49:
								this.aB_void();
								break label153;
							}

							var8.aA_void();
						}

						if (this.aG_int != -1) {
							if (a_Image_2d_Array[this.aG_int] == null) {
								a_a_Array[a_int_int(this.aG_int)].a_void_Graphics_int_int_int_int_int_int(graphics,
										this.aH_int, this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int,
										0, 0);
							} else {
								graphics.drawImage(a_Image_2d_Array[this.aG_int][this.aH_int],
										this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bP_int);
							}

							this.aG_int = -1;
							this.bP_int = 0;
						} else {
							if (b_a == null) {
								continue;
							}

							if (this.bG_int == this.co_int && this.bH_int == this.cp_int) {
								c_a = b_a;
								this.ct_int = this.bK_int;
								this.cs_int = this.bL_int;
								this.cr_int = this.bx_int + this.bN_int;
								this.cq_int = this.by_int + this.bO_int;
							}

							if (this.bK_int != -1) {
								b_a.a_void_Graphics_int_int_int_int_int_int_int(graphics, this.bK_int, this.bL_int,
										this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bM_int, 0, 0);
								this.bK_int = -1;
							} else {
								b_a.a_void_Graphics_int_int_int_int_int_int(graphics, this.bL_int,
										this.bx_int + this.bN_int, this.by_int + this.bO_int, this.bM_int, 0, 0);
							}

							b_a = null;
							this.bM_int = 0;
						}

						this.bN_int = this.bO_int = 0;
					}
				}
			}
		}
	}

	private void W_void() {
		this.a_Graphics.setClip(0, 0, 240, 260);
	}

	private void X_void() {
		Graphics var1 = this.a_Graphics;
		int var2 = aN_int;
		this.bQ_int = (this.aS_int & 4096) == 0 ? this.k_byte : 0;
		var1.translate(0, 30);
		this.bk_int = 0;
		this.W_void();
		if (this.bj_int > 0) {
			this.bk_int = this.bj_int * var2 % ((this.bj_int >> 1) + 1) % 12;
		}

		if (this.bk_int > this.as_int) {
			this.bk_int = this.as_int;
		}

		this.as_int = this.as_int - this.bk_int;
		this.cI_int = this.ar_int / 24;
		this.cJ_int = this.as_int / 24;
		this.cK_int = this.ar_int % 24;
		this.cL_int = this.as_int % 24;
		this.bR_int = (var2 & 63) >> 1;
		if (this.bR_int >= 4) {
			this.bR_int = 0;
		}

		int var3 = this.ar_int - this.cK_int;
		int var4 = this.as_int - this.cL_int;
		int var5 = this.ar_int + cC_int - 24 - (this.ar_int + cC_int - 24) % 24;
		int var6 = this.as_int + cD_int - 24 - (this.as_int + cD_int - 24) % 24;
		if (cE_int == -1) {
			this.a_void_int_int_int_int_boolean(var3, var4, var5, var6, false);
			cE_int = var3;
			cF_int = var5;
			cG_int = var4;
			cH_int = var6;
		}

		if (cE_int != var3) {
			int var7;
			int var10000;
			if (cE_int < var3) {
				var7 = cF_int + 24;
				var10000 = var5;
			} else {
				var7 = var3;
				var10000 = cE_int - 24;
			}

			int var8 = var10000;
			this.a_void_int_int_int_int_boolean(var7, var4, var8, var6, false);
			cE_int = var3;
			cF_int = var5;
		}

		if (cG_int != var4) {
			int var36;
			int var43;
			if (cG_int < var4) {
				var36 = cH_int + 24;
				var43 = var6;
			} else {
				var36 = var4;
				var43 = cG_int - 24;
			}

			int var38 = var43;
			this.a_void_int_int_int_int_boolean(var3, var36, var5, var38, false);
			cG_int = var4;
			cH_int = var6;
		}

		this.b_void_Graphics(var1);
		this.W_void();
		this.c_void_Graphics(var1);
		if (D_boolean) {
			var1.setColor(0);
			var1.fillRect(0, 0, 240, 320);
			this.az_void();
			if (e_Image != null) {
				var1.drawImage(e_Image, cM_int, cN_int, cO_int);
			}

			if (this.S_int != this.T_int) {
				int var48 = this.S_int;

				while (true) {
					var3 = var48;
					if (var48 == this.T_int) {
						break;
					}

					var4 = a_byte_Array[var3 << 1] * 24 - this.ar_int;
					var5 = a_byte_Array[(var3 << 1) + 1] * 24 - this.as_int;
					a var49;
					Graphics var52;
					byte var55;
					int var57;
					if (c_byte_Array[var3] < 0) {
						a var35;
						var49 = var35 = a_a_Array[2];
						var52 = var1;
						var55 = 0;
						var57 = a_int_a_int_int(var35, 0, b_byte_Array[var3]);
					} else {
						var49 = a_a_Array[9];
						var52 = var1;
						var55 = c_byte_Array[var3];
						var57 = b_byte_Array[var3];
					}

					var49.a_void_Graphics_int_int_int_int_int_int_int(var52, var55, var57, var4, var5, 0, 0, 0);
					var48 = ++var3 & 7;
				}
			}

			this.a_Graphics.setClip(0, 0, 240, 320);
			var1.translate(0, -30);
			this.ah_void();
		} else {
			this.az_void();
			if (this.j_boolean) {
				this.d_void_int_int(this.cK_int, this.cL_int);
			}

			if (e_Image != null) {
				var1.drawImage(e_Image, cM_int, cN_int, cO_int);
			}

			if (this.al_int > 0) {
				this.Y_void();
			}

			if (this.i_byte != 0) {
				this.ap_void();
			}

			for (int var17 = -1; var17 < 12; var17++) {
				for (int var24 = -1; var24 < 12; var24++) {
					int var37 = var24 + this.cI_int;
					int var39 = var17 + this.cJ_int;
					if (var37 >= 0 && var37 < this.av_int && var39 >= 0 && var39 < this.aw_int) {
						var5 = a_int_2d_Array[var37][var39] & 0xFF;
						byte var33 = a_byte_2d_Array[var37][var39];
						if (var5 < 38 || var5 >= 80) {
							int var10;
							int var11;
							label282: {
								var10 = var24 * 24 - this.cK_int;
								var11 = var17 * 24 - this.cL_int;
								a var44;
								Graphics var10001;
								int var10002;
								int var10003;
								if (var5 >= 20 && var5 < 26) {
									int var42 = var5 - 20;
									var44 = a_a_Array[3];
									var10001 = var1;
									var10002 = var42;
									var10003 = (var2 >> 2) % (a_a_Array[3].e_byte_Array[var42] & 255);
								} else {
									switch (var5) {
									case 31:
										int var13 = a_int_2d_Array[var37][var39] >> 8;
										a var14 = a_a_Array[15];
										int var15 = (aN_int >> 1) % (var14.e_byte_Array[var13] & 255);
										var14.a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, var13, var15,
												var10, var11, 0, 0, 0);
										break;
									case 32:
										a_a_Array[16].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0,
												a_int_2d_Array[var37][var39] >> 8 & 0xFF, var10, var11, 0, 0, 0);
										break;
									case 36:
										int var12 = (a_int_2d_Array[var37][var39] >> 8) - 1;
										var12 = (0 + var12 * 7) / 16;
										a_a_Array[20].a_void_Graphics_int_int_int_int_int_int_int(var1, 0, var12, var10,
												var11, 0, 0, 0);
										break;
									default:
										byte var16;
										if ((var16 = (byte) (var5 - 80)) >= 0) {
											a_a_Array[42].a_void_Graphics_int_int_int_int_int_int(var1, var16, var10,
													var11, 0, 0, 0);
										}
									}

									int var41;
									if ((var41 = (a_int_2d_Array[var37][var39] & -268435456) >> 28) <= 0) {
										break label282;
									}

									var44 = a_a_Array[13];
									var10001 = var1;
									var10002 = 0;
									var10003 = var41;
								}

								var44.a_void_Graphics_int_int_int_int_int_int_int(var10001, var10002, var10003, var10,
										var11, 0, 0, 0);
							}

							if (var33 == 54) {
								a_a_Array[7].a_void_Graphics_int_int_int_int_int_int_int(var1, 0,
										a_int_a_int_int(a_a_Array[7], 0, b_int_2d_Array[var37][var39]), var10, var11, 0,
										0, 0);
							}
						}
					}
				}
			}

			if (this.y_boolean) {
				var3 = (this.bB_int - this.cI_int) * 24 - this.cK_int + this.bz_int;
				var4 = (this.bC_int - this.cJ_int + 1) * 24 - this.cL_int + this.bA_int;
				var1.drawImage(a_a_Array[13].a_Image_2d_Array[0][0 + this.bD_int], var3, var4, 0);
				this.y_boolean = false;
			}

			if (this.ay_int != -1) {
				var1.drawImage(a_Image_2d_Array[13][0], this.bv_int + -12, this.bw_int + -24 + 2, 3);
				var1.drawImage(a_Image_2d_Array[this.ay_int][this.az_int], this.bv_int + -12, this.bw_int + -24, 3);
			}

			if (this.S_int != this.T_int) {
				int var45 = this.S_int;

				while (true) {
					var3 = var45;
					if (var45 == this.T_int) {
						break;
					}

					var4 = a_byte_Array[var3 << 1] * 24 - this.ar_int;
					var5 = a_byte_Array[(var3 << 1) + 1] * 24 - this.as_int;
					a var46;
					Graphics var50;
					byte var53;
					int var56;
					if (c_byte_Array[var3] < 0) {
						a var34;
						var46 = var34 = a_a_Array[2];
						var50 = var1;
						var53 = 0;
						var56 = a_int_a_int_int(var34, 0, b_byte_Array[var3]);
					} else {
						var46 = a_a_Array[9];
						var50 = var1;
						var53 = c_byte_Array[var3];
						var56 = b_byte_Array[var3];
					}

					var46.a_void_Graphics_int_int_int_int_int_int_int(var50, var53, var56, var4, var5, 0, 0, 0);
					var45 = ++var3 & 7;
				}
			}

			this.as_int = this.as_int + this.bk_int;
			if (this.v_boolean) {
				a_void_Graphics_a_String_int_int_int_int_boolean(var1, a_a_Array[41], a_String_Array[40], 120, 145, 17,
						19, false);
			}

			if (this.bn_int > aN_int && this.i_byte != 2) {
				if (!this.aj_boolean && !this.f_boolean) {
					var4 = (var3 = this.bn_int - aN_int) < 20 ? (var3 - 10) * 240 / 20
							: (var3 >= 50 ? (60 - var3) * 240 / 15 : 120);
					var5 = 240 - var4;
					a_void_Graphics_a_String_int_int_int_int_boolean(var1, a_a_Array[41],
							a_String_Array[d_int_Array[this.ap_int]], var4, 15, 17, 20, false);
					a_void_Graphics_a_String_int_int_int_int_boolean(var1, a_a_Array[41],
							a_String_Array[g_int_2d_Array[this.ap_int][this.aq_int]], var5, 50, 17, 20, false);
				}
			} else if (this.Z_int > aN_int && this.r_byte <= 2) {
				a_void_Graphics_a_String_int_int_int_int_boolean(var1, a_a_Array[41], a_String_Array[36], 120, 235, 33,
						20, false);
			} else if (this.Z_int == aN_int && this.r_byte <= 2) {
				this.r_byte++;
				this.J_void();
			}

			label211: {
				i var47;
				Graphics var51;
				byte var54;
				switch (this.i_byte) {
				case 3:
					if (this.ad_int == -1 || this.ad_int == 15) {
						break label211;
					}

					var47 = this;
					var51 = var1;
					var54 = 5;
					break;
				case 4:
					this.at_void();
					break label211;
				case 5:
					if (this.ad_int != -1 && this.ad_int != 15 && this.ad_int != 13 && this.ad_int != 12) {
						var47 = this;
						var51 = var1;
						var54 = 4;
						break;
					}
				default:
					break label211;
				}

				var47.a_void_Graphics_int(var51, var54);
			}

			var1.translate(0, -30);
			var1.setClip(0, 0, 240, 320);
			if (this.a_c == null) {
				this.ah_void();
			}

			if (this.d_String != null) {
				this.m_boolean = true;
				a_void_Graphics_a_String_int_int_int_int_boolean(var1, a_a_Array[41], this.d_String, 119, 261, 33, 4,
						true);
			}

			if (this.a_c != null && !D_boolean) {
				this.m_boolean = true;
				this.a_c.a_void_Graphics(var1);
			}

			if (this.bl_int > 0) {
				this.m_boolean = true;
				var1.setColor(0);
				var1.fillRect(0, 0, 240, this.bl_int);
				var1.fillRect(0, 320 - this.bl_int, 240, this.bl_int);
				var1.translate(0, 30);
				this.az_void();
				if (e_Image != null) {
					var1.drawImage(e_Image, cM_int, cN_int, cO_int);
				}

				if (c_a != null) {
					if (this.ct_int != -1) {
						c_a.a_void_Graphics_int_int_int_int_int_int_int(var1, this.ct_int, this.cs_int,
								(this.co_int - this.cI_int) * 24 - this.cK_int,
								(this.cp_int - this.cJ_int) * 24 - this.cL_int, this.bM_int, 0, 0);
					} else {
						c_a.a_void_Graphics_int_int_int_int_int_int(var1, this.cs_int, this.cr_int, this.cq_int,
								this.bM_int, 0, 0);
					}
				}

				var1.translate(0, -30);
			}
		}
	}

	private void Y_void() {
		int var1 = this.as_int - 24;
		int var2 = this.as_int + 320;
		int var3 = this.ar_int;
		int var4 = this.ar_int + 240;
		int var5 = (aN_int >> 1) % a_a_Array[2].a_int_int(1);

		for (byte var6 = 0; var6 < e_byte_Array.length; var6 += 3) {
			int var7 = 0;
			byte var8;
			int var9;
			if ((var9 = (var8 = e_byte_Array[var6 + 2]) * 24) > var1 && var9 < var2) {
				byte var10 = e_byte_Array[var6 + 0];
				byte var11 = e_byte_Array[var6 + 1];
				int var12 = var10 * 24;
				int var13 = var11 * 24 + 24;
				if (var12 >= var3 && var12 <= var4 || var13 >= var3 && var13 <= var4
						|| var12 <= var3 && var13 >= var4) {
					int var14 = var12 - var3;
					int var15 = var10 + (var10 != 0 ? -1 : 0);
					boolean var16 = true;
					if (a_byte_2d_Array[var15][var8] == 48 && (b_int_2d_Array[var15][var8] & 8) != 0) {
						var14 -= 12;
						var16 = false;
						if ((b_int_2d_Array[var15][var8 + 1] & 7) == 3) {
							var7 = -b_byte_2d_Array[var15][var8 + 1];
						} else {
							var14 -= -b_byte_2d_Array[var15][var8 + 1];
						}
					}

					int var17 = var13 - var3;
					var15 = var11 + (var11 < this.av_int - 1 ? 1 : 0);
					boolean var18 = true;
					if (a_byte_2d_Array[var15][var8] == 48 && (b_int_2d_Array[var15][var8] & 8) != 0) {
						var17 += 12;
						var18 = false;
						if ((b_int_2d_Array[var15][var8 + 1] & 7) == 3) {
							var7 = -b_byte_2d_Array[var15][var8 + 1];
						} else {
							var17 += -b_byte_2d_Array[var15][var8 + 1];
						}
					}

					int var19 = var9 - this.as_int + 10 + var7;
					this.a_Graphics.setColor(1820159);
					this.a_Graphics.drawLine(var14, var19, var17, var19);
					var19 += 2;
					this.a_Graphics.drawLine(var14, var19, var17, var19);
					var19--;
					this.a_Graphics.setColor(14153215);
					this.a_Graphics.drawLine(var14, var19, var17, var19);
					a var10000;
					Graphics var10001;
					byte var10002;
					int var10003;
					int var10004;
					int var10005;
					byte var10006;
					if (var16) {
						var10000 = a_a_Array[2];
						var10001 = this.a_Graphics;
						var10002 = 1;
						var10003 = var5;
						var10004 = var14;
						var10005 = var19;
						var10006 = 1;
					} else {
						if (!var18) {
							continue;
						}

						var10000 = a_a_Array[2];
						var10001 = this.a_Graphics;
						var10002 = 1;
						var10003 = var5;
						var10004 = var17;
						var10005 = var19;
						var10006 = 0;
					}

					var10000.a_void_Graphics_int_int_int_int_int_int_int(var10001, var10002, var10003, var10004,
							var10005, var10006, 0, 0);
				}
			}
		}
	}

	private void Z_void() {
		int var1;
		if (((var1 = b_int_2d_Array[this.bG_int][this.bH_int]) & 8) == 0) {
			b_a = a_a_Array[32];
			int var2 = var1 & 7;
			boolean var3;
			i var10000;
			int var10001;
			if ((!(var3 = (var1 & 16) == 0) || var2 != 2) && (var3 || var2 != 4)) {
				var10000 = this;
				var10001 = var3 ? 1 : 0;
			} else {
				var10000 = this;
				var10001 = 2;
			}

			var10000.bL_int = var10001;
			byte var4 = b_byte_2d_Array[this.bG_int][this.bH_int];
			this.bN_int = var4 * g_byte_Array[var2];
			this.bO_int = var4 * g_byte_Array[var2 + 8];
		}
	}

	private void aa_void() {
		if ((b_int_2d_Array[this.bG_int][this.bH_int] & 7) == 1
				&& (a_int_2d_Array[this.bG_int][this.bH_int] & 0xFF) == 35) {
			this.bN_int = 0;
			this.bO_int = b_byte_2d_Array[this.bG_int][this.bH_int];
		}
	}

	private void ab_void() {
		b_a = a_a_Array[30];
		this.bK_int = 1;
		this.bL_int = a_int_a_int_int(b_a, 1, aN_int % a_int_a_int(b_a, 1));
	}

	private void ac_void() {
		int var1 = b_int_2d_Array[this.bG_int][this.bH_int] & 7;
		b_a = a_a_Array[29];
		i var3;
		int var5;
		if ((b_int_2d_Array[this.bG_int][this.bH_int] & 8) == 0) {
			label26: {
				byte var10001;
				switch (var1) {
				case 1:
					var3 = this;
					var10001 = 2;
					break;
				case 2:
					var3 = this;
					var10001 = 1;
					break;
				case 3:
				default:
					break label26;
				case 4:
					var3 = this;
					var10001 = 0;
				}

				var3.bL_int = var10001;
			}

			this.bN_int = b_byte_2d_Array[this.bG_int][this.bH_int] * g_byte_Array[var1];
			var3 = this;
			var5 = b_byte_2d_Array[this.bG_int][this.bH_int] * g_byte_Array[8 + var1];
		} else {
			label21: {
				byte var6;
				switch (var1) {
				case 1:
					var3 = this;
					var6 = 14;
					break;
				case 2:
					var3 = this;
					var6 = 13;
					break;
				case 3:
				default:
					break label21;
				case 4:
					var3 = this;
					var6 = 12;
				}

				var3.bK_int = var6;
			}

			this.bL_int = a_int_a_int_int(b_a, this.bK_int, b_byte_2d_Array[this.bG_int][this.bH_int]);
			int var2 = (b_a.b_short_Array[this.bK_int] + this.bL_int) * 5;
			this.bN_int = b_a.f_byte_Array[var2 + 2];
			var3 = this;
			var5 = b_a.f_byte_Array[var2 + 3];
		}

		var3.bO_int = var5;
	}

	private void ad_void() {
		b_a = a_a_Array[29];
		this.bK_int = b_int_2d_Array[this.bG_int][this.bH_int] & 31;
		i var10000;
		int var10001;
		if (this.bK_int != 8 && this.bK_int != 9) {
			int var4 = (b_int_2d_Array[this.bG_int][this.bH_int] & 8160) >> 5;
			int var2 = a_int_a_int_int(b_a, this.bK_int, var4);
			this.bL_int = var2;
			int var3 = (b_a.b_short_Array[this.bK_int] + var2) * 5;
			this.bN_int = b_a.f_byte_Array[var3 + 2];
			var10000 = this;
			var10001 = b_a.f_byte_Array[var3 + 3];
		} else {
			this.bL_int = 0;
			int var1 = (b_a.b_short_Array[this.bK_int] + 0) * 5;
			this.bN_int = b_a.f_byte_Array[var1 + 2];
			var10000 = this;
			var10001 = -b_byte_2d_Array[this.bG_int][this.bH_int];
		}

		var10000.bO_int = var10001;
	}

	private void ae_void() {
		this.bK_int = (b_int_2d_Array[this.bG_int][this.bH_int] & 56) >> 3;
		b_a = a_a_Array[27];
		i var10000;
		int var10001;
		switch (this.bK_int) {
		case 1:
			var10000 = this;
			var10001 = (b_byte_2d_Array[this.bG_int][this.bH_int] >> 1) % a_a_Array[27].a_int_int(1);
			break;
		case 3:
			this.bL_int = 0;
			this.bO_int = -b_byte_2d_Array[this.bG_int][this.bH_int];
			return;
		default:
			var10000 = this;
			var10001 = b_byte_2d_Array[this.bG_int][this.bH_int];
		}

		var10000.bL_int = var10001;
	}

	private void af_void() {
		this.a_void_int_int_boolean(this.bx_int, this.by_int, false);
	}

	private void a_void_int_int_boolean(int integer1, int integer2, boolean boolean3) {
		Image[] var4 = a_Image_2d_Array[18];
		byte var5 = 0;
		if (boolean3) {
			var5 = -3;
		}

		this.a_Graphics.drawImage(var4[1], integer1 + 6, integer2 + var5, 0);
		this.a_Graphics.drawImage(var4[0], integer1 + 3, integer2 + 7, 0);
		if (!boolean3) {
			int var7 = 0;
			if (this.P_int < 10) {
				var7 = a_a_Array[0].a_Image_2d_Array[0][0].getWidth() >> 1;
				var7++;
			}

			a_void_Graphics_int_int_int_Image_Array_int(this.a_Graphics, integer1 + 19 - var7, integer2 + 11,
					this.P_int, a_a_Array[0].a_Image_2d_Array[0], 0);
		}
	}

	private void d_void_int_int(int integer1, int integer2) {
		Graphics var3 = this.a_Graphics;

		for (int var4 = 0; var4 < 12; var4++) {
			for (int var5 = 0; var5 < 12; var5++) {
				int var7 = var5 + this.ar_int / 24;
				int var8 = var4 + this.as_int / 24;
				if (var7 >= 0 && var7 < this.av_int && var8 >= 0 && var8 < this.aw_int) {
					int var6 = e_int_2d_Array[var7][var8];
					int var10 = var5 * 24 - integer1;
					int var11 = var4 * 24 - integer2;
					byte var12 = 0;
					if (var6 > 0) {
						byte var10000 = 0;

						while (true) {
							byte var13 = var10000;
							if (var10000 > 2) {
								break;
							}

							if (a_int_int_byte_byte_byte(var6, var13, (byte) 0, (byte) 3) != 0) {
								if ((var12 = (byte) (a_int_int_byte_byte_byte(var6, var13, (byte) 7,
										(byte) 2) << 3)) > 0) {
									byte var18 = (byte) (var12 - 24);
									var12 = a_int_int_byte_byte(
											a_int_int_byte_byte_byte(var6, var13, (byte) 0, (byte) 3), (byte) 45,
											(byte) 2) <= 1 ? (var18) : (byte) (24 - var12);
									this.W_void();
									var3.clipRect(var10, var11 + (var13 << 3), 24, 8);
								}

								int var14;
								int var15;
								int var16 = ((var15 = (var14 = this.a_int_int_int_int_byte(var7, var8, var6,
										var13)) >> 1) == 7 ? aN_int >> 3 : aN_int) & 1;
								if (var15 == 15) {
									d_a.a_void_Graphics_int_int_int_int_int_int(var3, var14 + this.cB_int,
											var10 + var12 - 8, var11 + (var13 << 3) + 8, 36, 0, 0);
									this.cB_int++;
									if (this.cB_int > 2) {
										this.cB_int = 0;
									}
								} else {
									label100: {
										a var19;
										Graphics var10001;
										int var10002;
										int var10003;
										int var10004;
										if (var15 != 14 && var15 != 11) {
											if (var15 == 8 && var13 == 0 && e_int_2d_Array[var7][var8 - 1] > 0) {
												d_a.a_void_Graphics_int_int_int_int_int_int(var3, 33, var10 + var12,
														var11, 20, 0, 0);
												var13 = 3;
												break label100;
											}

											var19 = d_a;
											var10001 = var3;
											var10002 = var14 + var16;
											var10003 = var10 + var12;
											var10004 = var11 + (var13 << 3);
										} else {
											var19 = d_a;
											var10001 = var3;
											var10002 = var14 + var16;
											var10003 = var10 + var12;
											var10004 = var11;
										}

										var19.a_void_Graphics_int_int_int_int_int_int(var10001, var10002, var10003,
												var10004, 20, 0, 0);
										this.W_void();
									}
								}
							}

							var10000 = (byte) (var13 + 1);
						}
					}
				}
			}
		}
	}

	private void ag_void() {
		this.aE_int = 20;
		i var10000;
		int var10001;
		if (a_int_2d_Array[this.bG_int][this.bH_int] >> 8 >= this.ax_int) {
			var10000 = this;
			var10001 = 0 + (aN_int >> 1) % 7;
		} else {
			var10000 = this;
			var10001 = 7;
		}

		var10000.aF_int = var10001;
	}

	private void l_void_int(int integer) {
		int var2;
		if ((var2 = a_int_2d_Array[this.bG_int][this.bH_int] >> 8) == 255) {
			var2 = 0;
		}

		int var3 = 14 == integer ? 8 : 22;
		if (a_a_Array[var3] != null) {
			a_a_Array[var3].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0, var2, this.bx_int,
					this.by_int, 0, 0, 0);
		}
	}

	private void ah_void() {
		boolean var1 = false;
		Graphics var2 = this.a_Graphics;
		a var3;
		if ((var3 = a_a_Array[0]) != null) {
			var2.translate(120, 320);
			var3.a_void_Graphics_int_int_int_int_int_int(var2, 1, 0, 0, 0, 0, 0);
			a var10000;
			if (!this.m_boolean && l_byte != 2) {
				var1 = true;
				var2.setClip(-120, -320, 240, 320);
				var10000 = var3;
			} else {
				var3.a_void_Graphics_int_int_int_int_int_int(var2, 0, 0, 0, 0, 0, 0);
				if (this.T_boolean) {
					var3.a_void_Graphics_int_int_int_int_int_int(var2, 19, 0, 0, 0, 0, 0);
				}

				var10000 = var3;
			}

			var10000.a_void_Graphics_int_int_int_int_int_int(var2, 1, 0, 0, 0, 0, 0);
			if (this.n_boolean) {
				var3.a_void_Graphics_int_int_int_int_int_int(var2, 2, 2, 0, 0, 0, 0);
				var3.a_void_Graphics_int_int_int_int_int_int(var2, 3 + this.ac_int, 2, 0, 0, 0, 0);
			}

			if (var1) {
				var2.setClip(-120, -320, 240, 320);
			}

			if (this.n_byte != this.cP_int || this.m_boolean || this.n_byte <= 1) {
				Image[] var4 = a_a_Array[0].a_Image_2d_Array[0];
				int var5 = 0;
				int var6 = this.n_byte <= 1 ? 1 : 0;
				int var7 = -33 - (i_byte_Array[8] - 4) * var4[11 + var6].getWidth() / 2;
				var2.drawImage(var4[11 + var6], var7, -26, 0);
				var5 = 0 + var4[11 + var6].getWidth();
				int var8 = var4[15].getWidth();

				for (int var9 = 0; var9 < i_byte_Array[8]; var9++) {
					Graphics var12;
					Image[] var10001;
					byte var10002;
					if ((this.n_byte > 1 || var9 != 0 || (aN_int >> 2 & 1) != 0)
							&& (var9 >= this.n_byte || this.n_byte <= 1)) {
						var12 = var2;
						var10001 = var4;
						var10002 = 13;
					} else {
						var12 = var2;
						var10001 = var4;
						var10002 = 15;
					}

					var12.drawImage(var10001[var10002 + var6], var7 + var5, -26, 0);
					var5 += var8;
				}

				var2.drawImage(var4[17 + var6], var7 + var5, -26, 0);
				this.cP_int = this.n_byte;
			}

			a_void_Graphics_int_int_int_Image_Array_int(var2, 70, -12, this.aZ_int, a_a_Array[0].a_Image_2d_Array[0],
					0);
			a_void_Graphics_int_int_int_Image_Array_int(var2, 107, -12, this.bb_int, a_a_Array[0].a_Image_2d_Array[0],
					0);
			var2.translate(-120, -320);
			var2.translate(120, 0);
			boolean var10 = false;
			if (this.m_boolean || l_byte == 2) {
				var3.a_void_Graphics_int_int_int_int_int_int(var2, 20, 0, 0, 0, 0, 0);
				var10 = true;
			}

			if (this.cR_int != this.aU_int || this.cS_int != this.aV_int || this.m_boolean || l_byte == 2 || var10) {
				if (!var10) {
					var3.a_void_Graphics_int_int_int_int_int_int(var2, 20, 0, 0, 0, 0, 0);
					var10 = true;
				}

				a_void_Graphics_int_int_int_Image_Array_int(var2, 47, 11, this.aU_int, a_a_Array[0].a_Image_2d_Array[0],
						0);
				a_void_Graphics_int_int_int_Image_Array_int(var2, 87, 11, this.aV_int, a_a_Array[0].a_Image_2d_Array[0],
						0);
				this.cR_int = this.aU_int;
				this.cS_int = this.aV_int;
			}

			if (this.cQ_int != this.ao_int || this.m_boolean || var10) {
				if (!var10) {
					var3.a_void_Graphics_int_int_int_int_int_int(var2, 20, 0, 0, 0, 0, 0);
				}

				a_void_Graphics_int_int_int_Image_Array_int(var2, -29, 11, this.ao_int,
						a_a_Array[0].a_Image_2d_Array[0], 0);
				this.cQ_int = this.ao_int;
			}

			var2.translate(-120, 0);
			this.m_boolean = false;
		}
	}

	private void ai_void() {
		b_a = a_a_Array[6];
		this.bK_int = 0;
		i var10000;
		int var10001;
		if (this.ce_int == 0) {
			var10000 = this;
			var10001 = 0;
		} else if (this.ce_int == 9) {
			var10000 = this;
			var10001 = 2;
		} else {
			var10000 = this;
			var10001 = this.cf_int < 0 ? 1 : 3;
		}

		var10000.bL_int = var10001;
	}

	private void aj_void() {
		int var1 = b_int_2d_Array[this.bG_int][this.bH_int] == 1 ? 1 : 0;
		a var2;
		(var2 = a_a_Array[5]).a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, var1,
				(aN_int >> 1) % var2.a_int_int(var1), this.bx_int, this.by_int, 0, 0, 0);
	}

	private void b_void_byte(byte byte1) {
		g var2 = a_g_Array[4];
		if (byte1 == 23) {
			var2.a_int = this.bx_int;
			var2.e_int |= 1;
		} else {
			var2.e_int &= -2;
			var2.a_int = this.bx_int + 24;
		}

		var2.b_int = this.by_int;
		var2.a_void();
		var2.a_void_Graphics(this.a_Graphics);
	}

	private void m_void_int(int integer) {
		switch (integer) {
		case 0:
			cL_void();
			System.gc();
			return;
		case 1:
			return;
		case 2:
			a_a_Array[41].e_int = 15;
			return;
		case 3:
			return;
		case 4:
			return;
		case 5:
			return;
		case 6:
			if (a_Image == null) {
				a_Image = a_Image_String_int("/spl.f", 0);
			}

			if (b_Image == null) {
				b_Image = a_Image_String_int("/spl.f", 1);
			}

			if (c_Image == null) {
				c_Image = a_Image_String_int("/spl.f", 2);
				return;
			}
			break;
		case 7:
			if (a_a_Array[18] == null) {
				a_a_Array[18] = a_a_String_int("/ui.f", 3);
			}
		}
	}

	private static void ak_void() {
		a_Image = null;
		b_Image = null;
		c_Image = null;
		g_Image = null;
		f_Image = null;
		c_Graphics = null;
		System.gc();
	}

	private void al_void() {
		this.cU_int = a_short_2d_Array[this.bo_int].length >> 1;
		this.cV_int = 0;

		for (int var1 = 0; var1 < this.cU_int; var1++) {
			int var2 = a_int_a_String_int(a_a_Array[41], a_String_Array[a_short_2d_Array[this.bo_int][var1 * 2 + 1]],
					0);
			if ((this.bo_int != 0 || var1 != 3) && var2 > this.cV_int) {
				this.cV_int = var2;
			}
		}

		this.cY_int = 0;
		this.cT_int = 0;
	}

	private void e_void_int_int(int integer1, int integer2) {
		if (l_byte == 4) {
			this.b_void_Graphics_boolean(this.a_Graphics, false);

			for (int var3 = integer1 - 1; var3 < integer2 - 2; var3++) {
				a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 4, var3 % 2, var3, 0, 0, 0);
			}
		}

		if (l_byte == 2) {
			this.a_Graphics.setColor(0);
			this.a_Graphics.fillRect(0, integer1 - 1, 240, integer2 - 2 - (integer1 - 1));
		}

		this.a_Graphics.setColor(16777215);
		this.a_Graphics.drawLine(0, integer1 - 1 - 1, 240, integer1 - 1 - 1);
		this.a_Graphics.drawLine(0, integer2 - 1, 240, integer2 - 1);
		this.a_Graphics.setColor(0);
		this.a_Graphics.drawLine(0, integer1 - 1 - 2, 240, integer1 - 1 - 2);
		this.a_Graphics.drawLine(0, integer2 - 2, 240, integer2 - 2);
	}

	private void am_void() {
		this.X_boolean = false;
		this.W_boolean = a_boolean();
	}

	private void an_void() {
		if (this.X_boolean) {
			this.am_void();
		}

		int var1;
		var1 = (var1 = 320 - (this.cU_int * 15 + 1 + 2)) + (!this.W_boolean && this.bo_int == 0 ? 15 : 0);
		int var2 = 320;
		this.a_Graphics.setClip(0, 0, 240, 320);
		if (l_byte == 2 && U_boolean && V_boolean) {
			this.T_boolean = false;
			this.X_void();
			this.T_boolean = true;
			V_boolean = false;
		}

		if (l_byte == 7 || l_byte == 2) {
			int var3 = var1 - (160 - (320 - var1) / 2);
			var1 -= var3;
			var2 = 320 - var3;
		}

		if (this.bo_int == 7) {
			a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics,
					a_String_Array[this.aM_int == 5 ? 102 : 113], 120, var1 - 20, 17);
		}

		if (l_byte == 7) {
			Graphics var10000;
			byte var10001;
			int var10002;
			short var10003;
			short var10004;
			if (this.db_int != -1 && !U_boolean) {
				int var16 = var1 + this.db_int * 15;
				this.a_Graphics.setColor(0);
				var10000 = this.a_Graphics;
				var10001 = 0;
				var10002 = var16;
				var10003 = 240;
				var10004 = 16;
			} else {
				this.a_Graphics.setColor(0);
				var10000 = this.a_Graphics;
				var10001 = 0;
				var10002 = 0;
				var10003 = 240;
				var10004 = 320;
			}

			var10000.fillRect(var10001, var10002, var10003, var10004);
		}

		long var17 = System.currentTimeMillis();
		if (this.da_int >= 0 && var17 - this.h_long > 100L) {
			this.da_int++;
			this.h_long = var17;
		}

		if (this.db_int != -1 && !U_boolean) {
			int var5 = this.bo_int == 0 && this.db_int > 1 && !this.W_boolean ? 15 : 0;
			int var6 = var1 + this.db_int * 15 - var5;
			this.a_Graphics.setClip(0, var6, 240, 16);
		}

		if (this.db_int != this.bq_int || U_boolean) {
			this.e_void_int_int(var1, var2);
		}

		for (int var18 = 0; var18 < this.cU_int; var18++) {
			if ((this.db_int == -1 || var18 == this.db_int || var18 == this.bq_int || U_boolean)
					&& (this.bo_int != 0 || var18 != 1 || this.W_boolean)) {
				int var20;
				int var7 = (var20 = var1 + var18 * 15) + 7;
				if (this.bo_int == 0 && var18 > 1 && !this.W_boolean) {
					var20 -= 15;
					var7 -= 15;
				}

				byte var8 = 0;
				if (var18 == 2 && this.bo_int == 0) {
					var8 = 1;
				}

				label208: {
					Graphics var25;
					int var28;
					int var30;
					short var31;
					byte var32;
					label288: {
						if (this.i_byte == 2 && var18 == 4 && this.bo_int == 1) {
							var8 = 0;
							if (var18 != this.bq_int) {
								this.a_Graphics.setColor(13421772);
								var25 = this.a_Graphics;
								var28 = 0;
								var30 = var7 - 7 + 1;
								var31 = 240;
								var32 = 14;
								break label288;
							}

							var25 = this.a_Graphics;
							var28 = 6710886;
						} else {
							if (var18 != this.bq_int) {
								break label208;
							}

							var25 = this.a_Graphics;
							var28 = 13540096;
						}

						var25.setColor(var28);
						var25 = this.a_Graphics;
						var28 = 0;
						var30 = var7 - 7;
						var31 = 240;
						var32 = 16;
					}

					var25.fillRect(var28, var30, var31, var32);
				}

				int var11 = 0;
				boolean var14 = false;
				a_a_Array[41].a_void_String(a_String_Array[a_short_2d_Array[this.bo_int][var18 * 2 + 1]]);
				int var9 = a.c_int;
				int var10 = a.c_int;
				int var12 = var18 == 2 && this.bo_int == 0 ? 152 : 210;
				if (var9 > var12) {
					var14 = true;
					var9 = var12;
				}

				int var13 = 120 - var9 / 2;
				if (var14) {
					var11 = var18 == this.bq_int ? this.cX_int : 0;
					this.a_Graphics.setClip(var13, var20, var9, 15);
				}

				a_a_Array[41].b_int = var8;
				a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics,
						a_String_Array[a_short_2d_Array[this.bo_int][var18 * 2 + 1]], 120 - var9 / 2 - var11, var7 + 1,
						6);
				if (var14) {
					this.a_Graphics.setClip(0, 0, 240, 320);
				}

				if (var18 == this.bq_int) {
					this.a_Graphics.setColor(16777215);
					a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 2, 120 - var9 / 2 - 8, var7,
							0, 0, 10);
					a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 2, 120 + var9 / 2 + 8, var7,
							0, 0, 6);
				}

				if (var18 == this.bq_int && var14 && this.cT_int % 2 == 0) {
					this.cX_int = this.cX_int + this.cW_int;
					if (this.cX_int < -5 || this.cX_int + var12 - 5 > var10) {
						this.cW_int = -this.cW_int;
						this.cX_int = this.cX_int + this.cW_int;
					}
				}
			}
		}

		this.db_int = this.bq_int;
		this.cT_int++;
		i var26;
		int var29;
		if (this.cZ_int < 0) {
			var26 = this;
			var29 = 3;
		} else {
			var26 = this;
			var29 = this.cZ_int - 1;
		}

		var26.cZ_int = var29;
		if (this.cZ_int == 0 && this.cY_int + 1 < this.cU_int) {
			this.cY_int++;
		}

		this.a_Graphics.setClip(0, 0, 240, 320);
		if (this.bo_int == 0 && this.al_boolean) {
			int var19 = this.cT_int % 20;
			if ((var19) >= 10) {
				a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 1, 1,
						var1 + 30 + 7 - (this.W_boolean ? 0 : 15), 0, 0, 6);
			} else if (this.bq_int != 2) {
				if (f_Image == null) {
					int var21 = var1 + 30 + 1 - (this.W_boolean ? 0 : 15);
					f_Image = Image.createImage(28, 14);
					Graphics var22;
					(var22 = f_Image.getGraphics()).translate(-1, -var21);
					this.b_void_Graphics_boolean(var22, false);
					var22.translate(1, var21);

					for (int var23 = 0; var23 < 14; var23++) {
						a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(var22, 4, (var21 + var23 + 1) % 2, var23,
								0, 0, 0);
					}
				}

				this.a_Graphics.drawImage(f_Image, 1, var1 + 30 + 1 - (this.W_boolean ? 0 : 15), 0);
			}
		}

		if (this.bo_int != 0 && this.bo_int != 3 && this.bo_int != 1 && this.bo_int != 7) {
			this.a_void();
		}

		this.b_void();
		U_boolean = false;
		if (this.da_int == 2) {
			if (l_byte == 2) {
				U_boolean = true;
				V_boolean = true;
			}

			this.da_int = -1;
			this.m_boolean = true;
			this.db_int = -1;
			this.p_void();
		}
	}

	public final void a_void() {
		a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0, 223, 308, 0, 0, 0);
	}

	public final void b_void() {
		a_a_Array[18].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 3, 2, 308, 0, 0, 0);
	}

	private void ao_void() {
		a_Graphics.setColor(0);
		a_Graphics.fillRect(0, 0, 240, 320);
		int var2 = (this.bs_int + 1) * 230 / this.br_int;
		if ((var2) > 230) {
			var2 = 230;
		}

		a_Graphics.setColor(13540096);
		a_Graphics.fillRect(5, 310, var2, 6);
		a_Graphics.setColor(16554500);
		a_Graphics.drawRoundRect(4, 309, 231, 6, 2, 2);
		a_a_Array[41].b_int = 0;
		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[37], 120, 293, 1);
	}

	private void ap_void() {
		switch (this.i_byte) {
		case 1:
			this.av_void();
			return;
		case 2:
			this.ax_void();
			this.aq_void();
			return;
		case 3:
			this.as_void();
			return;
		case 4:
			this.au_void();
			return;
		case 5:
			this.ar_void();
		}
	}

	private void aq_void() {
		if (this.ar_int + 240 > 1440 && this.as_int + 320 > 48) {
			if (a_a_Array[10] == null) {
				a_a_Array[10] = a_a_String_int("/mmv.f", 0);
			}

			a var1 = a_a_Array[10];
			if (this.d_boolean_int_int(60, 3) || this.d_boolean_int_int(61, 3)) {
				var1.a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 1, 1440 - this.ar_int, 48 - this.as_int,
						0, 0, 0);
			}
		}

		if (this.aP_int > 55 && this.c_boolean) {
			a_g_Array[0].a_void_Graphics(this.a_Graphics);
		}
	}

	private void d_void_Graphics(Graphics graphics) {
		if (a_a_Array[10] == null) {
			a_a_Array[10] = a_a_String_int("/mmv.f", 0);
		}

		if (this.bG_int >= 60 && this.bG_int < 65 && this.bH_int >= 2 && this.bH_int < 7) {
			a_a_Array[10].a_void_Graphics_int_int_int_int_int_int(graphics,
					4 + (this.bH_int - 2) * 5 + this.bG_int - 60, this.bx_int, this.by_int, 0, 0, 0);
		}
	}

	private void ar_void() {
		if (this.ad_int != -1) {
			g var1;
			(var1 = a_g_Array[5]).a_int = this.ai_int - this.ar_int;
			var1.b_int = 504 - this.as_int;
			var1.a_void();
			var1.a_void_Graphics(this.a_Graphics);
			if (this.ad_int == 12) {
				int var2 = this.ai_int - this.ar_int + aN_int * this.ae_int % 48;
				int var3 = a_g_Array[5].b_int + 24;
				a_a_Array[7].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0,
						aN_int % a_a_Array[7].a_int_int(1), var2, var3, 0, 0, 0);
				this.k_void_int_int(var2, var3);
			}
		}
	}

	private void as_void() {
		if (this.i_byte == 3 && (long) aN_int >= this.l_long + 80L) {
			for (int var1 = 14; var1 <= 21; var1++) {
				b_int_2d_Array[var1][15] = 0;
				a_int_2d_Array[var1][15] = -1;
				a_byte_2d_Array[var1][15] = 44;
				b_byte_2d_Array[var1][15] = 0;
				c_byte_2d_Array[var1][15] = 24;
			}

			this.l_long = 0L;
		}

		if (this.ad_int != 15) {
			if (this.ar_int + 240 + 48 >= this.ah_int && this.as_int + 320 + 48 >= 504) {
				g var3;
				(var3 = a_g_Array[5]).a_int = this.ah_int - this.ar_int;
				var3.b_int = 504 - this.as_int;
				var3.a_void();
				var3.a_void_Graphics(this.a_Graphics);
			}

			if (this.ad_int == 12) {
				int var4 = this.ah_int - this.ar_int + aN_int * this.ae_int % 48;
				int var2 = a_g_Array[5].b_int + 24;
				a_a_Array[7].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0,
						aN_int % a_a_Array[7].a_int_int(0), var4, var2, 0, 0, 0);
				this.k_void_int_int(var4, var2);
			}
		}
	}

	private void at_void() {
		Graphics var1 = this.a_Graphics;
		g var2 = a_g_Array[5];
		if (this.ad_int == 7) {
			int var3 = var2.a_int + aN_int * this.ae_int % 48;
			int var4 = var2.b_int;
			if (this.H_int == 10) {
				var4 -= 144;
			}

			a_a_Array[7].a_void_Graphics_int_int_int_int_int_int_int(var1, 1, aN_int % a_a_Array[7].a_int_int(1), var3,
					var4, 0, 0, 0);
			this.k_void_int_int(var3, var4);
		} else {
			if (this.ad_int != 8 && this.ad_int != 0) {
				this.a_void_Graphics_int(var1, 3);
			}
		}
	}

	private void a_void_Graphics_int(Graphics graphics, int integer) {
		int var3 = integer * 14 + 2;
		int var4 = 240 - var3 >> 1;
		if (this.af_int > 0) {
			graphics.setColor(0);
			graphics.fillRect(var4, 5, var3, 12);
			graphics.setColor(3913615);

			for (int var5 = 0; var5 < this.af_int; var5++) {
				graphics.fillRect(var4 + 2 + var5 * 14, 7, 12, 8);
			}
		}
	}

	private void au_void() {
		Graphics var1;
		g var2;
		g var3;
		int var4;
		label58: {
			var1 = this.a_Graphics;
			var2 = a_g_Array[5];
			var3 = a_g_Array[4];
			int var10000;
			switch (this.ad_int) {
			case 1:
				var10000 = this.ae_int * 1;
				break;
			case 2:
			case 7:
				var10000 = 40;
				break;
			case 3:
				var10000 = 40;
				break;
			case 4:
				var10000 = 40 - (this.ae_int * 2 << 1);
				break;
			case 5:
				var4 = 15 + this.ae_int * 18;
				this.Y_boolean = false;
				break label58;
			case 6:
			case 8:
			default:
				var10000 = -1000;
				break;
			case 9:
				var10000 = 15 + this.ae_int * 18;
				break;
			case 10:
				var10000 = 15 + this.ae_int * 18;
				break;
			case 11:
				var10000 = 15 + this.ae_int * 18;
			}

			var4 = var10000;
		}

		label53: {
			var2.a_int = (10 + this.ag_int * (2 + (this.ag_int > 0 ? 1 : 0))) * 24 - this.ar_int;
			g var8;
			int var10001;
			if (this.ad_int == 5) {
				int var5 = var2.b_int;
				var2.b_int = 256 - this.as_int - this.I_int - 15;
				if (this.h_int() != 3) {
					break label53;
				}

				var8 = var2;
				var10001 = var5;
			} else {
				var8 = var2;
				var10001 = 256 - var4 - this.as_int;
			}

			var8.b_int = var10001;
		}

		var2.a_void_Graphics(var1);
		if (this.i_boolean) {
			var3.b_int = 96 - this.as_int;
			var3.a_int = (this.g_int() + 1) * 24 - this.ar_int;
			var3.a_void_Graphics(var1);
		}

		for (int var7 = 0; var7 < 3; var7++) {
			int var6;
			if ((var6 = (var7 * (2 + (var7 > 0 ? 1 : 0)) + 10) * 24 - this.ar_int) < 240 && var6 > -48
					&& this.as_int > -80) {
				a_a_Array[40].a_void_Graphics_int_int_int_int_int_int(var1, 1, var6, 216 - this.as_int, 0, 0, 0);
			}
		}
	}

	private void av_void() {
		int var1 = aN_int;
		g var2 = a_g_Array[2];
		if (this.as_int + this.bk_int < 1008 && this.as_int + this.bk_int > 592) {
			var2.a_int = 240 - this.ar_int;
			var2.b_int = 1008 - this.as_int;
			var2.a_void();
			var2.a_void_Graphics(this.a_Graphics);
			var2.a_int = 336 - this.ar_int;
			var2.b_int = 1008 - this.as_int;
			var2.a_void();
			var2.e_int = 1;
			var2.a_void_Graphics(this.a_Graphics);
		}

		if (this.bj_int > 10) {
			this.aw_void();
		}

		int var5 = this.aw_int * 24 - this.aa_int - this.as_int;
		int var6;
		int var7 = var6 = 168 - this.ar_int;
		int var8 = var6 + 240;

		while (var6 <= -24) {
			var6 += 24;
		}

		g var9 = a_g_Array[1];
		if ((this.aa_int >= 816 || var9.f_int == 2) && this.aa_int > 816) {
			for (int var10 = var5 + 20; var10 < 320; var10 += 24) {
				for (int var11 = var6; var11 < var8; var11 += 24) {
					var9.a_a.a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 1,
							((var1 >> 1) + var11 + var10) % 2, var11, var10, 0, 0, 0);
				}
			}
		}

		if (var2.f_int == 2) {
			var9.e_int = 0;
			var9.a_int = var7 + 120;
			var9.b_int = var5;
			var9.a_void();
			var9.a_void_Graphics(this.a_Graphics);
			var9.e_int = 1;
			var9.a_void_Graphics(this.a_Graphics);
			this.ay_void();
		}
	}

	private void aw_void() {
		for (byte var1 = 3; var1 < 13; var1 += 2) {
			int var2;
			int var3 = ((var2 = 10 * (2 * var1 / 5 + 1)) + aN_int / var2) * var1 % 240;
			int var4 = 320 / var2 * aN_int % 320;
			this.a_Graphics.drawImage(a_Image_2d_Array[27][var1 & 1], var3, var4, 0);
		}
	}

	private void ax_void() {
		if (this.r_boolean && this.a_c == null && this.bm_int == -1) {
			a_a_Array[15].a_void_Graphics_int_int_int_int_int_int_int(this.a_Graphics, 0, aN_int >> 1 & 3, this.bv_int,
					this.bw_int - 24, 0, 0, 0);
		}
	}

	private void ay_void() {
		Graphics var1 = this.a_Graphics;
		int var3 = (aN_int << 3) % 160;
		int var2 = (aN_int / 160 & 1) == 0 ? 160 - var3 : 0 + var3;
		var1.setColor(255, var2, 0);
		var1.drawRect(0, 0, 239, 319);
	}

	private void az_void() {
		if (!this.C_boolean) {
			int var1 = this.aP_int;
			int var2 = this.aQ_int;
			int var3 = aN_int;
			int var4 = this.aS_int & 7;
			int var5 = (this.aS_int & 16384) == 0 ? 0 : 3;
			g var6 = a_g_Array[var5];
			boolean var7 = this.b_boolean();
			int var8 = (this.aS_int & 2048) == 0 ? this.bQ_int : this.aS_int & 7;
			if (this.c_boolean) {
				this.bv_int = var1 * 24 + g_byte_Array[var8] * this.aR_int - this.ar_int;
				this.bw_int = var2 * 24 + g_byte_Array[var8 + 8] * this.aR_int - this.as_int;
				if ((this.b_long <= 0L || (var3 >> 1 & 1) == 0) && this.aT_int <= 0) {
					var6.a_int = this.bv_int;
					var6.b_int = this.bw_int;
					if (e_int_2d_Array != null && var7 && var4 != 1 && var4 != 3 && e_int_2d_Array[var1][var2 + 1] != 0
							&& j_boolean_int_int(var1, var2 + 1)) {
						int var9;
						int var10 = (var9 = (var3 >> 1) + var1) % 4;
						if ((var9 / 4 & 1) == 1) {
							var10 = 4 - var10;
						}

						var6.b_int += var10;
					}

					var6.a_void();
					var6.a_void_Graphics(this.a_Graphics);
					int var14 = var6.f_int;
					D_boolean = var6.f_int == 47 && var6.g_int == 0;
					switch (var14) {
					case 17:
					case 18:
						if (var6.g_int == 0) {
							this.a_Graphics.drawImage(a_Image_2d_Array[this.aA_int][this.aB_int], var6.a_int,
									var6.b_int - 12, 0);
						}
						break;
					case 40:
					case 47:
					case 48:
						if (var6.g_int > (var14 == 40 ? 13 : 6) || var14 == 47) {
							try {
								byte var16 = 0;
								if (this.aA_int == 30 || this.aA_int == 31 || this.aA_int == 32) {
									var16 = -2;
								}

								if (a_Image_2d_Array[this.aA_int] == null) {
									a_a_Array[a_int_int(this.aA_int)].a_void_Graphics_int_int_int_int_int_int(
											this.a_Graphics, this.aB_int, var6.a_int + var16, var6.b_int - 24, 0, 0, 0);
								} else {
									this.a_Graphics.drawImage(a_Image_2d_Array[this.aA_int][this.aB_int],
											var6.a_int + var16, var6.b_int - 24, 0);
								}
							} catch (Exception exception) {
								exception.printStackTrace();
							}

							if (this.aC_int > 0) {
								a_void_Graphics_int_int_int_Image_Array_int(this.a_Graphics, var6.a_int + 24,
										var6.b_int - 10, this.aC_int, a_a_Array[0].a_Image_2d_Array[0], 0);
							}
						}
					}
				}

				if (var7 && a_byte_2d_Array[var1][var2] == 0) {
					int var15 = b_int_2d_Array[var1][var2] & 7;
					byte var17 = b_byte_2d_Array[var1][var2];

					try {
						a_a_Array[a_int_int(1)].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics,
								0 + (b_int_2d_Array[var1][var2] & 56),
								var1 * 24 - this.ar_int + g_byte_Array[var15] * var17,
								var2 * 24 - this.as_int + g_byte_Array[var15 + 8] * var17, 0, 0, 0);
						return;
					} catch (Exception exception) {
						exception.printStackTrace();
					}
				}
			}
		}
	}

	private void aA_void() {
		int var1 = this.bG_int;
		int var2 = this.bH_int;
		int var3 = this.bH_int + 1;
		this.bz_int = 0;
		this.bA_int = 0;
		this.y_boolean = false;
		int var4;
		int var6 = (var4 = b_int_2d_Array[var1][var2]) & 7;
		byte var5 = b_byte_2d_Array[var1][var2];
		if (var4 == -1) {
			var4 = -1;
		}

		this.bN_int = this.bN_int + var5 * g_byte_Array[var6];
		this.bO_int = this.bO_int + var5 * g_byte_Array[var6 + 8];
		boolean var7 = e_int_2d_Array != null && e_int_2d_Array[var1][var2] != 0;
		switch (this.bI_int) {
		case 0:
			int var8 = (var4 & 56) >> 3;
			int var9 = (var4 & 28672) >> 12;
			boolean var10 = (var4 & 65536) == 0;
			if (!var7 && var6 == 0 && j_boolean_int_int(var1, var3)) {
				var4 = var4 & -28673 | var9 << 12;
				if (var10) {
					var4 &= -65537;
				} else {
					var4 |= 65536;
					var9 = -var9;
				}

				this.bN_int = var9;
			} else {
				var4 &= -28673;
			}

			b_int_2d_Array[var1][var2] = var4;
			this.aG_int = 1;
			this.aH_int = 0 + var8;
			break;
		case 1:
			this.aG_int = 2;
			this.aH_int = 0 + this.bR_int;
			break;
		case 2:
			this.aD_void();
			break;
		case 4:
			this.aG_int = 24;
			this.aH_int = 0 + this.bR_int;
			break;
		case 5:
			this.aG_int = 25;
			this.aH_int = 0 + this.bR_int;
			break;
		case 6:
			this.aG_int = 5;
			this.aH_int = 0;
			break;
		case 7:
			this.aG_int = 5;
			this.aH_int = 1;
			break;
		case 8:
			this.aG_int = 16;
			this.aH_int = 0 + (aN_int >> 1 & 1);
			break;
		case 9:
			b_a = a_a_Array[(var4 & 264241152) >> 22];
			this.bL_int = 0;
			break;
		case 47:
			b_a = a_a_Array[30];
			this.bK_int = 0;
			this.bL_int = a_int_a_int_int(b_a, 0, aN_int % a_int_a_int(b_a, 0));
		}

		if (var7 || e_int_2d_Array != null && e_int_2d_Array[var1][var3] != 0 && j_boolean_int_int(var1, var3)) {
			int var22;
			int var23 = (var22 = (aN_int >> 1) + var1) % 4;
			if ((var22 / 4 & 1) == 1) {
				var23 = 4 - var23;
			}

			this.bO_int += var23;
		}

		if (((var4 & 512) != 0 || a_byte_2d_Array[var1 - g_byte_Array[var6]][var3] < 0 && j_boolean_int_int(var1, var3)
				&& (b_int_2d_Array[var1][var3] & 7) == 0 && var1 != this.bg_int && var2 != this.bh_int)
				&& (this.aS_int & 8) == 0) {
			this.bO_int += var5 * var5 / 24;
			if (this.bI_int != 9) {
				this.bN_int = this.bN_int + -1 + aN_int % 3;
			}
		}

		if ((var4 & 512) != 0) {
			this.bN_int = -this.bN_int;
		}

		if (this.bI_int == 0) {
			this.bD_int = ((var4 & 448) >> 6) - 1;
			if (this.bD_int >= 0 && this.bD_int < 5) {
				this.y_boolean = true;
				i var10000;
				byte var10001;
				switch (var4 & 7) {
				case 2:
					var10000 = this;
					var10001 = -24;
					break;
				case 4:
					var10000 = this;
					var10001 = 24;
					break;
				default:
					var10000 = this;
					var10001 = 0;
				}

				var10000.bz_int = var10001;
				this.bA_int = 13;
				this.bB_int = this.bG_int;
				this.bC_int = this.bH_int - 1;
			}
		}

		this.aa_void();
	}

	private void aB_void() {
		int var1 = this.bG_int;
		int var2 = this.bH_int;
		int var3 = b_int_2d_Array[var1][var2];
		byte var4 = b_byte_2d_Array[var1][var2];
		int var5 = var3 & 7;
		this.bN_int = var4 * g_byte_Array[var5];
		this.bO_int = var4 * g_byte_Array[var5 + 8];
		b_a = a_a_Array[38];
		int var6;
		i var10000;
		int var10001;
		if (((var6 = (var3 & 28672) >> 12) != 2 && var6 != 4 && var5 != 2 && var5 != 4
				|| a_byte_2d_Array[var1 - 1][var2] < 0 || a_byte_2d_Array[var1 + 1][var2] < 0)
				&& (var6 != 1 && var6 != 3 && var5 != 1 && var5 != 3 || a_byte_2d_Array[var1][var2 - 1] < 0
						|| a_byte_2d_Array[var1][var2 + 1] < 0)) {
			if (var5 != 1 && var5 != 3) {
				var10000 = this;
				var10001 = 0;
			} else {
				var10000 = this;
				var10001 = var5 - 1;
			}

			var10000.bK_int = var10001;
			var10000 = this;
			var10001 = (aN_int >> 1) % b_a.a_int_int(this.bK_int);
		} else {
			this.bK_int = 1;
			var10000 = this;
			var10001 = 0;
		}

		var10000.bL_int = var10001;
		this.aa_void();
	}

	private void c_void_byte(byte byte1) {
		i var7;
		int var9;
		a var10002;
		int var10003;
		label33: {
			int var2 = b_int_2d_Array[this.bG_int][this.bH_int];
			byte var3 = b_byte_2d_Array[this.bG_int][this.bH_int];
			int var4 = var2 & 7;
			this.bN_int = var3 * g_byte_Array[var4];
			this.bO_int = var3 * g_byte_Array[var4 + 8];
			int var5 = byte1 == 19 ? 4 : 21;
			b_a = a_a_Array[var5];
			if (this.ap_int == 1) {
				byte var10001;
				if ((var2 & 248) >> 3 > 0) {
					var7 = this;
					var10001 = 2;
				} else {
					var7 = this;
					var10001 = 0;
				}

				var7.bK_int = var10001;
				var7 = this;
				var9 = aN_int;
				var10002 = b_a;
			} else {
				label30: {
					if ((var2 & 248) >> 3 > 0) {
						var7 = this;
						var9 = 4;
					} else {
						this.bK_int = var4 - 1;
						if (this.bK_int >= 0) {
							break label30;
						}

						var7 = this;
						var9 = ((var2 & 28672) >> 12) - 1;
					}

					var7.bK_int = var9;
				}

				var7 = this;
				var9 = aN_int >> 1;
				var10002 = b_a;
				if (this.bK_int < 0) {
					var10003 = 0;
					break label33;
				}
			}

			var10003 = this.bK_int;
		}

		var7.bL_int = var9 % var10002.a_int_int(var10003);
		this.aa_void();
	}

	private void aC_void() {
		label44: {
			int var1 = this.bG_int;
			int var2 = this.bH_int;
			this.aE_int = 26;
			this.aF_int = 0;
			i var10000;
			int var10001;
			if (j_boolean_int_int(var1, var2) && b_byte_2d_Array[var1][var2] <= 12) {
				var10000 = this;
				var10001 = -(b_byte_2d_Array[var1][var2] - 12);
			} else if (this.d_boolean_int_int(var1, var2)) {
				if ((this.aS_int & 4096) == 0) {
					if (this.aR_int > 12) {
						break label44;
					}

					var10000 = this;
					var10001 = -(this.aR_int - 12);
				} else {
					var10000 = this;
					var10001 = 12;
				}
			} else {
				if (this.d_boolean_int_int(var1 - 1, var2) ? this.bQ_int != 4 || this.aR_int <= 12
						: !this.d_boolean_int_int(var1 + 1, var2) || this.bQ_int != 2 || this.aR_int <= 12) {
					break label44;
				}

				var10000 = this;
				var10001 = this.aR_int - 12;
			}

			var10000.bO_int = var10001;
		}

		this.bO_int += 24;
		this.bP_int = 36;
	}

	private void aD_void() {
		int var1 = a_int_2d_Array[this.bG_int][this.bH_int] & 0xFF;
		int var2 = a_int_2d_Array[this.bG_int][this.bH_int] >> 8;
		if (var1 != 14 && var1 != 33 || var2 > 11) {
			this.aG_int = 3;
			this.aH_int = 0 + this.bR_int;
			i var10000;
			a[] var10001;
			byte var10002;
			if (var1 == 14) {
				var10000 = this;
				var10001 = a_a_Array;
				var10002 = 8;
			} else {
				if (var1 != 33) {
					return;
				}

				var10000 = this;
				var10001 = a_a_Array;
				var10002 = 22;
			}

			var10000.bO_int = -(var10001[var10002].a_int_int(0) - var2);
		}
	}

	private void aE_void() {
		int var1 = this.bG_int;
		int var2 = this.bH_int;
		this.aG_int = 6;
		int var3;
		if ((var3 = (b_int_2d_Array[var1][var2] & 3840) >> 8) >= 4) {
			this.aG_int = -1;
		} else {
			i var10000;
			int var10001;
			if (var3 == 0) {
				var10000 = this;
				var10001 = 0 + (aN_int >> 1) % 3;
			} else {
				var10000 = this;
				var10001 = 3 + var3 - 1;
			}

			var10000.aH_int = var10001;
			int var4 = b_int_2d_Array[var1][var2] & 7;
			this.bN_int = b_byte_2d_Array[var1][var2] * g_byte_Array[var4] + 2;
			this.bO_int = b_byte_2d_Array[var1][var2] * g_byte_Array[var4 + 8] + 2;
			if ((b_int_2d_Array[var1][var2] & 16) == 0) {
				switch (var4) {
				case 1:
					this.bN_int += 4;
					return;
				case 2:
					var10000 = this;
					var10001 = this.bO_int + 4;
					break;
				case 3:
					this.bN_int -= 4;
					return;
				case 4:
					var10000 = this;
					var10001 = this.bO_int - 4;
					break;
				default:
					return;
				}

				var10000.bO_int = var10001;
			} else {
				switch (var4) {
				case 1:
					this.bN_int -= 4;
					return;
				case 2:
					var10000 = this;
					var10001 = this.bO_int - 4;
					break;
				case 3:
					this.bN_int += 4;
					return;
				case 4:
					var10000 = this;
					var10001 = this.bO_int + 4;
					break;
				default:
					return;
				}

				var10000.bO_int = var10001;
			}
		}
	}

	private void aF_void() {
		this.a_Graphics.setColor(13883367);
		byte var3 = b_byte_2d_Array[this.bG_int][this.bH_int];
		int var1;
		int var2;
		i var10000;
		byte var10001;
		if ((b_int_2d_Array[this.bG_int][this.bH_int] & 1) != 0) {
			var1 = this.bx_int;
			var2 = this.bx_int + 24 - var3;
			var10000 = this;
			var10001 = 0;
		} else {
			var1 = this.bx_int + 24;
			var2 = this.bx_int + var3;
			var10000 = this;
			var10001 = 1;
		}

		var10000.bL_int = var10001;
		this.a_Graphics.drawLine(var1, this.by_int + 12, var2, this.by_int + 12);
		if (var3 > 0) {
			a_g_Array[0].a_a.a_void_Graphics_int_int_int_int(this.a_Graphics, this.bL_int, var2, this.by_int + 12 - 2,
					0);
		}
	}

	private void aG_void() {
		int var1 = a_int_2d_Array[this.bG_int][this.bH_int] >> 8;
		this.aE_int = this.bJ_int == 9 ? 22 : 23;
		i var10000;
		byte var10001;
		if ((var1 & 512) != 0) {
			var10000 = this;
			if (this.bJ_int == 9) {
			}

			var10001 = (byte) (1 + (aN_int >> 2) % 6);
		} else if ((var1 & 256) != 0) {
			var10000 = this;
			var10001 = 1;
		} else {
			var10000 = this;
			var10001 = 0;
		}

		var10000.aF_int = var10001;
	}

	private void aH_void() {
		int var1 = this.bG_int;
		int var2 = this.bH_int;
		int var4;
		if ((var4 = ((a_int_2d_Array[var1][var2] >> 8 & 240) >> 4) - 1) < 0) {
			var4 = 0;
		}

		if ((a_int_2d_Array[var1][var2 - 1] & 0xFF) != 9 && (a_int_2d_Array[var1][var2 - 1] & 0xFF) != 8) {
			a_a_Array[56].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var4, this.bx_int, this.by_int, 0, 0,
					0);
		}

		this.aE_int = 4;
		this.aF_int = (byte) (var4 + 3);
	}

	private void aI_void() {
		int var1 = aN_int;
		int var2 = b_int_2d_Array[this.bG_int][this.bH_int];
		byte var3;
		if ((var3 = b_byte_2d_Array[this.bG_int][this.bH_int]) > 24) {
			var3 = 24;
		}

		int var4 = var2 & 7;
		this.bN_int = var3 * g_byte_Array[var4];
		this.bO_int = var3 * g_byte_Array[var4 + 8];
		if ((var2 & 8) == 0) {
			this.aG_int = 10;
			this.aH_int = (var1 >> 1) % 3;
			if (var4 != 3) {
				int var5 = (var1 >> 1) % 5;
				this.a_Graphics.drawImage(a_Image_2d_Array[10][3 + var5], this.bx_int + this.bN_int - var5 * 4,
						this.by_int + this.bO_int + 24, 36);
				return;
			}
		} else {
			this.aG_int = 10;
			this.aH_int = 2 - (var1 >> 1) % 3;
			if (var4 != 3) {
				int var6 = (var1 >> 1) % 5;
				this.a_Graphics.drawImage(a_Image_2d_Array[10][8 + var6],
						this.bx_int + 24 - 12 + this.bN_int + var6 * 3, this.by_int + this.bO_int + 24, 36);
				if ((var1 >> 1 & 1) == 0 && a_byte_2d_Array[this.bG_int - 1][this.bH_int] >= 0) {
					this.bN_int--;
					this.bO_int++;
				}
			}
		}
	}

	private void aJ_void() {
		if (a_byte_2d_Array[this.bG_int][this.bH_int + 1] != 16) {
			int var1 = b_int_2d_Array[this.bG_int][this.bH_int];
			a var2;
			b_a = var2 = a_a_Array[1];
			byte var3 = b_byte_2d_Array[this.bG_int][this.bH_int];
			int var4 = 36 - var3;
			int var5 = 0;
			this.bK_int = (var1 & 7) == 4 ? 1 : 0;
			if (var3 != 0) {
				for (int var6 = 0; var4 > 0; var5 = var6++) {
					var4 -= var2.a_int_int_int(this.bK_int, var6);
				}
			}

			this.bL_int = var5;
			int var7 = (var2.b_short_Array[this.bK_int] + var5) * 5;
			this.bN_int = var2.f_byte_Array[var7 + 2];
		}
	}

	private void aK_void() {
		int var1 = b_int_2d_Array[this.bG_int][this.bH_int];
		b_a = a_a_Array[28];
		this.bK_int = var1 & 15;
		int var2 = (b_int_2d_Array[this.bG_int][this.bH_int] & 2088960) >> 13;
		if (this.bK_int == 10) {
			int var3 = var2;
			int var4 = 0;
			int var6 = b_a.a_int_int(this.bK_int);
			int var10000 = 0;

			while (true) {
				int var5 = var10000;
				if (var3 <= 0) {
					this.bL_int = var4;
					break;
				}

				var3 -= b_a.a_int_int_int(this.bK_int, var5);
				var4 = var5;
				var10000 = (var5 + 1) % var6;
			}
		} else {
			int var7 = a_int_a_int_int(b_a, this.bK_int, var2);
			this.bL_int = var7;
			int var8 = (b_a.b_short_Array[this.bK_int] + var7) * 5;
			this.bN_int = b_a.f_byte_Array[var8 + 2];
			this.bO_int = b_a.f_byte_Array[var8 + 3];
		}

		this.aa_void();
	}

	private static int a_int_a_int_int(a a, int integer2, int integer3) {
		int var3 = 0;

		for (int var4 = 0; integer3 > 0; var3 = var4++) {
			integer3 -= a.a_int_int_int(integer2, var4);
		}

		return var3;
	}

	private static int b_int_a_int_int(a a, int integer2, int integer3) {
		int var3 = 0;

		for (int var4 = 0; var4 < integer3; var4++) {
			var3 += a.a_int_int_int(integer2, var4);
		}

		return var3;
	}

	private void aL_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		c_byte_2d_Array[var1][var2] = 24;
		int var3 = (b_int_2d_Array[var1][var2] & 7168) >> 10;
		int var4 = b_int_2d_Array[var1][var2] & 15;
		int var5 = 0;
		boolean var6 = (a_int_2d_Array[var1][var2] & 0xFF) == 35;
		if (var4 == 10) {
			var5 = 100;
		} else {
			int var7 = a_a_Array[28].a_int_int(var4);

			for (int var8 = 0; var8 < var7; var8++) {
				var5 += a_a_Array[28].a_int_int_int(var4, var8);
			}
		}

		int var16 = (b_int_2d_Array[var1][var2] & 2088960) >> 13;
		b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -2088961 | ++var16 << 13;
		byte[] var10000;
		int var10001;
		byte var10002;
		if (var4 >= 4 && var4 <= 9) {
			var10000 = b_byte_2d_Array[var1];
			var10001 = var2;
			var10002 = 12;
		} else {
			var10000 = b_byte_2d_Array[var1];
			var10001 = var2;
			var10002 = 0;
		}

		var10000[var10001] = var10002;
		if (var16 > var5 >> 1) {
			if (!var6) {
				if (this.d_boolean_int_int(var1, var2) && var4 != 10) {
					byte var21;
					switch (var4) {
					case 4:
					case 5:
						var21 = 1;
						break;
					case 6:
						var21 = 2;
						break;
					case 7:
					case 8:
						var21 = 3;
						break;
					case 9:
						var21 = 4;
						break;
					default:
						var21 = h_byte_Array[this.aS_int & 7];
					}

					byte var18 = var21;
					this.a_void_int_int_int(1, 48, var18);
				}

				if (this.i_boolean_int_int(var1, var2)) {
					a_byte_2d_Array[var1][var2] = -1;
					this.p_void_int_int(var1, var2);
					return;
				}
			}

			if (var16 >= var5) {
				q_void_int_int(var1, var2);
				int var10 = this.a_int_int_int_int_int_boolean(var1, var2, this.aP_int, this.aQ_int, true);
				boolean var11 = false;
				switch (var4) {
				case 0:
				case 3:
				case 4:
				case 7:
				case 9:
					var11 = true;
				case 1:
				case 2:
				case 5:
				case 6:
				case 8:
				default:
					boolean var12 = var10 == 4;
					int var9;
					int var13;
					int var14;
					if (var11 != var12) {
						var9 = var12 ? 3 : 2;
						var13 = var1;
						var14 = var2;
					} else {
						label156: {
							var13 = var1 - g_byte_Array[var10];
							var14 = var2 - g_byte_Array[8 + var10];
							byte var22;
							if (var12) {
								if (this.d_boolean_int_int(var13, var14) && var4 != 0) {
									var9 = 0;
									var13 = var1;
									var14 = var2;
									break label156;
								}

								switch (var10) {
								case 1:
									var22 = 4;
									break;
								case 2:
								default:
									var22 = 0;
									break;
								case 3:
									var22 = 7;
									break;
								case 4:
									var22 = 9;
								}
							} else {
								if (this.d_boolean_int_int(var13, var14) && var4 != 1) {
									var9 = 1;
									var13 = var1;
									var14 = var2;
									break label156;
								}

								switch (var10) {
								case 1:
									var22 = 5;
									break;
								case 2:
									var22 = 6;
									break;
								case 3:
									var22 = 8;
									break;
								default:
									var22 = 1;
								}
							}

							var9 = var22;
						}
					}

					if (a_byte_2d_Array[var13][var14] >= 0 || var6) {
						if (var13 != var1 || var14 != var2) {
							var9 = 0;
						}

						var13 = var1;
						var14 = var2;
					}

					a_byte_2d_Array[var1][var2] = -1;
					b_byte_2d_Array[var13][var14] = 0;
					b_int_2d_Array[var13][var14] = var3 << 10 | var9;
					b_int_2d_Array[var13][var14] = b_int_2d_Array[var13][var14] & -2088961;
					a_byte_2d_Array[var13][var14] = 45;
				}
			}
		}

		if (var6) {
			if (!this.d_boolean_int_int(var1, var2) || var4 == 10) {
				return;
			}
		} else {
			int var19 = var1;
			int var20 = var2;
			switch (var4) {
			case 0:
			case 1:
			case 2:
			case 3:
			default:
				break;
			case 4:
			case 5:
				var20 = var2 + 1;
				break;
			case 6:
				var19 = var1 - 1;
				break;
			case 7:
			case 8:
				var20 = var2 - 1;
				break;
			case 9:
				var19 = var1 + 1;
				break;
			case 10:
				var19 = -1;
				var20 = -1;
			}

			if (!this.d_boolean_int_int(var19, var20)) {
				return;
			}
		}

		this.a_void_int_int_int(1, 48, h_byte_Array[this.aS_int & 7]);
	}

	private void aM_void() {
		byte var1 = -1;
		byte var2 = 3;
		int var3;
		if (((var3 = b_int_2d_Array[this.bG_int][this.bH_int]) & 7) == 3) {
			var1 = 1;
			var2 = 0;
		}

		int var4;
		int var10000;
		if ((var3 & 8) == 0) {
			var4 = this.aJ_int;
			var10000 = this.aI_int;
		} else {
			var4 = this.aL_int;
			var10000 = this.aK_int;
		}

		int var5 = var10000;

		for (int var6 = 0; var6 < var4; var6++) {
			a_a_Array[11].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var2 + var6 * var1, this.bx_int + 3,
					this.by_int + var1 * (var5 - var6 * 24), 0, 0, 0);
		}

		a var7;
		Graphics var10001;
		int var10002;
		int var10003;
		int var10004;
		if (var1 == 1) {
			var7 = a_a_Array[42];
			var10001 = this.a_Graphics;
			var10002 = a_byte_2d_Array[this.bG_int][this.bH_int - 1] - 80;
			var10003 = this.bx_int;
			var10004 = this.by_int - 24;
		} else {
			var7 = a_a_Array[42];
			var10001 = this.a_Graphics;
			var10002 = a_byte_2d_Array[this.bG_int][this.bH_int + 1] - 80;
			var10003 = this.bx_int;
			var10004 = this.by_int + 24;
		}

		var7.a_void_Graphics_int_int_int_int_int_int(var10001, var10002, var10003, var10004, 0, 0, 0);
	}

	private void aN_void() {
		g var1 = a_g_Array[0];
		this.a_Graphics.setColor(0);
		this.a_Graphics.fillRect(0, 0, 240, 320);
		var1.b_int = 136;
		int var3 = 0;
		if (aN_int > 30) {
			var1.a_int = 139;
			var1.a_void_int(1);
			int var4;
			if ((var4 = (aN_int - 30) * 4) > 29) {
				var4 = 29;
				a var10000;
				Graphics var10001;
				byte var10002;
				short var10003;
				int var10004;
				if (aN_int < 42) {
					int var5 = 42 - aN_int;
					var3 = 0 + var5 * var5 % ((var5 >> 1) + 1);
					var10000 = var1.a_a;
					var10001 = this.a_Graphics;
					var10002 = 10;
					var10003 = 138;
					var10004 = 136 + var3;
				} else {
					var10000 = var1.a_a;
					var10001 = this.a_Graphics;
					var10002 = 4;
					var10003 = 138;
					var10004 = 136;
				}

				var10000.a_void_Graphics_int_int_int_int_int_int(var10001, var10002, var10003, var10004, 0, 0, 0);
				var1.g_int = 0;
			} else {
				var1.a_a.a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 10, 138, 136, 0, 0, 0);
			}

			var1.b_int = 136 + var4;
		} else {
			var1.a_int = aN_int * 4 - 1 + 18;
		}

		var1.b_int += var3;
		var1.a_void_Graphics(this.a_Graphics);
		var1.a_a.a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 5, 138, 160 + var3, 0, 0, 0);
	}

	private static void a_void_Graphics_int_int_int_Image_Array_int(Graphics graphics, int integer2, int integer3,
			int integer4, Image[] arr, int integer6) {
		if (integer4 == 0) {
			Image var8 = a_a_Array[0].a_Image_2d_Array[0][0];
			graphics.drawImage(var8, integer2, integer3, 24);
		} else {
			while (integer4 > 0) {
				int var6 = integer4 % 10;
				integer4 /= 10;
				Image var7 = arr[var6 + integer6];
				integer2 -= var7.getWidth();
				graphics.drawImage(var7, integer2, integer3, 0);
			}
		}
	}

	private boolean b_boolean() {
		return this.aP_int > 0 && this.aP_int < this.av_int - 1 && this.aQ_int > 0 && this.aQ_int < this.aw_int - 1;
	}

	private void n_void_int(int integer) {
		int var2 = a_g_Array[0].f_int;
		if (a_g_Array[0].f_int != 19 && (this.aS_int & 16384) == 0 && (this.aS_int & 2048) == 0) {
			if (this.b_boolean()) {
				int var3;
				if ((var3 = e_int_2d_Array == null ? 0
						: a_int_int_byte_byte_byte(e_int_2d_Array[this.aP_int][this.aQ_int], (byte) 0, (byte) 3,
								(byte) 4)) != 8
						&& var3 != 7) {
					label49: if (a_byte_2d_Array[this.aP_int][this.aQ_int + 1] < 0
							|| a_byte_2d_Array[this.aP_int][this.aQ_int + 1] == 14) {
						byte var10000;
						switch (integer) {
						case 0:
							var10000 = 0;
							break;
						case 1:
							var10000 = 35;
							break;
						case 2:
							var10000 = 2;
							break;
						case 3:
							var10000 = 34;
							break;
						case 4:
						case 5:
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 15:
						case 17:
						case 18:
						case 19:
						case 24:
						case 25:
						case 26:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 43:
						default:
							break label49;
						case 14:
							var10000 = 28;
							break;
						case 16:
							var10000 = 29;
							break;
						case 20:
							var10000 = 30;
							break;
						case 21:
							var10000 = 32;
							break;
						case 22:
							var10000 = 31;
							break;
						case 23:
							var10000 = 33;
							break;
						case 42:
							var10000 = 46;
							break;
						case 44:
							var10000 = 45;
						}

						integer = var10000;
					}
				} else {
					switch (integer) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 11:
					case 24:
					case 25:
					case 26:
					case 27:
						integer = 36 + (this.aS_int & 7) - 1;
					case 10:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					}
				}
			}

			if (integer == 1000) {
				a_g_Array[3].a_void_int(0);
				this.aS_int |= 16384;
			} else {
				a_g_Array[0].a_void_int(integer);
			}

			if (var2 != integer) {
				this.am_int = 70;
			}
		}
	}

	private void aO_void() {
		if (a_boolean_int(32944)) {
			W_int = 0;
			this.aw_boolean = true;
			this.o_void_int(this.c_int);
		} else if (a_boolean_int(64)) {
			W_int = 0;
			l_byte = 27;
			this.aw_boolean = true;
			this.e_boolean = true;
			W_int = 0;
		} else {
			label24: {
				i var10000;
				byte var10001;
				if (a_boolean_int(4097)) {
					var10000 = this;
					var10001 = -1;
				} else {
					if (!a_boolean_int(262146)) {
						break label24;
					}

					var10000 = this;
					var10001 = 1;
				}

				var10000.p_void_int(var10001);
			}

			W_int = 0;
			i var2;
			String[] var3;
			byte var10002;
			if (f_int_int(this.c_int) == 0) {
				this.d_int = -1;
				var2 = this;
				var3 = a_String_Array;
				var10002 = 81;
			} else {
				this.d_int = f.a_int_Array[this.c_int];
				this.d_StringBuffer.delete(0, this.d_StringBuffer.length());
				this.d_StringBuffer.append(this.d_int);
				var2 = this;
				var3 = a_String_Array;
				var10002 = 90;
			}

			var2.a_String = var3[var10002];
			this.aw_boolean = true;
		}
	}

	private static int f_int_int(int integer) {
		byte var1 = i_byte_Array[8];
		if ((var1) >= 4 + integer + 1) {
			return 0;
		} else {
			return a_int_byte_Array_int(i_byte_Array, 4) < f.a_int_Array[integer] ? -1 : 1;
		}
	}

	private void o_void_int(int integer) {
		this.em_int = -1;
		switch (f_int_int(integer)) {
		case -1:
			this.a_String = a_String_Array[89];
			return;
		case 0:
			this.a_String = a_String_Array[81];
			return;
		case 1:
			this.aZ_int = a_int_byte_Array_int(i_byte_Array, 4) - f.a_int_Array[this.c_int];
			this.e_String = null;
			System.gc();
			this.e_String = a_String_Array[110] + " " + this.aZ_int + " " + a_String_Array[109];
			i_byte_Array[4] = (byte) (this.aZ_int & 0xFF);
			i_byte_Array[5] = (byte) (this.aZ_int >> 8 & 0xFF);
			i_byte_Array[8] = (byte) (4 + integer + 1);
			this.G_void();
			this.d_int = -1;
			this.a_String = a_String_Array[81];
			this.Z_boolean = true;
			this.a_void_String_int_int_int_int_int(a_String_Array[91], -1, -1, 5000, 4273165, 0);
		}
	}

	private void p_void_int(int integer) {
		this.c_int += integer;
		if (this.c_int < 0) {
			this.c_int = 3;
		}

		if (this.c_int == 4) {
			this.c_int = 0;
		}
	}

	private void aP_void() {
		if (a_boolean_int(64)) {
			l_byte = 4;
			this.a_void_int(4);
		}

		W_int = 0;
	}

	private void aQ_void() {
		if (W_int == 0) {
			this.j_byte = 0;
		} else if (h_boolean()) {
			this.c_void_boolean(true);
			W_int = 0;
		} else {
			label91: {
				byte var10000;
				label90: {
					switch (l_byte) {
					case 1:
						if (this.f_boolean || this.aj_boolean) {
							W_int = 0;
						}

						m_byte = l_byte;
						this.aT_void();
						this.ba_void();
						break label91;
					case 2:
					case 7:
					case 32:
						this.bb_void();
					case 3:
					case 5:
					case 6:
					case 8:
					case 9:
					case 10:
					case 11:
					case 13:
					case 14:
					case 16:
					case 18:
					case 19:
					case 21:
					case 22:
					case 23:
					case 28:
					case 29:
					default:
						break label91;
					case 4:
						this.bb_void();
						break label91;
					case 12:
						this.aZ_void();
						break label91;
					case 15:
						this.cD_void();
						break label91;
					case 17:
					case 20:
						if (!a_boolean_int(32944)) {
							break label91;
						}

						if (this.aM_int == 5) {
							this.bk_void();
							this.A_void();
						}

						this.s_boolean = true;
						break;
					case 24:
						this.aW_void();
						break label91;
					case 25:
						this.aO_void();
						break label91;
					case 26:
						this.aP_void();
						break label91;
					case 27:
						m_byte = l_byte;
						this.aT_void();
						this.aU_void();
						break label91;
					case 30:
						if (!a_boolean_int(32784)) {
							break label91;
						}

						l_byte = 4;
						if (this.bo_int == -1) {
							this.aM_int = 0;
							this.a_void_int(0);
						} else {
							this.aM_int = 2;
						}

						var10000 = 0;
						break label90;
					case 31:
						if (a_boolean_int(64)) {
							this.bs_int = 0;
							this.br_int = 8;
							l_byte = 9;
							this.a_void_int(-1);
						} else if (a_boolean_int(32944)) {
							this.aR_void();
						}
						break;
					case 33:
						this.aS_void();
						break label91;
					case 34:
						this.aY_void();
						break label91;
					}

					var10000 = 0;
				}

				W_int = var10000;
			}

			if (!this.b_boolean) {
				if ((this.aS_int & 7) != 0) {
					this.b_int = 10;
				}
			}
		}
	}

	private void aR_void() {
		this.B_boolean = true;
		l_byte = 16;
		this.bs_int = 0;
		this.br_int = 6;
		this.ao_int = 0;
		this.bb_int = 0;
		this.aZ_int = 0;
		this.n_boolean = false;
		this.V_int = 0;
		dY_int = 0;
	}

	private void aS_void() {
		if (a_boolean_int(64)) {
			if (this.bo_int == 0) {
				l_byte = 4;
				this.a_void_int(0);
				this.a_h.b_void_int(19);
			}

			if (this.bo_int == 1) {
				l_byte = 2;
				U_boolean = true;
				this.m_boolean = true;
				this.a_void_int(1);
			}
		}
	}

	private void aT_void() {
		if (s_byte < b_int_Array.length && a_boolean_int(b_int_Array[s_byte])) {
			W_int = 0;
			s_byte++;
			if (s_byte == b_int_Array.length) {
				W_int = 0;
				l_byte = 24;
				this.cz_int = i_byte_Array[8];
				this.cA_int = i_byte_Array[9];
				this.R_boolean = false;
				this.S_boolean = false;
				return;
			}
		} else {
			byte var10000;
			if (a_boolean_int(b_int_Array[0])) {
				W_int = 0;
				var10000 = 1;
			} else {
				var10000 = 0;
			}

			s_byte = var10000;
		}
	}

	private void aU_void() {
		if (this.s_int == -1 && this.q_int == 0) {
			label30: {
				i var10000;
				byte var10001;
				if (a_boolean_int(32944)) {
					var10000 = this;
					var10001 = 4;
				} else {
					if (a_boolean_int(64)) {
						this.A_void();
						l_byte = 9;
						this.br_int = 8;
						this.a_void_int(-1);
						this.bs_int = 0;
						break label30;
					}

					if (a_boolean_int(4097)) {
						var10000 = this;
						var10001 = 0;
					} else if (a_boolean_int(262146)) {
						var10000 = this;
						var10001 = 2;
					} else if (a_boolean_int(16388)) {
						var10000 = this;
						var10001 = 3;
					} else {
						if (!a_boolean_int(65544)) {
							break label30;
						}

						var10000 = this;
						var10001 = 1;
					}
				}

				var10000.j_int = var10001;
			}

			W_int = 0;
		} else {
			W_int = 0;
		}
	}

	private void aV_void() {
		if (this.ap_int == 0 && this.aq_int == 13) {
			this.a_c = null;
			this.aP_int = 60;
			this.aQ_int = 3;
		} else {
			this.au_boolean = a_boolean_int(524288);
			this.A_boolean = !this.au_boolean;
			this.bd_int = 0;
			this.bc_int = 0;
			this.v_boolean = true;
			this.aP_int = this.av_int + 5 + 1;
		}
	}

	private void aW_void() {
		boolean var1 = false;
		if (a_boolean_int(512)) {
			this.aa_boolean = !this.aa_boolean;
		} else if (a_boolean_int(65536)) {
			this.aZ_int += 50;
		} else if (a_boolean_int(131072)) {
			this.bb_int += 5;
		} else if (a_boolean_int(262144)) {
			if (m_byte != 1) {
				label79: {
					this.cA_int <<= 1;
					i var10000;
					byte var10001;
					if (this.cA_int == 0) {
						var10000 = this;
						var10001 = 1;
					} else {
						if (this.cA_int <= 8) {
							break label79;
						}

						var10000 = this;
						var10001 = 0;
					}

					var10000.cA_int = var10001;
				}

				if (this.cA_int > 2) {
					i_byte_Array[10] = 1;
				} else {
					i_byte_Array[10] = 0;
				}
			}
		} else if (a_boolean_int(524288)) {
			this.R_boolean = !this.R_boolean;
		} else if (a_boolean_int(32768)) {
			l_byte = 34;
		} else if (a_boolean_int(1024)) {
			this.S_boolean = !this.S_boolean;
		} else {
			label113: {
				if (!a_boolean_int(64)) {
					if (!a_boolean_int(32944)) {
						break label113;
					}

					i_byte_Array[8] = (byte) this.cz_int;
					i_byte_Array[9] = (byte) this.cA_int;
					if (this.R_boolean || this.S_boolean) {
						for (int var2 = 0; var2 <= 2; var2++) {
							int var3 = this.e_int_int(var2);
							if (var2 == 2) {
								var3++;
							}

							for (int var4 = 0; var4 <= var3; var4++) {
								this.a_void_int_int_byte(var2, var4, (byte) 2);
								this.a_void_int_int_byte(var2, var4, (byte) 64);
							}

							this.a_void_int_int(var2, var3);
						}

						if (this.S_boolean) {
							for (int var5 = 0; var5 <= 2; var5++) {
								int var6 = this.d_int_int(var5);
								if (var5 == 0) {
									var6--;
								}

								for (int var7 = this.e_int_int(var5); var7 < var6; var7++) {
									this.a_void_int_int_byte(var5, var7, (byte) 2);
									this.a_void_int_int_byte(var5, var7, (byte) 64);
								}

								this.a_void_int_int(var5, var6 - 1);
							}
						}
					}

					this.d_int();
					this.e_int();
					this.G_void();
				}

				var1 = true;
			}
		}

		if (var1) {
			this.aX_void();
		}

		W_int = 0;
	}

	private void aX_void() {
		l_byte = m_byte;
		if (m_byte == 27) {
			this.aw_boolean = true;
			this.e_boolean = true;
		} else if (m_byte == 1) {
			this.B_void();
		}

		W_int = 0;
	}

	private void aY_void() {
		byte var1 = 0;
		int var2 = 0;
		if (a_boolean_int(33008)) {
			this.aX_void();
			a_void_a_boolean(a_a, true);
			a_a = null;
		}

		if (a_boolean_int(4097)) {
			this.dc_int--;
			if (this.dc_int < 0) {
				this.dc_int = 0;
			}
		}

		if (a_boolean_int(262146)) {
			this.dc_int++;
			if (this.dc_int >= 2) {
				this.dc_int = 1;
			}
		}

		var2 = this.a_int_Array[this.dc_int];
		if (a_boolean_int(16388)) {
			var2--;
		}

		if (a_boolean_int(65544)) {
			var2++;
		}

		if (var2 < 0) {
			var2 = 0;
		}

		label35: {
			byte var10000;
			switch (this.dc_int) {
			case 0:
				var10000 = 115;
				break;
			case 1:
				var10000 = 8;
				break;
			default:
				break label35;
			}

			var1 = var10000;
		}

		if (var2 >= var1) {
			var2 = var1 - 1;
		}

		this.a_int_Array[this.dc_int] = var2;
		W_int = 0;
	}

	private void aZ_void() {
		if (a_boolean_int(32944)) {
			this.ao_int = 5;
			i_byte_Array[3] = (byte) this.ao_int;
			if (this.i_byte == 2) {
				this.t_void();
			} else {
				e_int_int_int(4, -500);
				l_byte = 15;
				this.I_boolean = true;
				this.G_boolean = true;
				this.ct_void();
			}
		}
	}

	private void ba_void() {
		if (this.aa_boolean && (a_boolean_int(524288) || a_boolean_int(131072))) {
			this.aV_void();
		}

		if ((this.cl_int == 0 || a_boolean_int(32944)) && this.an_int == 0 && !this.v_boolean && this.n_byte > 0
				&& a_g_Array[0].f_int != 19 && !this.C_boolean) {
			if (this.a_c != null) {
				if (a_boolean_int(32784)) {
					this.a_c.a_void();
				} else if (a_boolean_int(32944)) {
					this.a_c.b_boolean = true;
				}

				W_int = 0;
			} else {
				if (this.aT_int > 0) {
					boolean var1 = true;
					if (a_boolean_int(4097)) {
						this.ak_int = -5;
					} else if (a_boolean_int(262146)) {
						this.ak_int = 5;
					} else if (a_boolean_int(16388)) {
						this.aj_int = -5;
					} else if (a_boolean_int(65544)) {
						this.aj_int = 5;
					} else if (!a_boolean_int(32784)) {
						if (a_boolean_int(32944)) {
							this.bB_void();
							W_int = 0;
						} else {
							var1 = false;
						}
					}

					if (var1) {
						this.aT_int--;
						if (this.aT_int == 0) {
							if ((byte) (a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) < 0) {
								a_int_2d_Array[this.aP_int][this.aQ_int] = 32;
							}

							if (a_byte_2d_Array[this.aP_int][this.aQ_int] == 9) {
								a_byte_2d_Array[this.aP_int][this.aQ_int] = -1;
							}

							this.b_long = 40L;
							this.aR_int = 0;
							this.aS_int = this.aS_int & -113 | 0;
							this.n_void_int(this.f_int());
						}

						W_int = 0;
						return;
					}
				} else {
					if (a_boolean_int(4097)) {
						this.j_byte = 1;
					} else if (a_boolean_int(262146)) {
						this.j_byte = 3;
					} else if (a_boolean_int(16388)) {
						this.j_byte = 4;
					} else if (a_boolean_int(65544)) {
						this.j_byte = 2;
					} else if (!a_boolean_int(32784)) {
						if (a_boolean_int(256)) {
							this.ay_int = -1;
							int var22 = a_g_Array[0].f_int;
							if (a_g_Array[0].f_int == 36 + (this.aS_int & 7) - 1) {
								if ((a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) == 4) {
									this.cg_void();
								} else {
									this.C_void_int(2);
									this.n_void_int(19);
								}
							}

							switch (var22) {
							case 0:
							case 1:
							case 2:
							case 3:
							case 34:
							case 35:
								if ((a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) == 4) {
									this.cg_void();
								} else {
									this.C_void_int(2);
									this.n_void_int(19);
								}
							}
						} else if (a_boolean_int(32944)) {
							this.bB_void();
							W_int = 0;
						}
					} else {
						W_int = 0;
						if (this.bS_int == this.aP_int && this.bT_int == this.aQ_int
								&& (a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) == 4) {
							this.C_void_int(9);
							this.cg_void();
						} else {
							int var21;
							if ((var21 = e_int_2d_Array == null ? 0
									: a_int_int_byte_byte_byte(e_int_2d_Array[this.aP_int][this.aQ_int], (byte) 0,
											(byte) 3, (byte) 4)) != 8
									&& var21 != 7) {
								int var2 = this.aS_int & 7;
								int var3 = -1;
								int var4 = -1;
								boolean var5 = false;
								if (i_byte_Array[9] >= 2) {
									int var6 = 0;

									for (int var7 = 0; var7 < 2; var7++) {
										int var8;
										if ((var8 = var7 == 0 ? 1 : -1) > 0 && this.aP_int < this.av_int - 3
												|| var8 < 0 && this.aP_int > 3) {
											for (int var9 = 1; var9 <= 3; var9++) {
												int var26;
												label451: {
													int var10 = this.aP_int + var8 * var9;
													byte var11 = a_byte_2d_Array[var10][this.aQ_int];
													if ((a_int_2d_Array[var10][this.aQ_int] & 0xFF) != 7
															|| (a_int_2d_Array[var10][this.aQ_int] >> 8 & 240) != 0) {
														if (var11 == 48
																&& (b_int_2d_Array[var10][this.aQ_int] & 8) != 0) {
															continue;
														}

														switch (var11) {
														case -1:
															continue;
														case 11:
														case 19:
														case 43:
															label350: {
																byte var10001;
																if (var8 > 0) {
																	var26 = var6;
																	var10001 = 2;
																} else {
																	if (var8 >= 0) {
																		break label350;
																	}

																	var26 = var6;
																	var10001 = 4;
																}

																var6 = var26 | var10001;
															}
														case 0:
														case 1:
														case 8:
														case 9:
														case 14:
														case 47:
														case 48:
															if (var9 == 1) {
																var26 = 4;
																break label451;
															}

															if (var4 >= 0) {
																var5 = true;
																var4 = var6 == 2 ? 2 : (var6 == 4 ? 4 : -1);
																var26 = 4;
																break label451;
															}

															var4 = var8 > 0 ? 2 : 4;
														}
													}

													var26 = 4;
												}

												var9 = var26;
											}
										}
									}
								}

								if (i_byte_Array[9] >= 1) {
									this.j_byte = 5;
									int var23 = 0;
									int[] var24 = new int[] { 0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2 };
									int[] var25 = new int[] { -1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0 };
									int[] var13 = new int[] { 0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8 };

									for (int var14 = 0; var14 < var24.length; var14++) {
										int var15 = this.aP_int + var24[var14];
										int var16 = this.aQ_int + var25[var14];
										if (var15 >= 0 && var15 < this.av_int && var16 >= 0 && var16 < this.aw_int) {
											int var17;
											boolean var18;
											int var19;
											boolean var20;
											label316: {
												var17 = b_int_2d_Array[var15][var16] & 7;
												var18 = false;
												var19 = -1;
												var20 = false;
												switch (a_byte_2d_Array[var15][var16]) {
												case 9:
												case 18:
												case 30:
													if (var13[var14] == 0) {
														var20 = true;
													}
													break label316;
												case 19:
												case 43:
													if ((b_int_2d_Array[var15][var16] & 248) != 0) {
														break label316;
													}
													break;
												case 45:
													if ((b_int_2d_Array[var15][var16] & 15) == 10) {
														break label316;
													}
													break;
												case 46:
												case 49:
												case 50:
													if (var13[var14] == 0) {
														var23++;
														var20 = true;
													}
												default:
													break label316;
												}

												var18 = true;
											}

											if (var18) {
												label307: {
													int var27;
													if (var13[var14] == 0) {
														var27 = var14 + 1;
													} else {
														if (b_byte_2d_Array[var15][var16] < 12) {
															break label307;
														}

														if ((var13[var14] & 1) == 0 || var17 != 3) {
															if ((var13[var14] & 8) == 0 || var17 != 2) {
																break label307;
															}

															if (var25[var14] == 0) {
																var27 = 4;
															} else if (var25[var14] < 0) {
																var27 = 1;
															} else {
																if (var25[var14] <= 0) {
																	break label307;
																}

																var27 = 3;
															}
														} else if (var24[var14] == 0) {
															var27 = 1;
														} else if (var24[var14] < 0) {
															var27 = 4;
														} else {
															if (var24[var14] <= 0) {
																break label307;
															}

															var27 = 2;
														}
													}

													var19 = var27;
												}

												if (var19 != -1) {
													var20 = true;
													var23++;
												}
											}

											if (var20) {
												if (var23 == 0) {
													if (var2 == var14 + 1) {
														var3 = var2;
													} else if (var3 < 0) {
														var3 = var14 + 1;
													}
												} else {
													if (var23 != 1) {
														var3 = var2;
														break;
													}

													var3 = var19;
												}
											}
										}
									}
								}

								label443: {
									i var28;
									int var29;
									int var10002;
									if (var3 > 0 && var4 == var2) {
										this.j_byte = 6;
										var28 = this;
										var29 = this.aS_int & -8;
										var10002 = var2;
									} else if (var3 > 0 && var4 < 0 && !var5) {
										var28 = this;
										var29 = this.aS_int & -8;
										var10002 = var3;
									} else {
										label454: {
											if (var3 >= 0 || var4 <= 0 || var5) {
												if (var5 && (var2 == 2 || var2 == 4)) {
													this.j_byte = 6;
													var28 = this;
													var29 = this.aS_int & -8;
													var10002 = var2;
													break label454;
												}

												if (!var5 || var4 <= 0) {
													break label443;
												}
											}

											this.j_byte = 6;
											var28 = this;
											var29 = this.aS_int & -8;
											var10002 = var4;
										}
									}

									var28.aS_int = var29 | var10002;
								}

								if (this.j_byte == 6 && (a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) == 2
										&& a_int_2d_Array[this.aP_int][this.aQ_int] >> 8 == 1) {
									this.ay_int = -1;
									this.b_void_int_int_byte(this.aP_int, this.aQ_int, (byte) 2);
								}
							}
						}
					}

					if (this.j_byte != 5 && this.k_byte == 0 && this.b_int == 0 && this.j_byte != (this.aS_int & 7)) {
						this.aS_int |= 4096;
					}
				}
			}
		} else {
			W_int = 0;
		}
	}

	private void bb_void() {
		if (this.da_int >= 0 && this.da_int <= 2) {
			W_int = 0;
		} else {
			if (a_boolean_int(4097)) {
				if (System.currentTimeMillis() - this.i_long < 300L) {
					return;
				}

				this.x_void();
				if (this.bo_int == 0 && this.bq_int == 1 && !this.W_boolean) {
					this.x_void();
				}
			} else if (a_boolean_int(262146)) {
				if (System.currentTimeMillis() - this.i_long < 300L) {
					return;
				}

				this.y_void();
				if (this.bo_int == 0 && this.bq_int == 1 && !this.W_boolean) {
					this.y_void();
				}
			} else if (a_boolean_int(32944)) {
				if (this.da_int < 0 || this.da_int > 2) {
					this.da_int = 0;
					this.h_long = System.currentTimeMillis();
				}
			} else if (a_boolean_int(64)) {
				this.bc_void();
			}

			W_int = 0;
		}
	}

	private void bc_void() {
		switch (this.bo_int) {
		case -1:
			return;
		case 0:
		case 1:
		case 3:
		default:
			break;
		case 2:
			l_byte = 9;
			this.a_void_int(0);
			this.br_int = 8;
			this.bs_int = 0;
			return;
		case 4:
			this.a_void_int(2);
			break;
		case 5:
			U_boolean = true;
			V_boolean = false;
			if (l_byte == 2) {
				this.a_void_int(1);
				this.B_void();
				V_boolean = true;
			}

			if (l_byte == 4) {
				this.a_void_int(0);
				this.C_void_int(19);
				return;
			}
		}
	}

	private void f_void_int_int(int integer1, int integer2) {
		int[] var3;
		int[] var4;
		boolean var5;
		boolean var6;
		boolean var7;
		label119: {
			var3 = new int[] { 0, 1, -1, 0, 0 };
			var4 = new int[] { 0, 0, 0, 1, -1 };
			var5 = false;
			var6 = i_byte_Array[9] >= 8;
			var7 = false;
			boolean var10000;
			switch (a_byte_2d_Array[integer1][integer2]) {
			case 0:
				var7 = true;
				break label119;
			case 9:
				if ((this.aS_int & 8192) == 0) {
					this.aS_int |= 8192;
					var5 = true;
					this.g_void_int_int(integer1, integer2);
				}
				break label119;
			case 10:
				if (this.x_byte == 3 && b_int_2d_Array[integer1][integer2] <= 0) {
					var5 = true;
					b_int_2d_Array[integer1][integer2] = 1;
					this.b_void_int_int(integer1, integer2);
				}
				break label119;
			case 16:
				var5 = true;
				var7 = true;
				break label119;
			case 18:
				var10000 = this.c_boolean();
				break;
			case 30:
				var5 = true;
				if (b_int_2d_Array[integer1][integer2] == 0) {
					t_void_int(200);
					this.C_void_int(11);
					b_int_2d_Array[integer1][integer2] = 1;
				}
				break label119;
			default:
				if (a_byte_2d_Array[integer1][integer2] - 80 < 0 && ((a_int_2d_Array[integer1][integer2] & 0xFF) != 7
						|| (a_int_2d_Array[integer1][integer2] >> 8 & 240) != 0)) {
					break label119;
				}

				var7 = true;
				var10000 = true;
			}

			var5 = var10000;
		}

		if (var7) {
			t_void_int(200);
			this.C_void_int(6);
			this.n_void_int(41 + (this.aS_int & 7) - 1);
		}

		if (!var5) {
			for (int var9 = 0; var9 < 5; var9++) {
				int var10 = integer1 + var3[var9];
				int var11 = integer2 + var4[var9];
				if (var10 >= 0 && var10 < this.av_int && var11 >= 0 && var11 < this.aw_int) {
					byte var8 = a_byte_2d_Array[var10][var11];
					boolean var12 = false;
					boolean var13 = false;
					switch (var8) {
					case 1:
						if (var10 == this.aP_int - g_byte_Array[this.aS_int & 7]
								&& var11 == this.aQ_int - g_byte_Array[(this.aS_int & 7) + 8]) {
							var13 = true;
						}
						break;
					case 19:
					case 43:
					case 45:
					case 46:
					case 49:
						int var14;
						byte var15 = (var14 = b_int_2d_Array[var10][var11] & 7) == 0 ? 0
								: b_byte_2d_Array[var10][var11];
						boolean var16 = var8 != 49 && var8 != 46;
						if (a_boolean_int_int_int_int_int_int_int_int(integer1, integer2, 0, 0, var10, var11, var14,
								var15)) {
							var13 = true;
							var12 = var16;
						}

						if (var13) {
							t_void_int(200);
							this.C_void_int(10);
						}
					}

					if (var6 && var13 && (var10 != this.aP_int || var11 != this.aQ_int)) {
						if (this.b_boolean_int_int(var10, var11)) {
							this.aS_int |= 8192;
						}
					} else if (var12) {
						this.aS_int |= 8192;
						if (var8 == 45) {
							int var17;
							if ((var17 = (b_int_2d_Array[var10][var11] & 7168) >> 10) == 3) {
								a_byte_2d_Array[var10][var11] = -1;
								this.p_void_int_int(var10, var11);
							} else {
								b_int_2d_Array[var10][var11] = 10 | ++var17 << 10;
								b_int_2d_Array[var10][var11] = b_int_2d_Array[var10][var11] & -249 | 120;
								b_byte_2d_Array[var10][var11] = 0;
							}
						} else {
							this.c_void_int_int_int(var8, var10, var11);
						}
					}
				}
			}
		}
	}

	private void g_void_int_int(int integer1, int integer2) {
		if (!a_boolean_int_int(integer1, integer2)) {
			q_void_int_int(integer1, integer2);
			int var3 = this.d_boolean_int_int(integer1, integer2 - 1) ? 2 : 1;
			switch ((b_int_2d_Array[integer1][integer2] & 264241152) >> 22) {
			case 34:
				a_byte_2d_Array[integer1][integer2] = 1;
				this.c_void_int_int(integer1, integer2);
				return;
			case 35:
				a_byte_2d_Array[integer1][integer2] = 45;
				b_int_2d_Array[integer1][integer2] = b_int_2d_Array[integer1][integer2] & -16 | 10;
				return;
			case 36:
				a_byte_2d_Array[integer1][integer2] = 46;
				b_int_2d_Array[integer1][integer2] = 0;
				b_byte_2d_Array[integer1][integer2] = 0;
			case 38:
			default:
				return;
			case 37:
				byte[] var10000;
				int var10001;
				byte var10002;
				if ((b_int_2d_Array[integer1][integer2] & 268435456) != 0) {
					var10000 = a_byte_2d_Array[integer1];
					var10001 = integer2;
					var10002 = 43;
				} else {
					var10000 = a_byte_2d_Array[integer1];
					var10001 = integer2;
					var10002 = 19;
				}

				var10000[var10001] = var10002;
				b_int_2d_Array[integer1][integer2] = var3;
				this.c_void_int_int_int(19, integer1, integer2);
				return;
			case 39:
				a_byte_2d_Array[integer1][integer2] = 49;
				b_int_2d_Array[integer1][integer2] = var3;
			}
		}
	}

	private boolean c_boolean() {
		if (this.x_byte == 3) {
			int var1 = a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF;
			if (this.cf_int == 0 && var1 != 15 && var1 != 16) {
				t_void_int(200);
				this.C_void_int(0);
				i var10000;
				byte var10001;
				if (this.ce_int <= 0) {
					var10000 = this;
					var10001 = 1;
				} else {
					var10000 = this;
					var10001 = -1;
				}

				var10000.cf_int = var10001;
			}

			return true;
		} else {
			return false;
		}
	}

	private void c_void_int_int_int(int integer1, int integer2, int integer3) {
		int var4 = b_int_2d_Array[integer2][integer3];
		if (integer1 == 43 && (var4 & 248) == 0) {
			if ((var4 & 98304) == 0) {
				a_byte_2d_Array[integer2][integer3] = -1;
				this.p_void_int_int(integer2, integer3);
				return;
			}

			int var5 = var4 - 32768;
			int var6;
			var4 = ((var6 = ((var5) & -16646145 | integer2 << 17) & -2130706433 | integer3 << 24)
					& 7) != 1 && (var6 & 7) != 3 ? var6 & 2147483647 : var6 | -2147483648;
		}

		var4 = var4 & -249 | 120;
		b_int_2d_Array[integer2][integer3] = var4;
	}

	private void bd_void() {
		int var2 = a_int_2d_Array[this.bE_int][this.bF_int] >> 8;
		int[] var10000;
		int var10001;
		int var10002;
		if (++var2 >= 16) {
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = -1;
		} else {
			c_byte_2d_Array[this.bE_int][this.bF_int] = 24;
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = var2 << 8 | 36;
		}

		var10000[var10001] = var10002;
	}

	private void h_void_int_int(int integer1, int integer2) {
		switch (a_byte_2d_Array[integer1][integer2]) {
		case 0:
			this.C_void_int(11);
		case 19:
		case 43:
		case 45:
		case 46:
			a_int_2d_Array[integer1][integer2] = -1;
			this.p_void_int_int(integer1, integer2);
			return;
		case 48:
			a_int_2d_Array[integer1][integer2] = -1;
			this.p_void_int_int(integer1, integer2);
			int var3 = integer2 + 1;
			if (a_byte_2d_Array[integer1][var3] != 48) {
				var3 = -1;
			}

			a_byte_2d_Array[integer1][var3] = -1;
			this.p_void_int_int(integer1, var3);
			int var4 = (b_int_2d_Array[integer1][integer2] >> 24) * 3;
			e_byte_Array[var4 + 2] = -1;
			return;
		default:
			a_int_2d_Array[integer1][integer2] = -1;
		}
	}

	private void be_void() {
		if (this.a_boolean) {
			this.a_int--;
		}

		if ((this.f_boolean || this.aj_boolean) && aN_int > 140) {
			if (this.aj_boolean) {
				this.d_int();
			}

			this.f_boolean = false;
			this.aj_boolean = false;
			this.J_boolean = true;
			this.bs_int = 0;
			this.g_void();
			this.H_boolean = true;
			l_byte = 28;
		}

		boolean var1 = this.b_boolean();
		if (this.am_boolean) {
			this.am_boolean = false;
			if (this.ds_int < this.dt_int) {
				int var2 = a_int_byte_byte_byte((byte) this.ds_int, (byte) 13, (byte) 7);
				int var3 = a_int_byte_byte_byte((byte) this.ds_int, (byte) 20, (byte) 7);
				this.v_void_int_int(var2, var3);
				this.ds_int++;
			} else {
				this.ds_int = 0;
				this.dt_int = 0;
			}
		}

		if (a_g_Array[4] != null) {
			a_g_Array[4].b_void();
		}

		if (this.bj_int > 0) {
			this.bj_int--;
		}

		if (this.dh_int > 0) {
			this.dh_int--;
			if (this.dh_int == 0) {
				this.d_String = null;
			}
		}

		if (this.S_int != this.T_int) {
			int var10000 = this.S_int;

			while (true) {
				int var10 = var10000;
				if (var10000 == this.T_int) {
					break;
				}

				b_byte_Array[var10]++;
				int var14 = c_byte_Array[var10] < 0 ? a_int_a_int(a_a_Array[2], 0)
						: a_a_Array[9].a_int_int(c_byte_Array[var10]);
				if (b_byte_Array[var10] >= var14) {
					this.S_int++;
					this.S_int &= 7;
				}

				var10000 = var10 + 1 & 7;
			}
		}

		if (this.i_byte != 0) {
			this.bq_void();
			if (l_byte != 1) {
				return;
			}
		}

		if ((aN_int & 15) == 0) {
			this.bp_void();
		}

		if (this.cf_int != 0 && (aN_int >> 1 & 1) == 0) {
			this.ce_int = this.ce_int + this.cf_int;
			if (this.ce_int != 0 && this.ce_int != 9) {
				if (this.ce_int == 5) {
					int var12 = this.aw_int - 1;
					int var16 = this.av_int - 1;

					for (int var22 = 1; var22 < var12; var22++) {
						for (int var26 = 1; var26 < var16; var26++) {
							boolean var8;
							label447: {
								int var6 = a_int_2d_Array[var26][var22] & 0xFF;
								byte var7 = a_byte_2d_Array[var26][var22];
								var8 = false;
								if (var6 == 15) {
									this.h_void_int_int(var26, var22);
									a_byte_2d_Array[var26][var22] = 34;
								} else if (var6 == 16) {
									this.h_void_int_int(var26, var22);
									a_byte_2d_Array[var26][var22] = 35;
								} else {
									int[] var29;
									int var10001;
									byte var10002;
									if (var7 == 34) {
										var29 = a_int_2d_Array[var26];
										var10001 = var22;
										var10002 = 15;
									} else {
										if (var7 != 35) {
											break label447;
										}

										var29 = a_int_2d_Array[var26];
										var10001 = var22;
										var10002 = 16;
									}

									var29[var10001] = var10002;
									a_byte_2d_Array[var26][var22] = -1;
									this.t_void_int_int(var26, var22);
								}

								var8 = true;
							}

							if (var8) {
								q_void_int_int(var26, var22);
							}
						}
					}
				}
			} else {
				this.cf_int = 0;

				for (int var11 = 1; var11 < this.aw_int - 1; var11++) {
					for (int var15 = 1; var15 < this.av_int - 1; var15++) {
						int var4 = a_int_2d_Array[var15][var11] & 0xFF;
						byte var5 = a_byte_2d_Array[var15][var11];
						if (var4 == 15 || var4 == 16 || var5 == 34 || var5 == 35) {
							this.c_void_int_int(var15, var11);
						}
					}
				}
			}
		}

		this.b_long--;
		if (this.aW_int > 0 && --this.aW_int == 0) {
			this.bl_void();
		}

		if (this.aR_int <= 0 && this.u_boolean) {
			this.u_boolean = false;
			this.C_void_int(9);

			try {
				Thread.sleep(100L);
			} catch (InterruptedException var9) {
				var9.printStackTrace();
			}

			this.cf_void();
		}

		if (a_a_Array[11] != null) {
			this.bo_void();
		}

		if (this.bi_int != 0 && this.bg_int != 0) {
			this.bn_void();
		}

		this.bF_void();
		if (this.al_int > 0) {
			this.bf_void();
		}

		this.co_void();
		if (this.cl_int != 0) {
			this.bE_void();
		}

		if (this.a_c != null) {
			this.am_int = 70;
			if (this.a_c.a_boolean() && this.a_c.b_byte_Array() == null) {
				this.a_c = null;
			}

			if (this.a_c != null) {
				this.a_c.b_void();
			}
		} else if (this.bm_int != -1) {
			this.u_void_int(this.bm_int);
			this.bm_int = -1;
			this.j_byte = 0;
		}

		label422: {
			i var31;
			byte var35;
			if (this.aT_int > 0) {
				if (a_byte_2d_Array[this.aP_int][this.aQ_int] < 0) {
					byte var38;
					if (a_byte_2d_Array[this.aP_int][this.aQ_int + 1] == 9
							&& (b_int_2d_Array[this.aP_int][this.aQ_int + 1] & 7) == 3) {
						this.aQ_int++;
						var31 = this;
						var35 = (byte) (this.aS_int & -8);
						var38 = 3;
					} else if (a_byte_2d_Array[this.aP_int - 1][this.aQ_int + 1] == 9
							&& (b_int_2d_Array[this.aP_int - 1][this.aQ_int + 1] & 7) == 3) {
						this.aQ_int++;
						this.aP_int--;
						var31 = this;
						var35 = (byte) (this.aS_int & -8);
						var38 = 3;
					} else if (a_byte_2d_Array[this.aP_int + 1][this.aQ_int + 1] == 9
							&& (b_int_2d_Array[this.aP_int + 1][this.aQ_int + 1] & 7) == 3) {
						this.aQ_int++;
						this.aP_int++;
						var31 = this;
						var35 = (byte) (this.aS_int & -8);
						var38 = 3;
					} else {
						var31 = this;
						var35 = (byte) (this.aS_int & -8);
						var38 = 0;
					}

					var31.aS_int = var35 | var38;
				}

				var31 = this;
				var35 = b_byte_2d_Array[this.aP_int][this.aQ_int];
			} else {
				if ((this.k_byte == 0 || this.aR_int <= 0 && this.k_byte != 5) && !this.v_boolean
						&& (this.aS_int & 112) == 0 && this.aA_int == -1) {
					this.k_byte = this.j_byte;
					boolean var13 = false;
					if (this.an_int > 0) {
						this.k_byte = 2;
						this.an_int--;
						if (this.an_int == 0) {
							this.j_void_int_int(this.aP_int - 1, this.aQ_int);
							this.j_byte = 0;
							W_int = 0;
						}
					} else if (var1) {
						q_void_int_int(this.aP_int, this.aQ_int);
					}

					label299: switch (this.k_byte) {
					case 0:
						this.aS_int &= -9;
						boolean var27 = false;
						switch (a_g_Array[0].f_int) {
						default:
							if ((this.aS_int & 16384) == 0) {
								var27 = true;
							}
						case 0:
						case 2:
						case 10:
						case 11:
						case 12:
						case 34:
						case 35:
						case 40:
						case 48:
							if (var27) {
								int var28;
								if ((var28 = 0 + (this.aS_int & 7) - 1) < 0) {
									var28 = 0;
								}

								this.n_void_int(var28);
							}

							byte var37;
							if (this.a_c == null) {
								var31 = this;
								var37 = 6;
							} else {
								var31 = this;
								var37 = 0;
							}

							var31.aX_int = var37;
							if (this.aR_int > 0) {
								this.aR_int -= 6;
							}
							break label299;
						}
					case 3:
						this.aS_int &= -9;
					case 1:
					case 2:
					case 4:
						if (a_g_Array[0].f_int != 40 && a_g_Array[0].f_int != 48) {
							if ((this.aS_int & 4096) == 0) {
								var13 = this.a_boolean_int_int_boolean(-g_byte_Array[this.k_byte],
										-g_byte_Array[this.k_byte + 8], false);
								var1 = this.b_boolean();
								if (var13) {
									this.a_int = 40;
									this.a_boolean = false;
									int var18;
									if ((var18 = this.k_byte - 1) < 0) {
										var18 = 0;
									}

									if ((this.aS_int & 8) != 0) {
										if (this.k_byte == 2) {
											this.n_void_int(8);
										} else {
											this.n_void_int(9);
										}
									} else {
										this.n_void_int(4 + var18);
									}
								}
							} else {
								this.aS_int = this.aS_int & -8 | this.k_byte;
								this.aR_int = 18;
								int var19;
								if ((var19 = this.k_byte - 1) < 0) {
									var19 = 0;
								}

								this.n_void_int(0 + var19);
							}
						}
						break;
					case 5:
						this.aR_int = 0;
						int var23 = this.aS_int & 7;
						if (this.b_boolean()) {
							this.n_void_int(13 + var23 - 1);
						}
						break;
					case 6:
						int var17 = (this.aS_int & 7) == 2 ? 1 : -1;
						if (var1 && a_byte_2d_Array[this.aP_int + var17][this.aQ_int] < 0) {
							this.n_void_int(var17 == -1 ? 22 : 20);
							a_byte_2d_Array[this.aP_int + var17][this.aQ_int] = 32;
							b_byte_2d_Array[this.aP_int + var17][this.aQ_int] = 18;
							b_int_2d_Array[this.aP_int + var17][this.aQ_int] = 4 | (var17 > 0 ? 1 : 0);
							c_byte_2d_Array[this.aP_int + var17][this.aQ_int] = 30;
							this.aR_int = 72;
							this.j_byte = 0;
						}
					}

					if (var1) {
						byte var20 = a_byte_2d_Array[this.aP_int][this.aQ_int - 1];
						if (!var13 && this.k_byte != 5 && this.aR_int <= 0
								&& (var20 == 0 || var20 == 9 || var20 == 8 || var20 == 48)
								&& (a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) != 35) {
							int var24 = 0;
							if (e_int_2d_Array != null) {
								var24 = a_int_int_byte_byte_byte(e_int_2d_Array[this.aP_int][this.aQ_int], (byte) 0,
										(byte) 3, (byte) 4);
							}

							if (!this.j_boolean || var24 == 0 && var24 != 3) {
								if ((this.aS_int & 8) == 0 && a_g_Array[0].f_int != 11 && a_g_Array[0].f_int != 10
										&& a_g_Array[0].f_int != 12) {
									this.n_void_int(11);
								}

								this.a_boolean = true;
								if (this.a_int <= 0) {
									this.a_int = 40;
									this.b_long = 0L;
									this.a_void_int_int_int(i_byte_Array[8], 32, 0);
									return;
								}
							}
						}
					}

					if (var13) {
						this.w_boolean = false;
					} else if (var1 && (aN_int & 31) == 0) {
						boolean var21 = a_byte_2d_Array[this.aP_int][this.aQ_int - 1] == 0;

						for (int var25 = 1; !var21 && var25 <= 4; var25++) {
							var21 |= this.a_boolean_int_int_boolean(g_byte_Array[var25], g_byte_Array[var25 + 8], true);
						}

						if (!var21) {
							if (this.w_boolean) {
								this.n_void_int(19);
							} else {
								this.w_boolean = true;
							}
						}
					}
					break label422;
				}

				if (this.v_boolean && this.aR_int <= 0) {
					byte var36;
					if (this.au_boolean) {
						var31 = this;
						var36 = this.p_byte;
					} else {
						var31 = this;
						var36 = this.q_byte;
					}

					var31.k_byte = var36;
					this.aS_int = this.aS_int & -8 | this.k_byte;
					this.aP_int = this.aP_int + -g_byte_Array[this.k_byte];
					this.aQ_int = this.aQ_int + -g_byte_Array[this.k_byte + 8];
					var1 = this.b_boolean();
					this.aR_int = 18;
					if (a_g_Array[0].f_int != 4) {
						this.n_void_int(4 + this.k_byte - 1);
					}
				}

				if ((this.aS_int & 112) > 32 && (this.aS_int & 2048) == 0) {
					break label422;
				}

				this.aR_int -= 6;
				if (this.aR_int > 0) {
					break label422;
				}

				this.aS_int &= -4209;
				var31 = this;
				var35 = 0;
			}

			var31.aR_int = var35;
		}

		if (this.cl_int == 0) {
			if (this.C_boolean) {
				this.ck_int = 8;
				if (this.f_boolean()) {
					this.d_void_int_int_int(this.bS_int, this.bT_int, 5);
					this.C_boolean = false;
				}
			} else if (this.a_c == null) {
				if (ak_boolean && this.k_byte != 0) {
					ak_boolean = false;
					this.am_int = 0;
				}

				if (!ak_boolean) {
					this.c_void();
				}
			} else {
				this.ar_int = this.at_int;
				this.as_int = this.au_int;
			}
		}

		if (this.k_byte != 0 && var1) {
			this.l_boolean = a_byte_2d_Array[this.aP_int][this.aQ_int + 1] >= 0;
		}

		this.bm_void();
		if (this.v_boolean && (this.aP_int < -5 || this.aP_int > this.av_int + 5 || this.aQ_int < -5
				|| this.aQ_int > this.aw_int + 5)) {
			this.z_void();
			if (!this.au_boolean && this.aq_int < this.dJ_int) {
				l_byte = 20;
				this.bs_int = 0;
				this.bh_void();
				this.N_void();
				e_int_int_int(6, this.bb_int);
				this.E_void();
			} else {
				this.bs_int = 0;
				this.br_int = 12;
				l_byte = 35;
			}

			this.g_void();
			this.aM_int = -1;
		}
	}

	private byte a_byte_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		int var5 = integer1 + integer2;
		if ((integer1 > 0 && integer3 == 0 || integer1 < integer3 && integer3 > 0)
				&& (a_byte_2d_Array[var5][integer4] < 0 || a_byte_2d_Array[var5][integer4] == 31
						|| d_int_int_int(var5, integer4) >= 0)) {
			do {
				integer1 = var5;
				var5 += integer2;
			} while ((integer1 > 0 && integer3 == 0 || integer1 < integer3 && integer3 > 0)
					&& (a_byte_2d_Array[var5][integer4] < 0 || d_int_int_int(var5, integer4) >= 0
							|| a_byte_2d_Array[var5][integer4] == 31));
		}

		return (byte) integer1;
	}

	private static boolean a_boolean_int_int(int integer1, int integer2) {
		if (e_byte_Array == null) {
			return false;
		} else {
			for (byte var2 = 0; var2 < e_byte_Array.length; var2 += 3) {
				if (e_byte_Array[var2 + 2] == integer2
						&& (e_byte_Array[var2 + 0] - 1 == integer1 || e_byte_Array[var2 + 1] + 1 == integer1)) {
					return true;
				}
			}

			return false;
		}
	}

	private void bf_void() {
		int var1 = this.av_int - 1;

		for (byte var2 = 0; var2 < e_byte_Array.length; var2 += 3) {
			byte var3;
			if ((var3 = e_byte_Array[var2 + 2]) > 0) {
				byte var4 = e_byte_Array[var2 + 1];
				byte var5 = e_byte_Array[var2 + 0];
				var5 = e_byte_Array[var2 + 0] = this.a_byte_int_int_int_int(var5, -1, 0, var3);
				var4 = e_byte_Array[var2 + 1] = this.a_byte_int_int_int_int(var4, 1, var1, var3);

				for (int var6 = var5; var6 <= var4; var6++) {
					this.b_boolean_int_int(var6, var3);
				}
			}
		}
	}

	private boolean b_boolean_int_int(int integer1, int integer2) {
		int var3 = d_int_int_int(integer1, integer2);
		int var4 = 0;
		if (var3 >= 0) {
			if (var3 == 37 && a_byte_2d_Array[integer1][integer2] == 43) {
				var4 = 268435456;
			}

			q_void_int_int(integer1, integer2);
			a_byte_2d_Array[integer1][integer2] = 9;
			b_int_2d_Array[integer1][integer2] = b_int_2d_Array[integer1][integer2] & -264241153 | var3 << 22 | var4;
			this.d_void_int_int_int(integer1, integer2, 1);
		}

		int var5 = (this.aS_int & 16384) == 0 ? 0 : 3;
		g var6 = a_g_Array[var5];
		if (this.d_boolean_int_int(integer1, integer2) && this.aT_int <= 0 && var6.f_int != 40 && var6.f_int != 48
				&& var6.f_int != 47) {
			this.a_void_int_int_int(0, 16, 0);
		}

		return var3 >= 0;
	}

	private static int d_int_int_int(int integer1, int integer2) {
		if (a_byte_2d_Array[integer1][integer2] < 0) {
			return -1;
		} else {
			switch (a_byte_2d_Array[integer1][integer2]) {
			case 1:
				return 34;
			case 19:
			case 43:
				return 37;
			case 45:
				return 35;
			case 46:
				return 36;
			case 49:
				return 39;
			default:
				return -1;
			}
		}
	}

	private void bg_void() {
		label125: {
			int var1;
			a var2;
			Graphics var3;
			label129: {
				label130: {
					var1 = this.aM_int;
					var2 = a_a_Array[41];
					var3 = this.a_Graphics;
					this.a_Graphics.setColor(2496263);
					var3.fillRect(0, 0, 240, 320);
					switch (var1) {
					case 0:
						break label129;
					case 1:
						break label130;
					case 2:
						break;
					case 5:
						if (this.bd_int == 0) {
							if ((this.u_byte & 32) != 0) {
								var3.drawImage(a_Image_2d_Array[5][0], 200, 237, 0);
								if (var1 == 5) {
									a var6;
									int var7 = (var6 = a_a_Array[9]).a_int_int(0);
									if (aN_int < var7 * 2) {
										var6.a_void_Graphics_int_int_int_int_int_int_int(var3, 0, aN_int * 2, 200, 237,
												0, 0, 0);
									}
								}
							}

							var3.drawImage(a_Image_2d_Array[28][0], 180, 254, 0);
						}
					case 4:
						int var4;
						if (var1 != 4 || (var4 = -100 + aN_int * 10) > 0) {
							var4 = 0;
						}

						a_g_Array[0].a_a.a_void_Graphics_int_int_int_int_int_int_int(var3, 12, 0, 7 + var4, 243, 0, 0,
								0);
						var2.b_void_Graphics_String_int_int_int(var3, a_String_Array[44], 120, 243, 17);
						String var13 = String.valueOf(this.bd_int);
						var2.b_void_Graphics_String_int_int_int(var3, var13, 120, 255, 17);
						if (this.bc_int == 0) {
							if ((this.u_byte & 16) != 0) {
								var3.drawImage(a_Image_2d_Array[5][0], 200, 179, 0);
								if (var1 == 4) {
									a var17;
									int var8 = (var17 = a_a_Array[9]).a_int_int(0);
									if (aN_int < var8 * 2) {
										var17.a_void_Graphics_int_int_int_int_int_int_int(var3, 0, aN_int >> 1, 200,
												179, 0, 0, 0);
									}
								}
							}

							var3.drawImage(a_Image_2d_Array[28][0], 180, 196, 0);
						}
					case 3:
						int var9;
						if (var1 != 3 || (var9 = -100 + aN_int * 10) > 0) {
							var9 = 0;
						}

						a_g_Array[0].a_a.a_void_Graphics_int_int_int_int_int_int_int(var3, 10, 0, 7 + var9, 189, 0, 0,
								0);
						var2.b_void_Graphics_String_int_int_int(var3, a_String_Array[43], 120, 185, 17);
						String var14 = String.valueOf(this.bc_int);
						var2.b_void_Graphics_String_int_int_int(var3, var14, 120, 197, 17);
						if (this.bb_int == this.ba_int) {
							if ((this.u_byte & 8) != 0) {
								var3.drawImage(a_Image_2d_Array[5][0], 200, 121, 0);
								if (var1 == 3) {
									a var18;
									int var21 = (var18 = a_a_Array[9]).a_int_int(0);
									if (aN_int < var21 * 2) {
										var18.a_void_Graphics_int_int_int_int_int_int_int(var3, 0, aN_int >> 1, 200,
												121, 0, 0, 0);
									}
								}
							}

							var3.drawImage(a_Image_2d_Array[28][0], 180, 138, 0);
						}
						break;
					default:
						break label125;
					}

					int var10;
					if (var1 != 2 || (var10 = -100 + aN_int * 10) > 0) {
						var10 = 0;
					}

					a_a_Array[a_int_int(3)].a_void_Graphics_int_int_int_int_int_int(var3, 0, 7 + var10, 127, 0, 0, 0);
					var2.b_void_Graphics_String_int_int_int(var3, a_String_Array[114], 120, 127, 17);
					String var15 = this.bb_int + "/" + this.ba_int;
					var2.b_void_Graphics_String_int_int_int(var3, var15, 120, 139, 17);
					if (this.aZ_int == this.aY_int) {
						if ((this.u_byte & 4) != 0) {
							var3.drawImage(a_Image_2d_Array[5][0], 200, 63, 0);
							if (var1 == 2) {
								a var19;
								int var22 = (var19 = a_a_Array[9]).a_int_int(0);
								if (aN_int < var22 >> 1) {
									var19.a_void_Graphics_int_int_int_int_int_int_int(var3, 0, aN_int * 2, 200, 63, 0,
											0, 0);
								}
							}
						}

						var3.drawImage(a_Image_2d_Array[28][0], 180, 80, 0);
					}
				}

				int var11;
				if (var1 != 1 || (var11 = -100 + aN_int * 10) > 0) {
					var11 = 0;
				}

				a_a_Array[a_int_int(2)].a_void_Graphics_int_int_int_int_int_int(var3, 0, 7 + var11, 69, 0, 0, 0);
				var2.b_void_Graphics_String_int_int_int(var3, a_String_Array[109], 120, 69, 17);
				int var20;
				if (var1 != 1 || (var20 = aN_int >> 1) > this.aZ_int) {
					var20 = this.aZ_int;
				}

				String var16 = var20 + "/" + this.aY_int;
				var2.b_void_Graphics_String_int_int_int(var3, var16, 120, 81, 17);
			}

			int var5;
			int var12;
			label84: {
				if (var1 == 0) {
					var5 = (var12 = -100 + aN_int * 10) - 240;
					if (var12 > 0) {
						var12 = 0;
					}

					if (var5 <= 0) {
						break label84;
					}
				} else {
					var12 = 0;
				}

				var5 = 0;
			}

			var2.a_void_Graphics_String_int_int_int(var3, a_String_Array[g_int_2d_Array[this.ap_int][this.aq_int]],
					120 + var12, 10, 17);
			var2.a_void_Graphics_String_int_int_int(var3, a_String_Array[41], 120 + var5, 25, 17);
		}

		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[this.aM_int == 5 ? 98 : 53], 5,
				318, 36);
	}

	public static int a_int_byte_Array_int(byte[] arr, int integer) {
		return (arr[integer] & 0xFF) | (arr[integer + 1] & 0xFF) << 8;
	}

	public static int b_int_byte_Array_int(byte[] arr, int integer) {
		return arr[integer] & 0xFF | (arr[integer + 1] & 0xFF) << 8 | (arr[integer + 2] & 0xFF) << 16
				| (arr[integer + 3] & 0xFF) << 24;
	}

	private static int e_int_int_int(int integer1, int integer2) {
		int var2;
		if ((var2 = a_int_byte_Array_int(i_byte_Array, integer1) + integer2) < 0) {
			var2 = 0;
		}

		i_byte_Array[integer1] = (byte) (var2 & 0xFF);
		i_byte_Array[integer1 + 1] = (byte) (var2 >> 8 & 0xFF);
		return var2;
	}

	private void bh_void() {
		for (int var1 = 0; var1 < this.X_int; var1++) {
			this.a_void_int_int_int_int(this.ap_int, this.aq_int, d_byte_Array[var1 << 1] & 255,
					d_byte_Array[(var1 << 1) + 1] & 255);
		}
	}

	private int d_int() {
		return e_int_int_int(4, this.aZ_int);
	}

	private int e_int() {
		return e_int_int_int(6, this.bb_int);
	}

	private void q_void_int(int integer) {
		switch (integer) {
		case 0:
			dd_int = 0;
			de_int = 0;
			df_int = 0;
			this.t_byte = this.a_byte_int_int(this.ap_int, this.aq_int);
			this.u_byte = 0;
			return;
		case 1:
			dd_int = a_int_byte_Array_int(i_byte_Array, 4);
			dd_int = dd_int + this.aZ_int;
			this.s_boolean = false;
			return;
		case 2:
			i_byte_Array[4] = (byte) (dd_int & 0xFF);
			i_byte_Array[5] = (byte) (dd_int >> 8 & 0xFF);
			return;
		case 3:
			de_int = a_int_byte_Array_int(i_byte_Array, 6);
			de_int = de_int + this.bb_int;
			return;
		case 4:
			i_byte_Array[6] = (byte) (de_int & 0xFF);
			i_byte_Array[7] = (byte) (de_int >> 8 & 0xFF);
			return;
		case 5:
			df_int = i_byte_Array[2];
			this.J_int = 0;
			if ((df_int & 8) == 0 && de_int >= f.b_int_Array[1]) {
				this.J_int = 1;
				return;
			}

			if ((df_int & 16) == 0 && de_int >= f.b_int_Array[2]) {
				this.J_int = 2;
				return;
			}
			break;
		case 6:
			try {
				a_Image_2d_Array[28] = a_Image_Array_String_int("/ui.f", 4);
				return;
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
		case 7:
			this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 2);
			this.K_int = 0;
			return;
		case 8:
			int var2;
			int var3 = var2 = (df_int & 224) >> 5;

			while (var3 < 4 && dd_int >= f.a_int_Array[var3]) {
				var3++;
			}

			if (var2 < var3) {
				i_byte_Array[2] = (byte) (i_byte_Array[2] & -225);
				i_byte_Array[2] = (byte) (i_byte_Array[2] | var3 << 5 & 224);
				this.G_void();
				this.K_int = var3;
			}
		case 9:
			this.bh_void();
			return;
		case 10:
			this.g_void();
			System.gc();
			return;
		case 11:
			if (this.ao_int < 99 && this.aZ_int == this.aY_int && (this.t_byte & 4) == 0) {
				this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 4);
				this.u_byte = (byte) (this.u_byte | 4);
				this.ao_int++;
			}

			if (this.ao_int < 99 && this.bb_int == this.ba_int && (this.t_byte & 8) == 0) {
				this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 8);
				this.u_byte = (byte) (this.u_byte | 8);
				this.ao_int++;
			}

			if (this.ao_int < 99 && this.bc_int == 0 && (this.t_byte & 16) == 0) {
				this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 16);
				this.u_byte = (byte) (this.u_byte | 16);
				this.ao_int++;
			}

			if (this.ao_int < 99 && this.bd_int == 0 && (this.t_byte & 32) == 0) {
				this.a_void_int_int_byte(this.ap_int, this.aq_int, (byte) 32);
				this.u_byte = (byte) (this.u_byte | 32);
				this.ao_int++;
			}

			this.bj_void();
			this.E_void();
			this.H_boolean = false;
			this.G_boolean = true;
		}
	}

	private void bi_void() {
		switch (this.aM_int) {
		case 0:
			if (aN_int > 40 || this.s_boolean) {
				this.aM_int++;
				this.g_void();
				return;
			}
			break;
		case 1:
			if (aN_int > this.aZ_int << 1 && aN_int > 40 || this.s_boolean) {
				this.aM_int++;
				this.g_void();
				return;
			}
			break;
		case 2:
			if (aN_int > 40 || this.s_boolean) {
				this.aM_int++;
				this.g_void();
				return;
			}
			break;
		case 3:
			if (aN_int > 10 || this.s_boolean) {
				this.aM_int++;
				this.g_void();
				return;
			}
			break;
		case 4:
			if (aN_int > 10 || this.s_boolean) {
				this.aM_int++;
				this.g_void();
				this.s_boolean = false;
			}
		case 5:
		}
	}

	private long a_long_int(int integer) {
		for (int var2 = 0; var2 < 12; var2++) {
			for (int var3 = 0; var3 < 12; var3++) {
				long var4;
				if ((var4 = a_long_2d_Array[var2][var3]) != 0L
						&& a_int_long_byte_byte(var4, (byte) 6, (byte) 5) == integer) {
					return var4;
				}
			}
		}

		return -1L;
	}

	private void bj_void() {
		long var1 = this.a_long_int(this.aq_int);
		if ((this.aq_int == 0 || a_int_long_byte_byte(var1, (byte) 11, (byte) 3) > 1) && var1 >= 0L
				&& (this.a_byte_int_int(this.ap_int, this.aq_int + 1) & 64) == 0) {
			dY_int = this.aq_int + 1;
			this.a_void_int_int_byte(this.ap_int, dY_int, (byte) 64);
			this.ab_boolean = true;
		} else {
			dY_int = this.aq_int;
		}
	}

	private void bk_void() {
		this.ct_void();
	}

	private void d_void_int_int_int(int integer1, int integer2, int integer3) {
		int var4 = this.T_int << 1;
		a_byte_Array[var4] = (byte) integer1;
		a_byte_Array[var4 + 1] = (byte) integer2;
		c_byte_Array[this.T_int] = (byte) integer3;
		b_byte_Array[this.T_int] = 0;
		this.T_int = this.T_int + 1 & 7;
	}

	private void bl_void() {
		this.ao_int--;
		this.bd_int++;
		if (this.ao_int >= 0) {
			this.cg_void();
			this.n_byte = i_byte_Array[8];
			this.B_void();
			this.aS_int = 0;
			this.aT_int = 0;
			this.j_byte = this.k_byte = 0;
		} else {
			l_byte = 12;
		}
	}

	private void r_void_int(int integer) {
		if (integer >= 0) {
			byte var2 = q_byte_Array[integer];
			byte var3 = r_byte_Array[integer];
			int var4 = a_int_2d_Array[var2][var3] & 0xFF;
			int var5;
			if (((var5 = a_int_2d_Array[var2][var3] >> 8) & 240) == 0) {
				if (var4 != 7 || (var5 & 0xFF00) >> 8 != integer) {
					System.out.println("!!!!!!!!!!!!!! door missing");//official line
				}

				int var6 = var5 & 15;
				if (--var6 == 0) {
					var5 = var5 & -241 | 16;
					this.a_void_int_int_int_int_int(var2, var3 - 1, 1, 0, 1);
					this.a_void_int_int_int_int_int(var2, var3 - 1, -1, 0, 1);
					int var7 = a_int_2d_Array[var2][var3 - 1] >> 8 | 512;
					a_int_2d_Array[var2][var3 - 1] = var7 << 8 | a_int_2d_Array[var2][var3 - 1] & 0xFF;
					c_byte_2d_Array[var2][var3] = 24;
				} else {
					var5 = var5 & -16 | var6;
				}

				a_int_2d_Array[var2][var3] = var5 << 8 | var4;
				this.C_void_int(8);
			}
		}
	}

	private static void i_void_int_int(int integer1, int integer2) {
		int var2;
		if (((var2 = a_int_2d_Array[integer1][integer2] >> 8) & 240) == 0) {
			var2 |= 16;
			a_int_2d_Array[integer1][integer2] = var2 << 8 | 7;
			c_byte_2d_Array[integer1][integer2] = 24;
		}
	}

	private void j_void_int_int(int integer1, int integer2) {
		int var3 = a_int_2d_Array[integer1][integer2] >> 8;
		if ((a_int_2d_Array[integer1][integer2] & 0xFF) == 7) {
			if ((var3 & 240) != 0) {
				if (a_byte_2d_Array[integer1][integer2] != 32) {
					this.C_void_int(14);
					var3 &= -241;
					a_int_2d_Array[integer1][integer2] = var3 << 8 | 7;
					this.a_void_int_int_int_int_int(integer1, integer2 - 1, 1, 0, 0);
					this.a_void_int_int_int_int_int(integer1, integer2 - 1, -1, 0, 0);
					if (this.d_boolean_int_int(integer1, integer2)) {
						this.b_long = 0L;
						this.bi_int = 0;
						this.a_void_int_int_int(i_byte_Array[8], 48, 0);
						this.C_void_int(2);
					} else {
						switch (a_byte_2d_Array[integer1][integer2]) {
						case 0:
						case 1:
						case 19:
						case 43:
						case 45:
							a_byte_2d_Array[integer1][integer2] = -1;
							this.b_void_int_int(integer1, integer2);
							this.p_void_int_int(integer1, integer2);
						}
					}

					c_byte_2d_Array[integer1][integer2] = 24;
				}
			}
		}
	}

	private void s_void_int(int integer) {
		if (integer >= 0) {
			this.j_void_int_int(q_byte_Array[integer], r_byte_Array[integer]);
		}
	}

	private void bm_void() {
		int var1 = (this.aS_int & 16384) == 0 ? 0 : 3;
		g var2 = a_g_Array[var1];
		int var3 = -1;
		boolean var4 = true;
		boolean var5 = false;
		boolean var6;
		if (var6 = var2.a_boolean()) {
			this.aS_int &= -8193;
		}

		label220: {
			int var15;
			if (var1 == 3) {
				if (!var6) {
					break label220;
				}

				this.aS_int &= -18433;
				var15 = this.f_int();
			} else {
				label215: {
					byte var10000;
					switch (var2.f_int) {
					case 0:
						var5 = true;
						var15 = 0;
						break label215;
					case 1:
					case 3:
						if (var6) {
							var3 = 0 + (this.aS_int & 7) - 1;
						}

						var5 = true;
						break label220;
					case 2:
						var5 = true;
						var15 = 2;
						break label215;
					case 4:
					case 6:
						if (!this.l_boolean) {
							break label220;
						}

						var15 = var2.f_int;
						break label215;
					case 5:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 24;
						break label215;
					case 7:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 25;
						break label215;
					case 8:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 26;
						break label215;
					case 9:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 27;
						break label215;
					case 10:
						if (!var6) {
							this.b_long = 40L;
							break label220;
						}

						this.aS_int &= -2049;
						var15 = this.f_int();
						break label215;
					case 11:
						if (a_byte_2d_Array[this.aP_int][this.aQ_int - 1] != -1) {
							if (var6 && a_byte_2d_Array[this.aP_int][this.aQ_int - 1] != -1) {
								this.b_long = 0L;
								this.a_void_int_int_int(i_byte_Array[8], 32, 0);
							}
							break label220;
						}

						var10000 = 0;
						break;
					case 12:
						if (this.bl_int < 160) {
							this.bl_int += 12;
						}
						break label220;
					case 13:
					case 14:
					case 15:
					case 16:
					case 28:
					case 29:
						if (!var6) {
							if ((this.aS_int & 8192) == 0 && var2.g_int == 2 && var2.h_int == 0) {
								int var11 = this.aP_int - g_byte_Array[this.aS_int & 7];
								int var14 = this.aQ_int - g_byte_Array[(this.aS_int & 7) + 8];
								if (i_byte_Array[9] >= 8 && var2.g_int == 2 && var2.h_int == 0) {
									this.d_void_int_int_int(var11, var14, -1);
								}

								this.f_void_int_int(var11, var14);
								this.j_byte = 0;
								W_int = 0;
							}
							break label220;
						}

						W_int = 0;
						this.k_byte = 0;
						this.aR_int = 0;
						var10000 = 0;
						break;
					case 17:
					case 18:
						if (var6) {
							var3 = 0 + (this.aS_int & 7) - 1;
							this.aR_int = 0;
						} else if (var2.g_int > 0 && this.aA_int != -1) {
							int var10 = (this.aS_int & 7) == 2 ? this.aP_int + 1 : this.aP_int - 1;
							int var12 = a_int_2d_Array[var10][this.aQ_int] >> 8;
							int var9 = a_int_2d_Array[var10][this.aQ_int] & 0xFF;
							var12 |= 256;
							if (var9 == 9) {
								this.aU_int--;
							} else {
								this.aV_int--;
							}

							a_int_2d_Array[var10][this.aQ_int] = var12 << 8 | var9;
							this.r_void_int(var12 & 0xFF);
							this.aA_int = this.aC_int = -1;
						}
						break label220;
					case 19:
						if (var6) {
							var4 = false;
							this.bl_void();
						}
						break label220;
					case 20:
					case 21:
					case 22:
					case 23:
					case 30:
					case 31:
					case 32:
					case 33:
						if (var6) {
							var4 = false;
							W_int = 0;
						}
						break label220;
					case 24:
						if (!this.l_boolean) {
							break label220;
						}

						var15 = 5;
						break label215;
					case 25:
						if (!this.l_boolean) {
							break label220;
						}

						var15 = 7;
						break label215;
					case 26:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 8;
						break label215;
					case 27:
						if (this.l_boolean) {
							break label220;
						}

						var15 = 9;
						break label215;
					case 34:
						var5 = true;
						var15 = 34;
						break label215;
					case 35:
						var5 = true;
						var15 = 35;
						break label215;
					case 36:
					case 37:
					case 38:
					case 39:
						if (!var6) {
							break label220;
						}

						var10000 = 4;
						break;
					case 40:
					case 48:
						this.aR_int = 0;
						this.j_byte = this.k_byte = 0;
						if (var2.h_int == 0) {
							if (var2.g_int == (var2.f_int == 40 ? 12 : 6)) {
								this.C_void_int(4);
							}

							if (var2.g_int == (var2.f_int == 40 ? 13 : 6)) {
								this.bQ_void();
							}
						}

						if (var2.a_boolean()) {
							this.j_long = System.currentTimeMillis();
							var3 = 0 + (this.aS_int & 7) - 1;
							this.aA_int = this.aB_int = this.aC_int = -1;
						}
						break label220;
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
					case 46:
						if (var6) {
							var3 = 0 + (this.aS_int & 7) - 1;
							this.k_byte = this.j_byte = 0;
							this.aR_int = 0;
							W_int = 0;
						}
						break label220;
					case 47:
						this.aR_int = 0;
						this.j_byte = this.k_byte = 0;
						if ((aN_int & 1) == 0) {
							int var7 = this.aP_int - 2 + aN_int % 5;
							int var8 = this.aQ_int - 2 + aN_int % 3;
							if (var7 == this.aP_int && (var8 == this.aQ_int || var8 == this.aQ_int - 1)) {
								var7 += (aN_int >> 1 & 1) == 0 ? 1 : -1;
							}

							this.d_void_int_int_int(var7, var8, aN_int * 3 % 5);
						}

						if (var6) {
							var3 = 0 + (this.aS_int & 7) - 1;
							this.aA_int = this.aB_int = this.aC_int = -1;
						}
						break label220;
					default:
						var10000 = 36;
					}

					var15 = var10000 + (this.aS_int & 7) - 1;
				}
			}

			var3 = var15;
		}

		i var16;
		int var10001;
		if (var5) {
			var16 = this;
			var10001 = this.am_int - 1;
		} else {
			var16 = this;
			var10001 = 70;
		}

		var16.am_int = var10001;
		if (var3 != -1) {
			this.n_void_int(var3);
		}

		if (var4) {
			var2.b_void();
		}

		this.b_int = this.b_int > 0 ? --this.b_int : 0;
	}

	private int f_int() {
		int var1 = 0;
		if (this.n_byte <= 0) {
			this.C_void_int(2);
			var1 = 12;
			this.aW_int = 80;
		} else {
			var1 = 0 + (this.aS_int & 7) - 1;
			this.aS_int = this.aS_int & -113 | 0;
			this.b_long = 40L;
		}

		this.k_byte = 0;
		return var1;
	}

	private static void t_void_int(int integer) {
		if (k_boolean) {
			a_GloftDIRU.a_Display.vibrate(integer);
		}
	}

	private void bn_void() {
		if (this.o_byte <= 0) {
			int var1 = this.bi_int > 0 ? 1 : -1;
			this.bi_int -= var1;
			if (this.bi_int != 0) {
				if (a_byte_2d_Array[this.bg_int][this.bh_int] == 48) {
					int var2 = b_int_2d_Array[this.bg_int][this.bh_int];
					int var3 = this.bh_int + ((var2 & 8) == 0 ? -1 : 1);
					if (a_byte_2d_Array[this.bg_int + var1][var3] >= 0) {
						int var10000 = this.aP_int;

						while (true) {
							int var4 = var10000 - var1;
							if (a_byte_2d_Array[var4][this.aQ_int] != 32) {
								this.bi_int = 0;
								return;
							}

							a_byte_2d_Array[var4][this.aQ_int] = -1;
							var10000 = var4;
						}
					}

					a_byte_2d_Array[this.bg_int + var1][var3] = a_byte_2d_Array[this.bg_int][var3];
					a_byte_2d_Array[this.bg_int][var3] = -1;
					b_int_2d_Array[this.bg_int + var1][var3] = b_int_2d_Array[this.bg_int][var3];
					b_byte_2d_Array[this.bg_int][var3] = this.o_byte;
				}

				a_byte_2d_Array[this.bg_int + var1][this.bh_int] = a_byte_2d_Array[this.bg_int][this.bh_int];
				a_byte_2d_Array[this.bg_int][this.bh_int] = -1;
				this.b_void_int_int(this.bg_int, this.bh_int);
				this.bg_int += var1;
				b_int_2d_Array[this.bg_int][this.bh_int] = this.be_int | -2147483648;
				this.o_byte = 18;
				b_byte_2d_Array[this.bg_int][this.bh_int] = this.o_byte;
			} else {
				if (a_byte_2d_Array[this.bg_int][this.bh_int] == 48) {
					int var5 = b_int_2d_Array[this.bg_int][this.bh_int];
					int var6 = this.bh_int + ((var5 & 8) == 0 ? -1 : 1);
					b_byte_2d_Array[this.bg_int][var6] = 0;
				} else {
					b_int_2d_Array[this.bg_int][this.bh_int] = this.bf_int;
				}

				b_byte_2d_Array[this.bg_int][this.bh_int] = 0;
				this.bf_int = -1;
				this.c_void_int_int(this.bg_int, this.bh_int);
			}

			q_void_int_int(this.bg_int - var1, this.bh_int);
		} else {
			this.o_byte = (byte) (this.o_byte - 6);
			b_byte_2d_Array[this.bg_int][this.bh_int] = this.o_byte;
			if ((this.bi_int == 1 || this.bi_int == -1) && this.o_byte <= 6 && (this.aS_int & 112) == 0) {
				this.n_void_int((this.aS_int & 7) == 4 ? 23 : 21);
			}
		}
	}

	private void bo_void() {
		int var1;
		i var10000;
		int var10001;
		if ((var1 = aN_int % 89) < 15) {
			var10000 = this;
			var10001 = 0;
		} else if (var1 < 45) {
			var10000 = this;
			var10001 = 48 * (var1 - 15) / 30;
		} else if (var1 < 60) {
			var10000 = this;
			var10001 = 48;
		} else {
			var10000 = this;
			var10001 = 48 - 48 * (var1 - 60) / 30;
		}

		var10000.aI_int = var10001;
		this.aJ_int = this.aI_int > 0 ? (this.aI_int - 1) / 24 + 2 : 1;
		if ((var1 = aN_int % 44) < 7) {
			var10000 = this;
			var10001 = 0;
		} else if (var1 < 22) {
			var10000 = this;
			var10001 = 48 * (var1 - 7) / 15;
		} else if (var1 < 30) {
			var10000 = this;
			var10001 = 48;
		} else {
			var10000 = this;
			var10001 = 48 - 48 * (var1 - 30) / 15;
		}

		var10000.aK_int = var10001;
		this.aL_int = this.aK_int > 0 ? (this.aK_int - 1) / 24 + 2 : 1;
	}

	private void bp_void() {
		int var1 = k_byte_Array[this.ax_int << 1] - this.aP_int;
		int var2 = k_byte_Array[(this.ax_int << 1) + 1] - this.aQ_int;
		if (this.i_byte == 2 && this.ax_int == 2) {
			var1 = 10;
			var2 = -8;
		}

		i var10000;
		byte var10001;
		if (var2 == 0) {
			if (var1 < 0) {
				var10000 = this;
				var10001 = 12;
			} else {
				var10000 = this;
				var10001 = 4;
			}
		} else if (var1 == 0) {
			if (var2 < 0) {
				var10000 = this;
				var10001 = 0;
			} else {
				var10000 = this;
				var10001 = 8;
			}
		} else {
			int var3;
			if ((var3 = var1 * 128 / var2) > 0) {
				if (var3 < 128) {
					if (var1 > 0) {
						var10000 = this;
						var10001 = 7;
					} else {
						var10000 = this;
						var10001 = 15;
					}
				} else if (var3 > 128) {
					if (var1 > 0) {
						var10000 = this;
						var10001 = 5;
					} else {
						var10000 = this;
						var10001 = 13;
					}
				} else if (var1 > 0) {
					var10000 = this;
					var10001 = 6;
				} else {
					var10000 = this;
					var10001 = 14;
				}
			} else if (var3 > -128) {
				if (var1 < 0) {
					var10000 = this;
					var10001 = 9;
				} else {
					var10000 = this;
					var10001 = 1;
				}
			} else if (var3 < -128) {
				if (var1 < 0) {
					var10000 = this;
					var10001 = 11;
				} else {
					var10000 = this;
					var10001 = 3;
				}
			} else if (var1 < 0) {
				var10000 = this;
				var10001 = 10;
			} else {
				var10000 = this;
				var10001 = 2;
			}
		}

		var10000.ac_int = var10001;
	}

	private void bq_void() {
		switch (this.i_byte) {
		case 1:
			this.bz_void();
			return;
		case 2:
			this.bA_void();
			this.br_void();
			return;
		case 3:
			this.by_void();
			return;
		case 4:
			this.bu_void();
			return;
		case 5:
			this.bs_void();
		}
	}

	private void br_void() {
		if (this.d_boolean_int_int(61, 3) && this.aR_int == 6) {
			this.d_void_int_int_int(this.aP_int, this.aQ_int, 5);
			this.c_boolean = false;
		}

		if (this.a_c == null && (this.d_boolean_int_int(60, 3) || this.d_boolean_int_int(61, 3))) {
			this.b_void_boolean(true);
			this.M_boolean = true;
			this.cs_void();
			this.A_void();
			this.ap_int = 0;
			this.aq_int = 0;
			this.t_void();
		}

		if (this.aD_int == 2) {
			a_int_2d_Array[11][50] = -1;
		}
	}

	private void k_void_int_int(int integer1, int integer2) {
		for (int var3 = -1; var3 < 2; var3++) {
			for (int var4 = -1; var4 < 2; var4++) {
				int var5 = (this.ar_int + integer1) / 24 + var4;
				int var6 = (this.as_int + integer2) / 24 + var3;
				if (this.d_boolean_int_int(var5, var6)) {
					this.a_void_int_int_int(1, 48, 0);
				}
			}
		}
	}

	private void bs_void() {
		g var1 = a_g_Array[5];
		g var9;
		if (this.ad_int == 12) {
			if (this.ae_int++ > 100) {
				this.ad_int = 15;
				this.p_void_int_int(11, 11);
			} else {
				this.a_h.b_void_int(7);
			}

			var9 = var1;
		} else {
			if (this.ad_int == -1) {
				if (this.aP_int * 24 >= 360) {
					this.ad_int = 10;
					var1.a_void_int(10);
					return;
				}

				return;
			}

			if (this.ad_int == 15 || this.ad_int == -1) {
				return;
			}

			int var2 = -1;
			int var3 = this.aP_int * 24 + 12;
			int var4 = this.aQ_int * 24;
			int var5 = this.ai_int + 24;
			if (this.ad_int == 13) {
				var2 = 13;
				if (var3 > var5) {
					this.ad_boolean = true;
				}
			}

			int var6 = this.af_int > 0 && aN_int % this.af_int == 0 ? 2 : 1;
			if (this.ad_int == 6 || this.ad_int == 7) {
				var6 = (aN_int & 11) == 0 ? 2 : var6;
			}

			if (!this.ac_boolean && (this.ad_int == 0 || this.ad_int == 1)) {
				i var10;
				int var10001;
				if (this.ad_int == 0) {
					this.dg_int = 36;
					this.dg_int = ~this.dg_int;
					var10 = this;
					var10001 = this.dg_int + 1;
				} else {
					var10 = this;
					var10001 = 36;
				}

				var10.dg_int = var10001;
				if (var4 < 504 && (var3 == var5 + this.dg_int || aN_int % 76 == 0)) {
					this.ac_boolean = true;
				}
			}

			while (var6-- > 0) {
				label300: {
					switch (this.ad_int) {
					case 0:
						if (var4 >= 504 && var5 > 360) {
							if (var3 < var5) {
								var2 = 6;
								this.ad_int = 6;
							} else {
								this.ai_int--;
							}
						} else if (this.ac_boolean) {
							var2 = 2;
							this.ad_int = 2;
						} else if (var5 <= 360) {
							var2 = 1;
							this.ad_int = 1;
						} else {
							this.ai_int--;
						}
						break label300;
					case 1:
						if (var4 >= 504 && var5 < 504) {
							if (var3 < var5) {
								this.ai_int++;
							} else {
								var2 = 7;
								this.ad_int = 7;
							}
						} else if (this.ac_boolean) {
							var2 = 3;
							this.ad_int = 3;
						} else if (var5 >= 504) {
							var2 = 0;
							this.ad_int = 0;
						} else {
							this.ai_int++;
						}
						break label300;
					case 2:
						if (var1.g_int == 5 && var1.h_int == 0) {
							this.bj_int = 30;
						}

						if (var1.a_boolean()) {
							var2 = 10;
							this.ad_int = 10;
							this.ac_boolean = false;
							this.dg_int = 0;
						}

						if (var1.g_int < 7 || var4 >= 504 || var3 != var5 + this.dg_int) {
							break label300;
						}
						break;
					case 3:
						if (var1.g_int == 5 && var1.h_int == 0) {
							this.bj_int = 30;
						}

						if (var1.a_boolean()) {
							var2 = 11;
							this.ad_int = 11;
							this.ac_boolean = false;
							this.dg_int = 0;
						}

						if (var1.g_int < 7 || var4 >= 504 || var3 != var5 + this.dg_int) {
							break label300;
						}
						break;
					case 4:
					case 5:
						if (var1.a_boolean()) {
							this.ad_int = var2 = this.ad_int == 4 ? 0 : 1;
						}

						this.ac_boolean = false;
						this.dg_int = 0;
						break label300;
					case 6:
						if (var4 >= 504) {
							if (var3 >= var5 - 48) {
								var2 = 8;
								this.ad_int = 8;
							} else {
								this.ai_int -= 2;
							}
						} else if (var5 >= 360) {
							var2 = 0;
							this.ad_int = 0;
						}
						break label300;
					case 7:
						if (var4 >= 504) {
							if (var3 <= var5 + 48) {
								var2 = 9;
								this.ad_int = 9;
							} else {
								this.ai_int += 2;
							}
						} else if (var5 <= 504) {
							var2 = 1;
							this.ad_int = 1;
						}
						break label300;
					case 8:
						if (var1.a_boolean()) {
							var2 = 10;
							this.ad_int = 10;
						}

						if (var1.g_int < 4 || var4 < 504 || var3 < var5 - 48 || var3 > var5) {
							break label300;
						}
						break;
					case 9:
						if (var1.a_boolean()) {
							var2 = 11;
							this.ad_int = 11;
						}

						if (var1.g_int < 4 || var4 < 504 || var3 < var5 || var3 > var5 + 48) {
							break label300;
						}
						break;
					case 10:
					case 11:
						label349: {
							i var12;
							byte var14;
							if (var3 > var5 && var5 < 504) {
								var12 = this;
								var14 = 1;
							} else {
								if (var3 >= var5 || var5 <= 360) {
									break label349;
								}

								var12 = this;
								var14 = 0;
							}

							var2 = var14;
							var12.ad_int = var14;
						}

						this.ac_boolean = false;
						this.dg_int = 0;
					case 12:
					default:
						break label300;
					case 13:
						if (var1.a_boolean()) {
							var2 = 0;
							this.ad_int = 0;
							this.ad_boolean = false;
						} else if (this.ad_boolean) {
							var1.b_void();
						}
						break label300;
					}

					this.a_void_int_int_int(1, 48, 0);
				}

				if (var4 >= 504 && var3 >= var5 - 24 && var3 <= var5 - 24) {
					this.a_void_int_int_int(1, 48, h_byte_Array[this.aS_int & 7]);
				}
			}

			if ((this.ad_int == 8 || this.ad_int == 9) && var1.g_int == 5) {
				this.bw_void();
			}

			if (this.ad_int != 6 && this.ad_int != 7) {
				for (int var7 = 21; var7 < 23; var7++) {
					for (int var8 = var5 / 24 - 1; var8 < var5 / 24 - 2 + 4; var8++) {
						if (a_byte_2d_Array[var8][var7] == 0) {
							label214: if ((b_int_2d_Array[var8][var7] & 7) == 3 && this.ad_int != 13) {
								this.af_int--;
								i var13;
								byte var15;
								switch (this.ad_int) {
								case 0:
								case 2:
								case 4:
								case 8:
								case 10:
									var13 = this;
									var15 = 4;
									break;
								case 1:
								case 3:
								case 5:
								case 9:
								case 11:
									var13 = this;
									var15 = 5;
									break;
								case 6:
								case 7:
								default:
									break label214;
								}

								var2 = var15;
								var13.ad_int = var15;
							}

							a_byte_2d_Array[var8][var7] = -1;
							this.b_void_int_int(var8, var7);
							a_byte_2d_Array[var8][var7] = 30;
							c_byte_2d_Array[var8][var7] = 24;
							b_int_2d_Array[var8][var7] = 4;
							this.C_void_int(7);
						}
					}
				}
			}

			if (this.af_int <= 0) {
				this.ad_int = 12;
				this.ae_int = 0;
				var2 = 12;
			}

			if (var2 != -1) {
				var1.a_void_int(var2);
				return;
			}

			var9 = var1;
		}

		var9.b_void();
	}

	private void bt_void() {
		int var1 = this.g_int();
		if (this.aP_int == var1 || this.aP_int == var1 + 1) {
			g var2;
			int var3 = (var2 = a_g_Array[5]).b_int + -40;
			int var4 = var2.b_int + 256;
			int var5 = (var2.a_a.b_short_Array[var2.f_int] + var2.g_int) * 5;
			var5 = (var2.a_a.f_byte_Array[var5 + 3] << 0) * 1 / 1;
			var3 -= var5;
			var4 -= var5;
			int var6 = a_g_Array[0].b_int;
			if (a_g_Array[0].b_int > var3 && var6 < var4 && !this.h_boolean) {
				this.a_void_int_int_int(1, 48, this.aP_int == var1 ? 4 : 2);
			}
		}
	}

	private static void l_void_int_int(int integer1, int integer2) {
		if (integer1 >= 0 && integer2 >= 0) {
			a_byte_2d_Array[integer1][integer2] = -1;
			a_byte_2d_Array[integer1 + 1][integer2] = -1;
		}
	}

	private static void m_void_int_int(int integer1, int integer2) {
		if (integer1 >= 0 && integer2 >= 0) {
			a_byte_2d_Array[integer1][integer2] = 50;
			a_byte_2d_Array[integer1 + 1][integer2] = 50;
		}
	}

	private boolean c_boolean_int_int(int integer1, int integer2) {
		boolean var3 = false;

		for (int var4 = integer1; var4 <= integer1 + 1; var4++) {
			for (int var5 = integer2; var5 >= integer2 - 1; var5--) {
				if (a_byte_2d_Array[var4][var5] == 0) {
					this.h_void_int_int(var4, var5);
					q_void_int_int(var4, var5);
					a_byte_2d_Array[var4][var5] = -1;
					this.b_void_int_int(var4, var5);
					var3 = true;
				}
			}
		}

		return var3;
	}

	private int g_int() {
		int var1 = this.ag_int > 0 ? 1 : 0;
		return 10 + this.ag_int * (2 + var1);
	}

	private int h_int() {
		g var1;
		int var2 = (var1 = a_g_Array[5]).b_int + -40;
		int var3 = (var1.a_a.b_short_Array[var1.f_int] + var1.g_int) * 5;
		var3 = (var1.a_a.f_byte_Array[var3 + 3] << 0) * 1 / 1;
		int var4 = var2 - var3;
		var2 = (var4) + this.as_int;
		return this.aw_int * var2 / (this.aw_int * 24);
	}

	private boolean d_boolean() {
		int var1 = this.g_int();
		int var2 = this.h_int();
		boolean var3 = false;

		for (int var4 = var1; var4 <= var1 + 1; var4++) {
			for (int var5 = var2; var5 <= 10; var5++) {
				if (a_byte_2d_Array[var4][var5] == 0) {
					this.h_void_int_int(var4, var5);
					q_void_int_int(var4, var5);
					a_byte_2d_Array[var4][var5] = -1;
					this.b_void_int_int(var4, var5);
					var3 = true;
				}
			}
		}

		return var3;
	}

	private int i_int() {
		int var1;
		int var2 = (var1 = this.aP_int - 10) / 3;
		if (var1 == var2 * 3 + 2) {
			var2 += aN_int % 50 / 25;
		}

		return var2;
	}

	private void bu_void() {
		if (this.ad_int == 5) {
			if (this.Y_boolean) {
				return;
			}
			this.Y_boolean = true;
		}
		g g2 = i.a_g_Array[5];
		++this.ae_int;
		int integer3 = -1;
		g g4 = i.a_g_Array[4];
		int integer5 = -1;
		int integer6 = this.g_int();
		if (i.a_byte_2d_Array[this.E_int][2] == -1) {
			i.a_byte_2d_Array[this.E_int][2] = 31;
		}
		if (i.a_byte_2d_Array[this.F_int][2] == -1) {
			i.a_byte_2d_Array[this.F_int][2] = 31;
		}
		switch (this.ad_int) {
		case 0: {
			if (this.aP_int >= 10) {
				this.ad_int = 6;
				this.ae_int = 0;
				break;
			}
			break;
		}
		case 6: {
			if (this.ae_int > 10) {
				this.ad_int = 1;
				integer3 = 2;
				this.ae_int = 0;
				break;
			}
			break;
		}
		case 1: {
			if (this.ae_int > 40) {
				this.ad_int = 2;
				this.ae_int = 0;
				break;
			}
			if (this.ae_int > 20) {
				this.c_boolean_int_int(integer6, 8);
				m_void_int_int(integer6, 8);
				this.B_int = integer6;
				this.C_int = 8;
				break;
			}
			break;
		}
		case 7: {
			l_void_int_int(this.B_int, this.C_int);
			this.B_int = -1;
			this.C_int = -1;
			if (this.ae_int > 80) {
				this.ad_int = 8;
				this.bS_void();
			}
			if ((this.ae_int & 0x6F) == 0x1) {
				this.C_void_int(7);
				break;
			}
			break;
		}
		case 3: {
			if (this.ae_int <= 40) {
				break;
			}
			if (this.af_int <= 0) {
				this.ad_int = 7;
				this.ae_int = 0;
				break;
			}
			if (this.H_int == 10) {
				this.ad_int = 9;
				this.ae_int = 0;
				break;
			}
			if (this.H_int == 2 || this.H_int == 1) {
				this.ad_int = 4;
				this.ae_int = 0;
				integer3 = 2;
				break;
			}
			break;
		}
		case 2: {
			if (this.c_boolean_int_int(integer6, 8)) {
				--this.af_int;
				this.H_int = this.ad_int;
				l_void_int_int(this.B_int, this.C_int);
				this.B_int = -1;
				this.C_int = -1;
				this.H_int = this.ad_int;
				this.ad_int = 3;
				integer3 = 3;
				this.C_void_int(10);
			}
			if (this.ae_int > 15 && g2.f_int != 6) {
				integer3 = 6;
			}
			if (this.ae_int > 30) {
				this.ad_int = 4;
				this.ae_int = 0;
				integer3 = 0;
				l_void_int_int(this.B_int, this.C_int);
				this.B_int = -1;
				this.C_int = -1;
				break;
			}
			break;
		}
		case 4: {
			int integer8 = (this.af_int <= 1) ? 5 : 10;
			Label_0631: {
				int n2;
				if (this.ae_int >= integer8) {
					this.ad_int = 5;
					this.ae_int = 0;
					n2 = 4;
				} else {
					if (this.ae_int <= integer8 >> 1 || g2.f_int == 1) {
						break Label_0631;
					}
					n2 = 1;
				}
				integer3 = n2;
			}
			this.d_boolean();
			this.bt_void();
			break;
		}
		case 5: {
			int integer9 = g2.b_int - 40;
			int integer10 = (g2.a_a.b_short_Array[g2.f_int] + g2.g_int) * 5;
			integer10 = (g2.a_a.f_byte_Array[integer10 + 3] << 0) * 1 / 1;
			if ((integer9 -= integer10) <= 72 - this.as_int + 40) {
				this.I_int = 0;
				this.bw_void();
				this.ad_int = 10;
				this.B_int = integer6;
				this.C_int = 4;
				m_void_int_int(this.B_int, this.C_int);
			}
			this.d_boolean();
			this.bt_void();
			break;
		}
		case 9: {
			this.ae_int -= 2;
			this.bt_void();
			int integer11 = g2.b_int - 40;
			int integer12 = (g2.a_a.b_short_Array[g2.f_int] + g2.g_int) * 5;
			integer12 = (g2.a_a.f_byte_Array[integer12 + 3] << 0) * 1 / 1;
			if ((integer11 -= integer12) >= 240 - this.as_int + 40) {
				this.ad_int = 6;
				this.ae_int = 0;
				this.ag_int = this.i_int();
				break;
			}
			break;
		}
		case 10: {
			--this.ae_int;
			this.bt_void();
			++this.A_int;
			if (this.A_int == 28) {
				integer3 = 7;
			}
			if (this.A_int >= 50) {
				this.A_int = 0;
				this.ad_int = 11;
				l_void_int_int(this.B_int, this.C_int);
				this.B_int = -1;
				this.C_int = -1;
				integer3 = 8;
				integer5 = 2;
				this.i_boolean = true;
				break;
			}
			break;
		}
		case 11: {
			--this.ae_int;
			++this.A_int;
			if (this.A_int >= 12) {
				this.A_int = 0;
				this.ad_int = 9;
				integer3 = 4;
				this.h_boolean = false;
				this.i_boolean = false;
				break;
			}
			if (!this.h_boolean) {
				this.bv_void();
				break;
			}
			break;
		}
		}
		if (integer3 == -1) {
			g2.b_void();
		} else {
			g2.a_void_int(integer3);
		}
		if (this.i_boolean) {
			if (integer5 == -1) {
				g4.b_void();
				return;
			}
			g4.a_void_int(integer5);
		}
	}

	private void bv_void() {
		int var1 = this.g_int();
		if (this.aQ_int == 4 && this.aP_int >= var1 - 3 && this.aP_int <= var1 + 4) {
			this.a_void_int_int_int(1, 64, this.aP_int == var1 ? 4 : 2);
			this.h_boolean = true;
		}
	}

	private void bw_void() {
		this.bj_int = 30;
		if (a_byte_2d_Array[this.E_int][this.G_int] == -1) {
			a_byte_2d_Array[this.E_int][this.D_int] = 0;
			q_void_int_int(this.E_int, this.D_int);
		}

		if (a_byte_2d_Array[this.F_int][this.G_int] == -1) {
			a_byte_2d_Array[this.F_int][this.D_int] = 0;
			q_void_int_int(this.F_int, this.D_int);
		}
	}

	private void bx_void() {
		this.ad_int = -1;
		this.af_int = 5;
	}

	private void by_void() {
		g var1 = a_g_Array[5];
		int var2 = this.bE_int;
		int var3 = this.bF_int;
		int var4 = this.aP_int - 8;
		int var5 = this.aP_int + 8;
		int var6 = this.aQ_int + 8;
		int var7 = this.aQ_int - 8;

		for (int var8 = 15; var8 <= 22; var8++) {
			for (int var9 = 14; var9 <= 21; var9++) {
				if ((var9 <= var4 || var9 >= var5 || var8 <= var6 || var8 >= var7)
						&& a_byte_2d_Array[var9][var8] == 44) {
					this.bE_int = var9;
					this.bF_int = var8;
					this.bK_void();
				}
			}
		}

		this.bE_int = var2;
		this.bF_int = var3;
		if (this.n_byte == 0) {
			this.bx_void();
		}

		g var20;
		if (this.ad_int == 12) {
			if (this.ae_int++ > 100) {
				this.ad_int = 15;
				this.p_void_int_int(11, 11);
			} else {
				this.a_h.b_void_int(7);
			}

			var20 = var1;
		} else {
			if (this.ad_int == -1) {
				if (this.aP_int * 24 >= 336) {
					this.ad_int = 0;
					var1.a_void_int(0);
					return;
				}

				return;
			}

			if (this.ad_int == 15 || this.ad_int == -1) {
				return;
			}

			byte var17 = -1;
			int var18 = this.aP_int * 24 + 12;
			int var10 = this.aQ_int * 24;
			int var11 = this.ah_int + 24;
			if (this.k_long == 0L && this.n_byte != 0) {
				this.k_long = (long) (aN_int + d.getRandomInteger(340, 441));
			}

			int var12 = this.af_int > 0 && aN_int % this.af_int == 0 ? 2 : 1;
			if (this.ad_int == 10 || this.ad_int == 11) {
				var12 = (aN_int & 11) == 0 ? 2 : var12;
			}

			while (var12-- > 0) {
				switch (this.ad_int) {
				case 0:
					if (var11 > 360) {
						var17 = 4;
						this.ad_int = 4;
					} else {
						var17 = 5;
						this.ad_int = 5;
					}
					break;
				case 1:
					if (var11 < 504) {
						var17 = 5;
						this.ad_int = 5;
					} else {
						var17 = 4;
						this.ad_int = 4;
					}
					break;
				case 2:
					if (var1.a_boolean()) {
						if ((long) aN_int > this.k_long) {
							var17 = 13;
							this.ad_int = 13;
						} else {
							var17 = 4;
							this.ad_int = 4;
						}
					}
					break;
				case 3:
					if (var1.a_boolean()) {
						if ((long) aN_int > this.k_long) {
							var17 = 14;
							this.ad_int = 14;
						} else {
							var17 = 5;
							this.ad_int = 5;
						}
					}
					break;
				case 4:
					if ((long) aN_int > this.k_long) {
						var17 = 13;
						this.ad_int = 13;
					} else {
						if (var10 >= 504 && var18 < var11 && this.ah_int - 48 >= 360) {
							var17 = 10;
							this.ad_int = 10;
						}

						if (var11 <= 360) {
							var17 = 5;
							this.ad_int = 5;
						}

						if (this.ad_int == 4) {
							this.ah_int--;
						}
					}
					break;
				case 5:
					if ((long) aN_int > this.k_long) {
						var17 = 14;
						this.ad_int = 14;
					} else {
						if (var10 >= 504 && var18 > var11 && this.ah_int + 48 <= 504) {
							var17 = 11;
							this.ad_int = 11;
						}

						if (var11 >= 504) {
							var17 = 4;
							this.ad_int = 4;
						}

						if (this.ad_int == 5) {
							this.ah_int++;
						}
					}
					break;
				case 6:
				case 7:
				case 13:
				case 14:
					byte var14;
					byte var15;
					byte var16;
					label272: {
						var14 = 0;
						var15 = 0;
						var16 = 0;
						byte var22;
						switch (this.ad_int) {
						case 6:
						case 13:
							var14 = 4;
							var15 = 2;
							var22 = 1;
							break;
						case 7:
						case 14:
							var14 = 5;
							var15 = 1;
							var22 = 2;
							break;
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						default:
							break label272;
						}

						var16 = var22;
					}

					if (var1.g_int == 5 && var1.h_int == 0) {
						i var23;
						byte var10001;
						if (this.ad_int != 13 && this.ad_int != 14) {
							var23 = this;
							var10001 = 10;
						} else {
							var23 = this;
							var10001 = 80;
						}

						var23.bj_int = var10001;
					}

					if (var1.a_boolean()) {
						if (this.ad_int == 13 || this.ad_int == 14) {
							this.l_long = (long) (aN_int + 40);
							this.k_long = (long) (aN_int + d.getRandomInteger(340, 441));
						}

						var17 = var14;
						this.ad_int = var14;
					}

					if (var1.g_int >= 5 && var10 >= 504 && var18 >= var11 - var15 * 24 && var18 <= var11 + var16 * 24) {
						this.a_void_int_int_int(1, 48, 4);
					}
				case 8:
				case 9:
				case 12:
				default:
					break;
				case 10:
					if (var1.a_boolean()) {
						this.bj_int = 10;
						var11 = this.ah_int + 24;
						if ((long) aN_int > this.k_long) {
							var17 = 13;
							this.ad_int = 13;
						} else if (var10 >= 504) {
							if (var18 >= var11 - 48) {
								var17 = 6;
								this.ad_int = 6;
							}
						} else {
							var17 = 4;
							this.ad_int = 4;
						}
					} else {
						this.ah_int -= 2;
					}
					break;
				case 11:
					if (var1.a_boolean()) {
						this.bj_int = 10;
						var11 = this.ah_int + 24;
						if ((long) aN_int > this.k_long) {
							var17 = 14;
							this.ad_int = 14;
						} else if (var10 >= 504) {
							if (var18 <= var11 + 48) {
								var17 = 7;
								this.ad_int = 7;
							}
						} else {
							var17 = 5;
							this.ad_int = 5;
						}
					} else {
						this.ah_int += 2;
					}
				}

				if (var10 >= 504 && var18 >= var11 - 24 && var18 <= var11 + 24) {
					this.a_void_int_int_int(1, 48, h_byte_Array[this.aS_int & 7]);
				}

				if (this.af_int <= 0) {
					this.ad_int = 12;
					this.ae_int = 0;
					return;
				}
			}

			label239: if (this.ce_int == 5) {
				int[] var24;
				byte var26;
				if (this.cf_int <= 0) {
					if (this.af_int <= 2) {
						a_byte_2d_Array[10][16] = 45;
						c_byte_2d_Array[10][16] = 24;
						b_byte_2d_Array[10][16] = 0;
						b_int_2d_Array[10][16] = 0;
					}

					a_byte_2d_Array[26][19] = 45;
					c_byte_2d_Array[26][19] = 24;
					b_byte_2d_Array[26][19] = 0;
					var24 = b_int_2d_Array[26];
					var26 = 19;
				} else {
					a_byte_2d_Array[10][19] = 45;
					c_byte_2d_Array[10][19] = 24;
					b_byte_2d_Array[10][19] = 0;
					b_int_2d_Array[10][19] = 0;
					if (this.af_int > 2) {
						break label239;
					}

					a_byte_2d_Array[26][16] = 45;
					c_byte_2d_Array[26][16] = 24;
					b_byte_2d_Array[26][16] = 0;
					var24 = b_int_2d_Array[26];
					var26 = 16;
				}

				var24[var26] = 0;
			}

			if (this.ad_int != 10 && this.ad_int != 11) {
				for (int var13 = 21; var13 < 23; var13++) {
					for (int var19 = var11 / 24 - 1; var19 < var11 / 24 - 2 + 4; var19++) {
						if (a_byte_2d_Array[var19][var13] == 9) {
							label222: if ((b_int_2d_Array[var19][var13] & 7) == 3) {
								this.af_int--;
								i var25;
								byte var27;
								switch (this.ad_int) {
								case 0:
								case 2:
								case 4:
								case 6:
									var25 = this;
									var27 = 2;
									break;
								case 1:
								case 3:
								case 5:
								case 7:
									var25 = this;
									var27 = 3;
									break;
								default:
									break label222;
								}

								var17 = var27;
								var25.ad_int = var27;
							}

							a_byte_2d_Array[var19][var13] = -1;
							this.b_void_int_int(var19, var13);
							a_byte_2d_Array[var19][var13] = 30;
							c_byte_2d_Array[var19][var13] = 24;
							b_int_2d_Array[var19][var13] = 4;
							this.C_void_int(7);
						}
					}
				}
			}

			if (var17 != -1) {
				var1.a_void_int(var17);
				return;
			}

			var20 = var1;
		}

		var20.b_void();
	}

	private void bz_void() {
		if (a_byte_2d_Array[18][63] == 0 && b_byte_2d_Array[18][63] <= 0 && this.ab_int == 0) {
			this.bj_int = 120;
			this.ab_int++;
		}

		label60: {
			g var10000;
			byte var10001;
			if (this.ab_int == 3) {
				if (a_g_Array[2].f_int != 0) {
					if (a_g_Array[2].f_int == 1 && a_g_Array[2].a_boolean()) {
						a_g_Array[2].a_void_int(2);
						if (this.aQ_int == this.aw_int - 4) {
							this.aa_int = 817;
						}
					}
					break label60;
				}

				var10000 = a_g_Array[2];
				var10001 = 1;
			} else {
				if (a_g_Array[2].f_int == 0) {
					break label60;
				}

				var10000 = a_g_Array[2];
				var10001 = 0;
			}

			var10000.a_void_int(var10001);
		}

		a_g_Array[2].b_void();
		if (a_g_Array[2].f_int == 2) {
			a_g_Array[1].b_void();
			if (this.bj_int == 10) {
				this.bj_int = 60;
			}

			if (a_g_Array[1].f_int == 0) {
				if ((this.a_c == null || this.aa_int < 46) && this.aa_int < 1704) {
					this.aa_int++;
					int var1 = this.aw_int * 24 - (this.as_int + 320 - 60);
					if (this.aa_int < var1) {
						this.aa_int = var1;
					}
				}

				if (this.aw_int * 24 - this.aa_int <= this.aQ_int * 24 + 18 && this.aP_int < 17) {
					this.a_void_int_int_int(i_byte_Array[8], 64, 1);
					return;
				}
			} else if (a_g_Array[1].a_boolean()) {
				a_g_Array[1].a_void_int(0);
			}
		}
	}

	private void bA_void() {
		if (a_int_2d_Array != null && this.b_boolean() && (a_int_2d_Array[this.aP_int][this.aQ_int] & 0xFF) == 0) {
			int var1;
			if ((var1 = a_int_2d_Array[this.aP_int][this.aQ_int] >> 8) == 13) {
				this.o_boolean = true;
			} else if (var1 == 16) {
				this.p_boolean = true;
			}
		}

		if (!this.q_boolean && this.aR_int <= 0 && this.d_boolean_int_int(46, 7)) {
			this.r_boolean = true;
			this.q_boolean = true;
		}
	}

	public final void c_void() {
		byte var1;
		int var4;
		int var5;
		label58: {
			var1 = (this.aS_int & 4096) == 0 ? this.k_byte : 0;
			int var2 = this.aP_int * 24 + this.aR_int * g_byte_Array[var1];
			var4 = 24 * this.av_int - 240;
			var5 = 24 * this.aw_int - 260;
			i var10000;
			int var10001;
			if (var2 < this.at_int + 96) {
				this.at_int = this.at_int - 96 + var2 >> 1;
				if (this.at_int >= 0) {
					break label58;
				}

				var10000 = this;
				var10001 = 0;
			} else {
				if (var2 <= this.at_int + 120) {
					break label58;
				}

				this.at_int = this.at_int - 120 + var2 >> 1;
				if (this.at_int <= var4) {
					break label58;
				}

				var10000 = this;
				var10001 = var4;
			}

			var10000.at_int = var10001;
		}

		int var6;
		if ((var6 = this.aQ_int * 24 + this.aR_int * g_byte_Array[var1 + 8] + 30) < this.au_int + 96) {
			this.au_int = this.au_int - 96 + var6 >> 1;
			if (this.au_int < 0) {
				this.au_int = 0;
			}
		}

		if (var6 > this.au_int + 170) {
			this.au_int = this.au_int - 170 + var6 >> 1;
			if (this.au_int > var5) {
				this.au_int = var5;
			}
		}

		label45: {
			this.ar_int = this.at_int;
			this.as_int = this.au_int;
			i var7;
			int var9;
			if (this.ar_int < 0) {
				var7 = this;
				var9 = 0;
			} else {
				if (this.ar_int <= var4) {
					break label45;
				}

				var7 = this;
				var9 = var4;
			}

			var7.ar_int = var9;
		}

		i var8;
		i var10;
		int var10002;
		if (this.as_int < 0) {
			var8 = this;
			var10 = this;
			var10002 = 0;
		} else {
			if (this.as_int <= var5) {
				return;
			}

			var8 = this;
			var10 = this;
			var10002 = var5;
		}

		var8.as_int = var10.au_int = var10002;
	}

	private void a_void_int_int_boolean_byte(int integer1, int integer2, boolean boolean3, byte byte4) {
		int var5 = boolean3 ? integer1 + 1 : integer1 - 1;
		int var6 = b_int_2d_Array[integer1][integer2];
		a_byte_2d_Array[var5][integer2] = byte4;
		a_byte_2d_Array[integer1][integer2] = -1;
		b_byte_2d_Array[var5][integer2] = 18;
		int var10000;
		short var10001;
		if (boolean3) {
			var10000 = (var6 & -8 | 2) & -3073;
			var10001 = 1024;
		} else {
			var10000 = (var6 & -8 | 4) & -3073;
			var10001 = 2048;
		}

		var6 = var10000 | var10001;
		b_int_2d_Array[var5][integer2] = var6 & -513 | -2147483648;
		q_void_int_int(var5, integer2);
		this.b_void_int_int(integer1, integer2);
	}

	private void b_void_int_int_byte(int integer1, int integer2, byte byte3) {
		if ((a_int_2d_Array[integer1][integer2] & 0xFF) == byte3) {
			a_int_2d_Array[integer1][integer2] = -1;
			this.b_void_int_int_byte(integer1 - 1, integer2, byte3);
			this.b_void_int_int_byte(integer1 + 1, integer2, byte3);
			this.b_void_int_int_byte(integer1, integer2 - 1, byte3);
			this.b_void_int_int_byte(integer1, integer2 + 1, byte3);
		}
	}

	private boolean a_boolean_int_int_boolean(int integer1, int integer2, boolean boolean3) {
		boolean var4 = false;
		int var5 = this.aS_int;
		int var6 = this.aP_int;
		int var7 = this.aQ_int;
		byte var8 = this.k_byte;
		boolean var9 = this.v_boolean;
		int var10 = this.aX_int;
		int var11 = this.aR_int;
		int var12 = this.aW_int;
		int var10000;
		byte var10001;
		if (integer1 > 0) {
			var10000 = var5 & -8;
			var10001 = 2;
		} else if (integer1 < 0) {
			var10000 = var5 & -8;
			var10001 = 4;
		} else if (integer2 < 0) {
			var10000 = var5 & -8;
			var10001 = 1;
		} else {
			var10000 = var5 & -8;
			var10001 = 3;
		}

		var5 = var10000 | var10001;
		int var13 = var6 + integer1;
		int var14 = var7 + integer2;
		boolean var15 = false;
		boolean var16 = false;
		if (var13 >= 0 && var13 < this.av_int && var14 >= 0 && var14 < this.aw_int) {
			if (e_int_2d_Array != null && e_int_2d_Array[var13][var14] != 0 && i_byte_Array[10] == 0) {
				var15 = false;
				var4 = true;
			}

			label326: {
				boolean var36;
				switch ((byte) (a_int_2d_Array[var13][var14] & 0xFF)) {
				case 1:
					if (!boolean3) {
						this.bj_int = 120;
						this.ab_int++;
						this.b_void_int_int_byte(var13, var14, (byte) 1);
					}
					break label326;
				case 2:
					if (boolean3) {
						break label326;
					}

					label321: {
						label320: {
							var16 = true;
							switch (a_int_2d_Array[var13][var14] >> 8) {
							case 0:
								if (i_byte_Array[9] >= 1) {
									this.ay_int = 7;
									var10001 = 0;
									break label321;
								}

								break;
							case 1:
								if (i_byte_Array[9] >= 2) {
									var10001 = 7;
									break label320;
								}

								break;
							default:
								break label326;
							}

							var10001 = 13;
						}

						this.ay_int = var10001;
						var10001 = 1;
					}

					this.az_int = var10001;
					break label326;
				case 3:
					if (a_int_2d_Array[var13][var14] >> 8 < 3) {
						var15 = true;
						break label326;
					}

					var15 = false;
					var36 = true;
					break;
				case 4:
					int var18;
					if (!boolean3 && (var18 = (a_int_2d_Array[var13][var14] & -256) >> 8) >= this.ax_int) {
						this.u_boolean = true;
						this.ax_int = var18 + 1;
						this.Z_int = aN_int + 13;
					}
					break label326;
				case 5:
					var15 = true;
					if (!boolean3) {
						var9 = true;
						this.au_boolean = true;
					}
				case 6:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				default:
					break label326;
				case 7:
					if ((a_int_2d_Array[var13][var14] >> 8 & 240) >> 4 >= 2) {
						break label326;
					}

					var36 = true;
					break;
				case 19:
					if (boolean3) {
						break label326;
					}

					int var19 = var13 + 3;
					int var20 = var14;

					while (a_byte_2d_Array[var19][var20] != 39) {
						var20--;
					}

					if (!this.j_boolean) {
						this.cn_void();
					}

					this.j_boolean = true;
					this.am_boolean = false;
					if (e_int_2d_Array == null) {
						e_int_2d_Array = new int[this.av_int][this.aw_int];
					}

					this.a_byte_byte_byte_byte_byte((byte) b_int_2d_Array[var19][var20], (byte) var19, (byte) var20,
							(byte) 0);
					this.v_void_int_int(var19, var20);
					var19 = var13;

					while (true) {
						if ((a_int_2d_Array[var19][++var20] & 0xFF) != 19) {
							break label326;
						}

						a_int_2d_Array[var19][var20] = -1;
					}
				case 28:
					if (!boolean3) {
						var9 = true;
						this.au_boolean = false;
					}
					break label326;
				}

				var4 = var36;
			}

			if (!var4) {
				byte var30;
				switch (var30 = a_byte_2d_Array[var13][var14]) {
				case -1:
					label359: {
						boolean var40;
						if (var13 != 0 && var14 != 0 && var13 != this.av_int - 1 && var14 != this.aw_int - 1) {
							if ((integer1 != 0 && a_byte_2d_Array[var13][var7 + 1] == 0
									&& (b_int_2d_Array[var13][var7 + 1] & 7) == 3
									|| this.aI_int >= 24 && (a_byte_2d_Array[var13][var14 - 1] == 28
											&& (b_int_2d_Array[var13][var14 - 1] & 8) == 0
											|| a_byte_2d_Array[var13][var14 + 1] == 28
													&& (b_int_2d_Array[var13][var14 + 1] & 8) == 0)
									|| this.aK_int >= 24 && (a_byte_2d_Array[var13][var14 - 1] == 28
											|| a_byte_2d_Array[var13][var14 + 1] == 28))
									&& !boolean3) {
								var8 = 0;
								break label359;
							}

							var40 = true;
						} else {
							var40 = true;
						}

						var15 = var40;
					}

					var5 &= -9;
					break;
				case 0:
				case 8:
				case 9:
				case 47:
					int var32 = var6 + (integer1 << 1);
					int var33 = var7 + (integer2 << 1);
					if (this.i_byte == 4) {
						int var22 = this.g_int();
						if (var32 == var22 || var32 == var22 + 1) {
							int var23 = this.h_int();
							if (var33 >= var23) {
								var5 |= 8;
								this.n_void_int((var5 & 7) == 2 ? 8 : 9);
								return false;
							}
						}
					}

					var10--;
					int var34 = a_int_2d_Array[var32][var33] & 0xFF;
					int var35 = a_int_2d_Array[var32][var33] >> 8;
					byte var24 = a_byte_2d_Array[var13][var7 + 1];
					if ((var10 < 0 || boolean3) && integer1 != 0 && f_boolean_int_int(var32, var33)
							&& (var34 != 7 || (var35 & 240) != 0)
							&& (var24 != 19 && var24 != 45 && var24 != 49 && var24 != 43
									|| (a_int_2d_Array[var13][var7 + 1] & 0xFF) == 35)) {
						if (!boolean3) {
							this.a_void_int_int_boolean_byte(var13, var14, integer1 > 0, var30);
						}

						var15 = true;
						var5 |= 8;
					} else {
						if (integer1 != 0) {
							var5 |= 8;
						}

						var8 = 0;
						b_int_2d_Array[var13][var14] = b_int_2d_Array[var13][var14] & -8 | 0;
					}
					break;
				case 1:
				case 2:
				case 4:
				case 5:
				case 6:
				case 7:
				case 11:
				case 14:
				case 19:
				case 24:
				case 26:
				case 27:
				case 33:
				case 40:
				case 41:
				case 42:
				case 43:
				case 45:
				case 50:
				case 51:
				case 52:
				case 53:
					var15 = true;
					break;
				case 3:
				case 12:
				case 13:
				case 15:
				case 16:
				case 17:
				case 18:
				case 20:
				case 21:
				case 22:
				case 23:
				case 25:
				case 29:
				case 30:
				case 32:
				case 36:
				case 37:
				case 38:
				case 39:
				case 44:
				case 46:
				default:
					integer1 = 0;
					var15 = false;
					if (this.k_byte == 4 || this.k_byte == 2) {
						this.n_void_int(0 + this.k_byte - 1);
					}
					break;
				case 10:
					if (this.x_byte == 3) {
						if (!boolean3 && b_int_2d_Array[var13][var14] <= 0) {
							b_int_2d_Array[var13][var14] = 1;
						}

						var15 = true;
					}
					break;
				case 28:
					var8 = 0;
					var5 &= -9;
					break;
				case 31:
				case 49:
					var15 = false;
					break;
				case 34:
				case 35:
					var15 = boolean3;
					break;
				case 48:
					int var31 = var6 + (integer1 << 1);
					int var21 = var7 + (integer2 << 1);
					var10--;
					byte var25;
					byte var39;
					if ((b_int_2d_Array[var13][var14] & 8) != 0) {
						var25 = 0;
						var39 = 1;
					} else {
						var25 = -1;
						var39 = 0;
					}

					byte var26 = var39;
					if ((var10 < 0 || boolean3) && integer1 != 0 && a_byte_2d_Array[var31][var21 + var25] < 0
							&& a_byte_2d_Array[var31][var21 + var26] < 0
							&& a_byte_2d_Array[var13][var14 + var26 + 1] >= 0) {
						if (!boolean3) {
							a_byte_2d_Array[var31][var21 + var25] = var30;
							a_byte_2d_Array[var31][var21 + var26] = var30;
							a_byte_2d_Array[var13][var14 + var25] = -1;
							a_byte_2d_Array[var13][var14 + var26] = -1;
							b_int_2d_Array[var31][var21 + var25] = b_int_2d_Array[var13][var14 + var25];
							b_int_2d_Array[var31][var21 + var26] = b_int_2d_Array[var13][var14 + var26] & -16
									| (integer1 > 0 ? 2 : 4);
							b_byte_2d_Array[var31][var21 + var26] = 18;
							c_byte_2d_Array[var31][var21 + var25 - 1] = 48;
							c_byte_2d_Array[var31][var21 + var25 - 1] = 48;
							c_byte_2d_Array[var31][var21 + var25 - 1] = 48;
							q_void_int_int(var31, var21 + var26);
						}

						var15 = true;
						var5 |= 8;
					} else {
						if (integer1 != 0) {
							var5 |= 8;
						}

						var8 = 0;
					}
				}
			}
		} else {
			var15 = true;
		}

		if (!boolean3 && var15 && !var16) {
			this.ay_int = -1;
		}

		if (var15 && var12 == 0) {
			var11 = 18;
			var6 += integer1;
			var7 += integer2;
			if ((var5 & 8) == 0 && !boolean3) {
				this.n_void_int(4 + var8 - 1);
			}
		} else if (integer1 != 0 && !boolean3) {
			var5 |= 8;
		}

		if ((var5 & 8) != 0 && !boolean3) {
			this.n_void_int((var5 & 7) == 2 ? 8 : 9);
		}

		if (!boolean3) {
			this.aS_int = var5;
			this.aP_int = var6;
			this.aQ_int = var7;
			this.k_byte = var8;
			this.v_boolean = var9;
			this.aX_int = var10;
			this.aR_int = var11;
			this.aW_int = var12;
		}

		return var15;
	}

	public static void d_void() {
		l_byte = 3;
	}

	private void bB_void() {
		l_byte = 2;
		U_boolean = true;
		this.a_void_int(1);
		this.B_void();
		if (a_a_Array[18] == null) {
			a_a_Array[18] = a_a_String_int("/ui.f", 3);
		}
	}

	public final void e_void() {
		this.m_long = System.currentTimeMillis() - this.a_long;
		this.ae_boolean = true;
		if ((l_byte == 30 || l_byte == 4) && h.a_boolean()) {
			this.af_boolean = true;
		}

		this.a_h.e_void();
	}

	public final void showNotify() {
		if (this.ae_boolean) {
			this.f_void();
		}
	}

	public final void hideNotify() {
		if (!this.ae_boolean) {
			this.e_void();
		}
	}

	public final void f_void() {
		this.ae_boolean = false;
		U_boolean = true;
		V_boolean = true;
		this.b_boolean = true;
		W_int = 0;
		this.da_int = -1;
		if (this.bo_int == 7) {
			this.bq_int = 0;
		}

		this.a_long = System.currentTimeMillis() - this.m_long;
		i var10000;
		switch (l_byte) {
		case 0:
		case 6:
		case 12:
		case 22:
			return;
		case 1:
			this.B_void();
			if (D_boolean) {
				return;
			}

			if (this.a_c != null) {
				return;
			}

			if (this.an_int != 0) {
				return;
			}

			if (this.v_boolean) {
				return;
			}

			if (this.n_byte <= 0) {
				return;
			}

			if (a_g_Array[0].f_int == 19) {
				return;
			}

			if (this.C_boolean) {
				return;
			}

			this.bB_void();
			return;
		case 2:
			g_Image = null;
			this.m_boolean = true;
			if (this.bo_int == 1) {
				this.bq_int = 0;
				return;
			}

			return;
		case 3:
		case 13:
		case 14:
		case 24:
		case 29:
		case 32:
		default:
			return;
		case 4:
		case 30:
			if (this.af_boolean) {
				this.a_h.b_void_int(19);
				return;
			}

			return;
		case 5:
			this.Q_boolean = true;
			return;
		case 7:
			this.bq_int = 1;
			return;
		case 8:
			return;
		case 9:
		case 28:
			return;
		case 10:
			V_boolean = false;
			return;
		case 11:
			this.bs_int = 6;
			return;
		case 15:
			var10000 = this;
			break;
		case 16:
			this.ao_int = 0;
			this.bb_int = 0;
			this.n_boolean = false;
			this.V_int = 0;
			this.B_boolean = true;
			return;
		case 17:
			return;
		case 18:
		case 25:
		case 26:
			var10000 = this;
			break;
		case 19:
			return;
		case 20:
			return;
		case 21:
			this.ct_void();
			return;
		case 23:
			return;
		case 27:
			this.aw_boolean = true;
			this.e_boolean = true;
			return;
		case 31:
			this.P_boolean = true;
			return;
		case 33:
			var10000 = this;
		}

		var10000.aw_boolean = true;
	}

	private void bC_void() {
		if (this.j_boolean) {
			for (int var1 = 0; var1 < this.av_int; var1++) {
				for (int var2 = 0; var2 < this.aw_int; var2++) {
					if (a_byte_2d_Array[var1][var2] == 38) {
						this.a_byte_byte_byte_byte_byte((byte) b_int_2d_Array[var1][var2], (byte) var1, (byte) var2,
								(byte) 0);
						this.dt_int++;
					}
				}
			}
		}
	}

	private void n_void_int_int(int integer1, int integer2) {
		this.c_long |= 4194304L;
		a_int_2d_Array[integer1][integer2] = a_int_2d_Array[integer1][integer2] & -256;
		a_int_2d_Array[integer1][integer2] = a_int_2d_Array[integer1][integer2] | 14;
	}

	private boolean e_boolean() {
		return this.i_byte == 4 || this.i_byte == 5 || this.i_byte == 3;
	}

	private void bD_void() {
		Hashtable<Integer,Integer> var1 = new Hashtable<>();
		Hashtable<Integer,Integer> var2 = new Hashtable<>();
		Hashtable<Integer,Integer> var3 = new Hashtable<>();
		this.X_int = 0;
		this.Y_int = 0;
		int var4 = 0;
		this.aY_int = 0;
		this.bu_int = 0;
		int var5 = 0;
		int var6 = 0;
		this.ag_boolean = false;
		this.ah_boolean = false;
		this.ai_boolean = false;
		this.al_int = 0;
		int var7 = 0;

		for (int var8 = 0; var8 < this.av_int; var8++) {
			for (int var9 = 0; var9 < this.aw_int; var9++) {
				b_byte_2d_Array[var8][var9] = 0;
				c_byte_2d_Array[var8][var9] = 0;
				int var10 = a_int_2d_Array[var8][var9];
				int var11 = b_int_2d_Array[var8][var9];
				byte var12 = a_byte_2d_Array[var8][var9];
				if (var10 != -1) {
					label373: switch (var10 & 0xFF) {
					case 0:
						var7++;
						a_int_2d_Array[var8][var9] = var11 << 8 | var10 & 0xFF;
						break;
					case 2:
						this.c_long |= 1048576L;
						switch (var11) {
						case 0:
						case 1:
							this.c_long |= 524288L;
						default:
							a_int_2d_Array[var8][var9] = var11 << 8 | 2;
							break label373;
						}
					case 3:
						c_byte_2d_Array[var8][var9] = 127;
						if (var11 > 0) {
							a_int_2d_Array[var8][var9] = var11 + 1 << 8 | 3;
						}
						break;
					case 4:
						var5++;
						this.c_long |= 16L;
						a_int_2d_Array[var8][var9] = var11 << 8 | var10 & 0xFF;
						break;
					case 5:
						this.p_byte = (byte) var11;
						break;
					case 6:
						Integer var34 = new Integer(var11);
						Integer var40;
						var40 = (var40 = (Integer) var1.get(var34)) == null ? new Integer(1) : new Integer(var40 + 1);
						var1.put(var34, var40);
						this.c_long |= 536870912L;
						a_int_2d_Array[var8][var9] = var11 << 8 | 6;
						break;
					case 7:
						if (var11 != -1) {
							q_byte_Array[var11] = (byte) var8;
							r_byte_Array[var11] = (byte) var9;
						}

						a_int_2d_Array[var8][var9] = var11 << 8 | var10;
						break;
					case 8:
						this.ah_boolean = true;
					case 9:
						if ((var10 & 0xFF) != 8) {
							this.ag_boolean = true;
						}

						this.c_long |= 268435456L;
						Integer var33 = new Integer(var11);
						Integer var38;
						var38 = (var38 = (Integer) var1.get(var33)) == null ? new Integer(1) : new Integer(var38 + 1);
						var1.put(var33, var38);
						a_int_2d_Array[var8][var9] = var11 << 8 | var10;
						break;
					case 10:
					case 11:
					case 12:
					case 13:
					case 15:
					case 16:
					case 18:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 27:
					case 29:
					case 32:
					default:
						if (var10 >= 20 && var10 < 26) {
							a_int_2d_Array[var8][var9] = var10;
							i var10000;
							long var10001;
							long var10002;
							switch (this.ap_int) {
							case 0:
								var10000 = this;
								var10001 = this.c_long;
								var10002 = 16L;
								break;
							case 1:
								var10000 = this;
								var10001 = this.c_long;
								var10002 = 2097152L;
								break;
							default:
								break label373;
							}

							var10000.c_long = var10001 | var10002;
						} else if (var10 < 80 && var10 > -1) {
							a_int_2d_Array[var8][var9] = -1;
						}
						break;
					case 14:
					case 33:
						if (!this.e_boolean()) {
							a_int_2d_Array[var8][var9] = 33;
						}

						this.c_long = this.c_long | 1L << ((a_int_2d_Array[var8][var9] & 0xFF) == 14 ? 22 : 33);
						if (this.a_boolean_int_int_int_int(this.ap_int, this.aq_int, var8, var9)) {
							if (this.e_boolean()) {
								a_byte_2d_Array[var8][var9] = 41;
								b_int_2d_Array[var8][var9] = 10;
								this.aY_int += 10;
							} else {
								a_byte_2d_Array[var8][var9] = -1;
								a_int_2d_Array[var8][var9] = a_int_2d_Array[var8][var9] | 256;
							}
						}
						break;
					case 17:
						int var13;
						if ((var13 = a_int_2d_Array[var8][var9 - 1] & 0xFF) == 14 || var13 == 33) {
							a_int_2d_Array[var8][var9 - 1] = 0xFF00 | var13;
						}

						byte var14;
						switch (var14 = a_byte_2d_Array[var8][var9 - 1]) {
						case 19:
						case 36:
						case 43:
						case 45:
						case 46:
						case 49:
							Integer var15 = new Integer(var11);
							Integer var16;
							var16 = (var16 = (Integer) var2.get(var15)) == null ? new Integer(1)
									: new Integer(var16 + 1);
							var2.put(var15, var16);
							a_int_2d_Array[var8][var9] = -1;
							Integer var17 = (Integer) var3.get(var15);
							if (var14 == 36) {
								if (var17 == null) {
									var3.put(var15, new Integer(58));
								}
							} else {
								var3.put(var15, new Integer(57));
								if (this.i_byte == 4) {
									var3.put(var15, new Integer(93));
								} else if (this.i_byte == 5) {
									var3.put(var15, new Integer(94));
								} else if (this.i_byte == 3) {
									var3.put(var15, new Integer(95));
								}
							}
							break;
						default:
							a_int_2d_Array[var8][var9] = var11 << 8 | 17;
						}

						if (var11 >= 0) {
							var6 |= 1 << var11;
						}
						break;
					case 28:
						this.q_byte = (byte) var11;
						break;
					case 30:
						this.c_long |= 1073741824L;
						var7++;
					case 1:
					case 26:
						a_int_2d_Array[var8][var9] = var11 << 8 | var10 & 0xFF;
						break;
					case 31:
						this.c_long |= 1073741824L;
						a_int_2d_Array[var8][var9] = var11 << 8 | 31;
					case 19:
						a_int_2d_Array[var8][var9] = var11 << 8 | 19;
						break;
					case 34:
						this.c_long |= 17179869184L;
					}
				}

				byte[] var45;
				int var50;
				byte var55;
				switch (var12) {
				case 1:
					this.aY_int++;
					c_byte_2d_Array[var8][var9] = 48;
					b_int_2d_Array[var8][var9] = 0;
					continue;
				case 3:
				case 9:
				case 13:
				case 15:
				case 17:
				case 20:
				case 21:
				case 25:
				case 29:
				case 32:
				case 50:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				default:
					if (var12 >= 80 || var12 <= -1) {
						continue;
					}

					var45 = a_byte_2d_Array[var8];
					var50 = var9;
					var55 = -1;
					break;
				case 6:
					var4++;
					this.n_void_int_int(var8, var9);
				case 7:
					this.c_long |= 16L;
					b_int_2d_Array[var8][var9] = 0;
					continue;
				case 8:
					this.c_long |= 32L;
					this.c_long |= 8L;
				case 4:
					if (var12 != 8) {
						this.n_void_int_int(var8, var9);
					}
				case 5:
					this.c_long |= 4L;
				case 2:
					var4++;
				case 0:
					c_byte_2d_Array[var8][var9] = 48;
					b_int_2d_Array[var8][var9] = 0;
					this.d_long |= 1L;
					continue;
				case 10:
					b_int_2d_Array[var8][var9] = 0;
					this.d_long |= 2L;
					continue;
				case 11:
					b_int_2d_Array[var8][var9] = var11 == 1 ? 16 : 0;
					c_byte_2d_Array[var8][var9] = 48;
					this.c_long |= 16384L;
					continue;
				case 12:
					a_byte_2d_Array[var8][var9] = -1;
					this.Q_int = var8;
					this.R_int = var9;
					this.P_int = var11;
					continue;
				case 14:
					this.c_long |= 4096L;
					b_int_2d_Array[var8][var9] = b_int_2d_Array[var8][var9] == 4 ? 8 : 0;
					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 24;
					break;
				case 16:
					if (a_byte_2d_Array[var8][var9 + 1] != 16) {
						a_byte_2d_Array[var8][var9 - 1] = 16;
						b_int_2d_Array[var8][var9 - 1] = var11;
					}

					this.c_long |= 8192L;
					continue;
				case 18:
					this.ce_int = 0;
					this.cf_int = 0;
					this.c_long |= 549755813888L;
					this.c_long |= 128L;
					continue;
				case 19:
					this.c_long = this.c_long | 1L << (this.ap_int == 1 ? 17 : 15);
					this.bu_int |= 2;
					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 48;
					break;
				case 22:
				case 23:
					this.c_long |= 512L;
					this.c_long |= 1024L;
					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 48;
					break;
				case 26:
					this.c_long |= 1099511627776L;
				case 24:
				case 27:
					var7++;
					var4++;
					this.c_long |= 1073741824L;
					this.c_long |= 524288L;
					this.n_void_int_int(var8, var9);
					continue;
				case 28:
					this.c_long |= 2048L;
					if (var11 > 10) {
						b_int_2d_Array[var8][var9] = b_int_2d_Array[var8][var9] / 11;
						b_int_2d_Array[var8][var9] = b_int_2d_Array[var8][var9] | 8;
					}

					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 24;
					break;
				case 30:
					this.c_long |= 128L;
					b_int_2d_Array[var8][var9] = 0;
				case 31:
				case 33:
				case 51:
				case 52:
				case 53:
					continue;
				case 34:
					a_byte_2d_Array[var8][var9] = -1;
					a_int_2d_Array[var8][var9] = 15;
					this.c_long |= 16777216L;
					continue;
				case 35:
					a_byte_2d_Array[var8][var9] = 35;
					a_int_2d_Array[var8][var9] = -1;
					this.c_long |= 16777216L;
					this.ai_boolean = true;
					continue;
				case 36:
					if (b_int_2d_Array[var8][var9] != 1) {
						b_int_2d_Array[var8][var9] = 0;
					}

					this.c_long |= 256L;
					continue;
				case 37:
					this.c_long |= 33554432L;
					b_int_2d_Array[var8][var9] = 0;
					continue;
				case 38:
					this.j_boolean = true;
					this.c_long |= 67108864L;
					a_int_2d_Array[var8][var9] = 27;
					this.c_long |= 64L;
					continue;
				case 39:
					this.j_boolean = true;
					this.c_long |= 67108864L;
					continue;
				case 40:
					this.c_long |= 1073741824L;
					var7++;
					this.j_boolean = true;
					this.c_long |= 134217728L;
					this.n_void_int_int(var8, var9);
					var4++;
					continue;
				case 41:
					if (b_int_2d_Array[var8][var9] <= 0) {
						b_int_2d_Array[var8][var9] = 1;
					}

					this.aY_int = this.aY_int + b_int_2d_Array[var8][var9];
					continue;
				case 42:
					var7++;
					var4++;
					this.c_long |= 2147483648L;
					this.c_long |= 1073741824L;
					this.n_void_int_int(var8, var9);
					continue;
				case 43:
					this.c_long = this.c_long | 1L << (this.ap_int == 1 ? 17 : 15);
					this.bu_int |= 1;
					b_int_2d_Array[var8][var9] = var11 & -98305 | 65536;
					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 48;
					break;
				case 44:
					c_byte_2d_Array[var8][var9] = 24;
					b_int_2d_Array[var8][var9] = 0;
					this.c_long |= 17179869184L;
					continue;
				case 45:
					b_int_2d_Array[var8][var9] = 0;
					c_byte_2d_Array[var8][var9] = 24;
					this.c_long |= 34359738368L;
					continue;
				case 46:
					b_int_2d_Array[var8][var9] = 0;
					c_byte_2d_Array[var8][var9] = 24;
					b_byte_2d_Array[var8][var9] = 0;
					this.c_long |= 137438953472L;
					continue;
				case 47:
					c_byte_2d_Array[var8][var9] = 48;
					b_int_2d_Array[var8][var9] = 0;
					this.c_long |= 8388608L;
					continue;
				case 48:
					int[] var46;
					if ((var11 & 7) == 4) {
						var46 = b_int_2d_Array[var8];
						var50 = var9;
						var55 = 16;
					} else {
						var46 = b_int_2d_Array[var8];
						var50 = var9;
						var55 = 0;
					}

					var46[var50] = var55;
					this.al_int++;
					this.c_long |= 1099511627776L;
					this.c_long |= 4294967296L;
					int var29 = var9 - 1;
					a_byte_2d_Array[var8][var29] = 48;
					b_int_2d_Array[var8][var29] = 8;
					q_void_int_int(var8, var29);
					continue;
				case 49:
					this.c_long |= 2199023255552L;
					var45 = c_byte_2d_Array[var8];
					var50 = var9;
					var55 = 48;
					break;
				case 79:
					this.aP_int = 0;
					this.aQ_int = var9;
					this.an_int = var8;
					a_byte_2d_Array[var8][var9] = -1;
					this.ar_int = this.at_int = 0;
					this.as_int = this.au_int = this.aQ_int * 24 - 160;
					continue;
				}

				var45[var50] = var55;
			}
		}

		d_byte_Array = new byte[var4 << 1];

		for (int var22 = 0; var22 < d_byte_Array.length; var22++) {
			d_byte_Array[var22] = 0;
		}

		a_c_Array = new c[var7];
		p_byte_Array = new byte[var7];
		int var23 = 0;
		k_byte_Array = new byte[(var5 + 1) * 2];
		int var24 = 31;

		while (var24 >= 0 && (var6 & 1 << var24) == 0) {
			var24--;
		}

		if (++var24 > 0) {
			m_byte_Array = new byte[var24];
			l_byte_Array = new byte[var24];
		}

		if (this.al_int > 0) {
			e_byte_Array = new byte[this.al_int * 3];
		}

		int var26 = 0;

		for (int var27 = 0; var27 < this.aw_int; var27++) {
			for (int var28 = 0; var28 < this.av_int; var28++) {
				label324: {
					int var30 = a_int_2d_Array[var28][var27] & 0xFF;
					int var31 = a_int_2d_Array[var28][var27] >> 8;
					byte[] var47;
					int var52;
					byte var57;
					switch (var30) {
					case 0:
					case 30:
						var47 = p_byte_Array;
						var52 = var23++;
						var57 = (byte) var31;
						break;
					case 4:
						k_byte_Array[var31 * 2] = (byte) var28;
						var47 = k_byte_Array;
						var52 = var31 * 2 + 1;
						var57 = (byte) var27;
						break;
					case 5:
						k_byte_Array[var5 * 2] = (byte) var28;
						var47 = k_byte_Array;
						var52 = var5 * 2 + 1;
						var57 = (byte) var27;
						break;
					case 7:
						Integer var35 = (Integer) var1.get(new Integer(var31));
						var31 <<= 8;
						if (var35 != null) {
							var31 = var31 & -16 | var35;
						}

						boolean var42 = (a_int_2d_Array[var28][var27 - 1] & 0xFF) == 17;
						boolean var44 = (a_int_2d_Array[var28][var27 + 1] & 0xFF) == 17
								&& (a_int_2d_Array[var28 + 1][var27] & 0xFF) != 26
								&& (a_int_2d_Array[var28 - 1][var27] & 0xFF) != 26;
						if (var42 || var44) {
							var31 = var31 & -241 | 48;
							c_byte_2d_Array[var28][var27] = 24;
							if (var42) {
								a_int_2d_Array[var28][var27 - 1] = -1;
							}
						}

						a_int_2d_Array[var28][var27] = var31 << 8 | var30;
						break label324;
					case 17:
						if (var31 != -1) {
							Integer var19 = new Integer(var31);
							Integer var20;
							if ((var20 = (Integer) var2.get(var19)) == null) {
								var20 = new Integer(0);
							}

							m_byte_Array[var31] = var20.byteValue();
							Integer var21;
							if ((var21 = (Integer) var3.get(var19)) == null) {
								var21 = new Integer(59);
							}

							var47 = l_byte_Array;
							var52 = var31;
							var57 = var21.byteValue();
							break;
						}
					default:
						break label324;
					}

					var47[var52] = var57;
				}

				byte[] var49;
				int var54;
				byte var59;
				switch (a_byte_2d_Array[var28][var27]) {
				case 24:
					var49 = p_byte_Array;
					var54 = var23++;
					var59 = 22;
					break;
				case 26:
					var49 = p_byte_Array;
					var54 = var23++;
					var59 = 25;
					break;
				case 27:
					var49 = p_byte_Array;
					var54 = var23++;
					var59 = 23;
					break;
				case 40:
					var49 = p_byte_Array;
					var54 = var23++;
					var59 = 24;
					break;
				case 42:
					var49 = p_byte_Array;
					var54 = var23++;
					var59 = 11;
					break;
				case 48:
					if ((b_int_2d_Array[var28][var27] & 8) != 0) {
						int var36 = var28 + ((b_int_2d_Array[var28][var27 + 1] & 16) == 0 ? 1 : -1);
						int var43 = var26 * 3;
						if (d_int_int_int(var36, var27) >= 0) {
							e_byte_Array[var43 + 0] = (byte) var36;
							e_byte_Array[var43 + 1] = (byte) var36;
							var49 = e_byte_Array;
							var54 = var43 + 2;
							var59 = (byte) var27;
						} else {
							var49 = e_byte_Array;
							var54 = var43 + 2;
							var59 = -1;
						}

						var49[var54] = var59;
						b_int_2d_Array[var28][var27] = b_int_2d_Array[var28][var27] & 16777215 | var26 << 24;
						var26++;
					}
				default:
					continue;
				}

				var49[var54] = var59;
			}
		}

		a_int_2d_Array[this.an_int - 2][this.aQ_int] = -193 << 8 | 7;
		if ((this.c_long & 4294967296L) != 0L || i_byte_Array[9] >= 8) {
			this.c_long |= 1099511627776L;
			this.c_long |= 2L;
			this.c_long |= 1L;
			if ((this.c_long & 131072L) != 0L) {
				this.c_long |= 262144L;
			}

			if ((this.c_long & 32768L) != 0L) {
				this.c_long |= 65536L;
			}

			if ((this.c_long & 34359738368L) != 0L) {
				this.c_long |= 68719476736L;
			}

			if ((this.c_long & 137438953472L) != 0L) {
				this.c_long |= 274877906944L;
			}

			if ((this.c_long & 2199023255552L) != 0L) {
				this.c_long |= 4398046511104L;
			}
		}
	}

	private void a_void_int_int_int_int_int(int integer1, int integer2, int integer3, int integer4, int integer5) {
		if (integer1 + integer3 > 0 && integer1 + integer3 < this.av_int && integer2 + integer4 > 0
				&& integer2 + integer4 < this.aw_int) {
			int var9;
			switch (var9 = a_int_2d_Array[integer1 + integer3][integer2 + integer4] & 0xFF) {
			case 8:
			case 9:
				int var8 = a_int_2d_Array[integer1 + integer3][integer2 + integer4] >> 8;
				var8 = integer5 == 1 ? var8 | 512 : var8 & -513;
				a_int_2d_Array[integer1 + integer3][integer2 + integer4] = var8 << 8 | var9;
				this.a_void_int_int_int_int_int(integer1 + integer3, integer2 + integer4, integer3, integer4, integer5);
				this.a_void_int_int_int_int_int(integer1 + integer3, integer2 + integer4, 0, 1, integer5);
			}
		}
	}

	private boolean d_boolean_int_int(int integer1, int integer2) {
		return integer1 == this.aP_int && integer2 == this.aQ_int;
	}

	private void u_void_int(int integer) {
		this.j_byte = this.k_byte = 0;

		for (int var2 = 0; var2 < p_byte_Array.length; var2++) {
			if (p_byte_Array[var2] == integer) {
				this.a_c = a_c_Array[var2];
			}
		}

		this.a_c.a_byte_Array();
	}

	private boolean f_boolean() {
		label61: {
			if (this.ar_int < this.ci_int) {
				this.ar_int = this.ar_int + this.ck_int;
				if (this.ar_int <= this.ci_int) {
					break label61;
				}
			} else {
				if (this.ar_int <= this.ci_int) {
					break label61;
				}

				this.ar_int = this.ar_int - this.ck_int;
				if (this.ar_int >= this.ci_int) {
					break label61;
				}
			}

			this.ar_int = this.ci_int;
		}

		label53: {
			if (this.as_int < this.cj_int) {
				this.as_int = this.as_int + this.ck_int;
				if (this.as_int <= this.cj_int) {
					break label53;
				}
			} else {
				if (this.as_int <= this.cj_int) {
					break label53;
				}

				this.as_int = this.as_int - this.ck_int;
				if (this.as_int >= this.cj_int) {
					break label53;
				}
			}

			this.as_int = this.cj_int;
		}

		boolean var1;
		boolean var2;
		label45: {
			var1 = false;
			var2 = false;
			if (this.ar_int < 0) {
				this.ar_int = 0;
			} else if (this.ar_int > this.av_int * 24 - 240) {
				this.ar_int = this.av_int * 24 - 240;
			} else if (this.ar_int != this.ci_int) {
				break label45;
			}

			var1 = true;
		}

		label39: {
			if (this.as_int < 0) {
				this.as_int = 0;
			} else if (this.as_int > this.aw_int * 24 - 320 + 60) {
				this.as_int = this.aw_int * 24 - 320 + 60;
			} else if (this.as_int != this.cj_int) {
				break label39;
			}

			var2 = true;
		}

		if (var1 && var2) {
			this.at_int = this.ar_int;
			this.au_int = this.as_int;
			this.am_int = 70;
			return true;
		} else {
			return false;
		}
	}

	private void bE_void() {
		switch (this.cl_int) {
		case 1:
			this.ck_int = 8;
			if (this.f_boolean()) {
				this.cl_int = 2;
				this.dk_int = 40;
				return;
			}
			break;
		case 2:
			this.dk_int--;
			if (this.dk_int == 30) {
				if ((a_int_2d_Array[this.di_int][this.dj_int] >> 8 & 240) != 0) {
					this.j_void_int_int(this.di_int, this.dj_int);
					return;
				}
			} else if (this.dk_int == 0) {
				this.cl_int = 3;
				this.ci_int = this.aP_int * 24 - 108;
				this.cj_int = this.aQ_int * 24 - 118;
				this.ck_int = 5;
				this.d_String = a_String_Array[l_byte_Array[cm_int]];
				a_a_Array[41].a_int_String(this.d_String);
				this.dh_int = 80;
				return;
			}
			break;
		case 3:
			if (this.f_boolean()) {
				this.dk_int = 20;
				this.cl_int = 4;
				this.am_int = 0;
				return;
			}
			break;
		case 4:
			this.dk_int--;
			if (this.dk_int == 0) {
				this.am_int = 0;
				this.cl_int = 0;
				ak_boolean = true;
			}
		}
	}

	private void v_void_int(int integer) {
		this.C_void_int(1);
		int var2 = this.av_int - 1;
		int var3 = this.aw_int - 1;

		for (int var4 = 1; var4 < var3; var4++) {
			for (int var5 = 1; var5 < var2; var5++) {
				if ((a_int_2d_Array[var5][var4] & 0xFF) == 17 && a_int_2d_Array[var5][var4] >> 8 == integer) {
					int var6;
					int var7;
					label32: {
						var6 = -1;
						var7 = -1;
						int var10000;
						if (a_byte_2d_Array[var5][var4] == 18) {
							var6 = var5;
							var10000 = var4;
						} else {
							switch (a_int_2d_Array[var5][var4 - 1] & 0xFF) {
							case 7:
								if ((a_int_2d_Array[var5][var4 - 1] >> 8 & 240) == 0) {
									break label32;
								}
							case 14:
							case 33:
								var6 = var5;
								var10000 = var4 - 1;
								break;
							default:
								break label32;
							}
						}

						var7 = var10000;
					}

					if (var6 != -1) {
						this.di_int = var6;
						this.dj_int = var7;
						this.ci_int = 24 * var6 - 108;
						this.cj_int = 24 * var7 - 118;
					}
				}
			}
		}
	}

	private void w_void_int(int integer) {
		this.C_void_int(8);
		int var2 = this.av_int - 1;
		int var3 = this.aw_int - 1;

		for (int var4 = 1; var4 < var3; var4++) {
			for (int var5 = 1; var5 < var2; var5++) {
				if ((a_int_2d_Array[var5][var4] & 0xFF) == 17 && a_int_2d_Array[var5][var4] >> 8 == integer) {
					int var6;
					switch (var6 = a_int_2d_Array[var5][var4 - 1] & 0xFF) {
					case 7:
						i_void_int_int(var5, var4 - 1);
						break;
					case 14:
					case 33:
						a_int_2d_Array[var5][var4 - 1] = 0 | var6;
					}
				}
			}
		}
	}

	private void bF_void() {
		int var2 = this.aP_int - 8;
		int var3 = this.aP_int + 8;
		int var4 = this.aQ_int + 8;
		int var5 = this.aQ_int - 8;
		int var6 = 0;
		if (a_g_Array[4] != null) {
			int var7 = a_g_Array[4].g_int;
			var6 = a_g_Array[4].g_int == 0 ? 0 : (var7 <= 10 ? 1 : (var7 <= 20 ? 2 : 3));
		}

		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 > this.av_int - 2) {
			var3 = this.av_int - 2;
		}

		if (var5 < 1) {
			var5 = 1;
		}

		if (var4 > this.aw_int - 2) {
			var4 = this.aw_int - 2;
		}

		i var10000 = this;
		int var10001 = var4;

		while (true) {
			var10000.bF_int = var10001;
			if (this.bF_int < var5) {
				return;
			}

			var10000 = this;
			var10001 = var2;

			while (true) {
				var10000.bE_int = var10001;
				if (this.bE_int > var3) {
					var10000 = this;
					var10001 = this.bF_int - 1;
					break;
				}

				boolean var9 = this.bi_int != 0 && this.bE_int == this.bg_int && this.bF_int == this.bh_int;
				label195: if (c_byte_2d_Array[this.bE_int][this.bF_int] > 0 && !var9) {
					label192: {
						c_byte_2d_Array[this.bE_int][this.bF_int] = (byte) (c_byte_2d_Array[this.bE_int][this.bF_int]
								- 6);
						switch ((byte) (a_int_2d_Array[this.bE_int][this.bF_int] & 0xFF)) {
						case 0:
							if (this.a_c == null && this.bm_int == -1
									&& this.d_boolean_int_int(this.bE_int, this.bF_int) && this.aR_int <= 6) {
								this.bm_int = a_int_2d_Array[this.bE_int][this.bF_int] >> 8;
								a_int_2d_Array[this.bE_int][this.bF_int] = -1;
							}
						case 1:
						case 4:
						case 5:
						case 10:
						case 11:
						case 12:
						case 13:
						case 15:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 28:
						case 29:
						case 31:
						case 34:
						default:
							break label192;
						case 2:
							switch (a_int_2d_Array[this.bE_int][this.bF_int] >> 8) {
							case 0:
								if (a_byte_2d_Array[this.bE_int - 1][this.bF_int] != 30
										&& a_byte_2d_Array[this.bE_int + 1][this.bF_int] != 30
										&& a_byte_2d_Array[this.bE_int][this.bF_int - 1] != 30
										&& a_byte_2d_Array[this.bE_int][this.bF_int + 1] != 30) {
									this.ay_int = -1;
									this.b_void_int_int_byte(this.bE_int, this.bF_int, (byte) 2);
								}
							default:
								break label192;
							}
						case 3:
							this.ce_void();
							break label192;
						case 6:
							this.bM_void();
							break label192;
						case 7:
							this.cd_void();
							break label192;
						case 8:
							var10000 = this;
							break;
						case 9:
							var10000 = this;
							break;
						case 14:
							this.z_void_int(14);
							break label192;
						case 26:
							this.bP_void();
							break label192;
						case 30:
							if (this.a_c == null && this.bm_int == -1
									&& this.d_boolean_int_int(this.bE_int, this.bF_int) && this.aR_int <= 0) {
								this.bm_int = a_int_2d_Array[this.bE_int][this.bF_int] >> 8;
								a_int_2d_Array[this.bE_int][this.bF_int] = -1;
							}
							break label192;
						case 32:
							this.bL_void();
							break label192;
						case 33:
							this.z_void_int(33);
							break label192;
						case 35:
						case 37:
							if (this.bE_int != this.bg_int || this.bF_int != this.bh_int || this.bi_int == 0) {
								this.bH_void();
							}
							break label192;
						case 36:
							this.bd_void();
							break label192;
						}

						var10000.cc_void();
					}

					if ((a_int_2d_Array[this.bE_int][this.bF_int] & -268435456) >> 28 > 0) {
						this.bR_void();
					}

					byte var16;
					switch (a_byte_2d_Array[this.bE_int][this.bF_int]) {
					case 0:
						this.ch_void();
						break label195;
					case 1:
						this.ch_void();
						break label195;
					case 2:
						this.x_void_int(2);
					case 3:
					case 12:
					case 13:
					case 15:
					case 17:
					case 18:
					case 20:
					case 25:
					case 29:
					case 31:
					case 33:
					case 34:
					case 35:
					case 38:
					case 39:
					default:
						break label195;
					case 4:
						this.x_void_int(4);
						break label195;
					case 5:
						this.x_void_int(5);
						break label195;
					case 6:
						this.x_void_int(6);
						break label195;
					case 7:
						this.x_void_int(7);
						break label195;
					case 8:
						this.ch_void();
						break label195;
					case 9:
						label171: if ((b_int_2d_Array[this.bE_int][this.bF_int] & 264241152) == 138412032) {
							label176: {
								c_byte_2d_Array[this.bE_int][this.bF_int] = 24;
								if (this.aj_int > 0) {
									var10000 = this;
									var16 = (byte) (this.aj_int - 1);
								} else {
									if (this.aj_int >= 0) {
										break label176;
									}

									var10000 = this;
									var16 = (byte) (this.aj_int + 1);
								}

								var10000.aj_int = var16;
							}

							if (this.ak_int > 0) {
								var10000 = this;
								var16 = (byte) (this.ak_int - 1);
							} else {
								if (this.ak_int >= 0) {
									break label171;
								}

								var10000 = this;
								var16 = (byte) (this.ak_int + 1);
							}

							var10000.ak_int = var16;
						}

						this.ch_void();
						break label195;
					case 10:
						this.bW_void();
						break label195;
					case 11:
						this.bV_void();
						break label195;
					case 14:
						this.bZ_void();
						break label195;
					case 16:
						this.ca_void();
						break label195;
					case 19:
						this.e_void_byte((byte) 19);
						break label195;
					case 21:
						this.bY_void();
						break label195;
					case 22:
						var10000 = this;
						var16 = 22;
						break;
					case 23:
						var10000 = this;
						var16 = 23;
						break;
					case 24:
						this.y_void_int(24);
						break label195;
					case 26:
						this.y_void_int(26);
						break label195;
					case 27:
						this.y_void_int(27);
						break label195;
					case 28:
						this.cb_void();
						break label195;
					case 30:
						this.bT_void();
						break label195;
					case 32:
						this.bX_void();
						break label195;
					case 36:
						this.bO_void();
						break label195;
					case 37:
						this.bU_void();
						break label195;
					case 40:
						this.x_void_int(40);
						break label195;
					case 41:
						this.x_void_int(41);
						break label195;
					case 42:
						this.x_void_int(42);
						break label195;
					case 43:
						this.e_void_byte((byte) 43);
						break label195;
					case 44:
						this.bK_void();
						break label195;
					case 45:
						this.aL_void();
						break label195;
					case 46:
						this.bJ_void();
						break label195;
					case 47:
						this.ch_void();
						this.bI_void();
						break label195;
					case 48:
						if ((b_int_2d_Array[this.bE_int][this.bF_int] & 8) == 0) {
							this.d_void_byte((byte) 48);
						} else {
							this.bG_void();
						}
						break label195;
					case 49:
						this.e_void_byte((byte) 49);
						break label195;
					case 50:
						if (this.aR_int < 12 && this.d_boolean_int_int(this.bE_int, this.bF_int) && !this.h_boolean) {
							this.a_void_int_int_int(1, 48, h_byte_Array[this.aS_int & 7]);
						}
						break label195;
					case 51:
						this.x_void_int(51);
						break label195;
					case 52:
						this.x_void_int(52);
						break label195;
					case 53:
						this.x_void_int(53);
						break label195;
					case 54:
						this.bN_void();
						break label195;
					}

					var10000.o_void_int_int(var16, var6);
				}

				var10000 = this;
				var10001 = this.bE_int + 1;
			}
		}
	}

	private void bG_void() {
		int var1;
		int var2;
		int var7;
		label21: {
			var1 = this.bE_int;
			var2 = this.bF_int;
			int var3 = this.bF_int + 1;
			int var4;
			switch ((var4 = b_int_2d_Array[var1][var3]) & 7) {
			case 2:
				var7 = var1;
				break;
			case 4:
				var7 = var1 + 1;
				break label21;
			default:
				if ((var4 & 16) == 0) {
					var7 = var1 + 1;
					break label21;
				}

				var7 = var1;
			}

			var7 -= 1;
		}

		int var5 = var7;
		int var6 = (b_int_2d_Array[var1][var2] >> 24) * 3;
		byte[] var8;
		int var10001;
		byte var10002;
		if (a_byte_2d_Array[var5][var2] < 0) {
			e_byte_Array[var6 + 2] = (byte) var2;
			e_byte_Array[var6 + 1] = (byte) var5;
			var8 = e_byte_Array;
			var10001 = var6 + 0;
			var10002 = (byte) var5;
		} else {
			var8 = e_byte_Array;
			var10001 = var6 + 2;
			var10002 = -1;
		}

		var8[var10001] = var10002;
	}

	private void d_void_byte(byte byte1) {
		int var2 = this.bE_int;
		int var3 = this.bF_int;
		if (b_byte_2d_Array[var2][var3] == 6 && (a_int_2d_Array[var2][var3] & 0xFF) == 6) {
			this.r_void_int(a_int_2d_Array[var2][var3] >> 8);
		}

		if (b_byte_2d_Array[var2][var3] <= 0) {
			int var4;
			label42: {
				int var5;
				int var10000;
				if ((var5 = (var4 = b_int_2d_Array[var2][var3]) & 7) == 2) {
					var10000 = var4 | 16;
				} else {
					if (var5 != 4) {
						break label42;
					}

					var10000 = var4 & -17;
				}

				var4 = var10000;
			}

			int var6 = var3 + 1;
			if (a_byte_2d_Array[var2][var6] < 0 && (!this.d_boolean_int_int(var2, var6) || this.aW_int != 0)) {
				a_byte_2d_Array[var2][var3 - 1] = -1;
				a_byte_2d_Array[var2][var6] = byte1;
				b_int_2d_Array[var2][var6] = var4 & -8 | 3;
				b_int_2d_Array[var2][var3] = b_int_2d_Array[var2][var3 - 1] | 8;
				b_byte_2d_Array[var2][var6] = 18;
				int var7 = var3 - 2;
				c_byte_2d_Array[var2 - 1][var7] = 48;
				c_byte_2d_Array[var2][var7] = 48;
				c_byte_2d_Array[var2 + 1][var7] = 48;
				q_void_int_int(var2, var3);
				if (byte1 == 48) {
					this.bG_void();
				}
			} else {
				if ((var4 & 7) == 3 && this.d_boolean_int_int(var2, var3 + 1)) {
					this.a_void_int_int_int(2, 48, 0);
				}

				b_int_2d_Array[var2][var3] = var4 & -8 | 0;
			}
		} else {
			b_byte_2d_Array[var2][var3] = (byte) (b_byte_2d_Array[var2][var3] - 6);
		}

		c_byte_2d_Array[var2][var3] = 24;
		c_byte_2d_Array[var2][var3 - 1] = 24;
	}

	private void bH_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		c_byte_2d_Array[var1][var2] = 24;
		byte[] var8;
		int var10;
		byte var12;
		if (b_byte_2d_Array[var1][var2] <= 0) {
			int var3;
			int var4;
			byte var5;
			label64: {
				var3 = var2 - 1;
				var4 = var2 + 1;
				int[] var10000;
				if ((var5 = (byte) (a_int_2d_Array[var1][var3] & 0xFF)) != 34 && var5 != 37) {
					if (var5 == 35 || !e_boolean_int_int(var1, var3)) {
						break label64;
					}

					b_byte_2d_Array[var1][var3] = 18;
					var10000 = a_int_2d_Array[var1];
					var10 = var3;
					var12 = 35;
				} else {
					var10000 = a_int_2d_Array[var1];
					var10 = var3;
					var12 = 37;
				}

				var10000[var10] = var12;
			}

			byte var6 = a_byte_2d_Array[var1][var2];
			if (a_byte_2d_Array[var1][var3] < 0 && !this.d_boolean_int_int(var1, var3) && var5 == 35 && var6 != 32
					&& var6 != 21 && a_byte_2d_Array[var1][var2] != -1) {
				b_byte_2d_Array[var1][var3] = 18;
				a_byte_2d_Array[var1][var3] = a_byte_2d_Array[var1][var2];
				b_int_2d_Array[var1][var3] = b_int_2d_Array[var1][var2] & -8 | 1;
				a_byte_2d_Array[var1][var2] = -1;
				this.b_void_int_int(var1, var2);
			} else {
				this.c_void_int_int(var1, var2);
			}

			if ((a_int_2d_Array[var1][var4] & 0xFF) != 35 && a_byte_2d_Array[var1][var4] != 47) {
				int[] var7;
				if (a_int_2d_Array[var1][var2] == 37) {
					var7 = a_int_2d_Array[var1];
					var10 = var2;
					var12 = 34;
				} else {
					var7 = a_int_2d_Array[var1];
					var10 = var2;
					var12 = -1;
				}

				var7[var10] = var12;
			}

			c_byte_2d_Array[var1][var3] = 24;
			if (a_byte_2d_Array[var1][var2] >= 0) {
				return;
			}

			var8 = b_byte_2d_Array[var1];
			var10 = var2;
			var12 = 18;
		} else {
			var8 = b_byte_2d_Array[var1];
			var10 = var2;
			var12 = (byte) (var8[var2] - 6);
		}

		var8[var10] = var12;
	}

	private static boolean e_boolean_int_int(int integer1, int integer2) {
		byte var2 = a_byte_2d_Array[integer1][integer2];
		int var3 = a_int_2d_Array[integer1][integer2] & 0xFF;
		return var2 < 80 && var2 != 30 && var2 != 10 && var2 != 37 && var2 != 34 && var2 != 35 && var3 != 14
				&& var3 != 33 && var3 != 15 && var3 != 4 && var3 != 16;
	}

	private static boolean f_boolean_int_int(int integer1, int integer2) {
		byte var2 = a_byte_2d_Array[integer1][integer2];
		int var3 = a_int_2d_Array[integer1][integer2] & 0xFF;
		return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 5 && var3 != 28;
	}

	private static boolean g_boolean_int_int(int integer1, int integer2) {
		byte var2 = a_byte_2d_Array[integer1][integer2];
		int var3 = a_int_2d_Array[integer1][integer2] & 0xFF;
		return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 4 && var3 != 32
				&& (var3 != 7 || (a_int_2d_Array[integer1][integer2] >> 8 & 240) != 0);
	}

	private void bI_void() {
		int var1 = this.bF_int - 1;
		boolean var2 = e_int_2d_Array != null && e_int_2d_Array[this.bE_int][this.bF_int] != 0
				&& e_int_2d_Array[this.bE_int][this.bF_int - 1] == 0;
		if ((b_int_2d_Array[this.bE_int][this.bF_int] & 7) == 0 && (a_int_2d_Array[this.bE_int][var1] & 0xFF) != 35
				&& e_boolean_int_int(this.bE_int, var1)
				&& (!this.d_boolean_int_int(this.bE_int - 1, this.bF_int)
						&& !this.d_boolean_int_int(this.bE_int + 1, this.bF_int) || (this.aS_int & 8) == 0)
				&& (a_byte_2d_Array[this.bE_int][this.bF_int + 1] >= 0 || var2)) {
			a_int_2d_Array[this.bE_int][var1] = 35;
			b_byte_2d_Array[this.bE_int][var1] = 18;
			c_byte_2d_Array[this.bE_int][var1] = 24;
		}
	}

	private void bJ_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3 = b_int_2d_Array[var1][var2] & 31;
		int var4 = (b_int_2d_Array[var1][var2] & 8160) >> 5;
		int var5 = a_int_a_int(a_a_Array[29], var3);
		if ((a_int_2d_Array[var1][var2] & 0xFF) == 35) {
			if (++var4 > var5) {
				var4 = 0;
			}

			b_int_2d_Array[var1][var2] = 0 | var4 << 5;
		} else if (a_byte_2d_Array[var1][var2 + 1] < 0 && var3 != 8 && var3 != 9) {
			byte var17;
			switch (var3) {
			case 0:
			case 2:
			case 4:
			case 6:
				var17 = 8;
				break;
			case 1:
			case 3:
			case 5:
			default:
				var17 = 9;
			}

			byte var12 = var17;
			b_byte_2d_Array[var1][var2 + 1] = 18;
			a_byte_2d_Array[var1][var2 + 1] = 46;
			a_byte_2d_Array[var1][var2] = -1;
			b_int_2d_Array[var1][var2 + 1] = var12;
			q_void_int_int(var1, var2);
		} else {
			if (var3 != 8 && var3 != 9) {
				if (this.i_boolean_int_int(var1, var2)) {
					a_byte_2d_Array[var1][var2] = -1;
					this.p_void_int_int(var1, var2);
					q_void_int_int(var1, var2);
					return;
				}

				if (!this.d_boolean_int_int(var1 - 1, var2) && !this.d_boolean_int_int(var1 + 1, var2)
						&& !this.d_boolean_int_int(var1, var2 - 1)) {
					int var7 = this.aS_int & 7;
					label203: if (this.aP_int == var1 && this.aR_int == 6 && (var7 == 4 || var7 == 2)
							&& this.aQ_int < var2 && a_byte_2d_Array[var1][var2 - 1] < 0
							&& var2 * 24 <= this.as_int + 320 - 60) {
						byte var16;
						switch (var3) {
						case 0:
						case 2:
							var16 = 6;
							break;
						case 1:
						case 3:
							var16 = 7;
							break;
						default:
							break label203;
						}

						var3 = var16;
						var4 = 0;
					} else if (this.aQ_int != var2 || this.aR_int != 6 || var7 != 1 && var7 != 3 || var3 < 0 || var3 > 3
							|| (this.aP_int >= var1 || a_byte_2d_Array[var1 - 1][var2] >= 0
									|| var1 * 24 >= this.ar_int + 240)
									&& (this.aP_int <= var1 || a_byte_2d_Array[var1 + 1][var2] >= 0
											|| (var1 + 1) * 24 <= this.ar_int)) {
						label175: {
							var4++;
							byte[] var14;
							int var10001;
							switch (var3) {
							case 4:
								int var8 = var1 - 1;
								if (a_byte_2d_Array[var8][var2] >= 0 || var4 != b_int_a_int_int(a_a_Array[29], 4, 1)) {
									break label175;
								}

								a_byte_2d_Array[var8][var2] = 21;
								b_int_2d_Array[var8][var2] = 4;
								b_byte_2d_Array[var8][var2] = 18;
								var14 = c_byte_2d_Array[var8];
								var10001 = var2;
								break;
							case 5:
								int var9 = var1 + 1;
								if (a_byte_2d_Array[var9][var2] >= 0 || var4 != b_int_a_int_int(a_a_Array[29], 5, 1)) {
									break label175;
								}

								a_byte_2d_Array[var9][var2] = 21;
								b_int_2d_Array[var9][var2] = 2;
								b_byte_2d_Array[var9][var2] = 18;
								var14 = c_byte_2d_Array[var9];
								var10001 = var2;
								break;
							case 6:
							case 7:
								int var10 = var2 - 1;
								if (a_byte_2d_Array[var1][var10] < 0
										&& var4 == b_int_a_int_int(a_a_Array[29], var3, 1)) {
									a_byte_2d_Array[var1][var10] = 21;
									b_int_2d_Array[var1][var10] = 1;
									b_byte_2d_Array[var1][var10] = 18;
									var14 = c_byte_2d_Array[var1];
									var10001 = var10;
									break;
								}
							default:
								break label175;
							}

							var14[var10001] = 24;
						}

						label143: if (var4 > var5) {
							var4 = 0;
							int var15;
							switch (this.a_int_int_int_int_int_boolean(var1, var2, this.aP_int, this.aQ_int, false)) {
							case 1:
								if (this.aP_int == var1 && var3 != 6 && var3 != 7
										&& var2 * 24 <= this.as_int + 320 - 60) {
									var3 = var3 == 2 ? 6 : 7;
									break label143;
								}

								var3 = this.aP_int < var1 ? 2 : 3;
								break label143;
							case 2:
								var15 = this.aQ_int == var2 && var3 != 5 && (var1 + 1) * 24 > this.ar_int ? 5 : 1;
								break;
							case 3:
							default:
								var15 = this.aP_int < var1 ? 0 : 1;
								break;
							case 4:
								var15 = this.aQ_int == var2 && var3 != 4 && var1 * 24 < this.ar_int + 240 ? 4 : 0;
							}

							var3 = var15;
						}
					} else {
						var3 = this.aP_int < var1 ? 4 : 5;
						var4 = 0;
					}
				} else {
					label213: {
						byte var10000;
						if (this.aQ_int == var2 - 1) {
							var10000 = 17;
						} else if (this.aP_int == var1 - 1) {
							var10000 = 16;
						} else {
							if (this.aP_int != var1 + 1) {
								break label213;
							}

							var10000 = 15;
						}

						var3 = var10000;
					}

					var4 = 0;
				}

				c_byte_2d_Array[var1][var2] = 24;
				b_int_2d_Array[var1][var2] = var3 & 31 | var4 << 5;
			} else {
				b_byte_2d_Array[var1][var2] = (byte) (b_byte_2d_Array[var1][var2] - 6);
				if (b_byte_2d_Array[var1][var2] < 0) {
					if (a_byte_2d_Array[var1][var2 + 1] < 0) {
						b_byte_2d_Array[var1][var2 + 1] = 18;
						a_byte_2d_Array[var1][var2 + 1] = 46;
						a_byte_2d_Array[var1][var2] = -1;
						b_int_2d_Array[var1][var2 + 1] = var3;
						q_void_int_int(var1, var2);
						return;
					}

					var3 = var3 == 8 ? 10 : 11;
					b_int_2d_Array[var1][var2] = var3;
					b_byte_2d_Array[var1][var2] = 0;
					return;
				}

				if (a_boolean_int_int_int_int_int_int_int_int(var1, var2, 3, b_byte_2d_Array[var1][var2], this.aP_int,
						this.aQ_int, this.aS_int & 7, this.aR_int)) {
					this.a_void_int_int_int(1, 48, b_int_2d_Array[var1][var2] & 7);
					return;
				}
			}
		}
	}

	private static int a_int_a_int(a a, int integer) {
		int var2 = 0;
		int var3 = a.e_byte_Array[integer] & 255;

		for (int var4 = 0; var4 < var3; var4++) {
			var2 += a.f_byte_Array[(a.b_short_Array[integer] + var4) * 5 + 1] & 255;
		}

		return var2;
	}

	private void bK_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		c_byte_2d_Array[var1][var2] = 24;
		byte[] var10000;
		int var10001;
		byte var10002;
		switch ((b_int_2d_Array[var1][var2] & 56) >> 3) {
		case 0:
			if ((this.aP_int != var1 || (var2 + 1) * 24 <= this.as_int || this.i_byte == 3)
					&& (this.i_byte != 3 || this.l_long == 0L || (long) aN_int < this.l_long + (long) (21 - var1))) {
				return;
			}

			int var6 = var2 + 1;

			while (true) {
				byte var7 = a_byte_2d_Array[var1][var6];
				if (this.aQ_int == var6 || var7 >= 80 || var7 == 30 || var7 == 34 || var7 == 35 || var7 == 0) {
					if (this.aQ_int == var6 || this.i_byte == 3) {
						b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -57 | 8;
						b_byte_2d_Array[var1][var2] = 10;
						return;
					}

					return;
				}

				var6++;
			}
		case 1:
			b_byte_2d_Array[var1][var2]--;
			if (b_byte_2d_Array[var1][var2] <= 0) {
				a_int_2d_Array[var1][var2] = 34;
				b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -64 | 24 | 3;
				b_byte_2d_Array[var1][var2] = 0;
				return;
			}

			return;
		case 2:
		default:
			return;
		case 3:
			if (b_byte_2d_Array[var1][var2] > 0) {
				b_byte_2d_Array[var1][var2] = (byte) (b_byte_2d_Array[var1][var2] - 5);
				return;
			}

			boolean var4 = this.d_boolean_int_int(var1, var2 + 1);
			boolean var5 = false;
			if (var4 || a_byte_2d_Array[var1][var2 + 1] >= 0 || this.j_boolean && e_int_2d_Array[var1][var2 + 1] != 0) {
				if (var4) {
					this.a_void_int_int_int(1, 48, 0);
					var5 = true;
				} else {
					var5 = true;
					switch (a_byte_2d_Array[var1][var2 + 1]) {
					case 10:
						a_int_2d_Array[var1][var2 + 1] = 32;
						this.b_void_int_int(var1, var2 + 1);
						var5 = false;
						break;
					case 18:
						this.c_boolean();
						break;
					case 19:
					case 43:
					case 45:
					case 46:
					case 49:
						this.p_void_int_int(var1, var2 + 1);
						a_byte_2d_Array[var1][var2 + 1] = -1;
						break;
					case 21:
						var5 = false;
						break;
					case 30:
						this.C_void_int(11);
						b_int_2d_Array[var1][var2 + 1] = 1;
						break;
					default:
						this.C_void_int(14);
					}
				}
			}

			if (var5) {
				b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -64 | 32;
				b_byte_2d_Array[var1][var2] = 0;
				return;
			}

			a_byte_2d_Array[var1][var2] = -1;
			a_byte_2d_Array[var1][var2 + 1] = 44;
			b_int_2d_Array[var1][var2 + 1] = b_int_2d_Array[var1][var2];
			var10000 = b_byte_2d_Array[var1];
			var10001 = var2 + 1;
			var10002 = 19;
			break;
		case 4:
			if ((aN_int & 1) != 0) {
				return;
			}

			b_byte_2d_Array[var1][var2]++;
			if (b_byte_2d_Array[var1][var2] != a_a_Array[27].a_int_int(4)) {
				return;
			}

			var10000 = a_byte_2d_Array[var1];
			var10001 = var2;
			var10002 = -1;
		}

		var10000[var10001] = var10002;
		q_void_int_int(var1, var2);
	}

	private void bL_void() {
		int var1 = a_int_2d_Array[this.bE_int][this.bF_int] >> 8 & 0xFF;
		if ((aN_int & 1) == 0) {
			var1++;
		} else if (var1 == 1) {
			this.b_void_int_int(this.bE_int, this.bF_int);
		}

		int[] var10000;
		int var10001;
		int var10002;
		if (var1 == a_a_Array[16].a_int_int(0)) {
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = -1;
		} else {
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = var1 << 8 | 32;
		}

		var10000[var10001] = var10002;
		c_byte_2d_Array[this.bE_int][this.bF_int] = 24;
	}

	private void bM_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3 = a_int_2d_Array[var1][var2] >> 8;
		boolean var4 = j_boolean_int_int(var1, var2) || a_byte_2d_Array[var1][var2] == 47
				|| a_byte_2d_Array[var1][var2] == 48;
		int var5 = b_byte_2d_Array[var1][var2];
		if (!var4 && this.d_boolean_int_int(var1, var2)) {
			var4 = true;
			var5 = (this.aS_int & 4096) != 0 ? 0 : this.aR_int;
		}

		if (var4 && var5 < 12) {
			this.r_void_int(var3);
		} else {
			this.s_void_int(var3);
		}
	}

	private void bN_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3 = b_int_2d_Array[var1][var2];
		a var4 = a_a_Array[7];
		var3++;
		int var5 = a_int_a_int(var4, 0);
		if (var3 >= var5) {
			a_byte_2d_Array[var1][var2] = -1;
			q_void_int_int(var1, var2);
		} else {
			if (var3 == 1) {
				this.C_void_int(7);
				q_void_int_int(var1, var2);
			} else if (var3 == var5 >> 1) {
				for (int var6 = -1; var6 < 2; var6++) {
					for (int var7 = -1; var7 < 2; var7++) {
						int var8;
						int var9;
						label38: {
							var8 = var1 + var7;
							var9 = var2 + var6;
							int[] var10000;
							int var10001;
							byte var10002;
							switch (a_byte_2d_Array[var8][var9]) {
							case 8:
								a_byte_2d_Array[var8][var9] = 54;
								var10000 = b_int_2d_Array[var8];
								var10001 = var9;
								var10002 = 0;
								break;
							case 10:
								if (this.x_byte != 3) {
									break label38;
								}
							case 30:
							case 37:
								var10000 = b_int_2d_Array[var8];
								var10001 = var9;
								var10002 = 1;
								break;
							case 16:
							case 19:
							case 43:
							case 49:
								a_byte_2d_Array[var8][var9] = -1;
								this.p_void_int_int(var8, var9);
								c_byte_2d_Array[var8][var9] = 24;
							default:
								break label38;
							}

							var10000[var10001] = var10002;
							q_void_int_int(var8, var9);
						}

						if (this.d_boolean_int_int(var8, var9)) {
							this.a_void_int_int_int(1, 64, 0);
						}
					}
				}
			}

			b_int_2d_Array[var1][var2] = var3;
			c_byte_2d_Array[var1][var2] = 24;
		}
	}

	private void bO_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		if (b_int_2d_Array[var1][var2] == 0) {
			if (a_byte_2d_Array[var1][var2 - 1] == 11) {
				b_int_2d_Array[var1][var2] = 1;
				this.bS_void();
				return;
			}
		} else if (this.d_boolean_int_int(var1, var2 - 1)) {
			this.a_void_int_int_int(1, 64, 0);
		}
	}

	private void bP_void() {
		if (this.aR_int <= 6 && this.d_boolean_int_int(this.bE_int, this.bF_int)) {
			W_int = 0;
			this.j_byte = 0;
			cm_int = a_int_2d_Array[this.bE_int][this.bF_int] >> 8;
			this.j_void_int_int(this.aP_int + g_byte_Array[this.aS_int & 7], this.aQ_int);
			if (cm_int >= 0 && cm_int < m_byte_Array.length) {
				this.C_void_int(1);
				this.cl_int = 1;
				this.v_void_int(cm_int);
			} else {
				cm_int = -1;
			}

			a_int_2d_Array[this.bE_int][this.bF_int] = -1;
		}
	}

	private void o_void_int_int(int integer1, int integer2) {
		int var3 = this.bE_int;
		int var4 = this.bF_int;
		int var5 = integer1 == 23 ? -1 : 1;
		c_byte_2d_Array[var3][var4] = 24;
		if (this.aQ_int == var4) {
			for (int var6 = 0; var6 <= integer2; var6++) {
				int var7 = var3 + var6 * var5;
				if (this.aP_int == var7) {
					this.a_void_int_int_int(1, 64, 0);
				}
			}
		}
	}

	private void bQ_void() {
		boolean var1 = false;
		byte var2 = -1;
		boolean var3 = false;
		switch (this.aD_int) {
		case 2:
			this.bb_int++;
			var3 = true;
			var2 = 0;
		case 3:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 25:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50:
		default:
			break;
		case 4:
			var2 = 2;
			this.aU_int++;
			break;
		case 5:
			this.aV_int++;
			var2 = 1;
			break;
		case 6:
			this.ao_int++;
			e_byte_2d_Array[this.aP_int][this.aQ_int] = -1;
			d_int_2d_Array[this.aP_int][this.aQ_int] = d_int_2d_Array[this.aP_int][this.aQ_int] | 256;
			var2 = 0;
			this.a_void_int_int_int_int(this.ap_int, this.aq_int, this.aP_int, this.aQ_int);
			break;
		case 7:
			this.a_void_byte((byte) 127);
			var2 = 4;
			break;
		case 24:
			var3 = true;
			var1 = true;
			this.bm_int = 22;
			break;
		case 26:
			var1 = true;
			this.bm_int = 25;
			var3 = true;
			break;
		case 27:
			var3 = true;
			var1 = true;
			this.bm_int = 23;
			break;
		case 40:
			var3 = true;
			var1 = true;
			this.bm_int = 24;
			break;
		case 41:
			if (this.e_boolean()) {
				this.aj_boolean = true;
				this.g_void();
			}

			this.aZ_int = this.aZ_int + this.aC_int;
			this.P_int = this.P_int - this.aC_int;
			if (this.P_int <= 0 && !this.e_boolean()) {
				a_byte_2d_Array[this.Q_int][this.R_int] = -1;
				this.P_int = 0;
			}

			var2 = 3;
			break;
		case 42:
			var3 = true;
			var1 = true;
			this.n_boolean = true;
			this.bm_int = 11;
			break;
		case 51:
		case 52:
		case 53:
			this.a_void_int_int_int_int(this.ap_int, this.aq_int, this.aP_int, this.aQ_int);
			var2 = 0;
			var1 = true;
			this.g_void();
			this.f_boolean = true;
			i var10000;
			byte var10001;
			if (this.aD_int == 53) {
				var10000 = this;
				var10001 = 0;
			} else if (this.aD_int == 51) {
				var10000 = this;
				var10001 = 1;
			} else {
				var10000 = this;
				var10001 = 2;
			}

			var10000.s_int = var10001;
			i_byte_Array[2] = (byte) (i_byte_Array[2] | 1 << this.s_int);
			this.G_void();
		}

		if (var1) {
			this.n_void_int(47);
		}

		if (var2 != -1) {
			this.d_void_int_int_int(this.aP_int, this.aQ_int - 1, var2);
		}

		if (var3) {
			d_byte_Array[this.X_int << 1] = (byte) this.aP_int;
			d_byte_Array[(this.X_int << 1) + 1] = (byte) this.aQ_int;
			this.X_int++;
		}

		this.B_void();
		this.aD_int = -1;
	}

	private void x_void_int(int integer) {
		int var2 = this.bE_int;
		int var3 = this.bF_int;
		if (this.aR_int <= 0 && this.d_boolean_int_int(var2, var3)) {
			int var4;
			if ((var4 = a_int_2d_Array[var2][var3] & 0xFF) != 14 && var4 != 33
					|| a_int_2d_Array[var2][var3] >> 8 != 255) {
				label37: {
					this.aD_int = integer;
					i var10000;
					byte var10001;
					switch (integer) {
					case 2:
						this.aA_int = 3;
						var10000 = this;
						var10001 = 0;
						break;
					case 4:
						this.aA_int = 24;
						var10000 = this;
						var10001 = 0;
						break;
					case 5:
						this.aA_int = 25;
						var10000 = this;
						var10001 = 0;
						break;
					case 6:
						if (this.ao_int >= 99) {
							a_byte_2d_Array[var2][var3] = 7;
							b_int_2d_Array[var2][var3] = 0;
							this.x_void_int(7);
							break label37;
						}

						this.aA_int = 5;
						var10000 = this;
						var10001 = 0;
						break;
					case 7:
						if (this.n_byte == i_byte_Array[8]) {
							a_byte_2d_Array[var2][var3] = 41;
							b_int_2d_Array[var2][var3] = 10;
							this.aY_int += 10;
							this.x_void_int(41);
							break label37;
						}

						this.aA_int = 5;
						var10000 = this;
						var10001 = 1;
						break;
					case 40:
						this.aA_int = 19;
						this.aB_int = 0;
						a_byte_2d_Array[this.bE_int][this.bF_int] = -1;
						this.aD_int = 40;
						i_byte_Array[10] = 1;
						break label37;
					case 41:
						this.aA_int = 2;
						this.aB_int = 0;
						this.aC_int = b_int_2d_Array[this.bE_int][this.bF_int];
						break label37;
					case 42:
						this.aA_int = 29;
						var10000 = this;
						var10001 = 0;
						break;
					case 51:
						this.aA_int = 30;
						var10000 = this;
						var10001 = 0;
						break;
					case 52:
						this.aA_int = 31;
						var10000 = this;
						var10001 = 0;
						break;
					case 53:
						this.aA_int = 32;
						var10000 = this;
						var10001 = 0;
						break;
					default:
						break label37;
					}

					var10000.aB_int = var10001;
				}

				a_byte_2d_Array[var2][var3] = -1;
				this.B_void();
			}
		}
	}

	private boolean h_boolean_int_int(int integer1, int integer2) {
		return a_byte_2d_Array[integer1][integer2] == 28 || this.aI_int >= 24
				&& (a_byte_2d_Array[integer1][integer2 - 1] == 28 && (b_int_2d_Array[integer1][integer2 - 1] & 8) == 0
						|| a_byte_2d_Array[integer1][integer2 + 1] == 28
								&& (b_int_2d_Array[integer1][integer2 + 1] & 8) == 0)
				|| this.aK_int >= 24 && (a_byte_2d_Array[integer1][integer2 - 1] == 28
						|| a_byte_2d_Array[integer1][integer2 + 1] == 28);
	}

	private int a_int_int_int_int_int_boolean(int integer1, int integer2, int integer3, int integer4,
			boolean boolean5) {
		int var6 = integer1 - integer3;
		int var7 = integer2 - integer4;
		int var8 = var6 > 0 ? var6 : -var6;
		int var9 = var7 > 0 ? var7 : -var7;
		byte var10 = 0;
		if (var8 > var9) {
			label79: {
				byte var10000;
				if (var6 > 0) {
					var10000 = 4;
				} else {
					if (var6 >= 0) {
						break label79;
					}

					var10000 = 2;
				}

				var10 = var10000;
			}

			if (var10 != 0 && (!g_boolean_int_int(integer1 - g_byte_Array[var10], integer2)
					|| this.h_boolean_int_int(integer1 - g_byte_Array[var10], integer2))) {
				var10 = 0;
			}
		}

		if (var10 == 0) {
			label66: {
				byte var12;
				if (var7 > 0) {
					var12 = 1;
				} else {
					if (var7 >= 0) {
						break label66;
					}

					var12 = 3;
				}

				var10 = var12;
			}

			int var11 = integer2 - g_byte_Array[8 + var10];
			if (boolean5 && var10 != 0
					&& (!g_boolean_int_int(integer1, var11) || this.j_boolean && e_int_2d_Array[integer1][var11] != 0
							|| this.h_boolean_int_int(integer1, var11))) {
				label50: {
					var10 = 0;
					byte var13;
					if (var6 > 0) {
						var13 = 4;
					} else {
						if (var6 >= 0) {
							break label50;
						}

						var13 = 2;
					}

					var10 = var13;
				}

				if (var10 != 0 && a_byte_2d_Array[integer1 - g_byte_Array[var10]][integer2] >= 0) {
					var10 = 0;
				}
			}
		}

		return var10;
	}

	private void e_void_byte(byte byte1) {
		int var2 = this.bE_int;
		int var3 = this.bF_int;
		int var4 = b_int_2d_Array[var2][var3];
		byte var5 = b_byte_2d_Array[var2][var3];
		int var6 = 0;
		int var7 = 0;
		boolean var8 = (a_int_2d_Array[var2][var3] & 0xFF) == 35;
		boolean var9 = byte1 == 43 && (var4 & 3840) != 0;
		if (!var8 && this.i_boolean_int_int(var2, var3)) {
			a_byte_2d_Array[var2][var3] = -1;
			this.p_void_int_int(var2, var3);
		} else {
			int var10;
			label121: {
				var10 = var4 & 7;
				byte[] var19;
				int var20;
				byte var10002;
				if (var5 <= 0) {
					if (!var8 || var5 > 6) {
						q_void_int_int(var2, var3);
						if (var9) {
							var5 = 18;
							int var18 = this.a_int_int_int_int_int_boolean(var2, var3, this.aP_int, this.aQ_int, true);
							var4 = var4 & -8 | var18;
							var10 = var18;
							var6 = -g_byte_Array[var18];
							var7 = -g_byte_Array[var18 + 8];
							if (var18 == 0) {
								var5 = 0;
								var7 = 0;
								var6 = 0;
							}

							var4 -= 256;
						} else {
							label146: {
								if ((var4 & 16646144) != 0 && (var4 & 248) == 0) {
									int var17 = (var4 & 16646144) >> 17;
									int var12 = (var4 & 2130706432) >> 24;
									if (var2 == var17 && var3 == var12) {
										int var14;
										var10 = ((var14 = var4 & -16646145) & -2147483648) == 0 ? 2 : 1;
										var4 = var14 & -8 | var10;
										break label146;
									}

									var5 = 21;
									int var13 = this.a_int_int_int_int_int_boolean(var2, var3, var17, var12, true);
									var4 = var4 & -8 | var13;
									var6 = -g_byte_Array[var13];
									var7 = -g_byte_Array[var13 + 8];
									var10 = var13;
									if (var13 != 0) {
										break label146;
									}

									var5 = 0;
								} else {
									if (var10 == 0) {
										var5 = 21;
										int var11 = (var4 & 28672) >> 12;
										var4 = var4 & -8 | var11;
										var10 = var11;
										var6 = -g_byte_Array[var11];
										var7 = -g_byte_Array[var11 + 8];
										if (!g_boolean_int_int(var2 + var6, var3 + var7)) {
											var7 = 0;
											var6 = 0;
											var5 = 0;
										}
										break label146;
									}

									var5 = 21;
									var6 = -g_byte_Array[var10];
									var7 = -g_byte_Array[var10 + 8];
									if (g_boolean_int_int(var2 + var6, var3 + var7)) {
										break label146;
									}

									label106: {
										int var10000;
										short var10001;
										switch (var10) {
										case 1:
											var10000 = var4 & -28673;
											var10001 = 12288;
											break;
										case 2:
											var10000 = var4 & -28673;
											var10001 = 16384;
											break;
										case 3:
											var10000 = var4 & -28673;
											var10001 = 4096;
											break;
										case 4:
											var10000 = var4 & -28673;
											var10001 = 8192;
											break;
										default:
											break label106;
										}

										var4 = var10000 | var10001;
									}

									var4 = var4 & -8 | 0;
									var10 = 0;
								}

								var7 = 0;
								var6 = 0;
							}
						}
					} else if (var5 < 0) {
						b_byte_2d_Array[var2][var3] = 0;
					}

					if ((var4 & 248) == 0) {
						a_byte_2d_Array[var2][var3] = -1;
						a_byte_2d_Array[var2 + var6][var3 + var7] = byte1;
						c_byte_2d_Array[var2 + var6][var3 + var7] = 48;
						b_byte_2d_Array[var2 + var6][var3 + var7] = var5;
						b_int_2d_Array[var2 + var6][var3 + var7] = var4;
						break label121;
					}

					if ((aN_int & 3) == 0) {
						var4 = var4 & -249 | (var4 & 248) - 8;
						if (byte1 == 43 && (var4 & 248) == 0) {
							var4 = var4 & -3841 | 3072;
						}
					}

					var19 = b_byte_2d_Array[var2];
					var20 = var3;
					var10002 = 0;
				} else {
					if (var5 < 0) {
						b_byte_2d_Array[var2][var3] = 0;
					}

					var5 = (byte) (var5 - 3);
					var19 = b_byte_2d_Array[var2];
					var20 = var3;
					var10002 = var5;
				}

				var19[var20] = var10002;
			}

			if ((var4 & 248) == 0 && (a_g_Array[0].f_int < 13 || a_g_Array[0].f_int > 16)
					&& a_boolean_int_int_int_int_int_int_int_int(var2, var3, var10, b_byte_2d_Array[var2][var3],
							this.aP_int, this.aQ_int, (this.aS_int & 4096) == 0 ? this.k_byte : 0, this.aR_int)) {
				this.a_void_int_int_int(1, 48, var10);
				if (var9) {
					var4 &= -3841;
				}
			}

			b_int_2d_Array[var2][var3] = var4;
		}
	}

	private void bR_void() {
		int var1;
		if ((var1 = (a_int_2d_Array[this.bE_int][this.bF_int] & -268435456) >> 28) == 0) {
			this.C_void_int(10);
		}

		if ((aN_int & 1) == 0) {
			var1++;
		}

		int[] var10000;
		int var10001;
		int var10002;
		if (var1 >= a_a_Array[13].a_int_int(0)) {
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = a_int_2d_Array[this.bE_int][this.bF_int] & 268435455;
		} else {
			var10000 = a_int_2d_Array[this.bE_int];
			var10001 = this.bF_int;
			var10002 = a_int_2d_Array[this.bE_int][this.bF_int] & 268435455 | var1 << 28;
		}

		var10000[var10001] = var10002;
		q_void_int_int(this.bE_int, this.bF_int);
	}

	private void bS_void() {
		if (this.i_byte != 3 && this.i_byte != 4 && this.i_byte != 5 || this.af_int <= 0) {
			if (cm_int >= 0) {
				m_byte_Array[cm_int]--;
				if (m_byte_Array[cm_int] == 0) {
					this.w_void_int(cm_int);
				}
			}
		}
	}

	private void y_void_int(int integer) {
		if ((a_int_2d_Array[this.bE_int][this.bF_int] & 0xFF) != 14
				|| a_int_2d_Array[this.bE_int][this.bF_int] >> 8 != 255) {
			if (this.d_boolean_int_int(this.bE_int, this.bF_int)
					&& (a_g_Array[0].f_int == 40 || a_g_Array[0].f_int == 48)) {
				label22: {
					a_byte_2d_Array[this.bE_int][this.bF_int] = -1;
					i var10000;
					byte var10001;
					switch (integer) {
					case 24:
						i_byte_Array[9] = 1;
						this.aA_int = 7;
						this.aB_int = 0;
						var10000 = this;
						var10001 = 24;
						break;
					case 25:
					default:
						break label22;
					case 26:
						i_byte_Array[9] = 8;
						this.aA_int = 7;
						this.aB_int = 2;
						var10000 = this;
						var10001 = 26;
						break;
					case 27:
						i_byte_Array[9] = 2;
						this.aA_int = 7;
						this.aB_int = 1;
						var10000 = this;
						var10001 = 27;
					}

					var10000.aD_int = var10001;
				}

				this.a_void_int_int_int_int(this.ap_int, this.aq_int, this.bE_int, this.bF_int);
			}
		}
	}

	private void bT_void() {
		int var1;
		if ((var1 = b_int_2d_Array[this.bE_int][this.bF_int]) > 0) {
			int var2 = this.bE_int;
			int var3 = this.bF_int;
			if (var1 == 4) {
				for (int var4 = 1; var4 < 5; var4++) {
					byte var5 = g_byte_Array[var4];
					byte var6 = g_byte_Array[var4 + 8];
					if (a_byte_2d_Array[var2 + var5][var3 + var6] == 30) {
						b_int_2d_Array[var2 + var5][var3 + var6]++;
						c_byte_2d_Array[var2 + var5][var3 + var6] = 24;
					}
				}
			} else if (var1 >= 16) {
				a_byte_2d_Array[var2][var3] = -1;
				q_void_int_int(var2, var3);
			}

			b_int_2d_Array[var2][var3] = var1 + 1;
			c_byte_2d_Array[var2][var3] = 24;
		}
	}

	private void bU_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3;
		if ((var3 = b_int_2d_Array[var1][var2]) > 0) {
			if (var3 >= 8) {
				this.t_void_int_int(var1, var2);
				a_byte_2d_Array[var1][var2] = -1;
				q_void_int_int(var1, var2);
			}

			b_int_2d_Array[var1][var2] = var3 + 1;
			c_byte_2d_Array[var1][var2] = 24;
		}
	}

	private void bV_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3;
		if ((var3 = (b_int_2d_Array[var1][var2] & 3840) >> 8) != 0) {
			if (var3 >= 4) {
				a_byte_2d_Array[var1][var2] = -1;
			} else if ((aN_int >> 1 & 1) == 0) {
				b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] + 256;
			}
		} else if (e_int_2d_Array != null && e_int_2d_Array[var1][var2] != 0) {
			b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -3841 | 256;
		} else if (b_byte_2d_Array[var1][var2] <= 4) {
			label162: {
				int var4 = b_int_2d_Array[var1][var2];
				c_byte_2d_Array[var1][var2] = 24;
				boolean var5 = (var4 & 16) != 0;
				int var6;
				int[] var13;
				int var10001;
				int var10002;
				int var10003;
				if ((var6 = var4 & 7) != 0) {
					int var7;
					int var8;
					byte var9;
					byte var10;
					int var11;
					int var12;
					label153: {
						var7 = 0;
						var8 = 0;
						var9 = 0;
						var10 = 0;
						var11 = 0;
						var12 = 0;
						byte var10000;
						switch (var6) {
						case 1:
							var7 = var5 ? -1 : 1;
							var11 = var5 ? 4 : 2;
							var12 = var5 ? 2 : 4;
							var10 = -1;
							break label153;
						case 2:
							var8 = var5 ? -1 : 1;
							var11 = var5 ? 1 : 3;
							var12 = var5 ? 3 : 1;
							var10000 = 1;
							break;
						case 3:
							var7 = var5 ? 1 : -1;
							var11 = var5 ? 2 : 4;
							var12 = var5 ? 4 : 2;
							var10 = 1;
							break label153;
						case 4:
							var8 = var5 ? 1 : -1;
							var11 = var5 ? 3 : 1;
							var12 = var5 ? 1 : 3;
							var10000 = -1;
							break;
						default:
							break label153;
						}

						var9 = var10000;
					}

					if (g_boolean_int_int(var1 + var9, var2 + var10) && g_boolean_int_int(var1 + var7, var2 + var8)
							&& g_boolean_int_int(var1 + var7 - var9, var2 + var8 - var10)) {
						if (b_byte_2d_Array[var1][var2] <= 0) {
							b_int_2d_Array[var1 + var9][var2 + var10] = var4;
							a_byte_2d_Array[var1 + var9][var2 + var10] = 11;
							a_byte_2d_Array[var1][var2] = -1;
							b_byte_2d_Array[var1 + var9][var2 + var10] = 18;
						}
						break label162;
					}

					if (g_boolean_int_int(var1 + var7, var2 + var8)) {
						b_int_2d_Array[var1 + var7][var2 + var8] = var4 & -8 | var11;
						a_byte_2d_Array[var1 + var7][var2 + var8] = 11;
						a_byte_2d_Array[var1][var2] = -1;
						b_byte_2d_Array[var1 + var7][var2 + var8] = 18;
						break label162;
					}

					if (g_boolean_int_int(var1 + var9, var2 + var10)) {
						if (b_byte_2d_Array[var1][var2] <= 0) {
							b_int_2d_Array[var1 + var9][var2 + var10] = var4;
							a_byte_2d_Array[var1 + var9][var2 + var10] = 11;
							a_byte_2d_Array[var1][var2] = -1;
							b_byte_2d_Array[var1 + var9][var2 + var10] = 18;
						}
						break label162;
					}

					var13 = b_int_2d_Array[var1];
					var10001 = var2;
					var10002 = var4 & -8;
					var10003 = var12;
				} else {
					label159: {
						if (a_byte_2d_Array[var1 - 1][var2] >= 0) {
							var13 = b_int_2d_Array[var1];
							var10001 = var2;
							var10002 = var4 & -8 | (var5 ? 1 : 3);
						} else {
							if (a_byte_2d_Array[var1][var2 + 1] < 0) {
								break label159;
							}

							var13 = b_int_2d_Array[var1];
							var10001 = var2;
							var10002 = var4 & -8 | (var5 ? 2 : 4);
						}

						var13[var10001] = var10002;
					}

					if (a_byte_2d_Array[var1 + 1][var2] >= 0) {
						b_int_2d_Array[var1][var2] = var4 & -8 | (var5 ? 3 : 1);
					}

					if (a_byte_2d_Array[var1][var2 + 1] < 0) {
						break label162;
					}

					var13 = b_int_2d_Array[var1];
					var10001 = var2;
					var10002 = var4 & -8;
					var10003 = var5 ? 4 : 2;
				}

				var13[var10001] = var10002 | var10003;
			}

			q_void_int_int(var1, var2);
		}

		if (this.d_boolean_int_int(var1, var2)) {
			this.a_void_int_int_int(1, 64, 0);
		}

		if (b_byte_2d_Array[var1][var2] > 0) {
			b_byte_2d_Array[var1][var2] = (byte) (b_byte_2d_Array[var1][var2] - 5);
		}
	}

	private void bW_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		if (b_int_2d_Array[var1][var2] > 0) {
			a_byte_2d_Array[var1][var2] = -1;
			a_int_2d_Array[var1][var2] = 32;
			q_void_int_int(var1, var2);
			this.t_void_int_int(var1, var2);
			c_byte_2d_Array[var1][var2] = 24;
		}
	}

	private void bX_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		c_byte_2d_Array[var1][var2] = 24;
		byte[] var10000;
		int var10001;
		byte var10002;
		if (b_byte_2d_Array[var1][var2] == 0) {
			int var4;
			byte var5;
			boolean var7;
			int var3;
			var4 = ((var3 = b_int_2d_Array[var1][var2]) & 1) == 0 ? -1 : 1;
			var5 = a_byte_2d_Array[var1 + var4][var2];
			int var6 = a_int_2d_Array[var1 + var4][var2] & 0xFF;
			var7 = false;
			int var8;
			label63: if ((var8 = var3 >> 1) <= 0) {
				var7 = true;
			} else if (var5 < 0 && var6 != 14 && var6 != 33) {
				b_int_2d_Array[var1 + var4][var2] = var8 - 1 << 1 | var3 & 1;
				c_byte_2d_Array[var1 + var4][var2] = 30;
				b_byte_2d_Array[var1 + var4][var2] = 18;
				var5 = 32;
			} else if (var5 != 32) {
				int var9 = b_int_2d_Array[var1 + var4][var2];
				int var10 = 0;
				if (var5 != 48 || (var9 & 8) == 0) {
					switch (var5) {
					case 1:
					case 2:
					case 4:
					case 5:
					case 6:
					case 7:
						var10 = -var4;
					case 0:
					case 8:
					case 9:
					case 11:
					case 14:
					case 19:
					case 43:
					case 47:
					case 48:
					case 49:
						this.C_void_int(12);
						this.o_byte = 0;
						this.bi_int = this.aP_int - (var1 + var4) + var10;
						this.bg_int = var1 + var4;
						this.bh_int = var2;
						if (this.bf_int == -1) {
							switch (var5) {
							case 0:
							case 8:
							case 9:
							case 47:
								int var11 = var9 & -28673;
								var9 = (var11) & -513;
							default:
								this.bf_int = var9;
							}
						}

						if (this.bi_int < 0) {
							this.be_int = var9 & -8 | 4;
						} else {
							this.be_int = var9 & -8 | 2;
						}
						break;
					case 3:
					case 10:
					case 12:
					case 13:
					case 15:
					case 16:
					case 17:
					case 18:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
					case 28:
					case 29:
					case 30:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 40:
					case 41:
					case 42:
					case 44:
					case 45:
					case 46:
					default:
						if (var5 == -1) {
							break;
						}
						break label63;
					}
				}
			}

			if (var7) {
				for (int var12 = 1; var12 <= 3; var12++) {
					if (a_byte_2d_Array[this.aP_int + var4 * var12][this.aQ_int] == 32) {
						a_byte_2d_Array[this.aP_int + var4 * var12][this.aQ_int] = -1;
					}
				}
			}

			var10000 = a_byte_2d_Array[var1 + var4];
			var10001 = var2;
			var10002 = var5;
		} else {
			var10000 = b_byte_2d_Array[var1];
			var10001 = var2;
			var10002 = (byte) (var10000[var2] - 6);
		}

		var10000[var10001] = var10002;
		q_void_int_int(var1, var2);
	}

	private void bY_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3 = b_int_2d_Array[var1][var2] & 7;
		if ((b_int_2d_Array[var1][var2] & 8) != 0) {
			byte var13;
			switch (var3) {
			case 2:
				var13 = 13;
				break;
			case 4:
				var13 = 12;
				break;
			default:
				var13 = 14;
			}

			byte var11 = var13;
			if (b_byte_2d_Array[var1][var2] < a_int_a_int(a_a_Array[29], var11)
					&& (a_int_2d_Array[this.bE_int][this.bF_int] & 0xFF) != 35) {
				b_byte_2d_Array[var1][var2]++;
			} else {
				a_byte_2d_Array[var1][var2] = -1;
				q_void_int_int(var1, var2);
			}

			c_byte_2d_Array[var1][var2] = 24;
		} else {
			if (this.d_boolean_int_int(var1, var2)
					|| this.d_boolean_int_int(var1 + g_byte_Array[var3], var2 + g_byte_Array[8 + var3])
							&& b_byte_2d_Array[var1][var2] <= this.aR_int) {
				this.a_void_int_int_int(1, 48, 0);
			}

			byte[] var12;
			int var14;
			byte var15;
			if (b_byte_2d_Array[var1][var2] <= 0) {
				int var4 = var1 - g_byte_Array[var3];
				int var5 = var2 - g_byte_Array[var3 + 8];
				byte var6 = 24;
				if (var3 == 4) {
					var6 = 12;
				}

				if (a_byte_2d_Array[var4][var5] < 0) {
					a_byte_2d_Array[var4][var5] = 21;
					b_int_2d_Array[var4][var5] = b_int_2d_Array[var1][var2];
					b_byte_2d_Array[var4][var5] = var6;
					var12 = a_byte_2d_Array[var1];
					var14 = var2;
					var15 = -1;
				} else if (a_byte_2d_Array[var4][var5] == 21) {
					int var7 = b_int_2d_Array[var4][var5] & 7;
					int var8 = var4 - g_byte_Array[var7];
					int var9 = var5 - g_byte_Array[var7 + 8];
					a_byte_2d_Array[var1][var2] = -1;
					q_void_int_int(var1, var2);
					int var10 = b_int_2d_Array[var1][var2];
					if (a_byte_2d_Array[var8][var9] < 0) {
						a_byte_2d_Array[var8][var9] = 21;
						b_int_2d_Array[var8][var9] = b_int_2d_Array[var4][var5];
						b_byte_2d_Array[var8][var9] = 18;
					}

					a_byte_2d_Array[var4][var5] = 21;
					b_int_2d_Array[var4][var5] = var10;
					var12 = b_byte_2d_Array[var4];
					var14 = var5;
					var15 = 18;
				} else {
					switch (a_byte_2d_Array[var4][var5]) {
					case 10:
					case 30:
						if (b_int_2d_Array[var4][var5] < 1) {
							b_int_2d_Array[var4][var5] = 1;
						}
						break;
					case 19:
					case 43:
					case 45:
					case 46:
						a_byte_2d_Array[var4][var5] = -1;
						this.p_void_int_int(var4, var5);
					}

					b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] | 8;
					var12 = b_byte_2d_Array[var1];
					var14 = var2;
					var15 = 0;
				}

				var12[var14] = var15;
				var12 = c_byte_2d_Array[var4];
				var14 = var5;
				var15 = 48;
			} else {
				var12 = b_byte_2d_Array[var1];
				var14 = var2;
				var15 = (byte) (var12[var2] - 12);
			}

			var12[var14] = var15;
		}
	}

	private void p_void_int_int(int integer1, int integer2) {
		a_int_2d_Array[integer1][integer2] = a_int_2d_Array[integer1][integer2] & 268435455 | 268435456;
		this.bS_void();
	}

	private void bZ_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3;
		int var4 = ((var3 = b_int_2d_Array[var1][var2]) & 0xFF00) >> 8;
		int var5 = (var3 & 8) != 0 ? 4 : 2;
		if (var4 >= 20) {
			if (g_boolean_int_int(var1, var2 + 1)
					|| var5 == 4 && (a_byte_2d_Array[var1 - 1][var2] < 0 || a_byte_2d_Array[var1 - 1][var2] == 16
							|| a_byte_2d_Array[var1 - 1][var2] == 19 || a_byte_2d_Array[var1 - 1][var2] == 43)
					|| var5 == 2 && (a_byte_2d_Array[var1 + 1][var2] < 0 || a_byte_2d_Array[var1 + 1][var2] == 16
							|| a_byte_2d_Array[var1 + 1][var2] == 19 || a_byte_2d_Array[var1 + 1][var2] == 43)) {
				b_int_2d_Array[var1][var2] = var3 & -65281 | 4864;
			}
		} else {
			label79: {
				byte[] var10000;
				int var10001;
				byte var10002;
				if (var4 > 0) {
					b_int_2d_Array[var1][var2] = var3 & -65281 | var4 - 1 << 8;
					var10000 = c_byte_2d_Array[var1];
					var10001 = var2;
					var10002 = 24;
				} else {
					byte var6;
					if ((var6 = b_byte_2d_Array[var1][var2]) <= 0) {
						int var7 = var1;
						int var8 = var2;
						if (g_boolean_int_int(var1, var2 + 1)) {
							var8 = var2 + 1;
							var5 = 3;
						} else {
							label110: {
								if (var5 == 4) {
									if (g_boolean_int_int(var1 - 1, var2)) {
										var7 = var1 - 1;
										break label110;
									}

									var5 = 0;
									if (a_byte_2d_Array[var1 - 1][var2] == 16 || a_byte_2d_Array[var1 - 1][var2] == 19
											|| a_byte_2d_Array[var1 - 1][var2] == 43) {
										break label110;
									}
								} else {
									if (g_boolean_int_int(var1 + 1, var2)) {
										var7 = var1 + 1;
										break label110;
									}

									var5 = 0;
									if (a_byte_2d_Array[var1 + 1][var2] == 16 || a_byte_2d_Array[var1 + 1][var2] == 19
											|| a_byte_2d_Array[var1 + 1][var2] == 43) {
										break label110;
									}
								}

								var3 = var3 & -65281 | 5120;
							}
						}

						if (var7 != var1 || var8 != var2) {
							a_byte_2d_Array[var7][var8] = 14;
							q_void_int_int(var7, var8);
							a_byte_2d_Array[var1][var2] = -1;
							b_byte_2d_Array[var7][var8] = 18;
						}

						b_int_2d_Array[var7][var8] = var3 & -8 | var5;
						break label79;
					}

					var10000 = b_byte_2d_Array[var1];
					var10001 = var2;
					var10002 = (byte) (var6 - 6);
				}

				var10000[var10001] = var10002;
			}
		}

		if (this.d_boolean_int_int(var1, var2)) {
			this.a_void_int_int_int(1, 48, var5);
		}
	}

	private void ca_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		byte var3;
		byte var10000;
		if (a_byte_2d_Array[var1][var2 + 1] != 16) {
			var3 = 0;
			var10000 = -1;
		} else {
			var3 = 1;
			var10000 = 0;
		}

		byte var4 = var10000;
		byte var5 = b_byte_2d_Array[var1][var2 + var3];
		int var6;
		int var7 = ((var6 = b_int_2d_Array[var1][var2 + var3]) & 7) == 4 ? 4 : 2;
		boolean var8 = this.d_boolean_int_int(var1 - g_byte_Array[var7], var2 + var3)
				|| this.d_boolean_int_int(var1 - g_byte_Array[var7], var2 + var4);
		if (var5 <= 0 && var8 && this.aR_int <= 12) {
			var5 = 36;
		} else if (var5 > 0) {
			if (var3 == 0) {
				var5--;
			}

			if ((var5 == 11 || var3 == 0 && var5 < 11) && var8) {
				this.a_void_int_int_int(1, 48, var6 & 7);
			}

			c_byte_2d_Array[var1][var2] = 24;
		}

		if (this.i_boolean_int_int(var1, var2)) {
			this.C_void_int(7);
			a_byte_2d_Array[var1][var2 + var4] = -1;
			this.p_void_int_int(var1, var2 + var4);
			a_byte_2d_Array[var1][var2 + var3] = -1;
			this.p_void_int_int(var1, var2 + var3);
		} else {
			b_int_2d_Array[var1][var2 + var4] = var6;
			b_int_2d_Array[var1][var2 + var3] = var6;
			if (var3 == 0) {
				b_byte_2d_Array[var1][var2 + var4] = var5;
				b_byte_2d_Array[var1][var2 + var3] = var5;
			}
		}
	}

	private void cb_void() {
		int var1;
		int var2 = ((var1 = b_int_2d_Array[this.bE_int][this.bF_int]) & 7) == 3 ? 1 : -1;
		int var3 = (var1 & 8) == 0 ? this.aJ_int : this.aL_int;
		int var5 = this.bF_int + (var3 - 1) * var2;
		if (this.d_boolean_int_int(this.bE_int, var5)) {
			this.a_void_int_int_int(2, 48, h_byte_Array[this.aS_int & 7]);
		}

		switch (a_byte_2d_Array[this.bE_int][var5]) {
		default:
			this.p_void_int_int(this.bE_int, var5);
			a_byte_2d_Array[this.bE_int][var5] = -1;
			q_void_int_int(this.bE_int, var5);
			this.b_void_int_int(this.bE_int, var5);
		case -1:
		case 28:
		case 32:
			c_byte_2d_Array[this.bE_int][this.bF_int] = 24;
		}
	}

	private void cc_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3 = a_int_2d_Array[var1][var2] >> 8;
		int var4 = a_int_2d_Array[var1][var2] & 0xFF;
		if ((var3 & 256) == 0 && (var4 == 9 && this.aU_int > 0 || var4 == 8 && this.aV_int > 0) && this.aQ_int == var2
				&& (this.aP_int == var1 - 1 || this.aP_int == var1 + 1)) {
			int var5 = a_g_Array[0].f_int;
			if (a_g_Array[0].f_int != 18 && var5 != 17 && this.aR_int <= 6) {
				this.k_byte = this.j_byte = 0;
				i var10000;
				byte var10001;
				if (this.aP_int == var1 - 1) {
					this.aS_int = this.aS_int & -8 | 2;
					var10000 = this;
					var10001 = 18;
				} else {
					this.aS_int = this.aS_int & -8 | 4;
					var10000 = this;
					var10001 = 17;
				}

				var10000.n_void_int(var10001);
				if (var4 == 9) {
					var10000 = this;
					var10001 = 24;
				} else {
					var10000 = this;
					var10001 = 25;
				}

				var10000.aA_int = var10001;
				this.aB_int = 0;
			}
		}
	}

	private void cd_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3;
		int var4;
		if ((var4 = ((var3 = a_int_2d_Array[var1][var2] >> 8) & 240) >> 4) != 0) {
			if (aN_int % 3 == 0 && var4 < 3) {
				var3 = var3 & -241 | var4 + 1 << 4;
				if (var4 == 2) {
					int var5;
					if ((var5 = a_int_2d_Array[var1][var2 - 1] & 0xFF) == 9 || var5 == 8) {
						int var6 = a_int_2d_Array[var1][var2 - 1] >> 8 & -513;
						a_int_2d_Array[var1][var2 - 1] = var6 << 8 | var5;
					}

					this.a_void_int_int_int_int_int(var1, var2 - 1, 1, 0, 0);
					this.a_void_int_int_int_int_int(var1, var2 - 1, -1, 0, 0);
				}

				c_byte_2d_Array[var1][var2] = 24;
			}

			a_int_2d_Array[var1][var2] = var3 << 8 | 7;
		}
	}

	private void ce_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		int var3;
		if ((var3 = a_int_2d_Array[var1][var2] >> 8) >= 6) {
			c_byte_2d_Array[var1][var2] = 0;
		} else {
			label36: switch (var3) {
			case -1:
				if (Math.abs(this.aP_int - var1) < 4 && Math.abs(this.aQ_int - var2) < 4) {
					var3 = 3;
				}
			case 0:
			case 1:
				break;
			case 2:
				switch (this.k_byte) {
				case 1:
					if (!this.d_boolean_int_int(var1, var2 - 1)) {
						break label36;
					}
					break;
				case 2:
					if (!this.d_boolean_int_int(var1 + 1, var2)) {
						break label36;
					}
					break;
				case 3:
					if (!this.d_boolean_int_int(var1, var2 + 1)) {
						break label36;
					}
					break;
				case 4:
					if (!this.d_boolean_int_int(var1 - 1, var2)) {
						break label36;
					}
					break;
				default:
					break label36;
				}

				var3 = 3;
				break;
			default:
				if ((aN_int & 1) == 0) {
					var3++;
				}
			}

			c_byte_2d_Array[var1][var2] = 24;
			a_int_2d_Array[var1][var2] = var3 << 8 | 3;
		}
	}

	private void z_void_int(int integer) {
		int var2 = this.bE_int;
		int var3 = this.bF_int;
		int var4 = a_int_2d_Array[var2][var3] >> 8;
		a_int_2d_Array[var2][var3] = var4 << 8 | integer;
		if (b_byte_2d_Array[var2][var3] <= 0) {
			if (var4 == 0) {
				if (this.d_boolean_int_int(var2, var3) && this.aR_int <= 0) {
					this.aS_int &= -2049;
					a_int_2d_Array[var2][var3] = 256 | integer;
					i var10000;
					byte var10001;
					if (Math.abs(this.j_long - System.currentTimeMillis()) >= 5000L) {
						var10000 = this;
						var10001 = 40;
					} else {
						var10000 = this;
						var10001 = 48;
					}

					var10000.n_void_int(var10001);
					this.C_void_int(3);
					return;
				}
			} else if ((aN_int >> 1 & 1) == 0 && a_a_Array[integer == 14 ? 8 : 22] != null
					&& var4 < a_a_Array[integer == 14 ? 8 : 22].a_int_int(0) - 1) {
				a_int_2d_Array[var2][var3] = var4 + 1 << 8 | integer;
				c_byte_2d_Array[var2][var3] = 24;
			}
		}
	}

	private boolean i_boolean_int_int(int integer1, int integer2) {
		int var3 = integer2 - 1;
		int var4 = integer1 - 1;
		int var5 = integer1 + 1;
		return b_byte_2d_Array[integer1][var3] <= 6
				&& (j_boolean_int_int(integer1, var3)
						&& ((b_int_2d_Array[integer1][var3] & 7) == 3
								|| a_byte_2d_Array[integer1][integer2] != 16 && a_byte_2d_Array[integer1][var3] != 1)
						|| a_byte_2d_Array[integer1][var3] == 46 || a_byte_2d_Array[integer1][var3] == 14
						|| a_byte_2d_Array[integer1][var3] == 48)
				|| b_byte_2d_Array[var5][integer2] <= 0 && a_byte_2d_Array[var5][integer2] == 14
						&& (b_int_2d_Array[var5][integer2] & 8) != 0 && (b_int_2d_Array[var5][integer2] & 7) != 3
				|| b_byte_2d_Array[var4][integer2] <= 0 && a_byte_2d_Array[var4][integer2] == 14
						&& (b_int_2d_Array[var4][integer2] & 8) == 0 && (b_int_2d_Array[var4][integer2] & 7) != 3;
	}

	private static boolean j_boolean_int_int(int integer1, int integer2) {
		if (a_byte_2d_Array[integer1][integer2] >= 0) {
			switch (a_byte_2d_Array[integer1][integer2]) {
			case 0:
			case 1:
			case 8:
			case 9:
				return true;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			}
		}

		return false;
	}

	private static void q_void_int_int(int integer1, int integer2) {
		int var2 = integer1 - 1;
		int var3 = integer1 + 1;
		int var4 = integer2 - 1;
		int var5 = integer2 + 1;
		c_byte_2d_Array[var2][var4] = 48;
		c_byte_2d_Array[integer1][var4] = 48;
		c_byte_2d_Array[var3][var4] = 48;
		c_byte_2d_Array[var2][integer2] = 48;
		c_byte_2d_Array[integer1][integer2] = 48;
		c_byte_2d_Array[var3][integer2] = 48;
		c_byte_2d_Array[var2][var5] = 48;
		c_byte_2d_Array[integer1][var5] = 48;
		c_byte_2d_Array[var3][var5] = 48;
	}

	private void cf_void() {
		this.h_byte = i_byte_Array[10];
		this.ch_int = this.cf_int;
		this.cg_int = this.ce_int;
		this.U_int = this.P_int;
		this.bZ_int = this.ax_int;
		this.bX_int = this.aZ_int;
		this.bY_int = this.bb_int;
		this.bS_int = this.aP_int;
		this.bT_int = this.aQ_int;
		this.bU_int = this.aU_int;
		this.bV_int = this.aV_int;
		this.bW_int = this.an_int;
		this.Y_int = this.X_int;
		this.ca_int = this.ab_int;
		this.cb_int = this.aa_int;
		cn_int = cm_int;
		if (m_byte_Array != null) {
			System.arraycopy(m_byte_Array, 0, o_byte_Array, 0, m_byte_Array.length);
		}

		for (int var1 = 0; var1 < this.av_int; var1++) {
			System.arraycopy(b_int_2d_Array[var1], 0, c_int_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(b_byte_2d_Array[var1], 0, d_byte_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(a_byte_2d_Array[var1], 0, e_byte_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(a_int_2d_Array[var1], 0, d_int_2d_Array[var1], 0, this.aw_int);
		}

		this.ck_void();
	}

	private void cg_void() {
		label102: {
			cE_int = -1;
			this.aA_int = this.aB_int = this.aC_int = -1;
			this.bg_int = 0;
			this.bh_int = 0;
			this.C_boolean = true;
			this.ci_int = this.bS_int * 24 - 120;
			this.cj_int = this.bT_int * 24 - 160 + 30;
			this.bl_int = 0;
			int[] var10000;
			byte var10001;
			if (this.o_boolean) {
				this.bm_int = 15;
				this.o_boolean = false;
				d_int_2d_Array[37][7] = -1;
				var10000 = d_int_2d_Array[39];
				var10001 = 5;
			} else {
				if (!this.p_boolean) {
					break label102;
				}

				this.bm_int = 17;
				this.p_boolean = false;
				d_int_2d_Array[46][7] = -1;
				var10000 = d_int_2d_Array[50];
				var10001 = 7;
			}

			var10000[var10001] = -1;
		}

		this.r_boolean = false;
		this.am_int = 70;
		i_byte_Array[10] = this.h_byte;
		this.P_int = this.U_int;
		this.cf_int = this.ch_int;
		this.ce_int = this.cg_int;
		this.ax_int = this.bZ_int;
		this.bb_int = this.bY_int;
		this.aZ_int = this.bX_int;
		a_g_Array[0].a_void_int(2);
		this.aS_int = 2;
		this.bj_int = 0;
		this.aP_int = this.bS_int;
		this.aQ_int = this.bT_int;
		this.aU_int = this.bU_int;
		this.aV_int = this.bV_int;
		this.X_int = this.Y_int;
		switch (this.i_byte) {
		case 1:
			this.aa_int = this.cb_int;
			this.ab_int = this.ca_int;
		case 2:
		default:
			break;
		case 3:
			this.af_int = 5;
			break;
		case 4:
			this.ad_int = 0;
			this.ag_int = 0;
			this.af_int = 3;
			this.i_boolean = false;
			break;
		case 5:
			this.L_void();
		}

		cm_int = cn_int;
		if (m_byte_Array != null) {
			System.arraycopy(o_byte_Array, 0, m_byte_Array, 0, m_byte_Array.length);
		}

		for (int var1 = 0; var1 < this.av_int; var1++) {
			System.arraycopy(c_int_2d_Array[var1], 0, b_int_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(d_byte_2d_Array[var1], 0, b_byte_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(e_byte_2d_Array[var1], 0, a_byte_2d_Array[var1], 0, this.aw_int);
			System.arraycopy(d_int_2d_Array[var1], 0, a_int_2d_Array[var1], 0, this.aw_int);
		}

		int var7 = this.aw_int - 1;

		for (int var2 = 1; var2 < var7; var2++) {
			int var3 = this.av_int - 1;

			for (int var4 = 1; var4 < var3; var4++) {
				byte var5 = a_byte_2d_Array[var4][var2];
				int var6 = a_int_2d_Array[var4][var2] & 0xFF;
				if (var5 > -1 && var5 < 80 || var6 > -1 && var6 < 80) {
					q_void_int_int(var4, var2);
				}
			}
		}

		if (a_g_Array[2] != null) {
			a_g_Array[2].a_void_int(0);
			a_byte_2d_Array[18][63] = -1;
		}

		this.an_int = this.bW_int;
		this.B_void();
		if (this.j_boolean) {
			this.cl_void();
		}

		if (e_byte_Array != null) {
			for (int var8 = 0; var8 < this.aw_int; var8++) {
				for (int var9 = 0; var9 < this.av_int; var9++) {
					if (a_byte_2d_Array[var9][var8] == 48) {
						this.bE_int = var9;
						this.bF_int = var8;
						if ((b_int_2d_Array[var9][var8] & 8) == 0) {
							this.d_void_byte((byte) 48);
						} else {
							this.bG_void();
						}
					}
				}
			}
		}
	}

	public static void a_void_short_short_byte_int(short short1, short short2, byte byte3, int integer) {
		a_byte_2d_Array[short1][short2] = byte3;
		b_int_2d_Array[short1][short2] = integer;
	}

	private static boolean b_boolean_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		return Math.abs(integer1 - integer3) < 24 && Math.abs(integer2 - integer4) < 24;
	}

	private static boolean a_boolean_int_int_int_int_int_int_int_int(int integer1, int integer2, int integer3,
			int integer4, int integer5, int integer6, int integer7, int integer8) {
		dm_int = 0;
		dl_int = 0;
		do_int = 100;
		dn_int = 100;
		if (Math.abs(integer1 - integer5) <= 1 && Math.abs(integer2 - integer6) <= 1) {
			dl_int = integer1 * 24 + g_byte_Array[integer3] * integer4;
			dm_int = integer2 * 24 + g_byte_Array[8 + integer3] * integer4;
			dn_int = integer5 * 24 + g_byte_Array[integer7] * integer8;
			do_int = integer6 * 24 + g_byte_Array[8 + integer7] * integer8;
			return b_boolean_int_int_int_int(dl_int, dm_int, dn_int, do_int);
		} else {
			return false;
		}
	}

	private void ch_void() {
		int var1 = this.bE_int;
		int var2 = this.bF_int;
		byte var3 = b_byte_2d_Array[var1][var2];
		int var4 = b_int_2d_Array[var1][var2];
		byte var5 = a_byte_2d_Array[var1][var2];
		boolean var10 = e_int_2d_Array != null && e_int_2d_Array[var1][var2] != 0;
		int var11 = var4 & 7;
		byte var6;
		byte var7;
		int var10000;
		if (var10 && e_int_2d_Array[var1][var2] != 3) {
			var6 = -1;
			var7 = 1;
			var10000 = var2 - 1;
		} else {
			var6 = 1;
			var7 = 3;
			var10000 = var2 + 1;
		}

		int var8 = var10000;
		byte var12 = (this.aS_int & 4096) == 0 ? this.k_byte : 0;
		boolean var13 = a_boolean_int_int_int_int_int_int_int_int(var1, var2, var11, var3, this.aP_int, this.aQ_int,
				var12, this.aR_int);
		if (var5 == 1 && var13) {
			this.r_void_int_int(var1, var2);
		} else {
			boolean var14 = (a_int_2d_Array[var1][var2] & 0xFF) == 35;
			if (a_byte_2d_Array[var1][var8] == 9 && var3 <= 0) {
				byte var16 = (byte) (a_int_2d_Array[var1][var8] & 0xFF);
				int var17;
				if ((var17 = (b_int_2d_Array[var1][var8] & 264241152) >> 22) != 34) {
					if (var17 == 33) {
						if (var16 == -1) {
							a_int_2d_Array[var1][var8] = 32;
						}

						this.aP_int = var1;
						this.aQ_int = var8;
						a_byte_2d_Array[var1][var8] = -1;
						this.aR_int = 0;
						this.aT_int = 0;
						this.a_void_int_int_int(2, 48, 0);
					} else if (a_byte_2d_Array[var1][var8] == 19 || a_byte_2d_Array[var1][var8] == 43
							|| a_byte_2d_Array[var1][var8] == 45 || a_byte_2d_Array[var1][var8] == 46
							|| a_byte_2d_Array[var1][var8] == 49 || a_byte_2d_Array[var1][var8] == 11) {
						a_byte_2d_Array[var1][var8] = -1;
						this.p_void_int_int(var1, var8);
					}
				}
			}

			if (var3 <= 0 && !var14) {
				if (var11 == var7 && this.d_boolean_int_int(var1, var8) && f_boolean_int_int(var1, var8)) {
					if ((var5 == 0 || var5 == 9) && var6 > 0) {
						this.a_void_int_int_int(2, 48, 0);
					} else if (var5 == 1) {
						b_int_2d_Array[var1][var8] = var4 & -8 | 3;
						b_byte_2d_Array[var1][var8] = 18;
						a_byte_2d_Array[var1][var8] = 1;
						a_byte_2d_Array[var1][var2] = -1;
						this.b_void_int_int(var1, var2);
					} else if (var5 == 8) {
						var4 &= -4063233;
					}

					b_int_2d_Array[var1][var2] = var4 & -8 | 0;
				} else if ((f_boolean_int_int(var1, var8) || a_byte_2d_Array[var1][var8] == 21)
						&& (!this.d_boolean_int_int(var1, var2) || this.aT_int > 0)
						&& (!this.d_boolean_int_int(var1, var8)
								&& !b_boolean_int_int_int_int(dl_int, dm_int, dn_int, do_int - 1) || this.aT_int > 0
								|| this.aW_int != 0 || var5 != 0 && var11 == var7)) {
					if (var6 <= 0 && (e_int_2d_Array == null || e_int_2d_Array[var1][var8] == 0)) {
						var4 = var4 & -4063240 | 0;
						b_int_2d_Array[var1][var2] = var4;
						b_byte_2d_Array[var1][var8] = 0;
					} else {
						int var27 = var4 + 131072;
						var4 = (var27) & -8 | var7;
						b_int_2d_Array[var1][var8] = var4 | -2147483648;
						b_byte_2d_Array[var1][var8] = 18;
						a_byte_2d_Array[var1][var8] = var5;
						a_byte_2d_Array[var1][var2] = -1;
						q_void_int_int(var1, var2);
						c_byte_2d_Array[var1][var2 + 2 * var6] = 24;
						this.b_void_int_int(var1, var2);
					}
				} else if (j_boolean_int_int(var1, var8)) {
					if (var6 < 0 && (e_int_2d_Array == null || e_int_2d_Array[var1][var8] == 0)
							&& a_byte_2d_Array[var1][var2 + 1] < 0) {
						b_int_2d_Array[var1][var2 + 1] = var4 & -8 | 3;
						b_int_2d_Array[var1][var2 + 1] = b_int_2d_Array[var1][var2 + 1] | -2147483648;
						a_byte_2d_Array[var1][var2 + 1] = var5;
						b_byte_2d_Array[var1][var2 + 1] = 18;
						a_byte_2d_Array[var1][var2] = -1;
					} else if (b_byte_2d_Array[var1][var8] <= 0) {
						if ((var4 & 4063232) >> 17 >= 2) {
							if (var5 == 8) {
								a_byte_2d_Array[var1][var2] = 54;
								b_int_2d_Array[var1][var2] = 0;
								q_void_int_int(var1, var2);
								return;
							}

							if (a_byte_2d_Array[var1][var8] == 8) {
								a_byte_2d_Array[var1][var8] = 54;
								b_int_2d_Array[var1][var8] = 0;
								q_void_int_int(var1, var8);
								return;
							}
						}

						label464: {
							var4 &= -4063233;
							short var37;
							if (f_boolean_int_int(var1 - 1, var2) && f_boolean_int_int(var1 - 1, var8)
									&& !this.d_boolean_int_int(var1 - 1, var2)) {
								b_byte_2d_Array[var1][var2] = (byte) (((var4 & 28672) >> 12) + 1);
								c_byte_2d_Array[var1][var2] = 24;
								var10000 = (var4 & -8 | 4) & -3073;
								var37 = 2048;
							} else {
								if (!f_boolean_int_int(var1 + 1, var2) || !f_boolean_int_int(var1 + 1, var8)
										|| this.d_boolean_int_int(var1 + 1, var2)) {
									break label464;
								}

								b_byte_2d_Array[var1][var2] = (byte) (((var4 & 28672) >> 12) + 1);
								c_byte_2d_Array[var1][var2] = 24;
								var10000 = (var4 & -8 | 2) & -3073;
								var37 = 1024;
							}

							var4 = var10000 | var37 | 512;
						}

						b_int_2d_Array[var1][var2] = var4;
					}
				} else if (var5 == 8) {
					if ((var4 & 4063232) >> 17 >= 2) {
						a_byte_2d_Array[var1][var2] = 54;
						b_int_2d_Array[var1][var2] = 0;
						q_void_int_int(var1, var2);
						return;
					}

					var4 &= -4063233;
				} else {
					var4 = (var4 & -3073 | 0) & -4063233 & -8;
					b_int_2d_Array[var1][var2] = var4;
				}
			} else if (!var14) {
				if ((var4 & 512) == 0) {
					if (var11 == 3 && (a_int_2d_Array[var1][var2] & 0xFF) == 6 && var3 <= 12) {
						var3 = (byte) (var3 - (aN_int & 1));
						c_byte_2d_Array[var1][var2] = 24;
					} else {
						var3 = (byte) (var3 - 6);
					}

					if (var3 == 0 || var3 == 12) {
						label310: {
							int var10001;
							switch (var4 & 3072) {
							case 1024:
								var10000 = var4 & -57;
								var10001 = var4 + 8;
								break;
							case 2048:
								var10000 = var4 & -57;
								var10001 = var4 - 8;
								break;
							default:
								break label310;
							}

							var4 = var10000 | var10001 & 56;
						}

						if (var3 == 0) {
							if ((a_int_2d_Array[var1][var2] & 0xFF) == 6) {
								var4 &= -449;
							}

							if (var11 == var7) {
								if ((var5 == 0 || var5 == 9) && var6 > 0 && !f_boolean_int_int(var1, var2 + 1)) {
									t_void_int(200);
									this.C_void_int(14);
									this.bj_int = 10;
									if (var5 == 9 && this.aT_int > 0 && this.d_boolean_int_int(var1, var2)) {
										this.a_void_int_int_int(1, 0, 0);
										this.B_void();
									}

									if (!j_boolean_int_int(var1, var2 + 1)) {
										var4 = var4 & -449 | 64;
									}
								}

								c_byte_2d_Array[var1][var2] = 30;
								if (!this.d_boolean_int_int(var1, var8)) {
									var4 = var4 & -8 | 0;
								}
							}
						}
					}

					b_byte_2d_Array[var1][var2] = var3;
					b_int_2d_Array[var1][var2] = var4;
				} else {
					byte var29;
					byte var31;
					label292: {
						var29 = 0;
						var31 = 0;
						byte var35;
						if (var11 == 4) {
							var35 = -1;
						} else {
							if (var11 != 2) {
								break label292;
							}

							var35 = 1;
						}

						var29 = var35;
					}

					if (f_boolean_int_int(var1, var8) && !this.d_boolean_int_int(var1, var8)) {
						if ((var3 = (byte) (var3 - 6)) <= 0) {
							var3 = 0;
							int var26 = var4 & -513;
							var4 = (var26) & -8 | 0;
						}

						b_byte_2d_Array[var1][var2] = var3;
						b_int_2d_Array[var1][var2] = var4;
						c_byte_2d_Array[var1][var2] = 24;
					} else if (f_boolean_int_int(var1 + var29, var2) && !this.d_boolean_int_int(var1 + var29, var2)
							&& f_boolean_int_int(var1 + var29, var8) && !this.d_boolean_int_int(var1 + var29, var8)
							&& (b_int_2d_Array[var1][var8] & 512) == 0) {
						if (var3 >= 6 || (aN_int & 3) == 0) {
							var3++;
						}

						if (var3 >= 12) {
							var4 &= -513;
							if (var29 != 0) {
								var3 = 6;
								a_byte_2d_Array[var1][var2] = -1;
								if (f_boolean_int_int(var1 + var29, var8)) {
									var3 = 12;
									var4 = var4 & -8 | var7;
									var31 = var6;
								}
							} else {
								var4 = var4 & -8 | 0;
								var3 = 0;
							}

							b_int_2d_Array[var1 + var29][var2 + var31] = var4 | -2147483648;
							b_byte_2d_Array[var1 + var29][var2 + var31] = var3;
							a_byte_2d_Array[var1 + var29][var2 + var31] = var5;
							q_void_int_int(var1, var2);
							c_byte_2d_Array[var1][var2 + 2 * var6] = 24;
						} else {
							b_byte_2d_Array[var1][var2] = var3;
							b_int_2d_Array[var1][var2] = var4;
							c_byte_2d_Array[var1][var2] = 24;
						}
					} else {
						if ((var3 = (byte) (var3 - 6)) <= 0) {
							var3 = 0;
							int var25 = var4 & -513;
							var4 = (var25) & -8 | 0;
						}

						b_byte_2d_Array[var1][var2] = var3;
						b_int_2d_Array[var1][var2] = var4;
						c_byte_2d_Array[var1][var2] = 24;
						this.c_void_int_int(var1, var2);
					}
				}
			}

			int var30 = var4 & 536870912;
			byte var32 = b_byte_2d_Array[var1][var2];
			int var18 = var4 & 1073741824;
			int var19 = 0;
			if (var30 == 0 && var32 != 0 || var18 == 0 && var10) {
				this.b_void_int_int(var1, var2);
			}

			if (var30 != 0 && var32 == 0 || var18 != 0 && !var10) {
				this.c_void_int_int(var1, var2);
			}

			var19 = (var4 & 512) != 0 ? 1
					: (var32 != 0 || var30 != 0 ? 2
							: (var10 ? 3
									: (a_int_2d_Array[var1][var2] > -1 && a_int_2d_Array[var1][var2] < 38 ? 4
											: ((f_boolean_int_int(var1 - 1, var2) || f_boolean_int_int(var1 + 1, var2))
													&& j_boolean_int_int(var1, var2 + 1)
													&& (b_int_2d_Array[var1][var2 + 1] & 7) == 0 && var1 != this.bg_int
													&& var2 != this.bh_int ? 6 : 0))));
			var4 = ((var4 & -536870913 | (var32 != 0 ? 536870912 : 0)) & -1073741825 | (var10 ? 1073741824 : 0))
					& 2147483647 | (var19 != 0 ? Integer.MIN_VALUE : 0);
			b_int_2d_Array[var1][var2] = var4;
			int var20;
			if ((var20 = ((b_int_2d_Array[var1][var2] & 448) >> 6) - 1) >= 0 && var20 < 5) {
				b_int_2d_Array[var1][var2] = b_int_2d_Array[var1][var2] & -449 | b_int_2d_Array[var1][var2] + 64 & 448;
			}
		}
	}

	private void r_void_int_int(int integer1, int integer2) {
		this.d_void_int_int_int(integer1, integer2, 3);
		this.aZ_int++;
		a_byte_2d_Array[integer1][integer2] = -1;
		this.P_int--;
		this.bi_int = 0;
		if (this.P_int == 0) {
			a_byte_2d_Array[this.Q_int][this.R_int] = -1;
		}

		if (a_byte_2d_Array[integer1][integer2 - 1] == -1) {
			this.b_void_int_int(integer1, integer2 - 1);
		}

		this.b_void_int_int(integer1, integer2);
		this.B_void();
	}

	private static a a_a_String_int_int_int(String string, int integer2, int integer3, int integer4) {
		a var4 = null;

		try {
			var4 = new a();
			byte[] var5 = a_byte_Array_String_int(string, integer2);
			var4.a_void_byte_Array_int(var5, 0);

			for (int var6 = integer3; var6 <= integer4; var6++) {
				var4.a_void_int_int_int_int(var6, 0, -1, -1);
			}

			var4.b_int = integer3;
			var4.g_byte_Array = null;
			System.gc();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return var4;
	}

	public static a a_a_String_int(String string, int integer) {
		return a_a_String_int_int(string, integer, 0);
	}

	private static a a_a_String_int_int(String string, int integer2, int integer3) {
		return a_a_String_int_int_int(string, integer2, integer3, integer3);
	}

	private static Image[] a_Image_Array_String_int(String string, int integer) {
		return a_Image_Array_String_int_int(string, integer, 0);
	}

	private static Image[] a_Image_Array_String_int_int(String string, int integer2, int integer3) {
		a var3 = null;

		try {
			var3 = new a();
			byte[] var4 = a_byte_Array_String_int(string, integer2);
			var3.a_void_byte_Array_int(var4, 0);
			var3.a_void_int_int_int_int(integer3, 0, -1, -1);
			a_void_a_boolean(var3, false);
			System.gc();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return var3.a_Image_2d_Array[integer3];
	}

	private static Image a_Image_String_int(String string, int integer) {
		Image var2 = null;

		try {
			byte[] var3;
			var2 = Image.createImage(var3 = a_byte_Array_String_int(string, integer), 0, var3.length);
			System.gc();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return var2;
	}

	public static byte[] a_byte_Array_String_int(String string, int integer) {
		byte[] var2 = null;

		try {
			InputStream var3 = Utils.deepCopy(i.class.getResourceAsStream("/res" + string));
			var2 = new byte[var3.read() << 3];
			var3.read(var2);
			int var5 = b_int_byte_Array_int(var2, integer << 3);
			int var6 = b_int_byte_Array_int(var2, (integer << 3) + 4);
			var3.skip((long) var5);
			var2 = new byte[var6];
			var3.read(var2);
			var3.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return var2;
	}

	private void ci_void() {
		if (a.h_byte_Array == null) {
			try {
				a.h_byte_Array = new byte[256];
				InputStream var1 = Utils.deepCopy(getClass().getResourceAsStream("/res" + "/mc"));
				var1.read(a.h_byte_Array);
				var1.close();
				return;
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public static final int a_int_a_String_int(a a_, String string, int integer) {
		int var3;
		if (integer != -1 && (var3 = string.indexOf(10)) != -1) {
			string = string.substring(0, var3);
		}

		if ((var3 = string.indexOf(125)) != -1) {
			string = string.substring(0, var3);
		}

		a_.a_void_String(string);
		return a.c_int;
	}

	public static int a_int_a(a a) {
		return a.e_int + (a.a_byte_Array[1] & 0xFF);
	}

	public static void b_void_int(int integer) {
		e.c_int = integer;
	}

	private boolean a_boolean_Graphics(Graphics graphics) {
		e.b_int++;
		switch (e.c_int) {
		case 0:
			this.A_void();
			this.a_e = new e();
			this.cj_void();
			this.a_h.e_void();
			b_void_int(1);
			this.al_boolean = false;
			break;
		case 1:
			e.a_void();
			V_boolean = false;
			break;
		case 2:
			e.b_void();
			this.A_void();
			l_byte = 9;
			this.br_int = 8;
			this.bs_int = 0;
			break;
		case 3:
			this.a_e.a_void_Graphics(graphics);
			break;
		case 4:
			b_void_int(0);
			this.a_e = null;
			System.gc();
			return false;
		}

		return true;
	}

	private void cj_void() {
		if ((j_byte_Array[0] & 1) == 0) {
			this.al_boolean = true;
			j_byte_Array[0] = (byte) (j_byte_Array[0] | 1);
			this.I_void();
		}
	}

	private static int a_int_InputStream(InputStream inputStream) throws IOException {
		return inputStream.read() & 0xFF | (inputStream.read() & 0xFF) << 8;
	}

	private static int g_int_int(int integer) {
		if (integer < 0) {
			integer = Math.abs(integer);
		}

		switch (integer) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 4;
		case 4:
			return 8;
		case 5:
			return 16;
		case 6:
			return 32;
		case 7:
			return 64;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		default:
			return 0;
		case 23:
			return 128;
		case 35:
			return 512;
		case 42:
			return 256;
		case 48:
			return 1024;
		case 49:
			return 2048;
		case 50:
			return 4096;
		case 51:
			return 8192;
		case 52:
			return 16384;
		case 53:
			return 32768;
		case 54:
			return 65536;
		case 55:
			return 131072;
		case 56:
			return 262144;
		case 57:
			return 524288;
		}
	}

	private void ck_void() {
		if (this.j_boolean) {
			if (f_int_2d_Array == null) {
				f_int_2d_Array = new int[this.av_int][this.aw_int];
			}

			for (int var1 = 0; var1 < this.av_int; var1++) {
				System.arraycopy(e_int_2d_Array[var1], 0, f_int_2d_Array[var1], 0, this.aw_int);
			}

			if (c_long_Array == null) {
				c_long_Array = new long[15];
			}

			System.arraycopy(a_long_Array, 0, c_long_Array, 0, a_long_Array.length);
			if (d_long_Array == null) {
				d_long_Array = new long[15];
			}

			System.arraycopy(b_long_Array, 0, d_long_Array, 0, b_long_Array.length);
			this.y_byte = this.x_byte;
			this.dz_int = this.dp_int;
			this.dA_int = this.dq_int;
			this.dB_int = this.dr_int;
			this.z_byte = this.v_byte;
			this.dC_int = this.du_int;
			this.dD_int = this.dv_int;
			this.dE_int = this.dw_int;
			this.A_byte = this.w_byte;
			this.dF_int = this.dx_int;
			this.dG_int = this.dy_int;
			an_boolean = this.am_boolean;
			this.dH_int = this.ds_int;
			this.dI_int = this.dt_int;
		}
	}

	private void cl_void() {
		this.am_boolean = an_boolean;
		this.ds_int = this.dH_int;
		this.dt_int = this.dI_int;

		for (int var1 = 0; var1 < this.av_int; var1++) {
			System.arraycopy(f_int_2d_Array[var1], 0, e_int_2d_Array[var1], 0, this.aw_int);
		}

		System.arraycopy(c_long_Array, 0, a_long_Array, 0, a_long_Array.length);
		System.arraycopy(d_long_Array, 0, b_long_Array, 0, b_long_Array.length);
		this.x_byte = this.y_byte;
		this.dp_int = this.dz_int;
		this.dq_int = this.dA_int;
		this.dr_int = this.dB_int;
		this.v_byte = this.z_byte;
		this.du_int = this.dC_int;
		this.dv_int = this.dD_int;
		this.dw_int = this.dE_int;
		this.w_byte = this.A_byte;
		this.dx_int = this.dF_int;
		this.dy_int = this.dG_int;
	}

	private void cm_void() {
		if (this.j_boolean) {
			this.cn_void();
			e_int_2d_Array = new int[this.av_int][this.aw_int];
			this.bC_void();
		}
	}

	private void cn_void() {
		if (this.j_boolean) {
			a_long_Array = new long[15];
			c_long_Array = new long[15];
			b_long_Array = new long[15];
			d_long_Array = new long[15];
			this.x_byte = 3;
			this.am_boolean = true;
			this.dp_int = -1;
			this.dq_int = 0;
			this.dr_int = 0;
			this.v_byte = 0;
			this.du_int = 0;
			this.dv_int = 0;
			this.dw_int = 0;
			this.w_byte = 0;
			this.dx_int = 0;
			this.dy_int = -1;
			this.ds_int = 0;
			this.dt_int = 0;
		}
	}

	private byte a_byte_byte_byte_byte_byte(byte byte1, byte byte2, byte byte3, byte byte4) {
		byte var10000 = 0;

		while (true) {
			byte var5 = var10000;
			if (var10000 >= 15 || a_int_byte_byte_byte(var5, (byte) 0, (byte) 4) == 0) {
				if (var5 < 15) {
					this.a_void_byte_byte_byte_byte(var5, (byte) 1, (byte) 0, (byte) 4);
					this.a_void_byte_byte_byte_byte(var5, byte4, (byte) 4, (byte) 2);
					this.a_void_byte_byte_byte_byte(var5, byte1, (byte) 6, (byte) 7);
					this.a_void_byte_byte_byte_byte(var5, byte1, (byte) 27, (byte) 7);
					this.a_void_byte_byte_byte_byte(var5, byte2, (byte) 13, (byte) 7);
					this.a_void_byte_byte_byte_byte(var5, byte3, (byte) 20, (byte) 7);
					return var5;
				} else {
					return -1;
				}
			}

			var10000 = (byte) (var5 + 1);
		}
	}

	private static int a_int_int_byte_byte_byte(int integer, byte byte2, byte byte3, byte byte4) {
		int var4 = integer >>> byte2 * 9 + byte3;
		return (var4) & ~(-1 << byte4);
	}

	private void a_void_int_int_byte_byte_byte_byte(int integer1, int integer2, byte byte3, byte byte4, byte byte5,
			byte byte6) {
		int var7;
		int var8 = a_int_int_byte_byte_byte(var7 = e_int_2d_Array[integer1][integer2], byte3, byte5, byte6);
		byte var9 = (byte) (byte3 * 9 + byte5);
		var8 <<= var9;
		var7 ^= var8;
		int var10 = byte4 << var9;
		var7 |= var10;
		e_int_2d_Array[integer1][integer2] = var7;
		c_byte_2d_Array[integer1][integer2] = 24;
		c_byte_2d_Array[integer1][integer2 + 1] = 24;
	}

	private static int a_int_int_byte_byte(int integer, byte byte2, byte byte3) {
		return (int) (a_long_Array[integer - 1] >>> byte2 & ~(-1L << byte3));
	}

	private void a_void_int_byte_byte_byte(int integer, byte byte2, byte byte3, byte byte4) {
		long var5 = (long) a_int_int_byte_byte(integer, byte3, byte4);
		long var7 = a_long_Array[--integer];
		var5 <<= byte3;
		var7 ^= var5;
		long var9;
		var9 = (var9 = (long) byte2) << byte3;
		var7 |= var9;
		a_long_Array[integer] = var7;
	}

	private static int a_int_byte_byte_byte(byte byte1, byte byte2, byte byte3) {
		long var3 = b_long_Array[byte1];
		return (int) ((var3) >>> byte2 & ~(-1L << byte3));
	}

	private void a_void_byte_byte_byte_byte(byte byte1, byte byte2, byte byte3, byte byte4) {
		long var5 = (long) a_int_byte_byte_byte(byte1, byte3, byte4);
		long var7 = b_long_Array[byte1];
		var5 <<= byte3;
		var7 ^= var5;
		int var9 = byte2 << byte3;
		var7 |= (long) var9;
		b_long_Array[byte1] = var7;
	}

	private byte b_byte_int_int(int integer1, int integer2) {
		byte var10000 = 0;

		while (true) {
			byte var3 = var10000;
			if (var10000 >= 15) {
				return -1;
			}

			if (integer1 == a_int_byte_byte_byte(var3, (byte) 13, (byte) 7)
					&& integer2 == a_int_byte_byte_byte(var3, (byte) 20, (byte) 7)) {
				return var3;
			}

			var10000 = (byte) (var3 + 1);
		}
	}

	private byte a_byte_int_int_byte(int integer1, int integer2, byte byte3) {
		byte var4;
		if ((var4 = this.b_byte_int_int(integer1, integer2)) < 0) {
			return -1;
		} else {
			this.a_void_byte_byte_byte_byte(var4, byte3, (byte) 0, (byte) 4);
			byte var10000;
			switch (byte3) {
			case 1:
				var10000 = 38;
				break;
			case 2:
				var10000 = 39;
				break;
			case 3:
				var10000 = 39;
				break;
			default:
				return var4;
			}

			return var10000;
		}
	}

	private void co_void() {
		if (this.j_boolean) {
			if (this.dp_int >= 0 && this.dy_int >= 0) {
				this.dp_int++;
				this.cq_void();
			}

			switch (this.x_byte) {
			case 1:
				this.x_byte = 2;
				return;
			case 2:
				byte var10000 = 1;

				while (true) {
					byte var1 = var10000;
					if (var10000 > 15) {
						break;
					}

					switch (a_int_int_byte_byte(var1, (byte) 28, (byte) 3)) {
					case 1:
					case 6:
					case 7:
						this.h_void_byte(var1);
						break;
					case 2:
						if (this.dy_int >= 0) {
							this.dy_int++;
							this.g_void_byte(var1);
						}
						break;
					case 3:
						f_void_byte(var1);
					case 4:
					case 5:
					}

					var10000 = (byte) (var1 + 1);
				}
			case 3:
			default:
				break;
			case 4:
				this.cp_void();
				this.x_byte = 2;
				return;
			case 5:
				this.u_void_int_int(this.du_int, this.dv_int);
			}
		}
	}

	private static void f_void_byte(byte byte1) {
		a_long_Array[byte1 - 1] = 0L;
	}

	private void cp_void() {
		byte var10000 = 0;

		while (true) {
			byte var1 = var10000;
			if (var10000 >= 15) {
				return;
			}

			if (a_int_byte_byte_byte(var1, (byte) 0, (byte) 4) == 3) {
				int var2;
				int var3;
				byte var5;
				byte var6;
				label23: {
					label22: {
						var2 = a_int_byte_byte_byte(var1, (byte) 13, (byte) 7);
						var3 = a_int_byte_byte_byte(var1, (byte) 20, (byte) 7);
						int var4 = a_int_byte_byte_byte(var1, (byte) 4, (byte) 2);
						b_long_Array[var1] = 0L;
						var5 = 0;
						var6 = 0;
						switch (var4) {
						case 0:
							var3++;
							var5 = 0;
							var10000 = 0;
							break label22;
						case 1:
							var2++;
							var10000 = 1;
							break;
						case 2:
							var2--;
							var10000 = -1;
							break;
						default:
							break label23;
						}

						var5 = var10000;
						var10000 = 2;
					}

					var6 = var10000;
				}

				this.a_byte_int_int_byte_byte_byte_byte(var2, var3, (byte) 7, var5, var6,
						this.b_byte_int_int(var2, var3));
			}

			var10000 = (byte) (var1 + 1);
		}
	}

	private void cq_void() {
		i var16;
		byte var10001;
		byte var10002;
		byte var10003;
		byte var10004;
		int var1 = a_int_int_byte_byte(this.w_byte, (byte) 14, (byte) 6);
		int var2 = a_int_int_byte_byte(this.w_byte, (byte) 20, (byte) 6);
		label201: switch (a_int_int_byte_byte(this.w_byte, (byte) 47, (byte) 2)) {
		case 0:
			this.a_void_int_byte_byte_byte(this.w_byte, (byte) 1, (byte) 47, (byte) 2);
			byte var11 = (byte) a_int_int_byte_byte(this.w_byte, (byte) 49, (byte) 5);
			byte var13 = (byte) a_int_int_byte_byte(this.w_byte, (byte) 45, (byte) 2);
			int var14 = 0;
			if (var13 != 0) {
				if (var13 == 2) {
					while (var1 >= this.du_int && (byte) (a_byte_2d_Array[var1 + 1][var2] - 80) < 0
							&& a_byte_2d_Array[var1 + 1][var2] != 10 && a_byte_2d_Array[var1 + 1][var2] != 37
							&& a_byte_2d_Array[var1 + 1][var2] != 34 && a_byte_2d_Array[var1 + 1][var2] != 35) {
						var1++;
					}
				} else {
					while (var1 <= this.du_int && (byte) (a_byte_2d_Array[var1 + 1][var2] - 80) < 0
							&& a_byte_2d_Array[var1 + 1][var2] != 10 && a_byte_2d_Array[var1 + 1][var2] != 37
							&& a_byte_2d_Array[var1 + 1][var2] != 34 && a_byte_2d_Array[var1 + 1][var2] != 35) {
						var1++;
					}
				}
			} else if ((byte) (a_byte_2d_Array[var1 + 1][var2] - 80) < 0 && a_byte_2d_Array[var1 + 1][var2] != 10
					&& a_byte_2d_Array[var1 + 1][var2] != 37 && a_byte_2d_Array[var1 + 1][var2] != 34
					&& a_byte_2d_Array[var1 + 1][var2] != 35) {
				while ((byte) (a_byte_2d_Array[var1 + 1][var2] - 80) < 0 && a_byte_2d_Array[var1 + 1][var2] != 10
						&& a_byte_2d_Array[var1 + 1][var2] != 37 && a_byte_2d_Array[var1 + 1][var2] != 34
						&& a_byte_2d_Array[var1 + 1][var2] != 35) {
					var1++;
				}
			} else {
				while (var14 < var11) {
					var14++;
					if ((byte) (a_byte_2d_Array[var1][var2] - 80) < 0 && a_byte_2d_Array[var1][var2] != 10
							&& a_byte_2d_Array[var1][var2] != 37 && a_byte_2d_Array[var1][var2] != 34
							&& a_byte_2d_Array[var1][var2] != 35) {
						var14 = var11;
					} else {
						var1--;
					}
				}
			}

			if (this.dw_int != 2 && var1 <= this.du_int) {
				while ((byte) (a_byte_2d_Array[var1 + 1][var2] - 80) < 0 && a_byte_2d_Array[var1 + 1][var2] != 10
						&& a_byte_2d_Array[var1 + 1][var2] != 37 && a_byte_2d_Array[var1 + 1][var2] != 34
						&& a_byte_2d_Array[var1 + 1][var2] != 35) {
					var1++;
				}
			}

			this.a_void_int_byte_byte_byte(this.w_byte, (byte) var1, (byte) 14, (byte) 6);
			byte var17 = 1;

			while (true) {
				byte var15 = var17;
				if ((byte) (a_byte_2d_Array[var1 - var15][var2] - 80) >= 0 || a_byte_2d_Array[var1 - var15][var2] == 10
						|| a_byte_2d_Array[var1 - var15][var2] == 37 || a_byte_2d_Array[var1 - var15][var2] == 34
						|| a_byte_2d_Array[var1 - var15][var2] == 35) {
					var16 = this;
					var10001 = this.w_byte;
					var10002 = var15;
					var10003 = 49;
					var10004 = 5;
					break label201;
				}

				var17 = (byte) (var15 + 1);
			}
		case 1:
			if (var2 == this.dx_int) {
				this.dp_int = -1;
				this.dy_int = -1;
				f_void_byte(this.w_byte);
				this.x_byte = 4;
				return;
			}

			byte var4 = (byte) a_int_int_byte_byte(this.w_byte, (byte) 49, (byte) 5);
			if (this.dp_int != 0 && this.dp_int % var4 == 0) {
				this.dp_int = 0;
				byte var5;
				if ((var5 = (byte) a_int_int_byte_byte(this.w_byte, (byte) 26, (byte) 2)) >= 0) {
					byte var10000 = 0;

					while (true) {
						byte var6 = var10000;
						if (var10000 >= var4) {
							if (var5 == 2) {
								this.a_void_int_byte_byte_byte(this.w_byte, (byte) 0, (byte) 47, (byte) 2);
								this.a_void_int_byte_byte_byte(this.w_byte, (byte) 0, (byte) 26, (byte) 2);
								var2++;
								var16 = this;
								var10001 = this.w_byte;
								var10002 = (byte) var2;
								var10003 = 20;
								var10004 = 6;
							} else {
								var16 = this;
								var10001 = this.w_byte;
								var10002 = ++var5;
								var10003 = 26;
								var10004 = 2;
							}
							break label201;
						}

						c_void_int_int_byte(var1 - var6, var2, var5);
						int var8 = var2;
						byte var7;
						if ((var7 = (byte) (var5 + 1)) > 2) {
							var7 = 0;
							var8 = var2 + 1;
						}

						int var9 = a_int_int_byte_byte_byte(e_int_2d_Array[var1 - var6][var8], var7, (byte) 3,
								(byte) 4);
						if (var8 == this.dx_int && var5 == 2 ? var9 != 0 && var9 != 3 : var9 != 12 && var9 != 9) {
							this.a_void_int_int_byte_byte_byte_byte(var1 - var6, var8, var7, (byte) 7, (byte) 3,
									(byte) 4);
						}

						var10000 = (byte) (var6 + 1);
					}
				}
			}

			return;
		default:
			return;
		}

		var16.a_void_int_byte_byte_byte(var10001, var10002, var10003, var10004);
	}

	private void g_void_byte(byte byte1) {
		int var2 = a_int_int_byte_byte(byte1, (byte) 14, (byte) 6);
		int var3 = a_int_int_byte_byte(byte1, (byte) 20, (byte) 6);
		int var4 = a_int_int_byte_byte(byte1, (byte) 0, (byte) 7);
		int var5 = a_int_int_byte_byte(byte1, (byte) 7, (byte) 7);
		int var6 = a_int_int_byte_byte(byte1, (byte) 47, (byte) 2);
		byte var7;
		byte var8 = (byte) a_int_byte_byte_byte(var7 = (byte) a_int_int_byte_byte(byte1, (byte) 54, (byte) 3), (byte) 6,
				(byte) 7);
		switch (var6) {
		case 0:
			this.a_void_int_byte_byte_byte(byte1, (byte) 1, (byte) 47, (byte) 2);
			this.a_void_int_byte_byte_byte(byte1, (byte) (--var3), (byte) 20, (byte) 6);
			if ((byte) (a_byte_2d_Array[var2][var3] - 80) < 0 && a_byte_2d_Array[var2][var3] != 10
					&& a_byte_2d_Array[var2][var3] != 37 && a_byte_2d_Array[var2][var3] != 34
					&& a_byte_2d_Array[var2][var3] != 35) {
				while ((byte) (a_byte_2d_Array[var2 + 1][var3] - 80) < 0 && a_byte_2d_Array[var2 + 1][var3] != 10
						&& a_byte_2d_Array[var2 + 1][var3] != 37 && a_byte_2d_Array[var2 + 1][var3] != 34
						&& a_byte_2d_Array[var2 + 1][var3] != 35) {
					var2++;
				}
			} else {
				while ((byte) (a_byte_2d_Array[var2][var3] - 80) >= 0 || a_byte_2d_Array[var2][var3] == 10
						|| a_byte_2d_Array[var2][var3] == 37 || a_byte_2d_Array[var2][var3] == 34
						|| a_byte_2d_Array[var2][var3] == 35) {
					var2 += -1;
				}
			}

			this.a_void_int_byte_byte_byte(byte1, (byte) var2, (byte) 14, (byte) 6);
			byte var31 = 1;

			while (true) {
				byte var21 = var31;
				if ((byte) (a_byte_2d_Array[var2 - var21][var3] - 80) >= 0 || a_byte_2d_Array[var2 - var21][var3] == 10
						|| a_byte_2d_Array[var2 - var21][var3] == 37 || a_byte_2d_Array[var2 - var21][var3] == 34
						|| a_byte_2d_Array[var2 - var21][var3] == 35) {
					this.a_void_int_byte_byte_byte(byte1, var21, (byte) 49, (byte) 5);
					var8 = (byte) (var8 - var21);
					byte var23 = 0;
					this.v_byte = 0;
					if (var8 < 0) {
						int var24;
						var24 = (var24 = -var8) * 3;
						byte var28 = 0;
						int var15;
						if ((var15 = var21 + var8) * 3 - var21 != 0 && (var15 = var15 * 3) <= var21 * 3 / 2) {
							var28 = 1;
						}

						var24 /= var21;
						this.v_byte = (byte) var24;
						this.v_byte += var28;
						if (this.v_byte > 2) {
							this.a_void_int_byte_byte_byte(byte1, (byte) 1, (byte) 57, (byte) 1);
						}

						var23 = (byte) Math.abs(var8);
						var8 = 0;
					}

					if ((var5 = var5 + (var21 - var23)) > var4) {
						int var27 = var4 - var5;
						var5 += var27;
						var8 = (byte) (var8 - var27);
					}

					this.a_void_int_byte_byte_byte(byte1, (byte) var5, (byte) 7, (byte) 7);
					this.a_void_byte_byte_byte_byte(var7, var8, (byte) 6, (byte) 7);
					return;
				}

				var31 = (byte) (var21 + 1);
			}
		case 1:
			byte var9 = (byte) a_int_int_byte_byte(byte1, (byte) 49, (byte) 5);
			if (this.dy_int != 0 && this.dy_int % var9 == 0) {
				this.dy_int = 0;
				byte var10 = (byte) a_int_int_byte_byte(byte1, (byte) 26, (byte) 2);
				byte var11 = (byte) a_int_int_byte_byte(byte1, (byte) 57, (byte) 1);
				if (var10 >= 0) {
					if (var11 != 1) {
						byte var10000 = 0;

						while (true) {
							byte var12 = var10000;
							if (var10000 >= var9) {
								if (this.dq_int > 0) {
									int var13 = var3;
									if ((var12 = (byte) (var10 + 1)) > 2) {
										var12 = 0;
										var13 = var3 + 1;
									}

									var10000 = 0;

									while (true) {
										byte var14 = var10000;
										if (var10000 >= var9) {
											break;
										}

										if ((byte) (a_byte_2d_Array[var2 - var14][var13] - 80) < 0
												&& a_byte_2d_Array[var2 - var14][var13] != 10
												&& a_byte_2d_Array[var2 - var14][var13] != 37
												&& a_byte_2d_Array[var2 - var14][var13] != 34
												&& a_byte_2d_Array[var2 - var14][var13] != 35) {
											this.a_void_int_int_byte_byte_byte_byte(var2 - var14, var13, var12,
													(byte) 8, (byte) 3, (byte) 4);
										}

										var10000 = (byte) (var14 + 1);
									}
								}

								this.dq_int++;
								break;
							}

							this.a_void_int_int_byte_byte_byte_byte(var2 - var12, var3, var10, (byte) 7, (byte) 3,
									(byte) 4);
							this.a_void_int_byte_byte_byte(byte1, var10, (byte) 43, (byte) 2);
							this.a_void_int_int_byte_byte_byte_byte(var2 - var12, var3, var10, byte1, (byte) 0,
									(byte) 3);
							var10000 = (byte) (var12 + 1);
						}
					}

					if (var11 == 1 || (var5 >= var4 || var8 == 0) && var10 == this.v_byte) {
						if (var11 == 1) {
							this.a_void_int_byte_byte_byte(byte1, (byte) 0, (byte) 57, (byte) 1);
						}

						this.a_void_int_byte_byte_byte(byte1, (byte) 3, (byte) 28, (byte) 3);
						if (var8 == 0) {
							this.a_void_byte_byte_byte_byte(var7, (byte) 3, (byte) 0, (byte) 4);
							this.a_void_int_byte_byte_byte(byte1, (byte) 5, (byte) 28, (byte) 3);
							if (this.dp_int == -1) {
								this.dy_int = -1;
								this.x_byte = 4;
							}

							return;
						}
					}

					if (var10 == 0) {
						this.a_void_int_byte_byte_byte(byte1, (byte) 0, (byte) 47, (byte) 2);
						this.a_void_int_byte_byte_byte(byte1, (byte) 2, (byte) 26, (byte) 2);
						return;
					}

					this.a_void_int_byte_byte_byte(byte1, --var10, (byte) 26, (byte) 2);
					return;
				}
			}
		}
	}

	private byte a_byte_byte_int_int_byte_byte_byte_boolean(byte byte1, int integer2, int integer3, byte byte4,
			byte byte5, byte byte6, boolean boolean7) {
		byte var8 = 0;
		if ((byte) (a_byte_2d_Array[integer2 + byte6][integer3] - 80) < 0
				&& a_byte_2d_Array[integer2 + byte6][integer3] != 10
				&& a_byte_2d_Array[integer2 + byte6][integer3] != 37
				&& a_byte_2d_Array[integer2 + byte6][integer3] != 34
				&& a_byte_2d_Array[integer2 + byte6][integer3] != 35) {
			var8 = byte6;
			if (byte4 != byte6) {
				this.a_void_int_byte_byte_byte(byte1, byte6 < 0 ? 2 : byte6, (byte) 45, (byte) 2);
			}

			integer2 += byte6;
			this.a_void_int_byte_byte_byte(byte1, (byte) integer2, (byte) 31, (byte) 6);
			this.a_void_int_int_byte_byte_byte_byte(integer2, integer3, byte5, byte1, (byte) 0, (byte) 3);
			if (boolean7) {
				c_void_int_int_byte(integer2, integer3, byte5);
			} else {
				int var9 = 0;
				byte var10 = 0;
				int var11 = a_int_int_byte_byte(byte1, (byte) 28, (byte) 3);
				byte var10000;
				if (byte6 > 0) {
					var9 = var11 == 6 && this.du_int == integer2 && this.dv_int == integer3 ? 11 : 4;
					var10000 = 9;
				} else {
					var9 = var11 == 6 && this.du_int == integer2 && this.dv_int == integer3 ? 14 : 5;
					var10000 = 12;
				}

				var10 = var10000;
				i var16;
				int var10001;
				int var10002;
				byte var10003;
				int var10004;
				if ((byte) (a_byte_2d_Array[integer2][integer3 + 1] - 80) < 0
						&& a_byte_2d_Array[integer2 + byte6][integer3] != 10
						&& a_byte_2d_Array[integer2 + byte6][integer3] != 37
						&& a_byte_2d_Array[integer2 + byte6][integer3] != 34
						&& a_byte_2d_Array[integer2 + byte6][integer3] != 35) {
					var16 = this;
					var10001 = integer2;
					var10002 = integer3;
					var10003 = byte5;
					var10004 = var10;
				} else {
					var16 = this;
					var10001 = integer2;
					var10002 = integer3;
					var10003 = byte5;
					var10004 = var9;
				}

				var16.a_void_int_int_byte_byte_byte_byte(var10001, var10002, var10003, (byte) var10004, (byte) 3,
						(byte) 4);
			}
		} else {
			var8 = -2;
		}

		return var8;
	}

	private boolean d_boolean_int(int integer) {
		return integer != -1 && a_byte_int_byte_byte(integer, (byte) 6, (byte) 1) == 1;
	}

	private static byte a_byte_int_byte_byte(int integer, byte byte2, byte byte3) {
		return (byte) (integer >>> byte2 & ~(16777215 << byte3));
	}

	private static boolean a_boolean_int_int_int(int integer1, int integer2, int integer3) {
		boolean var3 = true;
		boolean var10000 = true;

		label75: while (true) {
			boolean var4 = var10000;

			while (var4) {
				var4 = true;
				integer1 -= integer3;
				if (integer3 == 0) {
					if ((byte) (a_byte_2d_Array[integer1 - 1][integer2] - 80) >= 0
							|| a_byte_2d_Array[integer1 - 1][integer2] == 10
							|| a_byte_2d_Array[integer1 - 1][integer2] == 37
							|| a_byte_2d_Array[integer1 - 1][integer2] == 34
							|| a_byte_2d_Array[integer1 - 1][integer2] == 35
									&& (byte) (a_byte_2d_Array[integer1 + 1][integer2] - 80) >= 0
							|| a_byte_2d_Array[integer1 + 1][integer2] == 10
							|| a_byte_2d_Array[integer1 + 1][integer2] == 37
							|| a_byte_2d_Array[integer1 + 1][integer2] == 34
							|| a_byte_2d_Array[integer1 + 1][integer2] == 35) {
						var3 = true;
						var10000 = false;
						continue label75;
					}
				} else {
					if ((byte) (a_byte_2d_Array[integer1][integer2 + 1] - 80) < 0
							&& a_byte_2d_Array[integer1][integer2 + 1] != 10
							&& a_byte_2d_Array[integer1][integer2 + 1] != 37
							&& a_byte_2d_Array[integer1][integer2 + 1] != 34
							&& a_byte_2d_Array[integer1][integer2 + 1] != 35) {
						var4 = false;
					}

					if ((byte) (a_byte_2d_Array[integer1][integer2] - 80) >= 0
							|| a_byte_2d_Array[integer1][integer2] == 10 || a_byte_2d_Array[integer1][integer2] == 37
							|| a_byte_2d_Array[integer1][integer2] == 34 || a_byte_2d_Array[integer1][integer2] == 35) {
						var3 = var4;
						var10000 = false;
						continue label75;
					}

					if (!var4) {
						return var4;
					}
				}
			}

			return var3;
		}
	}

	private void h_void_byte(byte byte1) {
		int var2 = a_int_int_byte_byte(byte1, (byte) 31, (byte) 6);
		int var3 = a_int_int_byte_byte(byte1, (byte) 37, (byte) 6);
		byte var4 = (byte) a_int_int_byte_byte(byte1, (byte) 43, (byte) 2);
		byte var5 = (byte) a_int_int_byte_byte_byte(e_int_2d_Array[var2][var3], var4, (byte) 7, (byte) 2);
		byte var6 = (byte) a_int_int_byte_byte(byte1, (byte) 45, (byte) 2);
		boolean var8 = (byte) a_int_int_byte_byte(byte1, (byte) 28, (byte) 3) == 7;
		byte var9 = 0;
		if (var6 > 1) {
			var6 = -1;
		}

		if (var5 == 0) {
			byte var10 = (byte) (var4 + 1);
			int var11 = var3;
			if (var4 == 2) {
				var10 = 0;
				var11 = var3 + 1;
			}

			if (a_int_int_byte_byte_byte(e_int_2d_Array[var2][var11], var10, (byte) 3, (byte) 4) == 7) {
				this.dq_int = 1;
				if (var8) {
					f_void_byte(byte1);
					this.x_byte = 3;
					this.am_boolean = true;
					return;
				}

				int var12;
				if ((var12 = var10 - 1) < 0) {
					var12 = 2;
				}

				this.dy_int = 0;
				byte var13 = (byte) a_int_int_byte_byte_byte(e_int_2d_Array[var2][var11], var10, (byte) 0, (byte) 3);
				byte var14 = (byte) a_int_int_byte_byte(byte1, (byte) 54, (byte) 3);
				this.a_void_int_byte_byte_byte(var13, var14, (byte) 54, (byte) 3);
				this.a_void_int_byte_byte_byte(var13, (byte) 2, (byte) 28, (byte) 3);
				this.a_void_int_byte_byte_byte(var13, (byte) 0, (byte) 47, (byte) 2);
				this.a_void_int_byte_byte_byte(var13, (byte) var12, (byte) 26, (byte) 2);
				this.a_void_int_byte_byte_byte(var13, (byte) var2, (byte) 14, (byte) 6);
				this.a_void_int_byte_byte_byte(var13, (byte) var11, (byte) 20, (byte) 6);
				this.a_void_int_byte_byte_byte(var13, (byte) 0, (byte) 57, (byte) 1);
				f_void_byte(byte1);
				return;
			}
		}

		if (var4 == 2 && var5 == 0) {
			if ((byte) (a_byte_2d_Array[var2][var3 + 1] - 80) < 0 && a_byte_2d_Array[var2][var3 + 1] != 10
					&& a_byte_2d_Array[var2][var3 + 1] != 37 && a_byte_2d_Array[var2][var3 + 1] != 34
					&& a_byte_2d_Array[var2][var3 + 1] != 35) {
				if (var6 != 0) {
					var6 = 0;
					this.a_void_int_byte_byte_byte(byte1, (byte) 0, (byte) 45, (byte) 2);
				}
			} else {
				label89: {
					i var10000;
					byte var10001;
					int var10002;
					int var10003;
					byte var10004;
					byte var10005;
					byte var10006;
					if (var6 == 0) {
						if (var8) {
							c_void_int_int_byte(var2, var3, var4);
						} else {
							this.a_void_int_int_byte_byte_byte_byte(var2, var3, var4, (byte) 15, (byte) 3, (byte) 4);
						}

						if ((var9 = this.a_byte_byte_int_int_byte_byte_byte_boolean(byte1, var2, var3, var6, var4,
								(byte) 1, var8)) >= 0) {
							if ((byte) (a_byte_2d_Array[var2 + -1][var3] - 80) < 0
									&& a_byte_2d_Array[var2 + -1][var3] != 10 && a_byte_2d_Array[var2 + -1][var3] != 37
									&& a_byte_2d_Array[var2 + -1][var3] != 34
									&& a_byte_2d_Array[var2 + -1][var3] != 35) {
								this.a_byte_int_int_byte_byte_byte_byte(var2 - 1, var3, (byte) (var8 ? 7 : 5),
										(byte) -1, (byte) 2, (byte) a_int_int_byte_byte(byte1, (byte) 54, (byte) 3));
							}
							break label89;
						}

						var10000 = this;
						var10001 = byte1;
						var10002 = var2;
						var10003 = var3;
						var10004 = var6;
						var10005 = var4;
						var10006 = -1;
					} else {
						var10000 = this;
						var10001 = byte1;
						var10002 = var2;
						var10003 = var3;
						var10004 = var6;
						var10005 = var4;
						var10006 = var6;
					}

					var9 = var10000.a_byte_byte_int_int_byte_byte_byte_boolean(var10001, var10002, var10003, var10004,
							var10005, var10006, var8);
				}

				if (var9 == -2) {
					int var15 = b_int_2d_Array[var2][var3 + 1];
					i var16;
					byte var17;
					byte var18;
					byte var19;
					byte var20;
					if (this.d_boolean_int(var15) && a_boolean_int_int_int(var2, var3, var6)) {
						this.dq_int = 0;
						this.dy_int = 0;
						this.a_void_int_byte_byte_byte(byte1, (byte) 2, (byte) 28, (byte) 3);
						this.a_void_int_byte_byte_byte(byte1, a_byte_int_byte_byte(var15, (byte) 0, (byte) 6), (byte) 0,
								(byte) 7);
						this.a_void_int_byte_byte_byte(byte1, (byte) 2, (byte) 26, (byte) 2);
						this.a_void_int_byte_byte_byte(byte1, (byte) var2, (byte) 14, (byte) 6);
						var16 = this;
						var17 = byte1;
						var18 = (byte) (var3 + 1);
						var19 = 20;
						var20 = 6;
					} else {
						var16 = this;
						var17 = byte1;
						var18 = 3;
						var19 = 28;
						var20 = 3;
					}

					var16.a_void_int_byte_byte_byte(var17, var18, var19, var20);
					var2 += var6;
				} else {
					var6 = var9;
					var2 += var9;
				}
			}
		}

		if (var9 != -2) {
			switch (var6) {
			case -1:
			case 1:
				this.a_void_int_int_byte_byte(var2, var3, var4, var5);
				break;
			case 0:
				this.a_void_byte_int_int_byte_boolean(byte1, var2, var3, var4, var8);
				return;
			}
		}
	}

	private void a_void_int_int_byte_byte(int integer1, int integer2, byte byte3, byte byte4) {
		if (++byte4 > 2) {
			byte4 = 0;
		}

		this.a_void_int_int_byte_byte_byte_byte(integer1, integer2, byte3, byte4, (byte) 7, (byte) 2);
	}

	private void a_void_byte_int_int_byte_boolean(byte byte1, int integer2, int integer3, byte byte4,
			boolean boolean5) {
		if (!boolean5 && a_int_int_byte_byte_byte(e_int_2d_Array[integer2][integer3], byte4, (byte) 3, (byte) 4) == 0) {
			this.a_void_int_int_byte_byte_byte_byte(integer2, integer3, byte4, (byte) 3, (byte) 3, (byte) 4);
		}

		if (++byte4 > 2) {
			byte4 = 0;
			this.a_void_int_byte_byte_byte(byte1, (byte) (++integer3), (byte) 37, (byte) 6);
		}

		this.a_void_int_byte_byte_byte(byte1, byte4, (byte) 43, (byte) 2);
		i var10000;
		int var10001;
		int var10002;
		byte var10003;
		byte var10004;
		if (boolean5) {
			var10000 = this;
			var10001 = integer2;
			var10002 = integer3;
			var10003 = byte4;
			var10004 = 6;
		} else {
			this.a_void_int_int_byte_byte_byte_byte(integer2, integer3, byte4, byte1, (byte) 0, (byte) 3);
			var10000 = this;
			var10001 = integer2;
			var10002 = integer3;
			var10003 = byte4;
			var10004 = 0;
		}

		var10000.a_void_int_int_byte_byte_byte_byte(var10001, var10002, var10003, var10004, (byte) 3, (byte) 4);
	}

	private void s_void_int_int(int integer1, int integer2) {
		this.x_byte = 1;
		this.a_byte_int_int_byte_byte_byte_byte(integer1, integer2 + 1, (byte) 0, (byte) 0, (byte) 0,
				this.b_byte_int_int(integer1, integer2));
	}

	private static void c_void_int_int_byte(int integer1, int integer2, byte byte3) {
		int var3 = e_int_2d_Array[integer1][integer2];
		byte var4 = (byte) (byte3 * 9);
		int var5;
		var5 = ((var5 = var3 >>> var4) & 511) << var4;
		var3 ^= var5;
		e_int_2d_Array[integer1][integer2] = var3;
		c_byte_2d_Array[integer1][integer2] = 24;
	}

	private byte a_byte_int_int_byte_byte_byte_byte(int integer1, int integer2, byte byte3, byte byte4, byte byte5,
			byte byte6) {
		byte var10000 = 1;

		while (true) {
			byte var7 = var10000;
			if (var10000 > 15 || a_int_int_byte_byte(var7, (byte) 28, (byte) 3) == 0) {
				a_long_Array[var7 - 1] = 0L;
				if (byte3 == 7) {
					c_void_int_int_byte(integer1, integer2, byte5);
					this.a_void_int_byte_byte_byte(var7, (byte) 7, (byte) 28, (byte) 3);
				} else {
					this.a_void_int_byte_byte_byte(var7, (byte) 1, (byte) 28, (byte) 3);
					this.a_void_int_byte_byte_byte(var7, byte6, (byte) 54, (byte) 3);
					this.a_void_int_int_byte_byte_byte_byte(integer1, integer2, byte5, var7, (byte) 0, (byte) 3);
					this.a_void_int_int_byte_byte_byte_byte(integer1, integer2, byte5, byte3, (byte) 3, (byte) 4);
				}

				this.a_void_int_byte_byte_byte(var7, (byte) integer1, (byte) 31, (byte) 6);
				this.a_void_int_byte_byte_byte(var7, (byte) integer2, (byte) 37, (byte) 6);
				this.a_void_int_byte_byte_byte(var7, byte5, (byte) 43, (byte) 2);
				if (byte4 < 0) {
					byte4 = 2;
				}

				this.a_void_int_byte_byte_byte(var7, byte4, (byte) 45, (byte) 2);
				return var7;
			}

			var10000 = (byte) (var7 + 1);
		}
	}

	private int a_int_int_int_int_byte(int integer1, int integer2, int integer3, byte byte4) {
		byte var5;
		int var6 = a_int_int_byte_byte(var5 = (byte) a_int_int_byte_byte_byte(integer3, byte4, (byte) 0, (byte) 3),
				(byte) 31, (byte) 6);
		int var7 = a_int_int_byte_byte(var5, (byte) 37, (byte) 6);
		int var8 = a_int_int_byte_byte(var5, (byte) 43, (byte) 2);
		int var9 = a_int_int_byte_byte_byte(integer3, byte4, (byte) 3, (byte) 4);
		if (var6 == integer1 && var7 == integer2 && var8 == byte4) {
			byte var10000;
			switch (var9) {
			case 4:
				var10000 = 1;
				break;
			case 5:
				var10000 = 2;
				break;
			default:
				return var9 << 1;
			}

			byte var10 = var10000;
			return var10 << 1;
		} else {
			switch (var9) {
			case 6:
				c_void_int_int_byte(integer1, integer2, byte4);
			default:
				return var9 << 1;
			}
		}
	}

	private void t_void_int_int(int integer1, int integer2) {
		if (this.j_boolean) {
			this.dw_int = e_int_2d_Array[integer1 - 1][integer2] != 0 ? -1
					: (e_int_2d_Array[integer1 + 1][integer2] != 0 ? 1 : 0);
			if (this.dw_int == 0) {
				this.dw_int = e_int_2d_Array[integer1][integer2 - 1] != 0 ? 2 : 0;
			}

			if (this.dw_int != 0) {
				this.x_byte = 5;
				this.C_void_int(13);
				this.du_int = integer1;
				this.dv_int = integer2;
			}
		}
	}

	private int f_int_int_int(int integer1, int integer2) {
		byte var3 = 0;
		boolean var4 = true;
		int var5 = 0;
		int var6 = this.dw_int;
		int var7 = 0;

		while (true) {
			int var8 = 0;

			while (e_int_2d_Array[integer1 + var6][integer2 - 1] != 0
					&& (byte) (a_byte_2d_Array[integer1][integer2] - 80) >= 0
					|| a_byte_2d_Array[integer1][integer2] == 10 || a_byte_2d_Array[integer1][integer2] == 37
					|| a_byte_2d_Array[integer1][integer2] == 34 || a_byte_2d_Array[integer1][integer2] == 35) {
				integer1 += var6;
			}

			int var10000 = 0;

			while (true) {
				var5 = var10000;
				if ((byte) (a_byte_2d_Array[integer1 + var5][integer2] - 80) >= 0
						|| a_byte_2d_Array[integer1 + var5][integer2] == 10
						|| a_byte_2d_Array[integer1 + var5][integer2] == 37
						|| a_byte_2d_Array[integer1 + var5][integer2] == 34
						|| a_byte_2d_Array[integer1 + var5][integer2] == 35) {
					var5 = Math.abs(var5);
					var7 += var5;
					integer2++;

					while (e_int_2d_Array[integer1][integer2] == 0) {
						integer1 += var6;
						if (var8 >= var5 || integer1 < 0 || integer1 == this.av_int) {
							if (var7 > 0) {
								this.a_void_int_byte_byte_byte(var3, (byte) var7, (byte) 7, (byte) 7);
							}

							return var7;
						}

						var8++;
					}
					break;
				}

				if (var4) {
					var4 = false;
					var3 = this.a_byte_int_int_byte_byte_byte_byte(integer1, integer2, (byte) 8, (byte) -2, (byte) 2,
							(byte) 0);
					this.a_void_int_byte_byte_byte(var3, (byte) 5, (byte) 28, (byte) 3);
					this.a_void_int_byte_byte_byte(var3, (byte) integer1, (byte) 14, (byte) 6);
					this.a_void_int_byte_byte_byte(var3, (byte) integer2, (byte) 20, (byte) 6);
				}

				this.a_void_int_int_byte_byte_byte_byte(integer1 + var5, integer2, (byte) 2, var3, (byte) 0, (byte) 3);
				var10000 = var5 + var6;
			}
		}
	}

	private void u_void_int_int(int integer1, int integer2) {
		this.dp_int = 0;
		int var3 = 0;
		int[] var10000;
		int var10001;
		if (this.dw_int > 1) {
			var10000 = e_int_2d_Array[integer1];
			var10001 = integer2 - 1;
		} else {
			var10000 = e_int_2d_Array[integer1 + this.dw_int];
			var10001 = integer2;
		}

		var3 = var10000[var10001];
		this.w_byte = (byte) a_int_int_byte_byte_byte(var3, (byte) 2, (byte) 0, (byte) 3);
		this.a_void_int_byte_byte_byte(this.w_byte, (byte) 0, (byte) 47, (byte) 2);
		int var4 = a_int_int_byte_byte(this.w_byte, (byte) 7, (byte) 7);
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		switch (this.dw_int) {
		case 2:
			var5 = 0;
			var6 = integer1;
			var7 = integer2;
			var8 = var4;
			var9 = integer2 - 1;
			this.du_int = this.dv_int = -1;
			break;
		default:
			var5 = this.dw_int;
			var6 = integer1 + var5;
			var5 = var5 < 0 ? 1 : 2;
			var7 = integer2 + 1;
			var8 = var4 - this.f_int_int_int(var6, var7);
			var9 = integer2;
			this.du_int = integer1;
			this.dv_int = integer2;
		}

		byte var10;
		label30: {
			int var10002;
			byte var10003;
			byte var10004;
			byte var10005;
			label29: {
				this.a_void_int_byte_byte_byte(this.w_byte, (byte) var5, (byte) 45, (byte) 2);
				this.dx_int = var7;
				this.a_byte_byte_byte_byte_byte((byte) var8, (byte) var6, (byte) var9, (byte) var5);
				var10 = this.b_byte_int_int(var6, var9);
				this.a_void_byte_byte_byte_byte(var10, (byte) 2, (byte) 0, (byte) 4);
				this.x_byte = 1;
				switch (this.dw_int) {
				case -1:
					var10001 = var6 + 1;
					var10002 = integer2;
					var10003 = 11;
					var10004 = 1;
					break;
				case 0:
				default:
					break label30;
				case 1:
					var10001 = var6 - 1;
					var10002 = integer2;
					var10003 = 14;
					var10004 = -1;
					break;
				case 2:
					var10001 = var6;
					var10002 = integer2;
					var10003 = 3;
					var10004 = 0;
					var10005 = 0;
					break label29;
				}

				var10005 = 2;
			}

			var10 = this.a_byte_int_int_byte_byte_byte_byte(var10001, var10002, var10003, var10004, var10005, var10);
		}

		this.a_void_int_byte_byte_byte(var10, (byte) 6, (byte) 28, (byte) 3);
		this.dw_int = 0;
	}

	private void v_void_int_int(int integer1, int integer2) {
		if (this.a_byte_int_int_byte(integer1, integer2, (byte) 2) > 0) {
			a_byte_2d_Array[integer1][integer2] = -1;
			this.s_void_int_int(integer1, integer2);
		}
	}

	private static int b_int_a_int(a a, int integer) {
		int var2 = (integer << 2) + 3;
		return a.c_byte_Array[var2] & 0xFF;
	}

	private static int c_int_a_int(a a, int integer) {
		int var2 = (integer << 2) + 2;
		return a.c_byte_Array[var2] & 0xFF;
	}

	private static void A_void_int(int integer) {
		try {
			a_a = integer <= 4 ? a_a_String_int("/tips.f", integer) : null;
			ByteArrayInputStream var1;
			int var2 = (var1 = new ByteArrayInputStream(a_byte_Array_String_int("/tipst.f", 0))).read();
			integer %= var2;
			byte[] var3 = new byte[(var2 + 1) * 2];
			var1.read(var3);
			int var4 = a_int_byte_Array_int(var3, integer << 1);
			int var5 = a_int_byte_Array_int(var3, integer + 1 << 1);
			var1.skip((long) var4);
			f_byte_Array = new byte[var5 - var4];
			var1.read(f_byte_Array);
			var1.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void cr_void() {
		i.a_a_Array[41].e_int = 5;
		int n = 0;
		++n;
		int n2 = f_byte_Array[0];
		this.Q_boolean = false;
		Graphics graphics = this.a_Graphics;
		graphics.setColor(798521);
		graphics.fillRoundRect(20, 60, 200, 200, 8, 8);
		graphics.setColor(13540096);
		graphics.drawRoundRect(20, 60, 200, 200, 8, 8);
		int n3 = 0;
		boolean bl = true;
		for (int j = 0; j <= n2; ++j) {
			block9: {
				int n4;
				int n5;
				block8: {
					int n6;
					block7: {
						byte by;
						if (j == n2) {
							if (bl) {
								bl = false;
								j = -1;
								n = 1;
								n3 -= 4;
								n3 = 60 + (200 - n3 >> 1);
								continue;
							}
							return;
						}
						by = f_byte_Array[n++];;
						if ((by) != 0)
							break block7;
						n += 2;
						n6 = i.a_int_byte_Array_int(f_byte_Array, n += 2);
						int n7 = n += 2;
						n += n6;
						byte by2 = f_byte_Array[n++];
						int n8 = n;
						n += by2;
						n5 = n3 -= 3;
						n4 = this.a_int_Graphics_byte_Array_a_int_int_int_a_int_int(graphics, f_byte_Array,
								a_a_Array[41], n7, n6, bl ? -1 : n3, a_a, n8, 192);
						break block8;
					}
					n += 2;
					n += 2;
					n6 = f_byte_Array[n++] & 0xFF;
					if (a_a == null)
						break block9;
					if (!bl) {
						a_a.a_void_Graphics_int_int_int_int_int_int(graphics, n6,
								(240 - i.a_a.c_byte_Array[(n6 << 2) + 2] & 0xFF) >> 1, n3, 0, 0, 0);
					}
					n5 = n3;
					n4 = i.a_a.c_byte_Array[(n6 << 2) + 3] & 0xFF;
				}
				n3 = n5 + n4;
			}
			n3 += 4;
		}
	}

	private static void a_void_Graphics_a_String_int_int_int_int_boolean(Graphics graphics, a a, String string,
			int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		a.e_int = integer7;
		if (string.endsWith("\n")) {
			string = string.substring(0, string.length() - 1);
		}

		int var8;
		int var9;
		int var10;
		int var11;
		label31: {
			string = a_String_String_int(string, 230);
			var8 = a_int_a_String_int(a, string, boolean8 ? -1 : 0);
			var9 = a.a_int_String(string);
			var10 = integer4;
			var11 = integer5;
			int var10000;
			int var10001;
			if ((integer6 & 32) != 0) {
				var10000 = integer5;
				var10001 = var9;
			} else {
				if ((integer6 & 2) == 0) {
					break label31;
				}

				var10000 = integer5;
				var10001 = var9 >> 1;
			}

			var11 = var10000 - var10001;
		}

		label25: {
			int var13;
			int var14;
			if ((integer6 & 8) != 0) {
				var13 = integer4;
				var14 = var8;
			} else {
				if ((integer6 & 1) == 0) {
					break label25;
				}

				var13 = integer4;
				var14 = var8 >> 1;
			}

			var10 = var13 - var14;
		}

		graphics.setColor(798521);
		graphics.fillRoundRect(var10 - 5, var11 - 5, var8 + 10, var9 + 10, 10, 10);
		graphics.setColor(13540096);
		graphics.drawRoundRect(var10 - 5, var11 - 5, var8 + 10, var9 + 10, 10, 10);
		a.b_void_Graphics_String_int_int_int(graphics, string, integer4, integer5, integer6);
	}

	private int a_int_Graphics_byte_Array_a_int_int_int_a_int_int(Graphics graphics, byte[] arr, a a3, int integer4,
			int integer5, int integer6, a a7, int integer8, int integer9) {
		int var10 = 0;
		integer6 -= a3.d_byte_Array[2];
		int var11 = a3.e_int + (a3.a_byte_Array[1] & 255);
		int var12 = 0;
		int var13 = integer6;
		boolean var14 = integer6 != -1;
		int var15 = a3.b_int;
		int var16 = integer4;
		boolean var17 = true;
		int var18 = integer4;
		int var19 = 0;

		for (int var21 = integer4; var21 <= integer4 + integer5; var21++) {
			int var22 = 10;
			if (var21 < integer4 + integer5) {
				var22 = arr[var21] & 255;
			}

			if (var17 && var12 > integer9) {
				var12 = var19;
				arr[var18] = 10;
				var21 = var18 - 1;
			} else if (var22 == 10) {
				if (var17 && var14) {
					var12 = 120 - (var12 >> 1);
					var21 = var16 - 1;
					var10 = 0;
				} else {
					var12 = 0;
					var16 = var21 + 1;
					var13 += var11;
					var11 = a3.e_int + (a3.a_byte_Array[1] & 255);
				}

				if (var14) {
					var17 = !var17;
				}
			} else {
				int var28;
				int var30;
				label105: {
					byte[] var10000;
					if (var22 > 32) {
						if (var22 == 64 && a7 != null) {
							if (!var17 && var14) {
								a7.a_void_Graphics_int_int_int_int_int_int(graphics, arr[var10 + integer8], var12,
										var13, 0, 0, 0);
							}

							var12 += c_int_a_int(a7, arr[var10 + integer8]);
							int var23;
							if ((var23 = b_int_a_int(a7, arr[var10 + integer8])) > var11) {
								var11 = var23;
							}

							var10++;
							continue;
						}

						var10000 = a.h_byte_Array;
						var30 = var22;
					} else {
						if (var22 == 32) {
							var18 = var21;
							var19 = var12;
							var28 = var12;
							var30 = a3.a_byte_Array[0] & 255;
							break label105;
						}

						if (var22 == 1) {
							a3.b_int = arr[++var21];
							continue;
						}

						if (var22 != 2) {
							continue;
						}

						var21++;
						var10000 = arr;
						var30 = var21;
					}

					int var10002;
					if ((var22 = var10000[var30] & 255) >= a3.b_int_int(0)) {
						int var26 = var22 - a3.b_int_int(0);
						if (!var17 && var14) {
							a3.a_void_Graphics_int_int_int_int_int_int(graphics, var26, var12, var13, 0, 0, 0);
						}

						var28 = var12;
						var30 = a3.c_byte_Array[(var26 << 2) + 2] & 255;
						var10002 = a3.c_byte_Array[var26 << 2] & 255;
					} else {
						int var27 = (a3.d_byte_Array[var22 << 2] & 255) << 1;
						if (!var17 && var14) {
							a3.a_void_Graphics_int_int_int_int_int(graphics, 0, var22, var12, var13, 0);
						}

						var28 = var12;
						var30 = a3.a_byte_Array[var27] & 255;
						var10002 = a3.d_byte_Array[(var22 << 2) + 1];
					}

					var30 -= var10002;
				}

				var12 = var28 + var30 + a3.d_byte_Array[1];
			}
		}

		a3.b_int = var15;
		return var13 - integer6;
	}

	private void cs_void() {
		this.G_boolean = false;
		a_void_a_boolean(a_a_Array[23], true);
		a_a_Array[23] = null;
		a_void_a_boolean(a_a_Array[24], true);
		a_a_Array[24] = null;
		a_void_a_boolean(a_a_Array[25], true);
		a_a_Array[25] = null;
		a_void_a_boolean(a_a_Array[26], true);
		a_a_Array[26] = null;
		a_void_a_boolean(a_a_Array[17], true);
		a_a_Array[17] = null;
		this.c_int_Array = null;
		g_Image = null;
		c_Graphics = null;
		System.gc();
	}

	private void ct_void() {
		this.g_void();
		this.av_boolean = true;
		this.aw_boolean = true;
		this.ao_boolean = true;
		l_byte = 21;
		this.bs_int = 0;
		this.br_int = 14;
		this.dJ_int = 100;
		if (this.aq_int > this.b_int_int(this.ap_int)) {
			this.aq_int = this.b_int_int(this.ap_int);
		}

		this.cu_void();
	}

	private void cu_void() {
		a_long_2d_Array = new long[12][12];
		this.c_int_Array = new int[20];
	}

	private static int a_int_long_byte_byte(long long1, byte byte2, byte byte3) {
		long var4 = long1 >>> byte2;
		return (int) ((var4) & ~(-1L << byte3));
	}

	private void a_void_int_int_int_byte_byte(int integer1, int integer2, int integer3, byte byte4, byte byte5) {
		long var6;
		long var8 = (long) a_int_long_byte_byte(var6 = a_long_2d_Array[integer1][integer2], byte4, byte5) << byte4;
		var6 ^= var8;
		long var10;
		var10 = (var10 = (long) integer3) << byte4;
		var6 |= var10;
		a_long_2d_Array[integer1][integer2] = var6;
	}

	private void cv_void() {
		if (this.av_boolean) {
			g_Image = Image.createImage(186, 184);
		}

		if (this.aw_boolean) {
			this.aw_boolean = false;
			this.ax_boolean = true;
			this.cB_void();
			this.cA_void();
		}

		if (this.ax_boolean) {
			this.a_Graphics.drawImage(g_Image, 27, 77, 0);
			this.cC_void();
			this.cz_void();
			this.cw_void();
			this.cx_void();
		}

		if (this.ax_boolean && this.dU_int == this.dW_int && this.dV_int == this.dX_int) {
			this.ax_boolean = false;
		}
	}

	private void cw_void() {
		int var3;
		a var10000;
		Graphics var10001;
		StringBuffer var10002;
		int var10003;
		if ((var3 = a_int_long_byte_byte(a_long_2d_Array[this.dU_int][this.dV_int], (byte) 6,
				(byte) 5)) < this.dJ_int) {
			var10000 = a_a_Array[41];
			var10001 = this.a_Graphics;
			var10002 = new StringBuffer().append(a_StringBuffer.toString());
			var10003 = var3;
		} else {
			var10000 = a_a_Array[41];
			var10001 = this.a_Graphics;
			var10002 = new StringBuffer().append(b_StringBuffer.toString());
			var10003 = var3 - this.dJ_int;
		}

		var10000.a_void_Graphics_String_int_int_int(var10001, var10002.append(var10003 + 1).toString(), 8, 67, 6);
	}

	private void cx_void() {
		if (this.dU_int == this.dW_int && this.dV_int == this.dX_int) {
			int var3 = a_int_long_byte_byte(a_long_2d_Array[this.dU_int][this.dV_int], (byte) 6, (byte) 5);
			int var4 = 0;
			var4 = this.b_int_int_int(this.ap_int, var3);
			int var5 = this.c_int_int_int(this.ap_int, var3);
			if (var4 > var5) {
				var4 = var5;
			}

			c_StringBuffer.delete(0, c_StringBuffer.length());
			c_StringBuffer.append(var4);
			c_StringBuffer.append('/');
			c_StringBuffer.append(var5);
			a_a_Array[41].a_void_String(c_StringBuffer.toString());
			int var7 = a.c_int + 6 + 14;
			int var9 = 37 + this.dU_int * 13 + 6;
			int var10 = 73 + this.dV_int * 13 + 6;
			int var11 = var9 - (var7 >> 1) + 0;
			int var12;
			if ((var12 = var10 - 17 + -31) <= 75) {
				var12 = 75;
				if ((var11 = var9 + 20) + var7 >= 200) {
					var11 = var9 - var7 + -20;
				}
			}

			if (var11 <= 35) {
				var11 = 35;
			}

			if (var11 + var7 >= 200) {
				var11 = 150;
			}

			a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var11, var12, var7, 17, 37042, 0);
			a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, c_StringBuffer.toString(), var11 + 2,
					var12 + 2 - 1, 20);
			if (a_a_Array[17] != null) {
				a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 10, var11 + var7 - 2 - 14,
						var12 + 2 - 1, 0, 0, 0);
			}
		}
	}

	private void cy_void() {
		this.ek_int = 0;
		this.eh_int = 0;
		this.ei_int = 0;
		this.as_boolean = false;
		this.ar_boolean = true;
		this.aq_boolean = false;
		this.ej_int = 2;
		this.el_int = 2;
		this.at_boolean = false;
	}

	private boolean g_boolean() {
		boolean var1 = false;
		int var2 = this.eh_int >> 1;
		i var10000;
		int var10001;
		if (this.ej_int < 0) {
			var10000 = this;
			var10001 = 2;
		} else {
			var10000 = this;
			var10001 = this.ej_int - 1;
		}

		var10000.ej_int = var10001;
		if (this.dW_int == 0 && this.dX_int == 0) {
			this.dW_int = this.dU_int;
			this.dX_int = this.dV_int;
		}

		if (this.ej_int == 0) {
			boolean var23;
			if (this.ei_int == var2) {
				var23 = true;
			} else {
				this.ei_int++;
				var23 = false;
			}

			var1 = var23;
		}

		int var5;
		int var8;
		byte var9;
		label109: {
			var5 = a_int_long_byte_byte(a_long_2d_Array[this.dU_int][this.dV_int], (byte) 3, (byte) 3);
			var8 = a_int_long_byte_byte(a_long_2d_Array[this.dW_int][this.dX_int], (byte) 3, (byte) 3);
			var9 = 0;
			byte var24;
			switch (var5 != 1 && var8 != 1 ? var5 : 1) {
			case 0:
				var24 = 2;
				break;
			case 1:
				var24 = 8;
				break;
			default:
				break label109;
			}

			var9 = var24;
		}

		int var11 = 0;
		int var12 = this.at_boolean ? var2 - 1 : 0;

		for (int var13 = this.at_boolean ? -1 : 1; var11 < this.ei_int; var12 += var13) {
			int var14 = var12 * 2;
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var9, this.c_int_Array[var14],
					this.c_int_Array[var14 + 1], 0, 0, 0);
			var11++;
		}

		byte var15;
		byte var20;
		label98: {
			var20 = 0;
			var15 = 0;
			byte var25;
			switch (var5) {
			case 0:
				var15 = 0;
				var25 = 0;
				break;
			case 1:
				var15 = 2;
				var25 = 9;
				break;
			default:
				break label98;
			}

			var20 = var25;
		}

		int var16 = this.dU_int * 13 + var15 + 37;
		int var17 = this.dV_int * 13 + var15 + 73;
		a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var20, var16, var17, 0, 0, 0);
		int var18 = this.ap_boolean ? 7 : 6;
		a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var18, var16 + 6, var17 + 6, 0, 0, 0);
		boolean var19 = true;
		if (var11 == var2) {
			if (this.el_int < 0) {
				var10000 = this;
				var10001 = 2;
			} else {
				var10000 = this;
				var10001 = this.el_int - 1;
			}

			var10000.el_int = var10001;
			if (this.el_int == 0) {
				this.el_int = 1;
				var19 = false;
			}
		}

		label92: if (!var19) {
			byte var27;
			switch (var8) {
			case 0:
				var15 = 0;
				var27 = 0;
				break;
			case 1:
				var15 = 2;
				var27 = 9;
				break;
			default:
				break label92;
			}

			var20 = var27;
		} else {
			label87: {
				byte var28;
				switch (var8) {
				case 0:
					var15 = 0;
					var28 = 1;
					break;
				case 1:
					var15 = 2;
					var28 = 5;
					break;
				default:
					break label87;
				}

				var20 = var28;
			}
		}

		var16 = this.dW_int * 13 + var15 + 37;
		var17 = this.dX_int * 13 + var15 + 73;
		a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var20, var16, var17, 0, 0, 0);
		if (!var19) {
			boolean var29;
			if (this.ek_int == a_a_Array[9].a_int_int(0)) {
				this.ek_int--;
				this.as_boolean = true;
				var29 = true;
			} else {
				var29 = false;
			}

			var1 = var29;
			if (!this.O_boolean) {
				a_a_Array[9].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, this.ek_int, var16, var17, 0, 0,
						0);
			}

			this.ek_int++;
		}

		return var1;
	}

	private void cz_void() {
		int var1 = 37 + this.dU_int * 13 + 6;
		int var2 = 73 + this.dV_int * 13 + 6;
		if (this.dU_int != this.dW_int || this.dV_int != this.dX_int) {
			int var6 = 37 + this.dW_int * 13 + 6;
			int var4 = 73 + this.dX_int * 13 + 6;
			if ((this.a_byte_int_int(this.ap_int, this.aq_int + 1) & 2) != 0 && this.aq_int + 1 == dY_int
					|| this.aq_int == dY_int) {
				this.aq_boolean = true;
			}

			if (!this.aq_boolean) {
				this.aq_boolean = this.g_boolean();
				if (this.aq_boolean) {
					this.aw_boolean = true;
					return;
				}
			} else if (this.c_boolean_int_int_int_int(var1, var2, var6, var4)) {
				this.dU_int = this.dW_int;
				this.dV_int = this.dX_int;
				return;
			}
		} else if (this.ax_boolean) {
			int var3 = this.ap_boolean ? 7 : 6;
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var3, var1, var2, 0, 0, 0);
		}
	}

	private boolean c_boolean_int_int_int_int(int integer1, int integer2, int integer3, int integer4) {
		if (this.ao_boolean) {
			this.ao_boolean = false;
			this.dL_int = integer1;
			this.dM_int = integer2;
			this.dN_int = 0;
			this.dO_int = integer3 - integer1;
			this.dP_int = integer4 - integer2;
			this.dQ_int = 0;
			this.dR_int = 0;
			this.dS_int = 10;
			this.dT_int = 10;
		}

		if (this.dO_int < 0) {
			this.dS_int = -10;
			this.dO_int = -this.dO_int;
		}

		if (this.dP_int < 0) {
			this.dT_int = -10;
			this.dP_int = -this.dP_int;
		}

		this.ap_boolean = this.dS_int <= 0;
		int var5 = this.ap_boolean ? 7 : 6;
		if (this.dP_int <= this.dO_int) {
			this.dQ_int = 2 * this.dO_int;
			this.dR_int = 2 * this.dP_int;
			if (this.dS_int < 0 && this.dL_int <= integer3 || this.dS_int > 0 && this.dL_int >= integer3) {
				integer3 = 37 + this.dW_int * 13 + 6;
				integer4 = 73 + this.dX_int * 13 + 6;
				a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var5, integer3, integer4, 0, 0,
						0);
				this.ao_boolean = true;
				return true;
			}

			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var5, this.dL_int, this.dM_int, 0, 0,
					0);
			this.dL_int = this.dL_int + this.dS_int;
			this.dN_int = this.dN_int + this.dR_int;
			if (this.dN_int <= this.dO_int) {
				return false;
			}

			this.dM_int = this.dM_int + this.dT_int;
		} else {
			this.dQ_int = 2 * this.dP_int;
			this.dR_int = 2 * this.dO_int;
			if (this.dT_int < 0 && this.dM_int <= integer4 || this.dT_int > 0 && this.dM_int >= integer4) {
				integer3 = 37 + this.dW_int * 13 + 6;
				integer4 = 73 + this.dX_int * 13 + 6;
				a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var5, integer3, integer4, 0, 0,
						0);
				this.ao_boolean = true;
				return true;
			}

			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, var5, this.dL_int, this.dM_int, 0, 0,
					0);
			this.dM_int = this.dM_int + this.dT_int;
			this.dN_int = this.dN_int + this.dR_int;
			if (this.dN_int <= this.dP_int) {
				return false;
			}

			this.dL_int = this.dL_int + this.dS_int;
		}

		this.dN_int = this.dN_int - this.dQ_int;
		return false;
	}

	private void a_void_int_int_long_int_int(int integer1, int integer2, long long3, int integer4, int integer5) {
		int var7 = a_int_long_byte_byte(long3, (byte) 6, (byte) 5);
		this.dK_int |= 1 << var7;
		int var8 = a_int_long_byte_byte(long3, (byte) 11, (byte) 3);
		int var9 = 14;
		int var10 = 0;

		while (var10 < var8) {
			int var11 = 37 + integer1 * 13;
			int var12 = 73 + integer2 * 13;
			int var13 = a_int_long_byte_byte(long3, (byte) var9, (byte) 4);
			var9 += 4;
			int var14 = a_int_long_byte_byte(long3, (byte) var9, (byte) 4);
			long var17;
			int var19 = a_int_long_byte_byte(var17 = a_long_2d_Array[var13][var14], (byte) 6, (byte) 5);
			int var20 = this.dK_int;
			label83: if ((var20 & 1 << var19) <= 0) {
				int var15 = 37 + var13 * 13;
				int var16 = 73 + var14 * 13;
				var11 += 6;
				var12 += 6;
				var15 += 6;
				var16 += 6;
				this.dZ_int = var11;
				this.ea_int = var12;
				this.eb_int = 0;
				this.ec_int = var15 - var11;
				this.ed_int = var16 - var12;
				this.ee_int = 0;
				this.ef_int = 0;
				this.eg_int = 1;
				byte var21 = 1;
				byte var22 = 1;
				if (this.ec_int < 0) {
					var21 = -1;
					this.ec_int = -this.ec_int;
				}

				if (this.ed_int < 0) {
					var22 = -1;
					this.ed_int = -this.ed_int;
				}

				byte var23 = 0;
				int var24 = a_int_long_byte_byte(var17, (byte) 0, (byte) 3);
				int var25 = a_int_long_byte_byte(var17, (byte) 3, (byte) 3);
				if (integer4 == 1) {
					var25 = integer4;
				}

				if (integer5 == 1) {
					if (var25 == 1) {
						break label83;
					}

					var24 = integer5;
				}

				if (!this.as_boolean && var19 == dY_int) {
					var24 = 1;
				}

				label94: if (var24 == 0) {
					byte var10000;
					switch (var25) {
					case 0:
						var10000 = 2;
						break;
					case 1:
						var10000 = 8;
						break;
					default:
						break label94;
					}

					var23 = var10000;
				} else {
					label89: {
						byte var33;
						switch (var25) {
						case 0:
							var33 = 3;
							break;
						case 1:
							var33 = 4;
							break;
						default:
							break label89;
						}

						var23 = var33;
					}
				}

				if (this.ed_int <= this.ec_int) {
					this.ee_int = this.ec_int << 1;
					this.ef_int = this.ed_int << 1;

					while (true) {
						if (this.eg_int % 8 == 0) {
							a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(c_Graphics, var23, this.dZ_int - 27,
									this.ea_int - 77, 0, 0, 0);
							if (this.ar_boolean) {
								this.w_void_int_int(var7, var19);
							}
						}

						if (this.dZ_int == var15) {
							break;
						}

						this.dZ_int += var21;
						this.eb_int = this.eb_int + this.ef_int;
						if (this.eb_int > this.ec_int) {
							this.ea_int += var22;
							this.eb_int = this.eb_int - this.ee_int;
						}

						this.eg_int++;
					}
				} else {
					this.ee_int = 2 * this.ed_int;
					this.ef_int = 2 * this.ec_int;

					while (true) {
						if (this.eg_int % 8 == 0) {
							a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(c_Graphics, var23, this.dZ_int - 27,
									this.ea_int - 77, 0, 0, 0);
							if (this.ar_boolean) {
								this.w_void_int_int(var7, var19);
							}
						}

						if (this.ea_int == var16) {
							break;
						}

						this.ea_int += var22;
						this.eb_int = this.eb_int + this.ef_int;
						if (this.eb_int > this.ed_int) {
							this.dZ_int += var21;
							this.eb_int = this.eb_int - this.ee_int;
						}

						this.eg_int++;
					}
				}
			}

			var10++;
			var9 += 4;
		}
	}

	private void w_void_int_int(int integer1, int integer2) {
		i var10000;
		if (!this.au_boolean) {
			int var5 = a_int_long_byte_byte(a_long_2d_Array[this.cx_int][this.cy_int], (byte) 6, (byte) 5);
			if ((integer2 != dY_int || integer1 != var5) && (integer1 != dY_int || integer2 != var5)) {
				return;
			}

			if (integer1 == dY_int && integer2 == var5) {
				this.at_boolean = true;
			}

			var10000 = this;
		} else {
			if ((integer2 != dY_int || integer1 != dY_int - 1) && (integer1 != dY_int || integer2 != dY_int - 1)) {
				return;
			}

			if (integer1 == dY_int && integer2 == dY_int - 1) {
				this.at_boolean = true;
			}

			var10000 = this;
		}

		var10000.c_int_Array[this.eh_int++] = this.dZ_int;
		this.c_int_Array[this.eh_int++] = this.ea_int;
	}

	private void cA_void() {
		this.dK_int = 0;
		if ((this.a_byte_int_int(this.ap_int, this.aq_int + 1) & 2) != 0 && this.aq_int + 1 == dY_int
				|| this.aq_int == dY_int) {
			this.ar_boolean = false;
			this.as_boolean = true;
		}

		for (int var1 = 0; var1 < 12; var1++) {
			for (int var2 = 0; var2 < 12; var2++) {
				long var3 = a_long_2d_Array[var1][var2];
				boolean var5 = false;
				if (var3 != 0L) {
					int var6;
					int var7;
					int var8;
					int var9;
					byte var10;
					byte var11;
					var6 = a_int_long_byte_byte(var3, (byte) 3, (byte) 3);
					var7 = a_int_long_byte_byte(var3, (byte) 6, (byte) 5);
					var8 = !this.as_boolean && var7 == dY_int && var7 != 0 ? 1
							: a_int_long_byte_byte(var3, (byte) 0, (byte) 3);
					var9 = -1;
					var10 = -1;
					var11 = -1;
					label80: if (var8 == 0) {
						var5 = this.b_int_int_int(this.ap_int, var7) == this.c_int_int_int(this.ap_int, var7);
						int var10000;
						switch (var6) {
						case 0:
							var10 = 17;
							var11 = 0;
							var10000 = a_int_long_byte_byte(var3, (byte) 11, (byte) 3) > 2 ? 13 : 0;
							break;
						case 1:
							var10 = 18;
							var11 = 2;
							var10000 = 9;
							break;
						default:
							break label80;
						}

						var9 = var10000;
					} else {
						switch (var6) {
						case 0:
							var11 = 0;
							var9 = 1;
						case 1:
						}
					}

					this.a_void_int_int_long_int_int(var1, var2, var3, var6, var8);
					if (var11 != -1 && var9 != -1) {
						if (var5 && var10 != -1) {
							a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(c_Graphics, var10,
									var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 77, 0, 0, 0);
						}

						byte var12;
						label70: {
							a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(c_Graphics, var9,
									var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 77, 0, 0, 0);
							var12 = -1;
							byte var13;
							switch (this.ap_int) {
							case 0:
								if (var7 != 8) {
									break label70;
								}

								var13 = 52;
								break;
							case 1:
								if (var7 != 9) {
									break label70;
								}

								var13 = 53;
								break;
							case 2:
								if (var7 == 10) {
									var13 = 54;
									break;
								}
							default:
								break label70;
							}

							var12 = var13;
						}

						if (var12 != -1) {
							a_a_Array[var12].a_void_Graphics_int_int_int_int_int_int(c_Graphics, 0,
									var1 * 13 + -8 + 37 - 27, var2 * 13 + -8 + 73 - 77, 0, 0, 0);
						}
					}
				}
			}
		}

		this.ar_boolean = false;
	}

	private void cB_void() {
		int var1;
		int var2;
		int var3;
		byte var4;
		byte var5;
		label22: {
			this.a_Graphics.setClip(0, 0, 240, 320);
			var1 = 0;
			var2 = 0;
			var3 = 0;
			var4 = -1;
			var5 = 0;
			byte var10000;
			switch (this.ap_int) {
			case 0:
				var1 = 939282;
				var2 = 3111750;
				var3 = 8635434;
				var5 = 24;
				var10000 = 28;
				break;
			case 1:
				var1 = 869201;
				var2 = 4022666;
				var3 = 5873874;
				var5 = 25;
				var10000 = 29;
				break;
			case 2:
				var1 = 5210510;
				var2 = 3711421;
				var3 = 7469567;
				var5 = 26;
				var10000 = 30;
				break;
			default:
				break label22;
			}

			var4 = var10000;
		}

		this.a_Graphics.setColor(var1);
		this.a_Graphics.fillRect(0, 0, 240, 320);
		a_a_Array[var5].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0, 120, 0, 0, 0, 0);
		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[var4], 8, 6, 20);
		c_Graphics = g_Image.getGraphics();
		c_Graphics.setColor(var1);
		c_Graphics.fillRect(0, 0, 186, 184);
		a_a_Array[23].a_void_Graphics_int_int_int_int_int_int(c_Graphics, 0, 93, 92, 0, 0, 0);
		this.a_Graphics.setColor(var2);
		this.a_Graphics.fillRoundRect(2, 261, 236, 22, 8, 8);
		this.a_Graphics.setColor(var3);
		this.a_Graphics.drawRoundRect(2, 261, 236, 22, 8, 8);
		this.a_void();
		this.b_void();
		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[96], 222, 311, 10);
		if (a_a_Array[17] != null) {
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 12, 11, 263, 0, 0, 0);
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 10, 155, 264, 0, 0, 0);
			a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 11, 80, 264, 0, 0, 0);
		}

		c_StringBuffer.delete(0, c_StringBuffer.length());
		c_StringBuffer.append(this.ao_int);
		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, c_StringBuffer.toString(), 39, 264, 20);
		c_StringBuffer.delete(0, c_StringBuffer.length());
		c_StringBuffer.append(a_int_byte_Array_int(i_byte_Array, 4));
		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, c_StringBuffer.toString(), 100, 264, 20);
		c_StringBuffer.delete(0, c_StringBuffer.length());
		int var6 = a_int_byte_Array_int(i_byte_Array, 6);
		byte var8 = i_byte_Array[0];
		if (var6 >= var8) {
			c_StringBuffer.append(var6).append("/").append(var6);
		} else {
			c_StringBuffer.append(var6).append("/").append(var8);
		}

		a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, c_StringBuffer.toString(), 175, 264, 20);
		this.av_boolean = false;
	}

	private void cC_void() {
		int var1;
		int var2;
		label13: {
			var1 = 0;
			var2 = 0;
			int var10000;
			switch (this.ap_int) {
			case 0:
				var1 = 3111750;
				var10000 = 8635434;
				break;
			case 1:
				var1 = 4022666;
				var10000 = 5873874;
				break;
			case 2:
				var1 = 3711421;
				var10000 = 7469567;
				break;
			default:
				break label13;
			}

			var2 = var10000;
		}

		this.a_Graphics.setColor(var1);
		this.a_Graphics.fillRoundRect(2, 55, 236, 22, 8, 8);
		this.a_Graphics.setColor(var2);
		this.a_Graphics.drawRoundRect(2, 55, 236, 22, 8, 8);
	}

	private void cD_void() {
		if (this.dU_int == this.dW_int && this.dV_int == this.dX_int) {
			byte var1 = -1;
			if (a_boolean_int(4097)) {
				var1 = 2;
			} else if (a_boolean_int(262146)) {
				var1 = 3;
			} else if (a_boolean_int(16388)) {
				var1 = 4;
			} else if (a_boolean_int(65544)) {
				var1 = 1;
			} else {
				if (a_boolean_int(32944)) {
					if (System.currentTimeMillis() - this.n_long < 2000L) {
						return;
					}

					int var16 = a_int_long_byte_byte(a_long_2d_Array[this.dU_int][this.dV_int], (byte) 6, (byte) 5);
					this.A_void();
					this.cs_void();
					System.gc();
					this.aq_int = var16;
					this.t_void();
					W_int = 0;
					return;
				}

				if (a_boolean_int(64)) {
					this.I_boolean = true;
					this.G_boolean = true;
					this.K_boolean = true;
					this.bs_int = 0;
					l_byte = 28;
					W_int = 0;
					return;
				}
			}

			W_int = 0;
			if (var1 != -1) {
				int var2 = this.dU_int;
				int var3 = this.dV_int;
				long var4;
				int var6 = a_int_long_byte_byte(var4 = a_long_2d_Array[var2][var3], (byte) 11, (byte) 3);
				int var7 = 14;
				int var8 = -1;
				int var9 = -1;
				int var10 = 0;

				while (var10 < var6) {
					int var11 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
					var7 += 4;
					int var12 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
					label118: if (a_int_long_byte_byte(a_long_2d_Array[var11][var12], (byte) 0, (byte) 3) != 1) {
						int var10000;
						switch (var1) {
						case 1:
							if (var11 <= var2) {
								break label118;
							}

							if (var8 >= 0) {
								var9 = var10;
								break label118;
							}

							var10000 = var10;
							break;
						case 2:
							if (var12 >= var3) {
								break label118;
							}

							if (var8 >= 0) {
								var9 = var10;
								break label118;
							}

							var10000 = var10;
							break;
						case 3:
							if (var12 <= var3) {
								break label118;
							}

							if (var8 >= 0) {
								var9 = var10;
								break label118;
							}

							var10000 = var10;
							break;
						case 4:
							if (var11 < var2) {
								if (var8 < 0) {
									var10000 = var10;
									break;
								} else {
									var9 = var10;
								}
							}
						default:
							break label118;
						}

						var8 = var10000;
					}

					var10++;
					var7 += 4;
				}

				if (var8 != -1) {
					var10 = -1;
					if (var9 == -1) {
						var10 = var8;
					} else {
						label138: {
							int var29;
							label92: {
								var7 = 14 + var8 * 2 * 4;
								int var25 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
								var7 += 4;
								int var27 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
								var7 = 14 + var9 * 2 * 4;
								int var13 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
								var7 += 4;
								int var14 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
								switch (var1) {
								case 1:
								case 4:
									if (var3 == var27) {
										var29 = var8;
										break label92;
									}

									if (var3 != var14) {
										var29 = Math.abs(var2 - var25) > Math.abs(var2 - var13) ? var8 : var9;
										break label92;
									}
									break;
								case 2:
								case 3:
									if (var2 == var25) {
										var29 = var8;
										break label92;
									}

									if (var2 != var13 && var25 > var13) {
										var29 = var8;
										break label92;
									}
									break;
								default:
									break label138;
								}

								var29 = var9;
							}

							var10 = var29;
						}
					}

					if (var10 != -1) {
						var7 = 14 + var10 * 2 * 4;
						int var26 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
						var7 += 4;
						int var28 = a_int_long_byte_byte(var4, (byte) var7, (byte) 4);
						if (a_int_long_byte_byte(a_long_2d_Array[var26][var28], (byte) 0, (byte) 3) == 0) {
							this.dW_int = var26;
							this.dX_int = var28;
							this.ax_boolean = true;
						}
					}
				}
			}
		}
	}

	private void B_void_int(int integer) {
		try {
			switch (integer) {
			case 0:
				if (this.H_boolean) {
					this.E_void();
					return;
				}
				break;
			case 1:
				if (this.I_boolean) {
					this.A_void();
					return;
				}
				break;
			case 2:
				if (this.F_boolean) {
					this.k_void();
					return;
				}
				break;
			case 3:
				if (this.G_boolean) {
					this.cs_void();
					return;
				}
				break;
			case 4:
				a_a_Array[41].b_int = 0;
				c_StringBuffer.delete(0, c_StringBuffer.length());
				switch (this.ap_int) {
				case 0:
					c_StringBuffer.append("/map_angkor.out");
					break;
				case 1:
					c_StringBuffer.append("/map_scotland.out");
					break;
				case 2:
					c_StringBuffer.append("/map_tibet.out");
				}

				a_long_2d_Array = new long[12][12];
				this.c_int_Array = new int[20];
				this.a_void_String(c_StringBuffer.toString());
				return;
			case 5:
				a_a_Array[17] = a_a_String_int("/ms.f", 0);
				a_a_Array[23] = a_a_String_int("/ms.f", 1);
				return;
			case 6:
				a[] var10000;
				byte var10001;
				String var10002;
				byte var10003;
				switch (this.ap_int) {
				case 0:
					var10000 = a_a_Array;
					var10001 = 24;
					var10002 = "/ms.f";
					var10003 = 2;
					break;
				case 1:
					var10000 = a_a_Array;
					var10001 = 25;
					var10002 = "/ms.f";
					var10003 = 3;
					break;
				case 2:
					var10000 = a_a_Array;
					var10001 = 26;
					var10002 = "/ms.f";
					var10003 = 4;
					break;
				default:
					return;
				}

				var10000[var10001] = a_a_String_int(var10002, var10003);
				return;
			case 7:
				if (a_a_Array[54] == null) {
					a_a_Array[54] = a_a_String_int("/mmv.f", 1);
				}

				this.v_int = c_int_a_int(a_a_Array[54], 0) >> 1;
				this.w_int = b_int_a_int(a_a_Array[54], 0) >> 1;
				return;
			case 8:
				if (a_a_Array[53] == null) {
					a_a_Array[53] = a_a_String_int("/mmv.f", 2);
					return;
				}
				break;
			case 9:
				if (a_a_Array[52] == null) {
					a_a_Array[52] = a_a_String_int("/mmv.f", 3);
					return;
				}
				break;
			case 10:
				if (this.ab_boolean) {
					this.cy_void();
					return;
				}
			case 11:
			case 12:
			case 13:
			default:
				break;
			case 14:
				if (this.A_boolean) {
					this.A_boolean = false;
				}

				this.cE_void();
				l_byte = 15;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void a_void_String(String string) throws IOException {
		InputStream var2 = Utils.deepCopy(getClass().getResourceAsStream("/res" + string));
		int var3 = ((byte) (var2).read() & 255) + ((byte) var2.read() & 255) * 256;
		int var4 = var2.read();
		f_byte_Array = new byte[var3];
		var2.read(f_byte_Array);
		var2.close();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			byte var7 = f_byte_Array[var5++];
			byte var8 = f_byte_Array[var5++];
			byte var9 = f_byte_Array[var5++];
			byte var10 = f_byte_Array[var5++];
			if (var9 == 1 && var10 < this.dJ_int) {
				this.dJ_int = var10;
			}

			byte var11 = f_byte_Array[var5++];
			this.a_void_int_int_int_byte_byte(var7, var8, 1, (byte) 0, (byte) 3);
			this.a_void_int_int_int_byte_byte(var7, var8, var9, (byte) 3, (byte) 3);
			this.a_void_int_int_int_byte_byte(var7, var8, var10, (byte) 6, (byte) 5);
			this.a_void_int_int_int_byte_byte(var7, var8, var11, (byte) 11, (byte) 3);
			byte var12 = 14;

			for (int var13 = 0; var13 < var11; var13++) {
				byte var14 = f_byte_Array[var5++];
				this.a_void_int_int_int_byte_byte(var7, var8, var14, var12, (byte) 4);
				var12 = (byte) (var12 + 4);
				byte var15 = f_byte_Array[var5++];
				this.a_void_int_int_int_byte_byte(var7, var8, var15, var12, (byte) 4);
				var12 = (byte) (var12 + 4);
			}
		}

		f_byte_Array = null;
		System.gc();
	}

	private void cE_void() {
		this.dU_int = -1;
		if (!this.ab_boolean) {
			this.aq_int = dY_int;
		}

		this.ab_boolean = false;

		for (int var1 = 0; var1 < 12; var1++) {
			for (int var2 = 0; var2 < 12; var2++) {
				long var3;
				if ((var3 = a_long_2d_Array[var1][var2]) != 0L) {
					int var5 = a_int_long_byte_byte(var3, (byte) 6, (byte) 5);
					i var10000;
					int var10001;
					int var10002;
					byte var10003;
					if ((this.a_byte_int_int(this.ap_int, var5) & 64) == 0 && var5 != 0) {
						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = 1;
					} else {
						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = 0;
					}

					var10000.a_void_int_int_int_byte_byte(var10001, var10002, var10003, (byte) 0, (byte) 3);
					if (var5 == this.aq_int) {
						this.dU_int = var1;
						this.dV_int = var2;
					}

					if (var5 == dY_int) {
						this.dW_int = var1;
						this.dX_int = var2;
					}

					this.ap_boolean = false;
				}
			}
		}
	}

	private void cF_void() {
		a_a_Array[17] = a_a_String_int("/ms.f", 0);
		this.aO_void();
	}

	public static final void a_void_Graphics_int_int_int_int_int_int(Graphics graphics, int integer2, int integer3,
			int integer4, int integer5, int integer6, int integer7) {
		int var7 = graphics.getClipX();
		int var8 = graphics.getClipY();
		int var9 = graphics.getClipWidth();
		int var10 = graphics.getClipHeight();
		graphics.setClip(integer2, integer3, integer4, integer5);
		graphics.setColor(integer6);
		graphics.fillRect(integer2, integer3, integer4, integer5);
		graphics.setClip(integer2 - 3, integer3, integer4 + 6, integer5);

		for (int var11 = integer3; var11 <= integer3 + integer5; var11 += 8) {
			graphics.drawImage(b_Image_2d_Array[integer7][7], integer2, var11, 24);
			graphics.drawImage(b_Image_2d_Array[integer7][5], integer2 + integer4, var11, 20);
		}

		graphics.setClip(integer2, integer3 - 3, integer4, integer5 + 6);

		for (int var12 = integer2; var12 <= integer2 + integer4; var12 += 8) {
			graphics.drawImage(b_Image_2d_Array[integer7][4], var12, integer3, 36);
			graphics.drawImage(b_Image_2d_Array[integer7][6], var12, integer3 + integer5, 20);
		}

		graphics.setClip(integer2 - 3, integer3 - 3, integer4 + 6, integer5 + 6);
		graphics.drawImage(b_Image_2d_Array[integer7][0], integer2, integer3, 40);
		graphics.drawImage(b_Image_2d_Array[integer7][1], integer2 + integer4, integer3, 36);
		graphics.drawImage(b_Image_2d_Array[integer7][2], integer2, integer3 + integer5, 24);
		graphics.drawImage(b_Image_2d_Array[integer7][3], integer2 + integer4, integer3 + integer5, 20);
		graphics.setClip(var7, var8, var9, var10);
	}

	public static final void a_void_Graphics_int_int_int_int_int_int_int_int(Graphics graphics, int integer2,
			int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, int integer9) {
		int var9 = graphics.getClipX();
		int var10 = graphics.getClipY();
		int var11 = graphics.getClipWidth();
		int var12 = graphics.getClipHeight();
		a_void_Graphics_int_int_int_int_int_int(graphics, integer2, integer3, integer4, integer5, integer6, integer7);
		a_void_Graphics_int_int_int_int_int_int(graphics, integer2 + 10, integer3 - 3 - integer9, integer8, integer9,
				integer6, integer7);
		graphics.setClip(integer2 + 10 - 3, integer3 - 3, integer8 + 6, 3);
		graphics.setColor(integer6);
		graphics.fillRect(integer2 + 10 - 3, integer3 - 3, integer8 + 6, 3);
		graphics.drawImage(b_Image_2d_Array[integer7][3], integer2 + 10, integer3 - 3, 24);
		graphics.drawImage(b_Image_2d_Array[integer7][2], integer2 + 10 + integer8, integer3 - 3, 20);
		graphics.setClip(var9, var10, var11, var12);
	}

	private void cG_void() {
		int n;
		int n2;
		int n3;
		int n4;
		String string;
		Graphics graphics;
		a a2;
		if (this.c_int == this.em_int && !this.aw_boolean) {
			return;
		}
		if (this.c_int != this.em_int) {
			this.aw_boolean = true;
		}
		this.a_Graphics.setClip(0, 0, 240, 320);
		if (this.aw_boolean) {
			this.a_void_Graphics_boolean(this.a_Graphics, true);
			this.a_Graphics.setColor(0);
			this.a_Graphics.fillRect(0, 0, 240, 15);
			this.a_Graphics.setColor(0xFFFFFF);
			this.a_Graphics.drawLine(0, 15, 240, 15);
			a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[72], 120, 0, 17);
			i.a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 10, 35, 220, 90, 4273165, 0);
			if (this.d_int != -1) {
				a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics,
						i.a_String_String_int(this.a_String, 200), 120, 260, 17);
			}
			if (this.Z_boolean) {
				this.Z_boolean = false;
				a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, this.a_String, 120, 191, 1);
			}
			a_a_Array[41].b_void_Graphics_String_int_int_int(this.a_Graphics, this.e_String, 120, 240, 17);
			this.a_void();
			this.b_void();
			this.aw_boolean = false;
		}
		if (this.c_int != this.em_int) {
			this.a_Graphics.setColor(4273165);
			this.a_Graphics.fillRect(20, 43 + (this.em_int >= 0 ? this.em_int : this.c_int) * 20 + 2, 7, 9);
		}
		a_a_Array[17].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 14, 20, 43 + this.c_int * 20 + 2, 0, 0,
				0);
		i.a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 10, 155, 220, 70, 4273165, 0);
		if (this.d_int != -1) {
			String string2 = a_String_Array[74] + " " + this.d_StringBuffer.toString() + "\n" + a_String_Array[42];
			i.a_a_Array[41].e_int = 0;
			a2 = a_a_Array[41];
			graphics = this.a_Graphics;
			string = string2;
			n4 = 120;
			n3 = 185;
		} else {
			a2 = a_a_Array[41];
			graphics = this.a_Graphics;
			string = this.a_String;
			n4 = 120;
			n3 = 191;
		}
		a2.b_void_Graphics_String_int_int_int(graphics, string, n4, n3, 1);
		int n5 = 0;
		for (int j = 0; j < 4; ++j) {
			n5 = 43 + 20 * j;
			a_a_Array[46].a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, 0 + j, 27, n5, 0, 0, 0);
			a_a_Array[41].a_void_Graphics_String_int_int_int(this.a_Graphics, a_String_Array[85 + j], 53, n5, 0);
		}
		Image[] imageArray = i.a_a_Array[0].a_Image_2d_Array[0];
		int n6 = imageArray[11].getWidth();
		int n7 = imageArray[15].getWidth();
		this.a_Graphics.drawImage(imageArray[11], 100, 160, 0);
		for (n2 = 0; n2 < 8; ++n2) {
			n = n2 >= 4 ? 13 : 15;
			this.a_Graphics.drawImage(imageArray[n], 100 + n6, 160, 0);
			n6 += n7;
		}
		n2 = this.c_int;
		n = n6;
		n6 -= n7 * 4;
		for (int j = 0; j <= n2; ++j) {
			this.a_Graphics.drawImage(imageArray[15], 100 + n6, 160, 0);
			n6 += n7;
		}
		this.a_Graphics.drawImage(imageArray[17], 100 + n, 160, 0);
		if (this.c_int != this.em_int) {
			this.em_int = this.c_int;
		}
	}

	private static void a_void_int_int_short(int integer1, int integer2, short short3) {
		for (byte var3 = 0; var3 < a_short_2d_Array[integer1].length; var3 += 2) {
			if (integer2 == a_short_2d_Array[integer1][var3]) {
				a_short_2d_Array[integer1][var3 + 1] = short3;
				return;
			}
		}
	}

	private void C_void_int(int integer) {
		this.a_h.b_void_int(integer);
	}

	private void cH_void() {
		switch (this.aM_int) {
		case 0:
			this.en_int = 0;
			this.eo_int = 0;
			this.aM_int = 1;
			return;
		case 1:
			s_byte_Array = a_byte_Array_String_int("/cr.f", 0);
			int var4 = 0;

			while (var4 < s_byte_Array.length) {
				if (s_byte_Array[var4] == 92 && s_byte_Array[var4 + 1] == 110) {
					s_byte_Array[var4++] = 10;
					s_byte_Array[var4++] = 32;
				} else {
					var4++;
				}
			}

			var4 = 0;

			while (s_byte_Array[var4] != 36) {
				var4++;
			}

			for (int var8 = 0; var8 < GloftDIRU.a_byte_Array.length; var4++) {
				s_byte_Array[var4] = GloftDIRU.a_byte_Array[var8];
				var8++;
			}

			this.aM_int = 2;
			return;
		case 2:
			label87: {
				i var10000;
				int var10001;
				label86: {
					byte var10002;
					label85: {
						if (a_boolean_int(4097)) {
							if (this.en_int >= 240) {
								this.en_int -= 3;
								if (this.en_int >= 240) {
									break label87;
								}

								var10000 = this;
								var10001 = 240;
								break label86;
							}
						} else {
							if (a_boolean_int(262146)) {
								var10000 = this;
								var10001 = this.en_int;
								var10002 = 3;
								break label85;
							}

							if (a_boolean_int(64)) {
								if (this.g_boolean) {
									this.bs_int = 0;
									this.br_int = 8;
									l_byte = 9;
									this.g_boolean = false;
								} else {
									this.aM_int = 3;
								}
								break label87;
							}
						}

						var10000 = this;
						var10001 = this.en_int;
						var10002 = 1;
					}

					var10001 += var10002;
				}

				var10000.en_int = var10001;
			}

			int var7 = -this.en_int;

			int var1;
			for (var1 = 0; var1 < s_byte_Array.length && var7 <= -340; var1++) {
				if (s_byte_Array[var1] == 10) {
					var7 += 17;
				}
			}

			this.eo_int = var1;
			if (this.eo_int >= s_byte_Array.length) {
				this.eo_int = 0;
				this.en_int = 0;
				return;
			}
			break;
		case 3:
			s_byte_Array = null;
			System.gc();
			l_byte = 4;
			this.aM_int = 2;
			this.a_void_int(0);
			this.a_h.b_void_int(19);
		}
	}

	private void cI_void() {
		if (this.aM_int != 2) {
			return;
		}
		Graphics graphics = this.a_Graphics;
		graphics.setColor(0, 0, 0);
		graphics.fillRect(0, 0, 240, 320);
		int n = 0;
		int n2 = -17;
		int n3 = this.eo_int;
		int n4 = 0;
		n4 = this.en_int >= 340 ? -(this.en_int % 17) : 340 - this.en_int - 17;
		for (int j = this.eo_int; j < s_byte_Array.length && n2 < 340; ++j) {
			if (s_byte_Array[j] != 10)
				continue;
			i.a_a_Array[41].b_int = 0;
			this.a_int_Graphics_byte_Array_a_int_int_int_a_int_int(graphics, s_byte_Array, a_a_Array[41], n3, j - n3,
					n2 + n4, null, 0, 234);
			n2 += 17;
			n3 = j + 1;
		}
		n = 0;
		for (int j = 6; j > 0; --j) {
			graphics.setColor(0);
			graphics.fillRect(0, n, 240, j);
			graphics.fillRect(0, 320 - n - j, 240, j);
			n += j + 1;
		}
		this.a_void();
	}

	private void cJ_void() {
		if (ep_int > 0) {
			ep_int = (int) ((long) ep_int - (System.currentTimeMillis() - this.o_long));
			this.o_long = System.currentTimeMillis();
			if (ep_int <= 0) {
				this.c_void_boolean(true);
			}
		}
	}

	private void a_void_String_int_int_int_int_int(String string, int integer2, int integer3, int integer4,
			int integer5, int integer6) {
		this.o_long = System.currentTimeMillis();
		ep_int = integer4;
		this.eq_int = integer2;
		this.er_int = integer3;
		this.f_String = a_String_String_int(string, 220);
		this.es_int = integer5;
		this.et_int = integer6;
	}

	private void c_void_boolean(boolean boolean1) {
		ep_int = 0;
		if (boolean1) {
			this.aw_boolean = true;
		}
	}

	private static boolean h_boolean() {
		return ep_int > 0;
	}

	private void cK_void() {
		a var1 = a_a_Array[41];
		if (ep_int > 0) {
			int var2 = var1.e_int;
			var1.e_int = 3;
			var1.a_void_String(this.f_String);
			int var3 = a.d_int;
			int var4 = a.c_int;
			if (this.eq_int == -1) {
				this.eq_int = 240 - var4 >> 1;
			}

			if (this.er_int == -1) {
				this.er_int = 320 - var3 >> 1;
			}

			this.a_Graphics.setClip(this.eq_int - 6, this.er_int - 3, var4 + 12, var3 + 6);
			a_void_Graphics_int_int_int_int_int_int(this.a_Graphics, this.eq_int - 6, this.er_int - 3, var4 + 12,
					var3 + 6, this.es_int, this.et_int);
			var1.b_void_Graphics_String_int_int_int(this.a_Graphics, this.f_String, this.eq_int, this.er_int, 0);
			var1.e_int = var2;
		}
	}

	public static String a_String_String_int(String string, int integer) {
		a var2 = a_a_Array[41];
		int var4 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		StringBuffer var9 = new StringBuffer(string);

		for (int var10 = 0; var10 <= var9.length(); var10++) {
			int var11 = 10;
			if (var10 < var9.length()) {
				var11 = var9.charAt(var10) & 255;
			}

			if (var4 > integer && var6 != var8) {
				var4 = var7;
				var9.setCharAt(var6, '\n');
				var10 = var6 - 1;
				var8 = var6;
			} else {
				int var10000;
				if (var11 == 10) {
					var10000 = 0;
				} else {
					int var16;
					if (var11 > 32) {
						if (var11 == 64) {
							var4 += 14;
							continue;
						}

						var11 = a.h_byte_Array[var11] & 255;
						int var10002;
						if (var11 >= var2.b_int_int(0)) {
							int var12 = var11 - var2.b_int_int(0);
							var10000 = var4;
							var16 = var2.c_byte_Array[(var12 << 2) + 2] & 255;
							var10002 = var2.c_byte_Array[var12 << 2] & 255;
						} else {
							int var14 = (var2.d_byte_Array[var11 << 2] & 255) << 1;
							var10000 = var4;
							var16 = var2.a_byte_Array[var14] & 255;
							var10002 = var2.d_byte_Array[(var11 << 2) + 1];
						}

						var16 -= var10002;
					} else {
						if (var11 != 32) {
							continue;
						}

						var6 = var10;
						var7 = var4;
						var10000 = var4;
						var16 = var2.a_byte_Array[0] & 255;
					}

					var10000 += var16 + var2.d_byte_Array[1];
				}

				var4 = var10000;
			}
		}

		return var9.toString();
	}

	private static void cL_void() {
		if (a_a_Array[41] != null) {
			a_a_Array[41] = null;
			System.gc();
		}

		a_a_Array[41] = new a();
		byte[] var0 = a_byte_Array_String_int("/ui.f", 1);
		a_a_Array[41].a_void_byte_Array_int(var0, 0);
		a_a_Array[41].a_void_int_int_int_int(0, 0, -1, -1);
		a_a_Array[41].a_void_int_int_int_int(1, 0, -1, -1);
		a_a_Array[41].a_void_int_int_int_int(2, 0, -1, -1);
		a_a_Array[41].g_byte_Array = null;
	}

	@Override
	protected void paint(Graphics g) {
		// TODO Auto-generated method stub

	}
}
