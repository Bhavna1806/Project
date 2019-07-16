package Lab5;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice:\n1.RED\n2.YELLOW\n3.GREEN");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Stop");
			main(null);
		case 2:
			System.out.println("Ready");
			main(null);
		case 3:
			System.out.println("Go");
			main(null);
		default:
			break;

		}
		in.close();
	}
}
