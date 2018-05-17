package com.emp;

public class Test {

	public static void main(String[] args) {

		SalesPerson sp1 = new SalesPerson("123", "sean");

		// sp1.id = "123";
		// sp1.name = "Sean";
		sp1.commision = 100.00;

		System.out.println(sp1.getId());
		System.out.println(sp1.getName());
		System.out.println(sp1.commision);

	}

}
