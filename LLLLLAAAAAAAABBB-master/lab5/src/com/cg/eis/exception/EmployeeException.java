package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	public EmployeeException() {
		// TODO Auto-generated constructor stub
		super("The salary is less than 3000");
	}
	
}
