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

public class Hql_Fetch4 {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		//  Get max saalry as integer
		
		// 1. Create a CriteriaBuilder interface
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		// 2. Create a CriteriaQuery interface from CriteriaBuilder interface
		CriteriaQuery<Double> cq=cb.createQuery(Double.class);
		
		//3. set up query Root bby calling from()
		// from Test
		Root<Test> root=cq.from(Test.class);
		cq.select(cb.max(root.get("price")));
		//cq.multiselect(root.get("testId"),root.get("testName"));
		//cq.select(root).where(cb.equal(root.get("testId"), 103));	
		Query<Double> q= session.createQuery(cq);
		
		Double maxPrice=q.getSingleResult();
		
		System.out.println("Max Salary: "+maxPrice);
		
		sf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
