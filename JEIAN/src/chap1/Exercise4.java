package chap1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print(">");
		String line = in.nextLine();
		String reverse = "";
		for(int i = 0; i < line.length(); i++) {
			reverse += line.charAt(line.length() - 1 - i);
	
		}
		in.close();
		System.out.println(reverse);
	}
}
