package com;

public class Java  extends Teacher{
	
	
	//note: overriding a super class method in sub class is not mandatary in inheritence 
	
	
	/*@Override
	public void test() {
	
	}*/
	
	@Override
	public void doTeach() {
	
		super.doTeach(); // super class doTeach method
		//super.calc(10, 20);
		//System.out.println("AGe is "+super.MAX_AGE);
		System.out.println("--- teaching Java");
		
	}
	
	public void praticeLab() {
		System.out.println("--- practiceLab method of a Java class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
