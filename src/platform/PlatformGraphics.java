package platform;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class PlatformGraphics extends Graphics {
	protected BufferedImage canvas;
	protected Graphics2D gc;

	public PlatformGraphics platformGraphics;
	public PlatformImage platformImage;

	private Color awtColor;

	public PlatformGraphics(PlatformImage image) {
		canvas = image.getCanvas();
		gc = canvas.createGraphics();
		platformImage = image;

		platformGraphics = this;

		clipX = 0;
		clipY = 0;
		clipWidth = canvas.getWidth();
		clipHeight = canvas.getHeight();

		setColor(0, 0, 0);
		gc.setBackground(new Color(0, 0, 0, 0));
	}

	public Graphics2D getGraphics2D() {
		return gc;
	}

	public BufferedImage getCanvas() {
		return canvas;
	}

	public void setClip(int x, int y, int width, int height) {
		gc.setClip(x, y, width, height);
		clipX = (int) gc.getClipBounds().getX();
		clipY = (int) gc.getClipBounds().getY();
		clipWidth = (int) gc.getClipBounds().getWidth();
		clipHeight = (int) gc.getClipBounds().getHeight();
	}

	public void setColor(int rgb) {
		setColor((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF);
	}

	public void setColor(int r, int g, int b) {
		color = (r << 16) + (g << 8) + b;
		awtColor = new Color(r, g, b);
		gc.setColor(awtColor);
	}

	public void drawImage(Image image, int x, int y, int anchor) {
		try {
			int imgWidth = image.getWidth();
			int imgHeight = image.getHeight();

			x = AnchorX(x, imgWidth, anchor);
			y = AnchorY(y, imgHeight, anchor);

			gc.drawImage(image.platformImage.getCanvas(), x, y, null);
		} catch (Exception e) {
			System.out.println("drawImage A:" + e.getMessage());
		}
	}

	private int AnchorX(int x, int width, int anchor) {
		int xout = x;
		if ((anchor & HCENTER) > 0) {
			xout = x - (width / 2);
		}
		if ((anchor & RIGHT) > 0) {
			xout = x - width;
		}
		if ((anchor & LEFT) > 0) {
			xout = x;
		}
		return xout;
	}

	private int AnchorY(int y, int height, int anchor) {
		int yout = y;
		if ((anchor & VCENTER) > 0) {
			yout = y - (height / 2);
		}
		if ((anchor & TOP) > 0) {
			yout = y;
		}
		if ((anchor & BOTTOM) > 0) {
			yout = y - height;
		}
		if ((anchor & BASELINE) > 0) {
			yout = y + height;
		}
		return yout;
	}

	public void flushGraphics(Image image, int x, int y, int width, int height) {
		// called by MobilePlatform.flushGraphics/repaint
		try {
			BufferedImage sub = image.platformImage.getCanvas().getSubimage(x, y, width, height);
			gc.drawImage(sub, x, y, null);
			// gc.drawImage(image.platformImage.getCanvas(), 0, 0, null);
		} catch (Exception e) {
			// System.out.println("flushGraphics A:"+e.getMessage());
		}
	}

	public void clipRect(int x, int y, int width, int height) {
		gc.clipRect(x, y, width, height);
		clipX = (int) gc.getClipBounds().getX();
		clipY = (int) gc.getClipBounds().getY();
		clipWidth = (int) gc.getClipBounds().getWidth();
		clipHeight = (int) gc.getClipBounds().getHeight();
	}

	public void fillRect(int x, int y, int width, int height) {
		gc.fillRect(x, y, width, height);
	}

	public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
		gc.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
	}

	public void drawImage(BufferedImage image, int x, int y) {
		gc.drawImage(image, 0, 0, null);
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		gc.drawLine(x1, y1, x2, y2);
	}

	public void drawRect(int x, int y, int width, int height) {
		gc.drawRect(x, y, width, height);
	}

	public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
		gc.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
	}

	public void translate(int x, int y) {
		translateX += x;
		translateY += y;
		gc.translate((double) x, (double) y);
		// translateX = (int)gc.getTransform().getTranslateX();
		// translateY = (int)gc.getTransform().getTranslateY();
	}

	public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height,
			boolean processAlpha) {
		if (width < 1 || height < 1) {
			return;
		}
		if (!processAlpha) {
			for (int i = offset; i < rgbData.length; i++) {
				rgbData[i] &= 0x00FFFFFF;
				rgbData[i] |= 0xFF000000;
			}
		} else { // Fix Alpha //
			for (int i = offset; i < rgbData.length; i++) {
				rgbData[i] |= 0x00000000;
				rgbData[i] &= 0xFFFFFFFF;
			}
		}
		// Copy from new image. This avoids some problems with games that don't
		// properly adapt to different display sizes.
		BufferedImage temp = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		temp.setRGB(0, 0, width, height, rgbData, offset, scanlength);
		gc.drawImage(temp, x, y, null);
	}

	public void drawRegion(Image image, int subx, int suby, int subw, int subh, int transform, int x, int y,
			int anchor) {
		try {
			if (transform == 0) {
				BufferedImage sub = image.platformImage.getCanvas().getSubimage(subx, suby, subw, subh);
				x = AnchorX(x, subw, anchor);
				y = AnchorY(y, subh, anchor);
				gc.drawImage(sub, x, y, null);
			} else {
				PlatformImage sub = new PlatformImage(image, subx, suby, subw, subh, transform);
				x = AnchorX(x, sub.width, anchor);
				y = AnchorY(y, sub.height, anchor);
				gc.drawImage(sub.getCanvas(), x, y, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("drawRegion A (x:"+x+" y:"+y+" w:"+subw+"
			// h:"+subh+"):"+e.getMessage());
		}
	}

	public void drawString(String str, int x, int y, int anchor) {
		if (str != null) {
			x = AnchorX(x, gc.getFontMetrics().stringWidth(str), anchor);
			y = y + gc.getFontMetrics().getAscent() - 1;
			y = AnchorY(y, gc.getFontMetrics().getHeight(), anchor);
			gc.drawString(str, x, y);
		}
	}

	public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int argbColor) {
		// System.out.println("fillTriangle"); // Found In Use
		int temp = color;
		setColor(argbColor);
		gc.fillPolygon(new int[] { x1, x2, x3 }, new int[] { y1, y2, y3 }, 3);
		setColor(temp);
	}

}
