package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytoone.Department;
import com.manytoone.Employee;

public class ManyToOne_Fetch {

	public static void main(String[] args) {

		// hibernate configuration code
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		
//		Employee emp=session.get(Employee.class, 1024);
//		
//		System.out.println("Id: "+emp.getEmpId());
//		System.out.println("Name: "+emp.getEmpName());
//		System.out.println("Dept Id: "+emp.getDept().getDeptId());
//		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		
		Department dept=session.get(Department.class, 10);
		System.out.println("dept id: "+dept.getDeptId());
		System.out.println("Dept Name: "+dept.getDeptName());
		
		for(Employee emp:dept.getEmps()) {
			System.out.println("Emp Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("-------------------------------");
		}
		
		Employee e1=session.get(Employee.class, 1027);
		session.delete(e1);
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");

	}

	
	
	

}
