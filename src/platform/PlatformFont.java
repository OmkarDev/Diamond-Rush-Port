package platform;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.microedition.lcdui.Font;

public class PlatformFont {
	private Graphics2D gc;

	public java.awt.Font awtFont;

	public PlatformFont(Font font) {
		awtFont = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, font.getPointSize());
		gc = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB).createGraphics();
		gc.setFont(awtFont);
	}

	public int stringWidth(String str) {
		return gc.getFontMetrics().stringWidth(str);
	}
}