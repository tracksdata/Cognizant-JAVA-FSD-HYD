package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();

		// update product object to db
		
		// hibernate software performs dml operations on top of primary key only
		

		Product prod=new Product();
		
		prod.setProdId("P005");
		
		// set new data for prod
		
		prod.setProdName("Pen Drive");
		prod.setPrice(256);
		
		ses.update(prod);
	
		tx.commit();
		
		
		System.out.println("--- Done ---");
		
		
		
		
		
		
		
	}

}
