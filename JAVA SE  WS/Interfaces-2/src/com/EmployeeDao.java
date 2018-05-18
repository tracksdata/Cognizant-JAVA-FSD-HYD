package com;

public class EmployeeDao implements Employee {

	@Override
	public void saveEmployee() {
		System.out.println("--- save Employee method got called");
	}

}
