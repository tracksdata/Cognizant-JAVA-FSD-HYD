package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveProduct {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();

		// Save product object to db
		
		Product prod=new Product();
		Product prod2=new Product();

		
		prod.setProdId("P005");
		prod.setProdName("Soap");
		prod.setPrice(12);
		
		prod2.setProdId("P006");
		prod2.setProdName("Mouse");
		prod2.setPrice(127);
		
		
		ses.save(prod);
		ses.save(prod2);
		
		tx.commit();
		
		
		System.out.println("--- Done ---");
		
		
		
		
		
		
		
	}

}
