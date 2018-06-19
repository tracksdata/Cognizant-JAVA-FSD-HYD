package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Patient;
import com.manytomany.Test;

public class ManyToMany_Save {

	public static void main(String[] args) {

		// Hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Test t1=new Test(100,"Blood Test",10000);
		Test t2=new Test(101,"ECG Test",50000);
		Test t3=new Test(102,"Skin Test",2000);
		Test t4=new Test(103,"Sugar Test",3000);
		Test t5=new Test(104,"Body Test",12000);
		
		
		Patient p1=new Patient(1, "Praveen");
		Patient p2=new Patient(2, "Ozvitha");
		Patient p3=new Patient(3, "Babitha");
		
		
		// MAP TEST TO A PATIENT'
		
		p1.getTests().add(t1);
		p1.getTests().add(t2);
		p1.getTests().add(t3);
		p1.getTests().add(t4);
		p1.getTests().add(t5);
		
		p2.getTests().add(t3);
		p2.getTests().add(t5);
		
		p3.getTests().add(t1);
		p3.getTests().add(t3);
		p3.getTests().add(t4);

		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
