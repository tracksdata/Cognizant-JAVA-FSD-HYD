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

public class OnetoOne_Save {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		

		Employee emp=new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Ozvitha");
		emp.setSalary(343535);
		
		Department dept=new Department();
		dept.setDeptId(101);
		dept.setDeptName("IT");
		dept.setLoc("Pune");
		
		emp.setDept(dept);
		
		
		
		
		
		
		 session.save(emp);
		 
		 
		 session.beginTransaction().commit();
		 
		 
		 
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
