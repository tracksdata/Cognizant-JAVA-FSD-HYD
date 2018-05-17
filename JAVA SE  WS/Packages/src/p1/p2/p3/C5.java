package p1.p2.p3;

import p1.C1;

public class C5{
	
	private int empId=1000;
	
	private void useless() {
		
	}
	
	protected void c5() {
		useless(); // can access private data
		System.out.println("C5 class c5 method  "+empId);
	}
	
	protected void test() {
		System.out.println("--- Hello");
	}
}
