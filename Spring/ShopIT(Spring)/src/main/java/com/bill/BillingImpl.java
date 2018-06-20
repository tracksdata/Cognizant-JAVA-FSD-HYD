package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pricematrix.PriceMatric;

// Dependent class
@Component("bill")
public class BillingImpl {
	
	
	/*
	 * Design & Performance issues
	 * -----------------------------------------------
	 * 
	 * 	-> dependency tightly-coupling
	 * 			
	 * 		==> Maintenance issues
	 * 
	 * 	-> too many same dependencies created & destroyed
	 * 
	 * 		==> memory, slow, ....
	 * 
	 * -> unit-testing not possible
	 * 		==> we cannot fix bugs in the classes
	 * 
	 * Why all above issues happened?
	 * --------------------------------
	 * 	-> Creating dependency class object in the dependent class.
	 * 
	 * 	-> Dependent itself creating its own dependency
	 * 
	 * Solution to above problem
	 * -----------------------------
	 * 	-> Do not create any dependency objects with in dependent classes
	 * 	-> Do not create, do look up using JNDI (Java Naming directory interface)
	 * 	-> The JNDI location is tightly coupled with Java class 
	 * 
	 * Best Solution:
	 * ------------------
	 * 	-> don't create, don't look up, get/injected by 'some-one' ==> IOC    -> Spring container-> dependency
	 * 
	 * 	 how to implement this IOC?
	 * --------------------------------
	 * 
	 * 		--> Dependency Injection
	 * 
	 * 			a. constructor DI
	 * 			b. setter based DI
	 * 			c. field/properties DI
	 * 
	 */

	
	@Autowired
	private PriceMatric price;  // Dependency class object



	public double getTotalPrice(String[] cart) {

		//price = new PriceMatrixImpl(); // Very serious issue or code issue in java. 
		
		double total = 0.0;

		for (String itemCode : cart) {

			total = total + price.getPrice(itemCode);

		}

		return total;
	}

}
