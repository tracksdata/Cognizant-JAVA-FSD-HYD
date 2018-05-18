package com;

import java.util.Scanner;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId) {
		this.empId=empId;
		System.out.println("--- Employee class object created with hashcode: " + this.hashCode());
	}

	/*
	 * static { System.out.println("--- static block -1 "); }
	 * 
	 * static { System.out.println("--- static block -2 "); }
	 * 
	 * static { System.out.println("--- static block -2 "); }
	 */

	public static void main(String[] args) {

		Employee emp=new Employee(10);
		
		Scanner sc=new Scanner("d:/abc/f1.txt");
		Scanner sc1=new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
