package chap2;

public class Randomizer {
	static final int m = 233280;
	static final int a = 9301;
	static final int c = 49297;
	int seed;

	public Randomizer(int seed) {
		this.seed = seed;
	}

	public float randomFloat() {
		seed = (seed * a + c) % m;
		return (float) Math.abs((float) seed / (float) m);
	}
	
	public int randomInt(int max) {
		return Math.round(max * randomFloat());
	}
	
	public static class Test {
		public static void main(String[] args) {
			Randomizer r = new Randomizer((int) new java.util.Date().getTime());
			for(int i = 0; i < 10; i++) {
				System.out.println(r.randomInt(100));
			}
		}
	}
}
