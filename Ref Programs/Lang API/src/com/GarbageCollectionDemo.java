package com;

class Emp {

	int empID;
	double empSalary;

}

public class GarbageCollectionDemo {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		for (int i = 0; i < 100000; i++) {
			Emp emp = new Emp();
			emp.empID = 123;
			emp.empSalary = 1000;
		}
		
		
		
		System.out.println(runtime.freeMemory());
		
		System.gc();
		
		System.out.println(runtime.freeMemory());

	}

}
