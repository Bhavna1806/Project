package Lab9;

import java.util.*;

public class Exercise2 {
	public static HashMap<Character, Integer> countCharacters(char charArray[]) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (char chars : charArray) {
			if (charCountMap.containsKey(chars)) {

				charCountMap.put(chars, charCountMap.get(chars) + 1);
			} else {

				charCountMap.put(chars, 1);
			}
		}
		return charCountMap;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of characters:-");
		int length = scan.nextInt();
		char inputArray[] = new char[length];
		System.out.println("The characters are:-");
		for (int i = 0; i < length; i++) {
			inputArray[i] = scan.next().charAt(0);
		}
		Map<Character, Integer> newmap = countCharacters(inputArray);
		System.out.println("the map is\n" + newmap);
		scan.close();
	}
}
