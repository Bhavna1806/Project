package lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) 
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Day in numbers");
	   int day=sc.nextInt();
	   System.out.println("Enter Month in numbers");
	   int month=sc.nextInt();
	   System.out.println("Enter year in numbers");
	   int year=sc.nextInt();
       LocalDate pdate = LocalDate.of(year, month, day);
       LocalDate now = LocalDate.now();
       Period diff = Period.between(pdate, now);
       System.out.printf("Duration is "+diff.getYears()+" years, "+diff.getMonths()+" months and "+diff.getDays()+" days");
       sc.close();
    }

}
