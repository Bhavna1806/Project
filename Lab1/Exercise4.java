package Lab1;

import java.util.Scanner;

public class Exercise4 {
	public static boolean checkNumber(int num) {
		boolean result = false;
		if (num == 1) {
			result = true;
		}
		while (num >= 2) {
			if (num % 2 == 0) {
				num = num / 2;
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		boolean check;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		check = checkNumber(scan.nextInt());
		if (check) {
			System.out.println("The number is a power of 2!");
		} else {
			System.out.println("The number is not power of 2!");
		}
		scan.close();
	}

}
