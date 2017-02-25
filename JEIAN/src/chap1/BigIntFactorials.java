package chap1;

import java.math.BigInteger;
import java.util.*;

public class BigIntFactorials {

	static ArrayList<BigInteger> cache = new ArrayList<BigInteger>();
	static {
		cache.add(new BigInteger("1"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		while (num >= 0) {
			num = getInput(input);
			System.out.println(factorial(num));
		}
		input.close();

		// System.out.println(cache.toString());
	}

	public static synchronized BigInteger factorial(long n) {
		// TODO Auto-generated method stub
		try {
			return cache.get((int) n);
		} catch (IndexOutOfBoundsException e) {
			cache.add(BigInteger.valueOf(n).multiply(factorial(n - 1)));
			return cache.get((int) n);

		}

	}

	private static int getInput(Scanner input) {
		System.out.print("What number do you want to factorial: ");
		int n = input.nextInt();
		return n;
	}
}
