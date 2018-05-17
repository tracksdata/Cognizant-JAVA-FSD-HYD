package com;

public class Employee {

	int empId;
	String empName;
	double salary;

	public void computeSalary() {
		System.out.println("-- Employee class computeSalary method");
	}
	
	
	public void display() {
		System.out.println("EmpId: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("---------------------------");
	}
	
}

