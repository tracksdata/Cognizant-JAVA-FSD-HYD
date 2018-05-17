package com;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	Project proj; // Forward declaration / Has 'A' relatonship

	
	void setProject(Project proj) {
		this.proj=proj;
	}
	
	
	
	
	public void display() {
		System.out.println("Emp Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Project Id: "+proj.projId);
		System.out.println("Proj Name: "+proj.projName);
		System.out.println("----------------------------------------");
	}
	
	
	
	
	

}
