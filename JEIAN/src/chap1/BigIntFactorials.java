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
		int input = 0;
		while (input >= 0) {
			input = getInput();
			System.out.println(factorial(input));
		}
		// System.out.println(cache.toString());
	}

	private static BigInteger factorial(long n) {
		// TODO Auto-generated method stub
		try {
			return cache.get((int) n);
		} catch (IndexOutOfBoundsException e) {
			cache.add(BigInteger.valueOf(n).multiply(factorial(n - 1)));
			return cache.get((int) n);
		}
	}

	private static int getInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("What number do you want to factorial: ");
		int n = input.nextInt();
		return n;
	}
}
