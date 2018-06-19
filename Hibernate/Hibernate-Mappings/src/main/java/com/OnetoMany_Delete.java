package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytoone.Department;
import com.manytoone.Employee;

public class OnetoMany_Delete {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Department dept=session.get(Department.class, 10);
		session.delete(dept);
		session.beginTransaction().commit();

	
		System.out.println("----- Done ----");

	}

}
