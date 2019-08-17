package lab6;

public class Validator {
	static String namepattern ="[a-zA-Z][a-z]*+[_]+[j]+[o]+[b]";

	public static boolean validatename(String input) {
		
		return input.matches(namepattern);
	}
	
}
