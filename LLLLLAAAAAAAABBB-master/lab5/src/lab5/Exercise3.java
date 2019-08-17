package lab5;

public class Exercise3 {
	static void Prime(int n)
	{
		int c=0;
		for(int i=1;i<n;i++)
		{
			c=0;
			for(int j=1;j<=n;j++) 
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
			if(c==2) 
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int n=20;
		Prime(n);
	}
}
