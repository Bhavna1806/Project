package Lab6;

import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		String string = new String();
		int sum = 0;
		Scanner in = new Scanner(System.in);
		string = in.nextLine();
		int length = string.length();
		for (int i = 0; i < length; i++) {
			String s = Character.toString(string.charAt(i));
			int temp = Integer.parseInt(s);
			System.out.println(temp);
			;
			sum = sum + temp;
		}
		System.out.println("Sum=" + sum);
		in.close();
	}

}
