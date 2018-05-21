package com;

public class Operations {
	
	
	public static void main(String[] args) {
		
		Bank manager=new Bank() {
			
			@Override
			public void openAccount() {
				System.out.println("--- Manager open Account");
				
			}
		};// end of Bank
		
		
		Bank customer=new Bank() {
			
			@Override
			public void openAccount() {
				System.out.println("--- Customer open Account");
				
			}
		};
		
		
		manager.openAccount();
		customer.openAccount();
		
		
		
	}
	
	

}
