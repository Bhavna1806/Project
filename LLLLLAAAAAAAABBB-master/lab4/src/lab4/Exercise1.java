package lab4;

public class Exercise1 {
	public static void SumofCubes(int n)
	{
		int sum=0;
		int a;
		while(n>0) {
			a=n%10;
			a=a*a*a;
			n=n/10;
			sum=sum+a;
		}
		System.out.println("Sum Of Cubes is "+sum);
	}
	public static void main(String[] args) {
		int n=531;
		SumofCubes(n);
		
		
	}


}
