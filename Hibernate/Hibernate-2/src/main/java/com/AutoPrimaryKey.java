package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AutoPrimaryKey {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();

		// update product object to db
		
		// hibernate software performs dml operations on top of primary key only
		

		Person p=new Person();
		
		p.setAge(67);
		p.setPersonName("Kavya");
		
		ses.save(p);
		
		tx.commit();
		
		
		System.out.println("--- Done ---");
		
		
		
		
		
		
		
	}

}
