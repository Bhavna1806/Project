package Lab3;

import java.util.Arrays;

public class Exercise3 {
	public static int[] getSorted(int[] array) {
		int length = array.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = array[i];
			array[i] = array[length - 1 - i];
			array[length - 1 - i] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 31, 12, 4, 15 };
		int[] resultarray = getSorted(array);
		System.out.println("Reverse Array=" + Arrays.toString(resultarray));
		Arrays.sort(array);
		System.out.println("Sorted Array=" + Arrays.toString(array));
	}

}
