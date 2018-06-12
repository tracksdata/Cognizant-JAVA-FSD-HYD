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
		
		StandardServiceRegistry registry;
		SessionFactory sessionFactory;
		
		 registry = new StandardServiceRegistryBuilder()
		            .configure()
		            .build();

		        // Create MetadataSources
		        MetadataSources sources = new MetadataSources(registry);

		        // Create Metadata
		        Metadata metadata = sources.getMetadataBuilder().build();

		        // Create SessionFactory
		        sessionFactory = metadata.getSessionFactoryBuilder().build();
		        
		        Session session = sessionFactory.openSession();
		        //session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(23456);
		
		
		session.save(emp);
		
	
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
