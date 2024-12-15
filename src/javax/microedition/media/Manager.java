package javax.microedition.media;

import java.io.InputStream;

import platform.PlatformPlayer;

public class Manager {

	public static Player createPlayer(InputStream stream, String type) {
		//System.out.println("Create Player Stream "+type);
		return new PlatformPlayer(stream, type);
	}


}
