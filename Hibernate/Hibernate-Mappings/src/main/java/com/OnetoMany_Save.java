package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.Department;
import com.onetomany.Employee;

public class OnetoMany_Save {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Department dept = new Department();

		dept.setDeptId(10);
		dept.setDeptName("Praveen");
		dept.setLoc("Hyderabad");

		Employee e1 = new Employee(1024, "Praveen", 10000);
		Employee e2 = new Employee(1025, "James", 20000);
		Employee e3 = new Employee(1026, "Srikanth", 30000);
		Employee e4 = new Employee(1027, "Kavya", 40000);
		Employee e5 = new Employee(1028, "Nishanth", 50000);

		
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);
		
		session.save(dept);
		
		
		
		session.beginTransaction().commit();

		System.out.println("----- Done ----");

	}

}
