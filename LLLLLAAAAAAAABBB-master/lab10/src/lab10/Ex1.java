package lab10;

import java.lang.Math;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Ex1{
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf=(x,y) ->
		{
			int result=(int) Math.pow(x, y);
			return result;
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base");
		int x=scan.nextInt();
		System.out.println("Enter the power");
		int y=scan.nextInt();
		System.out.println(bf.apply(x, y));
		scan.close();
	}
}