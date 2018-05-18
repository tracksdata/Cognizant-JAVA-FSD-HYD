package com;

public  class Teacher {
	
	final int MAX_AGE=100;
	// Note: java.lang.Object class is the super class to all the classes by default
	
	public void doTeach() {
		System.out.println("--- Teacher is teaching");
	}
	
	public void calc(int x,int y) {
		System.out.println("Sum is "+(x+y));
	}
	
	
	public final void test() {
		
	}

}
