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
		System.out.print("What number do you want to factorial: ");
		int n = input.nextInt();
		input.close();
		System.out.println(factorial(n));
		System.out.println(cache.toString());
	}

	private static BigInteger factorial(int n) {
		// TODO Auto-generated method stub
		try {
			return cache.get(n);
		} catch (IndexOutOfBoundsException e) {
			for(int i = cache.size(); i <= n+1; i++) {
				BigInteger tmp = new BigInteger()
				cache.add(new BigInteger(cache.get(i).multiply(new BigInteger(i + 1))));
			}
		}
		
	}
	
	

}
