package com;

/*
 *  default init values for variables
 *  --------------------------------
 *  
 *  
 *  1. Integral  --> 0
 *  2. Real      --> 0.0
 *  3. char      --> \u0000
 *  4. boolean   --> false
 *  
 *  5. reference  --> null
 *  
 *  
 * 
 */

class Abc {

	// static int staVar;
	int objVar;
	boolean b;

	public void showValue() {
		// System.out.println(staVar);
		System.out.println(objVar);
		System.out.println(b);

		int locVar;
		locVar = 12;
		System.out.println(locVar);

	}

}

public class VarInitDemo {

	public static void main(String[] args) {

		Abc abc = new Abc();
		abc.showValue();

	}

}
