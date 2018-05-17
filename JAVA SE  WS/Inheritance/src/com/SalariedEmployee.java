package com;

public class SalariedEmployee extends Employee {

	int noOfDaysWorked;

	public void setWorkingDays(int noOfDaysWorked) {
		this.noOfDaysWorked = noOfDaysWorked;
	}

	@Override
	public void computeSalary() {
		this.salary = (noOfDaysWorked * 5000);
	}

}
