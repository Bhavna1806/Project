package lab5;

public class Exercise2 {
	static int Value(int n) 
	{
		if(n==1 || n==2)
		{
			n=1;
		}
		else
		{
			int one=1;
			int two=1;
			int sum=0;
			for(int i=2;i<n;i++)
			{
				sum=one+two;
				one=two;
				two=sum;				
			}
			n=sum;
		}
		return n;
	}
	public static void main(String[] args) {
		int n=6;
		int result=Value(n);
		System.out.println("The "+n+" element in the series is "+result);
	}
}
