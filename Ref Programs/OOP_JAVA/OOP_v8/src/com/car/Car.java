package com.car;

import com.wheel.Wheel;

/*
 *  --> IS-A (Inheritance )
 * 
 *  --> HAS-A ( have reference of that )
 * 
 */

public class Car {

	Wheel wheel; // HAS-A

	public void move(Wheel wheel) {
		this.wheel = wheel;
		// Rotate wheel
		wheel.rotate(); // Abstracted
		// wheel.iternalbehav(); // Encapsulated

		System.out.println("Car Moving");
	}

}
