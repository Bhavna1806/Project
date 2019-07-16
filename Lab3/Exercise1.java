package Lab3;

import java.util.Arrays;

public class Exercise1 {
	public static int getSecondSmallest(int[] a) {
		int b = 0;
		Arrays.sort(a);
		// second smallest
		int check = a[0];
		for (int i = 0; i < a.length; i++) {
			if (check == a[i]) {
				continue;
			} else {
				b = a[i];
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 12, 12, 13, 12, 15 };
		int result = getSecondSmallest(a);
		System.out.println("result=" + result);
	}

}
