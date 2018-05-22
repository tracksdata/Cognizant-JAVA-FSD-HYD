package com;

public class ThrowDemo {

	public static void main(String[] args) {
		
		
		try {
			
			int x=-10;
			
			if(x<0) {
				throw new IllegalAccessError();
			}
			
			System.out.println("X value is "+x);
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
		
		
	}

}
