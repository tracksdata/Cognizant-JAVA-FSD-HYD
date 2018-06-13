package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.onetomany.Department;
import com.onetomany.Employee;

public class OnetoMany_Fetch {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Department dept= session.get(Department.class, 10);
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Name: "+dept.getDeptName());
		System.out.println("Location: "+dept.getLoc());
		
		for(Employee emp:dept.getEmps()) {
			System.out.println("EmpId: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			
			System.out.println("-----------------------------");
			
		}
		
		
		
		
		
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
