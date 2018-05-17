package com;

public class ContractEmployee extends Employee {

	int noOfHoursWorked;

	public void setNoOfHoursWorked(int noOfHoursWorked) {
		this.noOfHoursWorked = noOfHoursWorked;
	}

	public void computeSalary() {
		this.salary=(noOfHoursWorked*5000);
	}

}
