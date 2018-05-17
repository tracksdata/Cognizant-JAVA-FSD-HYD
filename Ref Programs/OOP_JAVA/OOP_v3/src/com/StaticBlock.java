package com;


/*
 *  why we need?
 *  
 *  a. To do init setup/oprn for class on loading
 *  
 *      e.g : --> Loading some files
 *            --> To init static variables with some oprn.
 *            
 *  b. To perform any oprn only once for that class. 
 *  
 *  c. To create singleton Object for a class.         
 *            
 * 
 */
public class StaticBlock {

	// 1. State

	// 2. Constructor

	// 3. Methods

	// 4. Inner classes

	// 5. Static Block

	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
	}

}
