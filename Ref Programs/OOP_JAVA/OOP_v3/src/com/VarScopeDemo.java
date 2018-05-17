package com;

class Person {

	static int countVar = 0; // static /class var

	// int countVar = 0; // Object / Instance Var

	public void doIncrement() {
		// int countVar = 0; // Local Var
		countVar++;
		System.out.println("count:" + countVar);
	}

}

public class VarScopeDemo {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();

		person1.doIncrement();
		person1.doIncrement();

		person2.doIncrement();

	}

}
