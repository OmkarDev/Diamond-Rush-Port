package javax.microedition.media;

public interface Player extends Controllable {

	public static final int CLOSED = 0;
	public static final int PREFETCHED = 300;
	public static final int REALIZED = 200;
	public static final int STARTED = 400;
	public static final long TIME_UNKNOWN = -1;
	public static final int UNREALIZED = 100;

	public void realize();

	public void close();

	public void stop();

	public void deallocate();

	public void start();

	public void prefetch();

	public void addPlayerListener(PlayerListener playerListener);

}
