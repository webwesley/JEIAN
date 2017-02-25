package chap1;

public class FindingPrimes {

	public static void main(String[] args) {
		int max = 1000000000;
		try {
			max = Integer.parseInt(args[0]);
		} catch (Exception e) {}
		boolean[] isPrime = new boolean[max + 1];
		for(int i = 0; i <= max; i++) {
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		int n = (int) Math.sqrt(max);
		for(int i = 0; i <=n; i++) {
			if(isPrime[i]) {
				for(int j = 2*i; j<= max; j = j + i) {
					isPrime[j] = false;
				}
			}
		}
		int i;
		for(i = max; !isPrime[i]; i--) {
		}
		System.out.println(i);
	}
}
