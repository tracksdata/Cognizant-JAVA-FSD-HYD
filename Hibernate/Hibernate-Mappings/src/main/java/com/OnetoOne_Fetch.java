package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.onetoone.Department;
import com.onetoone.Employee;

public class OnetoOne_Fetch {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		
		Employee emp=session.get(Employee.class, 11);
		 
		System.out.println("Emp Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		System.out.println("Location: "+emp.getDept().getLoc());
		 
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
