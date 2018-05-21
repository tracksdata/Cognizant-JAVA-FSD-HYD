package com;

public class Use {
	
	public static void main(String[] args) {
		
		Bank b=new Manager();
		b.openAccount();
		
		b=new Customer();
		b.openAccount();
		
		
	}

}
