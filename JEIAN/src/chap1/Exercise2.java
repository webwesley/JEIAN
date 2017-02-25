package chap1;

public class Exercise2 {
	
	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c = 2;
		int tmp1;
		int tmp2;
		for(int i = 0; i <= 20; i++) {
			tmp1 = c;
			tmp2 = b;
			c = a + b + c;
			b = tmp1;
			a = tmp2;
			System.out.println(c);
		
		}
	}

}
