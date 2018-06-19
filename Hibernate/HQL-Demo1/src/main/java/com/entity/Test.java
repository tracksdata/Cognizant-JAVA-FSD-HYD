package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
	
	@Id
	private int testId;
	private String testName;
	private double price;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
