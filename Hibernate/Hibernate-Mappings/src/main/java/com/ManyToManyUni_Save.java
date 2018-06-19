package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Patient;
import com.manytomany.Test;

public class ManyToManyUni_Save {

	public static void main(String[] args) {

		// Hibernate configuration code
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		
//		
//		Test t1=new Test(100,"Blood Test",10000);
//		Test t2=new Test(101,"ECG Test",50000);
//		Test t3=new Test(102,"Skin Test",2000);
//		Test t4=new Test(103,"Sugar Test",3000);
//		Test t5=new Test(104,"Body Test",12000);
//		
//		
//		Patient p1=new Patient(1, "Praveen");
//		Patient p2=new Patient(2, "Ozvitha");
//		Patient p3=new Patient(3, "Babitha");
//		
		
		// MAP TEST TO A PATIENT'
		
		Patient p1=session.get(Patient.class, 1);
		Patient p2=session.get(Patient.class, 2);
		Patient p3=session.get(Patient.class, 3);

		
		p1.getTests().add(session.get(Test.class, 100));
		p1.getTests().add(session.get(Test.class, 101));
		p1.getTests().add(session.get(Test.class, 102));
		p1.getTests().add(session.get(Test.class, 103));
		//p1.getTests().add(session.get(Test.class, 104));
		
		p2.getTests().add(session.get(Test.class, 100));
		p2.getTests().add(session.get(Test.class, 101));
		p2.getTests().add(session.get(Test.class, 104));
		
		p3.getTests().add(session.get(Test.class, 100));
		p3.getTests().add(session.get(Test.class, 101));
		p3.getTests().add(session.get(Test.class, 103));
		p3.getTests().add(session.get(Test.class, 104));

		
		session.update(p1);
		session.update(p2);
		session.update(p3);
		
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
