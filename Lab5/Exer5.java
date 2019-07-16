package Lab5;

import java.util.Scanner;

import com.cg.eis.exception.MyException2;

public class Exer5 {
	public int Age;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Exer5 age = new Exer5();
		System.out.println("Enter the age");
		Scanner in = new Scanner(System.in);
		int givenage = in.nextInt();
		age.setAge(givenage);
		try {
			if (age.getAge() <= 15) {
				throw new MyException2();
			}
		} catch (MyException2 e) {
			System.out.println(e);
		} finally {
			System.out.println("This is the given age is " + age.getAge());
			System.out.println("end");
		}
		in.close();
	}

}
