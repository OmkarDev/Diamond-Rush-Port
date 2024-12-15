package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

import platform.PlatformImage;
import utils.Utils;

public abstract class GameCanvas extends Canvas {

	private boolean suppressKeyEvents;

	protected GameCanvas(boolean suppressKeyEvents) {
		this.suppressKeyEvents = suppressKeyEvents;

		width = Utils.WIDTH;
		height = Utils.HEIGHT;

		platformImage = new PlatformImage(width, height);
	}

	protected Graphics getGraphics() {
		return platformImage.getGraphics();
	}

	public void flushGraphics() {
		platformImage.getGraphics().flushGraphics(platformImage, 0, 0, width, height);
	}

}
