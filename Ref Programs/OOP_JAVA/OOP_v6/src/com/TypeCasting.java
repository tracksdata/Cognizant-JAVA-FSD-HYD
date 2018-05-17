package com;

/*
 *  Type Casting
 *  ------------
 *  
 *  Converting One Type Data to Other.
 * 
 * 	
 * Types:
 * ------
 *  
 *  1. Primary T.C
 *  
 *    a. Implicit
 *    b. Explicit
 *  
 *  2. Reference T.C
 *  
 *    a. Implicit
 *    b. Explicit
 *  
 * 
 * 
 * 
 */

public class TypeCasting {

	public static void main(String[] args) {

		int a = 6;
		int b = 4;
		float c = a / b;
		System.out.println(c);

		byte d = 12;
		short e = d; // Implicit P.T.C
		d = (byte) e; // Explicit T.C

		int intVal = 123;
		float floatval = intVal;

		// ------------------------

		// 456 / 256 --> 200 / 256 --> -56

		int i = 456;
		byte j = (byte) i;

		System.out.println(j);
		
		
		for (int j2 = 0; j2 < 256; j2++) {
			System.out.println(j2+"--->"+(char)j2);
		}
		
		//--------------------------

	}
}
