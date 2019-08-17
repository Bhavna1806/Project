package lab10;

import java.util.Scanner;



interface lambda1{
	public boolean  print(String a, String b);
}

public class Ex3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		lambda1 l=(a,b)->{if (a.equals(name)&& b.equals(pass))
			return true;
		else
			return false;
};

boolean c=l.print("Ravi","117");
	
	System.out.println(c);

}}
