package chap1;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an int:");
		int start = in.nextInt();
		System.out.print("Input another int:");
		int end = in.nextInt();
		System.out.print("Input a String:");
		String str = in.next();
		in.close();
		try {
			System.out.println(str.substring(start, end));
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry that string is to short");
		}
	}

}
