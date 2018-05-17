package com;

import com.emp.Employee;

public class Test {

	public static void main(String[] args) {

		Employee employee = new Employee(101);

		// Employee employee2 = new Employee(101);
		// employee.empID=101;

		System.out.println(employee.empID);
		System.out.println(employee.empName);
		System.out.println(employee.empAddress);

	}

}
