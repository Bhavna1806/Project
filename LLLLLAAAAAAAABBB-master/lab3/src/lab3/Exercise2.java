package lab3;

import java.util.Arrays;

public class Exercise2 {
	public static String temp;
	public static String[] Sort(String[] a) 
	{
		Arrays.sort(a);//we can use a single function
		int length=a.length;
		int halflength;
		if(length%2==0)
		{
			halflength=length/2;
		}
		else 
		{
			halflength=length/2+1;			
		}
		for(int i = 0;i<halflength;i++)
		{
			a[i]=a[i].toUpperCase();
		}
		for(int i=halflength;i<length;i++) 
		{
			a[i]=a[i].toLowerCase();
		}
		return a;
	}
	public static void main(String[] args) {
		String[] a= {"ravi","bhargav","rishi","koushik","sankar"};
		String[] result;
		result=Sort(a);
		System.out.println("Final Result="+ Arrays.toString(result));
	}

}
