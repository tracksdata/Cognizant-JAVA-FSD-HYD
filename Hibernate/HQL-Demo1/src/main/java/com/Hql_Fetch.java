package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Test;
import com.fasterxml.classmate.AnnotationConfiguration;

public class Hql_Fetch {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		// Create reference of a Query interface
		
		
		//-------------------------------------------------
		// Hibernate 3x code-> now we are using 5x
//		Query<Test> qry=session.createQuery("from Test");
//		List<Test> tests=qry.list();
//		
//		for(Test t:tests) {
//			System.out.println("Test Id: "+t.getTestId());
//			System.out.println("Name: "+t.getTestName());
//			System.out.println("Price: "+t.getPrice());
//			System.out.println("------------------------------");
//		}
		
		//--------------------------------------------------
		
		// HQL using Hibernate 5x
		// Fetch all columns
		
		// 1. Create a CriteriaBuilder interface
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		// 2. Create a CriteriaQuery interface from CriteriaBuilder interface
		CriteriaQuery<Test> cq=cb.createQuery(Test.class);
		
		//3. set up query Root bby calling from()
		// from Test
		Root<Test> root=cq.from(Test.class);
				
		Query<Test> q= session.createQuery(cq);
		
		List<Test> tests=q.getResultList();
		
		
		for(Test t:tests) {
			System.out.println("Test Id: "+t.getTestId());
			System.out.println("Name: "+t.getTestName());
			System.out.println("Price: "+t.getPrice());
			System.out.println("------------------------------");
		}

		
		sf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
