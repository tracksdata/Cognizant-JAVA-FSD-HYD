package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}

}

class SortByCityName implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getCityName().compareTo(emp2.getCityName());
	}
}

public class Use {
	public static void main(String[] args) {

		Employee e1 = new Employee(56, "Kara", 85000, "HYD");
		Employee e2 = new Employee(85, "Bitu", 12000, "CHN");
		Employee e3 = new Employee(74, "Lisa", 90000, "MAS");
		Employee e4 = new Employee(12, "Yesa", 15000, "GOA");
		Employee e5 = new Employee(73, "Coje", 11000, "AOP");

		ArrayList<Employee> emps = new ArrayList<>();

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		System.out.println("--- Original Data ---");
		Employee.display(emps);

		System.out.println("--- Sorting on EmpId ---");
		Collections.sort(emps);
		Employee.display(emps);

		System.out.println("--- Sorting on EmpName ---");
		Collections.sort(emps, new Employee());
		Employee.display(emps);

		System.out.println("--- Sorting on EmpSalary ---");
		Collections.sort(emps, new SortBySalary());
		Employee.display(emps);

		System.out.println("--- Sorting on CityName ----");
		Collections.sort(emps,new SortByCityName());
		Employee.display(emps);

	}

}
