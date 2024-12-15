package javax.microedition.lcdui;

import platform.PlatformFont;

public class Font {

	public static final int FACE_MONOSPACE = 32;
	public static final int FACE_PROPORTIONAL = 64;
	public static final int FACE_SYSTEM = 0;

	public static final int FONT_INPUT_TEXT = 1;
	public static final int FONT_STATIC_TEXT = 0;

	public static final int SIZE_LARGE = 16;
	public static final int SIZE_MEDIUM = 0;
	public static final int SIZE_SMALL = 8;

	public static final int STYLE_BOLD = 1;
	public static final int STYLE_ITALIC = 2;
	public static final int STYLE_PLAIN = 0;
	public static final int STYLE_UNDERLINED = 4;

	private int face;
	private int style;
	private int size;

	public PlatformFont platformFont;

	private static Font defaultFont = new Font(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);

	private Font(int fontFace, int fontStyle, int fontSize) {
		face = fontFace;
		style = fontStyle;
		size = fontSize;
		platformFont = new PlatformFont(this);
	}

	public static Font getFont(int face, int style, int size) {
		return new Font(face, style, size);
	}

	public int getPointSize() {
		return convertSize(size);
	}

	public static Font getDefaultFont() {
		return defaultFont;
	}

	private int convertSize(int size) {
		switch (size) {
		case SIZE_LARGE:
			return 14;
		case SIZE_MEDIUM:
			return 12;
		case SIZE_SMALL:
			return 10;
		default:
			return 10;
		}
	}

}
