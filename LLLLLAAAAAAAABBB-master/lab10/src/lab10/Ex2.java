package lab10;

import java.util.Scanner;

interface lambda{
	public String print(String s);
}

public class Ex2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name:");
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
lambda l =(s)-> { StringBuilder br= new StringBuilder();
for(int i = 0 ; i < str.length(); i++)
{
   br = br.append(str.charAt(i)).append(" ");
	}

return br.toString();
};
String r=l.print(str);
System.out.println("Name:" +r);
}}
