package com;

public class Calculator {

	public void calc() {
		System.out.println("0 parametarized");
	}

	public void calc(int x) {
		System.out.println("Int X: " + x);
	}


	public void calc(long x) {
		System.out.println("Long X: " + x);
	}

	public void calc(short x) {
		System.out.println("Short X: " + x);
	}

	public void calc(byte x) {
		System.out.println("Byte: X" + x);
	}

	public void calc(double x) {
		System.out.println("Double: X " + x);
	}

	/*public void calc(float x) {
		System.out.println("Float X: " + x);
	}*/

	public void calc(char x) {
		System.out.println("Character: X " + x);
	}
	
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.calc((int)'A');
		
		
		
		
	}

}
