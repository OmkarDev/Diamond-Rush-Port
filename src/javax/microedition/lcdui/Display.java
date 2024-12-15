package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public class Display {

	private Displayable displayable;
	
	private Display() {
		
	}
	
	public void vibrate(int millis) {
		System.out.println("VIBRATE for "+millis+" milliseconds.");
	}

	public void setCurrent(Displayable nextDisplayable) {
//		Requests that a different Displayable object be made visible on the display.
		this.displayable = nextDisplayable;
	}

	public Displayable getCurrent() {
		return this.displayable;
	}
	
	public static Display getDisplay(MIDlet miDlet) {
		return new Display();
	}

}
