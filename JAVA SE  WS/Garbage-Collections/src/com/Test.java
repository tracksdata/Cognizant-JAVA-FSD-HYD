package com;

class Employee {

	int empId;
	String empName;
	
	static int count=1;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- Employee Object is garbage collected "+count++);
	}

}

public class Test {

	public static void main(String[] args) {
		
		
		Runtime rt=Runtime.getRuntime();
		System.out.println("Total Space: "+rt.totalMemory());
	

		for(int i=1;i<=100000;i++) {
			new Employee();
		}
		
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Used Space: "+(rt.totalMemory()-(rt.freeMemory())));
		
		
		/*Employee emp = new Employee();
		emp = null;
		System.gc();*/
		System.out.println("--- Done ---");

	}

}
