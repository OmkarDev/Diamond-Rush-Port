import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftDIRU extends MIDlet {
	public static byte[] a_byte_Array = null;
	public i a_i;
	public Display a_Display;

	public GloftDIRU() {
		a_byte_Array = this.getAppProperty("MIDlet-Version").getBytes();
		this.a_i = new i(this);
	}

	public final void startApp() throws RuntimeException {
		if (this.a_Display == null) {
			this.a_Display = Display.getDisplay(this);
		}

		this.a_Display.setCurrent(this.a_i);
		this.a_i.f_void();
	}

	public final void pauseApp() {
		this.a_i.e_void();
		this.notifyPaused();
	}

	public final void destroyApp(boolean boolean1) throws RuntimeException {
		this.notifyDestroyed();
	}

	public final void a_void() {
		i.d_void();
		this.a_i.a_h.d_void();
		this.b_void();

		try {
			this.destroyApp(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void b_void() {
		this.a_i = null;
		this.a_Display = null;
		System.gc();
	}
}
