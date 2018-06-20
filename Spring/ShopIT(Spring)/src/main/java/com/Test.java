package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatric;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {
		
		// create carts
		String[] cart1= {"Item01","Item02","Item03"};
		String[] cart2= {"Item04","Item05"};
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		BillingImpl bill=ac.getBean("bill",BillingImpl.class);
		
		double total=bill.getTotalPrice(cart1);
		System.out.println("Cart1 Total: "+total);
		
		total=bill.getTotalPrice(cart2);
		
		System.out.println("Cart2 Total: "+total);
		

	}

}
