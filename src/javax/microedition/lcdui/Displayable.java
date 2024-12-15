package javax.microedition.lcdui;

import platform.PlatformImage;

public abstract class Displayable {

	public PlatformImage platformImage;

	public int width = 0;

	public int height = 0;
	public boolean fullScreen = false;

	public Displayable() {
	}

}
