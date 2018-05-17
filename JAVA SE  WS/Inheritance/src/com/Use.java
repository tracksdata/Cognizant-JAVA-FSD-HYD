package com;

public class Use {

	
	public static void main(String[] args) {
		
		ContractEmployee ce=new ContractEmployee();
		SalariedEmployee se=new SalariedEmployee();
		
		ce.setNoOfHoursWorked(50);
		ce.empId=100;
		ce.empName="Praveen";
		ce.computeSalary();
		
		se.empId=1000;
		se.empName="James";
		se.setWorkingDays(22);
		se.computeSalary();
		ce.display();
		se.display();
		
		
		
		
	}
}
