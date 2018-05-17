package com;

public class Employee {

	private String passCode;
	private int empId;
	private String empName;
	private double salary;
	
	

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		if(passCode.equals("CTS"))
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
		
		if(passCode.equals("CTS")) {
		this.salary = salary;
		}
	}
	
	public void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
	}
	
	
	
	
	
	

}
