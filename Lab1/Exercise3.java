package Lab1;

	import java.util.Scanner;

	public class Exercise3 {
		public static boolean checkNumber(int givenInput)
		{
			int temp=givenInput%10;
			givenInput=givenInput/10;
			boolean result=false;
			while(givenInput>0)
			{
				if(temp>=givenInput%10)
				{
					result=true;
					temp=givenInput%10;
					givenInput=givenInput/10;
				}
				else
				{
					result=false;
					break;
				}
			}
			return result;
		}
		public static void main(String[] args) {
			int input;
			boolean check=false;
			Scanner scan=new Scanner(System.in);
			input=scan.nextInt();
			check=checkNumber(input);
			if(check){
				System.out.println("the numbner is increasing");
			}
			else{
				System.out.println("the number is not increasing number");
			}
			scan.close();	
		}

}
