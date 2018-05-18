package com;

class C1 {

	/*public C1() {
		System.out.println("Default - C1");
	}*/
	
	public C1(int x) {
		System.out.println("Parametarized  - C1  "+x);
	}

}

public class C2 extends C1 {
	
	public C2() {
		super(100); // explicit constructor invocation
		System.out.println("Default - C2");
	}
	
	public C2(int x) {
		super(100);
		System.out.println("Parametarized  - C2  "+x);
	}

	public static void main(String[] args) {

		C2 c2=new C2(100);
		C1 c1=new C1(200);
	}

}
