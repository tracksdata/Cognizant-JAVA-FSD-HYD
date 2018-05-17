package com.sale;

public class SalesPerson {

	String name;

	public SalesPerson(String spName) {
		name = spName;
	}

	public String takeOrder(String custName, String item, String shipAddress,
			String deliveryDate) {

		// Check stock availability
		// Check delivery Date

		boolean status = true;

		if (status) {
			return "Thank You, Your Order Accepted";
		} else {
			return "No Stock with us for specified Item";
		}

	}

	
}
