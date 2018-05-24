package com;

class Employee {

	private String empName;
	private int age;
	long hc;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String empName, int age) {
		this.empName = empName;
		this.age = age;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;
		return empName.equals(emp.getEmpName()) && age==emp.getAge();
	}
	
	@Override
	public int hashCode() {

		return empName.hashCode()+age;
	}
	
	

}

public class EquelsDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Praveen",100);
		Employee e2 = new Employee("Praveen",100);

		System.out.println("Hashcode of e1: " + e1.hashCode());
		System.out.println("Hashcode of e2: " + e2.hashCode());

		System.out.println("Original Hashcode e1: " + System.identityHashCode(e1));
		System.out.println("Original Hashcode e2: " + System.identityHashCode(e2));

		
		
		if (e1.equals(e2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equals");
		}

	}

}
