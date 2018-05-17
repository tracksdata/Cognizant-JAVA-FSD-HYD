package com;

// Reference Type Casting

class Vehicle {

}

class Car extends Vehicle {

}

class Bike extends Vehicle {

}

public class TypeCasting2 {

	public static void main(String[] args) {

		Car carRef = new Car();

		Vehicle veRef = new Car(); // Implicit R.T.C

		// Car carRef2=new Bike(); Invalid

		Vehicle veRef2 = new Bike(); // Implicit R.T.C

		// ----------------------------

		Vehicle vehicle = new Car();
		vehicle = new Bike();

		if (vehicle instanceof Car) {
			Car car = (Car) vehicle; // Explicit R.T.C
			System.out.println("Casting Done");
		} else {
			System.out.println("Casting Error");
		}

	}

}
