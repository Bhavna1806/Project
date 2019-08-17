package lab1;
import java.util.Scanner;

public class Exercise2 {
	public static int calculateDifference(int n)
	{
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int j;
		for(int i=0;i<=n;i++)
		{
			j=i*i;
			sum1=sum1+j;
		}
		for(int i=0;i<=n;i++)
		{
			sum2=sum2+i;
		}
		sum2=sum2*sum2;
		sum=sum1-sum2;
		return sum;
	}
	public static void main(String[] args) {
		int input;
		int sum;
		System.out.println("Enter the limit of the numbers");
		Scanner scan=new Scanner(System.in);
		input=scan.nextInt();
		sum=calculateDifference(input);
		System.out.println("sum="+sum);
		scan.close();
	}
}

