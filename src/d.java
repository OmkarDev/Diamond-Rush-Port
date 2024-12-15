import java.util.Random;

public final class d {
	public static Random random = new Random(System.currentTimeMillis());

	public static int getRandomInteger(int min, int max) {
		return min + Math.abs(random.nextInt()) % (max - min);
	}
}
