package javax.microedition.lcdui;

import platform.PlatformImage;

public class Image {

	public PlatformImage platformImage;

	public int width;
	public int height;

	public static Image createImage(byte[] imageData, int imageOffset, int imageLength) {
		System.out.println("Create Image from image data ");
		return new PlatformImage(imageData, imageOffset, imageLength);
	}

	public static Image createImage(String name) {
		System.out.println("Create Image " + name);
		return new PlatformImage(name);
	}

	public static Image createImage(int width, int height) {
		System.out.println("Create Image w,h " + width + ", " + height);
		return new PlatformImage(width, height);
	}

	public Graphics getGraphics() {
		return platformImage.getGraphics();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
		// System.out.println("Create Image RGB " + width + ", " + height);
		return new PlatformImage(rgb, width, height, processAlpha);
	}

}
