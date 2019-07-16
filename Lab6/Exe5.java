package Lab6;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Exe5 {
		public static boolean PositiveString(String string) {
			boolean result=false;
			char[] temp=new char[string.length()];
			temp=string.toCharArray();
			Arrays.sort(temp);
			String checkstring=new String(temp);
			if(checkstring.equals(string)) {
				result=true;
			}
			
			return result;
			
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("enter the string");
			String string=in.nextLine();
			boolean result=PositiveString(string);
			if(result==true) {
				System.out.println("The string is positive");
			}
			else
			{
				System.out.println("the string is not positive");
			}
			in.close();
		}

}
