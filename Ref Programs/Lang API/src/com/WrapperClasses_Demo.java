package com;

/*
 * 
 *  Wrapper Classes:
 *  ----------------
 *	
 *  use :
 *  ----
 *     
 *        To covert/wrap all primitives as Objects.
 *        
 *   why we need?
 *   
 *         --> To Get Object-Level methods on primitives.
 *         --> To group values within Collections.
 *         --> To have many number/character related fun 
 *             on primitives.
 *             
 *      
 *             Byte  --> byte
 *             Short --> short
 *  		   Integer --> int
 *  		   Long    --> long
 *  		   Float  --> float
 *             Double  --> double
 *             
 *             Character --> char
 *             Boolean   --> boolean			
 * 
 */

public class WrapperClasses_Demo {

	public static void main(String[] args) {

		// ---------------------------------------

		// 1. Primitive to W-Object
		int pri = 123;
		Integer intObj = new Integer(pri);

		// 2. W-Object to primitive : ____Value();
		pri = intObj.intValue();
		short shortPri = intObj.shortValue();

		// 3. String Number to W-Object.
		String strNum = "123";
		intObj = new Integer(strNum);

		// 4. W-Object to String
		strNum = intObj.toString();

		// 5. String Number to Primitive : parse__();
		strNum = "123";
		int a = Integer.parseInt(strNum);
		float b = Float.parseFloat(strNum);

		// 6. Primitive to String
		int pri2 = 123;
		strNum = String.valueOf(pri2);

		// ---------------------------------------------

		System.out.println(Integer.toBinaryString(12));
		System.out.println(Character.isUpperCase('A'));

		// ---------------------------------------------

		System.out.println(12.12 / 0);

		// ----------------------------------------

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// -------------------------------------------

		// JDK 1.5 : Auto - Boxing

		Integer i = new Integer(123);
		Integer j = 123; // Auto - Boxing

		int n = i.intValue();
		int n2 = j; // Auto - Un-Boxing

		// -------------------------------------------

	}

}
