package javax.microedition.midlet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class MIDlet {

	protected MIDlet() {

	}

	public final String getAppProperty(String key) {
		List<String> lines = new ArrayList<>();
		try {
			BufferedInputStream inputStream = new BufferedInputStream(
					getClass().getResourceAsStream("res/META-INF/MANIFEST.MF"));
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			for (String line : br.lines().collect(Collectors.toList())) {
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String line : lines) {
			if (line.contains(key)) {
				String res = line.substring(line.indexOf(": ") + 1);
				System.out.println(key + ": " + res);
				return res;
			}
		}
		return null;
	}

	public void notifyDestroyed() {
//		System.out.println("THE APPLICATION SIGNALS THAT IT HAS DESTROYED");
	}

	public void notifyPaused() {
//		System.out.println("THE APPLICATION SIGNALS THAT IT HAS PAUSED");
	}

	public boolean platformRequest(String url) {
		System.out.println("DISPLAY THE URL: " + url);
		return true;
	}

	protected abstract void startApp();

	protected abstract void pauseApp();

	protected abstract void destroyApp(boolean unconditional);

}
