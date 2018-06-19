package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytoone.Department;
import com.manytoone.Employee;

public class ManyToOne_Save {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Department dept = new Department();

		dept.setDeptId(10);
		dept.setDeptName("IT");
		dept.setLoc("Hyderabad");
		
		// Map many employees to a single department
		

		Employee e1 = new Employee(1024, "Praveen", 10000);
		Employee e2 = new Employee(1025, "James", 20000);
		Employee e3 = new Employee(1026, "Srikanth", 30000);
		Employee e4 = new Employee(1027, "Kavya", 40000);
		Employee e5 = new Employee(1028, "Nishanth", 50000);

		// Map Department to a single employee object
		
		e1.setDept(dept);
		e2.setDept(dept);
		e3.setDept(dept);
		e4.setDept(dept);
		e5.setDept(dept);
		
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		
		

		
		
		
		session.beginTransaction().commit();

		System.out.println("----- Done ----");

	}

}
