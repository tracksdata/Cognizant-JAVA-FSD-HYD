package com;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Abc";
		s1 = "Xyz";

		System.out.println("S1: " + s1);
		System.out.println("Hashcode of S1: " + s1.hashCode());
		
		/*System.out.println("Hashcode of S2: " + System.identityHashCode(s2));

		if (s1.equals(s2)) {// == operator always compares hash code of the object
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}*/

	}

}
