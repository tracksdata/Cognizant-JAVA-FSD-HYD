package com.pricematrix;

import org.springframework.stereotype.Repository;

// Dependency class
@Repository("price")
public class PriceMatrixImpl implements PriceMatric {

	public PriceMatrixImpl() {
		System.out.println("---- PriceMatricImpl class object created...");
	}

	@Override
	public double getPrice(String itemCode) {

		// Code to connect to DB and fetch price of a given itemCode

		return 100.00;

	}

}
