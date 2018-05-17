package com;

public class Employee_V1 {

	int empId; // non static variable
	String empName;
	double salary;
	static String companyName;
	final int MAX_AGE=76;
	
	
	

	// non static methods

	void displayEmployee() {

		System.out.println("Employee Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Company: " + companyName);
		System.out.println("Dept Name: " + Department.deptName);
		System.out.println("-----------------------------------");
	}

	// static methods

	static void displayEmployee(Employee_V1 e1) {
		System.out.println("Employee Id: " + e1.empId);
		System.out.println("Name: " + e1.empName);
		System.out.println("Salary: " + e1.salary);
		System.out.println("Company: " + companyName);
		System.out.println("Dept Name: " + Department.deptName);
		System.out.println("-----------------------------------");

	}

	public static void main(String[] args) { // Defenation

		Employee_V1 e1;
		e1 = new Employee_V1();
		Employee_V1 e2;
		e2 = new Employee_V1();

		e1.empId = 10;
		e1.empName = "Praveen";
		e1.salary = 1000;

		companyName = "Cognizant";
		Department.deptName = "HR"; // mandate to call with class name as deptName does not belongs to Employee
									// class

		e2.empId = 20;
		e2.empName = "James";
		e2.salary = 6000;

		// Display employee Information

		//e1.displayEmployee();
		//e2.displayEmployee();


		//displayEmployee(e1);
		//displayEmployee(e2);
		
	
		/*  boolean flag=true;
		  int i=1;
		  while(flag) {
			 System.out.println(i++);
			 if(i==9)
				 flag=false;
		  }*/
		
		
		/*int i,j;
		for(i=1,j=10;i<=100,i>=0;i++,j--) {
			
			
		}*/
		
		
		// assert
		
		
		/*
		 * System.out.println("E1 EmpId  Id: "+e1.empId);
		 * System.out.println("Name of E1: "+e1.empName);
		 * System.out.println("E1 Company: "+companyName);
		 * System.out.println("E2 EmpId  Id: "+e2.empId);
		 * System.out.println("Name of E2: "+e2.empName);
		 * System.out.println("E2 Company: "+companyName);
		 * System.out.println("Deparftment Name: "+Department.deptName);
		 */

		// empId=10; // need object to assign a a value to a non static variable here

		// main(); calling function
	}

}
