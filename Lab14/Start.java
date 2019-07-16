package Lab14;
//package com.cg.eis.service;

import java.util.Scanner;

//import com.cg.eis.bean.Employee;
//import com.cg.eis.pl.EmployeeService;
//import com.cg.eis.pl.EmployeeServiceImpl;

public class Start {
	static void showMenu() {
		System.out.println("Enter the choice\n1.Get Details\n2.Set Insurance\n3.Show Details\n4.Exit");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		while (true) {
			showMenu();
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			switch (x) {
			case 1:
				Employee emp = new Employee();
				System.out.println("Enter the id");
				emp.setId(scan.nextInt());
				scan.nextLine();
				System.out.println("Enter the name");
				emp.setName(scan.next());
				System.out.println("Enter the salary");
				emp.setSalary(scan.nextDouble());
				System.out.println("Enter the designation");
				emp.setDesignation(scan.next());
				service.getDetails(emp);
				break;
			case 2:
				System.out.println("Enter the employee id");
				service.getInsurance(scan.next());
				break;
			case 3:
				System.out.println("Enter the employee id");
				Employee emp1 = service.showDetails(scan.next());
				System.out.println("Details:\nName:" + emp1.getName() + "\nSalary:" + emp1.getSalary()
						+ "\nDesignation:" + emp1.getDesignation() + "\nInsurance Scheme:" + emp1.getInsuranceScheme());
				break;
			case 4:
				System.exit(0);
			default:
				break;
			}
		}
	}

}
