package lab3;

public class Exercise4 {
	public static void Sort(char[] array)
	{
		int c=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!='\0'){		
				c=0;
			for(int j=0;j<array.length;j++)
			{
				if(i!=j) {
					if(array[i]==(array[j]))
					{
						c=c+1;
						array[j]='\0';
					}
			}}
			System.out.println(array[i]+" is repeated "+c+" times");
			}
			
		}
	}
	public static void main(String[] args) {
		char[] a= {'a','e','i','o','u','a','u'};
		System.out.println(a);
		Sort(a);
		
	}
}
