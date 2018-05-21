package com;

public class WraperDemo {

	public static void main(String[] args) {

		/*
		 * int x=100;
		 * 
		 * Integer ii=1000; // Auto Casting. Available only from JDK 5.0 and above int
		 * n=ii; float f=ii; long l=ii; short s=ii.shortValue(); byte b=ii.byteValue();
		 * 
		 * String s1=ii.toString(); String s2=n+"";
		 */
		
		
		//System.out.println(Integer.MAX_VALUE);

		long l=10;
		long x=9223372036854775807l;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int ii=150;
		System.out.println(Integer.toBinaryString(ii));
		
		Integer n1 = 977777779;
		Integer n2 = new Integer(34347374);
		
		
		
		
	/*	Integer n1 = 977777779;
		Integer n2 = 977777779;

		if (n1 == n2) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}*/

	}

}
