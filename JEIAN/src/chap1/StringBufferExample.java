package chap1;

import java.util.Scanner;

public class StringBufferExample {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		for (;;) {
			System.out.print(">");
			String line = input.nextLine();
			if ((line == null) || (line.equals("quit"))) {
				break;
			}
			StringBuffer buf = new StringBuffer(line.toLowerCase());
			for (int i = 0; i < buf.length(); i++) {
				buf.setCharAt(i, rot13(buf.charAt(i)));
			}
			System.out.println(buf);
		}
		input.close();
	}

	private static char rot13(char c) {
		// TODO Auto-generated method stub
		if (c != ' ') {
			c += 13; // Rotates Forward 13;
			if (c > 'z') {
				c -= 26; // will rotate back 26 if nessecary
			}
		}
		return c;
	}
}
