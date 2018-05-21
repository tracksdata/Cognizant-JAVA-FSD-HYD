package com;

class Trainer {

	String trName;

}

class Employee {

	int empID;
	String empName;
	double empSalary;

	Trainer trainer;

	@Override
	public String toString() {
		return "ID:" + this.empID + "\nName:" + this.empName + "\nSal:"
				+ this.empSalary;
	}

}

public class ToStringDemo {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.empID = 121;
		employee.empName = "Abc";
		employee.empSalary = 100;

		Trainer trainer = new Trainer();
		trainer.trName = "naga";

		employee.trainer = trainer;

		// --------------------
		// opern

		// ---------------------

		// Display Employee data on screen / on Web page

		System.out.println(employee);

	}

}
