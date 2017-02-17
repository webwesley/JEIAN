package chap1;

public class Factorials {
	
	static long[] table = new long[21];
	static {table[0] = 1;}
	static int last = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialChach(20));
		System.out.println(factorial(20));
	}

	private static long factorial(int i) {
		if (i <= 1) {
			return 1;
		} else
			return i * factorial(i - 1);

	}
	
	public static long factorialChach(int x) throws IllegalArgumentException {
		while(last < x) {
			table[last + 1] = (table[last]) * (last + 1);
			last++;
		}
		return table[x];
	}
}