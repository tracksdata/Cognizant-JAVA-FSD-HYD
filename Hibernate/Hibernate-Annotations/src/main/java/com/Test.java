package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Product prod=session.get(Product.class, "P005");
		
		System.out.println("Product Id: "+prod.getProdId());
		System.out.println("Product Name: "+prod.getProdName());
		System.out.println("Price: "+prod.getPrice());
		
		
		
		
		
		
		 
		 
		 
		 
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
