package platform;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public class PlatformImage extends Image {

	BufferedImage canvas;
	PlatformGraphics graphics;

	protected void createGraphics() {
		graphics = new PlatformGraphics(this);
		graphics.setColor(0);
	}

	public PlatformImage(int width, int height) {
		this.width = width;
		this.height = height;
		canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		createGraphics();
		graphics.setColor(0xFFFFFF);
		graphics.fillRect(0, 0, width, height);
		graphics.setColor(0);
		this.platformImage = this;
	}

	public PlatformImage(String name) {
		try {
			BufferedImage temp = ImageIO.read(getClass().getResource("/res" + name));
			width = temp.getWidth();
			height = temp.getHeight();
			canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			createGraphics();
			graphics.drawImage(temp, 0, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		platformImage = this;
	}

	public PlatformImage(byte[] imageData, int imageOffset, int imageLength) {
		// Create Image from Byte Array Range (Data is PNG, JPG, etc.)
		System.out.println("CREATING IMAGE FROM BYTE ARRAY");
		try {
			byte[] range = Arrays.copyOfRange(imageData, imageOffset, imageOffset + imageLength);
			InputStream stream = new ByteArrayInputStream(range);

			BufferedImage temp;

			temp = ImageIO.read(stream);
			width = (int) temp.getWidth();
			height = (int) temp.getHeight();

			canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			createGraphics();
			graphics.drawImage(temp, 0, 0);
		} catch (Exception e) {
			System.out.println("Couldn't Load Image Data From Byte Array");
			e.printStackTrace();
		}

		platformImage = this;
	}

	public PlatformImage(int[] rgb, int Width, int Height, boolean processAlpha) {
		// createRGBImage (Data is ARGB pixel data)
		width = Width;
		height = Height;

		if (width < 1) {
			width = 1;
		}
		if (height < 1) {
			height = 1;
		}

		canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		createGraphics();

		graphics.drawRGB(rgb, 0, width, 0, 0, width, height, true);

		platformImage = this;
	}

	public PlatformImage(Image image, int x, int y, int Width, int Height, int transform) {
		// Create Image From Sub-Image, Transformed //
		BufferedImage sub = image.platformImage.canvas.getSubimage(x, y, Width, Height);

		canvas = transformImage(sub, transform);
		createGraphics();

		width = (int) canvas.getWidth();
		height = (int) canvas.getHeight();

		platformImage = this;
	}

	public static BufferedImage transformImage(BufferedImage image, int transform) {
		int width = (int) image.getWidth();
		int height = (int) image.getHeight();
		int out_width = width;
		int out_height = height;

		AffineTransform af = new AffineTransform();

		switch (transform) {
		case Sprite.TRANS_NONE:
			break;

		case Sprite.TRANS_ROT90:
			af.translate(0, width);
			af.rotate(Math.PI * 3 / 2);
			out_width = height;
			out_height = width;
			break;

		case Sprite.TRANS_ROT180:
			af.translate(width, height);
			af.rotate(Math.PI);
			break;

		case Sprite.TRANS_ROT270:
			af.translate(height, 0);
			af.rotate(Math.PI / 2);
			out_width = height;
			out_height = width;
			break;

		case Sprite.TRANS_MIRROR:
			af.translate(width, 0);
			af.scale(-1, 1);
			break;

		case Sprite.TRANS_MIRROR_ROT90:
			af.translate(width, 0);
			af.scale(-1, 1);
			af.translate(height, 0);
			af.rotate(Math.PI / 2);
			out_width = height;
			out_height = width;
			break;

		case Sprite.TRANS_MIRROR_ROT180:
			af.translate(width, 0);
			af.scale(-1, 1);
			af.translate(width, height);
			af.rotate(Math.PI);
			break;

		case Sprite.TRANS_MIRROR_ROT270:
			af.translate(height, 0);
			af.rotate(Math.PI * 3 / 2);
			af.translate(width, 0);
			af.scale(-1, 1);
			out_width = height;
			out_height = width;
			break;
		}

		BufferedImage transimage = new BufferedImage(out_width, out_height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gc = transimage.createGraphics();
		gc.drawImage(image, af, null);
		return transimage;
	}

	public PlatformGraphics getGraphics() {
		return graphics;
	}

	public BufferedImage getCanvas() {
		return canvas;
	}

}
