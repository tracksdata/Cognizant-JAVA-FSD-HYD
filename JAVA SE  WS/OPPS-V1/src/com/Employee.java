package com;

public class Employee {
	
	int empId; // non static variable
	String empName;
	double salary;
	static String companyName;
	
	
	


	public static void main(String[] args) { // Defenation
	
		Employee e1;
		e1=new Employee();
		Employee e2;
		e2=new Employee();
		
		e1.empId=10;
		e1.empName="Praveen";
		e1.salary=1000;
		
		
		companyName="Cognizant";
		Department.deptName="HR"; // mandate to call with class name as deptName does not belongs to Employee class
		
		e2.empId=20;
		e2.empName="James";
		e2.salary=6000;
		
		System.out.println("E1 EmpId  Id: "+e1.empId);
		System.out.println("Name of E1: "+e1.empName);
		System.out.println("E1 Company: "+companyName);
		System.out.println("E2 EmpId  Id: "+e2.empId);
		System.out.println("Name of E2: "+e2.empName);
		System.out.println("E2 Company: "+companyName);
		System.out.println("Deparftment Name: "+Department.deptName);
		
		
		//empId=10; // need object to assign a a value to a non static variable here
		
		
		
	      //main(); calling function
	}
	
	

}
