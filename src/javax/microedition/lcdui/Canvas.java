package javax.microedition.lcdui;

import platform.PlatformImage;
import utils.Utils;

public abstract class Canvas extends Displayable {

	public PlatformImage platformImage;

	protected Canvas() {
		platformImage = new PlatformImage(240, 320);
	}

	protected abstract void paint(Graphics g);

	public void setFullScreenMode(boolean mode) {
		// System.out.print("Set Canvas Full Screen Mode ");
		fullScreen = mode;
		if (fullScreen) {
			width = Utils.WIDTH;
			height = Utils.HEIGHT;
		}
	}

	public void repaint() {
		paint(platformImage.getGraphics());
	}

	protected void keyPressed(int keyCode) {
		// TODO
	}

	protected void keyReleased(int keyCode) {
		// TODO
	}

	public void serviceRepaints() {
		// TODO
	}
}
