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
		
		
		Employee emp=new Employee();
		emp.setEmpId(12);
		emp.setEmpName("Ozvitha");
		emp.setSalary(343434);
		
		
		session.save(emp);
		
	
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
