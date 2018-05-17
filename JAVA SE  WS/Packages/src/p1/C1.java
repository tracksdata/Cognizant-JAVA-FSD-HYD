package p1;

import p1.p2.p3.C5;
import p1.p2.p3.C6;

public class C1 extends C5{

	public void c1() {
		System.out.println("C1 class c1 method");
	}
	
	public static void main(String[] args) {
		
		
		C6 c6=new C6();
		C2 c2=new C2();
		c2.c2();
		C1 c1=new C1();
		c1.c5();
		c1.test();
		
		
		
	}
	
}
