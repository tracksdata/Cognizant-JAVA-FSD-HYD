package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatric;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {
		
		// create carts
		String[] cart1= {"Item01","Item02","Item03"};
		String[] cart2= {"Item04","Item05"};
		
		
		// get Dependency object here in order to inject to any other dependent class
		
		PriceMatric price=new PriceMatrixImpl(); // Dependency class Object
				
		//-----------------------------------------
		BillingImpl bill=new  BillingImpl();
		bill.setPrice(price); // DI -> Injecting dependency object to the Dependent object  
		
		double total=bill.getTotalPrice(cart1);
		//-----------------------------------------
		
		System.out.println("Cart1 Total: "+total);
		
		total=bill.getTotalPrice(cart2);
		
		System.out.println("Cart2 Total: "+total);
		

	}

}
