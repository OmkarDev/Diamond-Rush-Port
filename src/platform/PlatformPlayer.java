package platform;

import java.io.InputStream;
import java.util.Vector;

import javax.microedition.media.Control;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class PlatformPlayer implements Player {

	private String contentType = "";

	private midiPlayer player;

//	private int state = Player.UNREALIZED;

	private Vector<PlayerListener> listeners;

	private Control[] controls;

	public PlatformPlayer(InputStream stream, String contentType) {
		this.contentType = contentType;
		listeners = new Vector<PlayerListener>();
		controls = new Control[3];

		if (contentType.equals("audio/midi")) {
			player = new midiPlayer(stream);
		} else {
			System.out.println("No Player For: " + contentType);
			System.exit(0);
		}

		controls[0] = new volumeControl();
//		controls[1] = new tempoControl();
//		controls[2] = new midiControl();

		// System.out.println("media type: "+type);
	}

	private class volumeControl implements javax.microedition.media.control.VolumeControl {
		private int level = 100;
		private boolean muted = false;

		public int getLevel() {
			return level;
		}

		public boolean isMuted() {
			return muted;
		}

		public int setLevel(int value) {
			level = value;
			return level;
		}

		public void setMute(boolean mute) {
			muted = mute;
		}
	}

	@Override
	public Control getControl(String controlType) {
		if (controlType.equals("VolumeControl")) {
			return controls[0];
		}
		System.exit(0);
		return null;
	}

	@Override
	public void prefetch() {
//		state = Player.PREFETCHED;
	}

	@Override
	public void realize() {
//		state = Player.REALIZED;
	}

	@Override
	public void close() {
		try {
			player.stop();
//			state = Player.CLOSED;
			notifyListeners(PlayerListener.CLOSED, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		state = Player.CLOSED;
	}

	public void start() {
		 System.out.println("Play "+contentType);
		try {
			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		try {
			player.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deallocate() {
		stop();
//		if (player instanceof midiPlayer) {
//			((midiPlayer) player).midi.close();
//		}
//		player = null;
//		state = Player.REALIZED;
	}

	@Override
	public void addPlayerListener(PlayerListener playerListener) {
		// System.out.println("Add Player Listener");
		listeners.add(playerListener);
	}

	private void notifyListeners(String event, Object eventData) {
		for (int i = 0; i < listeners.size(); i++) {
			listeners.get(i).playerUpdate(this, event, eventData);
		}
	}

	private class midiPlayer {
		private Sequencer midi;
		private InputStream stream;
		public midiPlayer(InputStream stream) {
			try {
				this.stream = stream;
				midi = MidiSystem.getSequencer();
				midi.open();
				midi.setSequence(stream);
//				state = Player.PREFETCHED;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void start() {
			System.out.println(stream);
			midi.setTickPosition(0);
			midi.start();
//			state = Player.STARTED;
			notifyListeners(PlayerListener.STARTED, new Long(0));
		}

		public void stop() {
			midi.stop();
//			state = Player.REALIZED;
		}
	}
}
