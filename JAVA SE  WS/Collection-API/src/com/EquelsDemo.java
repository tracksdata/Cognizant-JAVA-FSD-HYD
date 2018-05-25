package com;

class Emp {

	private String empName;
	private int age;
	long hc;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Emp(String empName, int age) {
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

		Emp emp = (Emp) obj;
		return empName.equals(emp.getEmpName()) && age==emp.getAge();
	}
	
	@Override
	public int hashCode() {

		return empName.hashCode()+age;
	}
	
	

}

public class EquelsDemo {

	public static void main(String[] args) {

		Emp e1 = new Emp("Praveen",100);
		Emp e2 = new Emp("Praveen",100);

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
