package com;

/*
 *  Static Poly
 *  ------------
 * 
 *  	Method Overloading
 *  	-------------------
 *  
 *        Duplicate method with different input params
 *        to do the work in different way.
 *        
 *        Rules:
 *        ------
 *        
 *        1. Must be same
 *  
 *  			--> method name
 *  
 *        2. Must be different in
 *        
 *             --> Type of arg
 *             or
 *             --> Number of args
 *             or
 *             --> Order of args
 *             
 * 		  3. May different in
 * 
 * 			  --> return Type
 *            --> Access specifiers  	
 */

class Actor {

	public void act() {
		System.out.println("No Act");
	}

	public int act(int pay) {
		System.out.println("Hero Act");
		return 100;
	}

	public int act(int pay1, float pay2) {
		System.out.println("Dual Hero Act");
		return 100;
	}

	public float act(float pay1, int pay2) {
		System.out.println("Dual Hero Act");
		return 100;
	}

}

public class StaticPolyDemo {

	public static void main(String[] args) {

		Actor actor = new Actor();
		actor.act();

		actor.act(10000);

		actor.act(12, 12.00F);

		// ------------------
		System.out.println(12);
		System.out.println(12.12);
		System.out.println('A');
		System.out.println("Hello");

	}

}
