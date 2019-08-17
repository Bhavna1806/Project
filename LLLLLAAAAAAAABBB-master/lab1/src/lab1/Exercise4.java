package lab1;

import java.util.Scanner;

public class Exercise4 {
	public static boolean checkNumber(int givenInput)
	{
		boolean result=false;
		if(givenInput==1){result=true;}
		while(givenInput>=2)
		{
			if(givenInput%2==0)
			{
				givenInput=givenInput/2;
				result=true;
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
		boolean check;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		check=checkNumber(scan.nextInt());
		if(check){
			System.out.println("the number is a power of 2");
		}
		else{
			System.out.println("the number is not power of 2");
		}
		scan.close();
	}

}
