package javax.microedition.lcdui;

import platform.PlatformGraphics;
import platform.PlatformImage;

public class Graphics {

	public static final int BASELINE = 64;
	public static final int BOTTOM = 32;
	public static final int DOTTED = 1;
	public static final int HCENTER = 1;
	public static final int LEFT = 4;
	public static final int RIGHT = 8;
	public static final int SOLID = 0;
	public static final int TOP = 16;
	public static final int VCENTER = 2;

	protected int translateX = 0;
	protected int translateY = 0;

	protected int clipX = 0;
	protected int clipY = 0;
	protected int clipWidth = 0;
	protected int clipHeight = 0;

	protected int color = 0xFFFFFF;
	protected int strokeStyle = SOLID;

	public PlatformImage platformImage;
	public PlatformGraphics platformGraphics;

	protected Font font = Font.getDefaultFont();

	public void setClip(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setColor(int red, int green, int blue) {
		color = (red << 16) + (green << 8) + blue;
	}

	public void drawImage(Image image, int x, int y, int anchor) {
		// TODO Auto-generated method stub

	}

	public void clipRect(int n8, int i, int n10, int j) {
		// TODO Auto-generated method stub

	}

	public void fillRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

	}

	public void fillRoundRect(int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub

	}

	public void drawRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

	}

	public void drawRoundRect(int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub

	}

	public void drawLine(int n8, int n9, int n10, int n11) {
		// TODO Auto-generated method stub

	}

	public void translate(int i, int j) {
		// TODO Auto-generated method stub

	}

	public void drawRegion(Image src, int x_src, int y_src, int width, int height, int transform, int x_dest,
			int y_dest, int anchor) {
		// TODO
	}

	public int getClipX() {
		return clipX;
	}

	public int getClipY() {
		return clipY;
	}

	public int getClipWidth() {
		return clipWidth;
	}

	public int getClipHeight() {
		return clipHeight;
	}

	public int getColor() {
		return color;
	}

	public void setFont(Font newfont) {
		font = newfont;
	}

	public void drawString(String str, int x, int y, int anchor) {
	}

	public void fillTriangle(int var10001, int var10002, int var10003, int var10004, int var10005, int i) {
		// TODO Auto-generated method stub
		
	}

}
