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

public class Hql_Fetch3 {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
				
		// HQL using Hibernate 5x
		
		// Multiple Columns
		// 1. Create a CriteriaBuilder interface
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		// 2. Create a CriteriaQuery interface from CriteriaBuilder interface
		CriteriaQuery<Object[]> cq=cb.createQuery(Object[].class);
		
		//3. set up query Root bby calling from()
		// from Test
		Root<Test> root=cq.from(Test.class);
		cq.multiselect(root.get("testId"),root.get("testName"));
		//cq.select(root).where(cb.equal(root.get("testId"), 103));	
		Query<Object[]> q= session.createQuery(cq);
				
		List<Object[]> tests=q.getResultList();
		
		
		for(Object[] obj:tests) {
			System.out.println("Test Id: "+obj[0]);
			System.out.println("Name: "+obj[1]);
			//System.out.println("Price: "+t.getPrice());
			System.out.println("------------------------------");
		}

		
		sf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
