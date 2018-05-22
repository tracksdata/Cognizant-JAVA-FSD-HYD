package com;

public class ThrowsDemo {
	
	
	void test() throws ClassNotFoundException{
		Class.forName("com.Employee");
	}

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName("com.Employee");
			System.out.println("--- Done");

		} catch (Exception e) {

		}
	}

}
