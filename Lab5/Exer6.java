package Lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exer6 {
	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Exer6 salary = new Exer6();
		System.out.println("Enter the salary");
		Scanner in = new Scanner(System.in);
		int givensalary = in.nextInt();
		salary.setSalary(givensalary);
		try {
			if (salary.getSalary() <= 3000) {
				throw new EmployeeException();
			}
		} catch (EmployeeException e) {
			System.out.println(e);
		} finally {
			System.out.println("The given salary is " + salary.getSalary());
			System.out.println("end");
		}
		in.close();
	}

}
