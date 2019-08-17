package lab1;

import java.util.Scanner;

public class Exercise1 {
	public static int calculateSum(int n){
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		int sum;
		System.out.println("Enter the limit of the numbers");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		sum=calculateSum(n);
		System.out.println("sum="+sum);
		a.close();
	}

}
