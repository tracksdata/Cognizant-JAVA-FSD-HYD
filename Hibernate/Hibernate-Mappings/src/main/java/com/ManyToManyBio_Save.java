package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Patient;
import com.manytomany.Test;

public class ManyToManyBio_Save {

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
		
		
		// MAP Patient TO A Test'
		
		t1.getPatients().add(p1);
		t1.getPatients().add(p2);
		t1.getPatients().add(p3);
		
		t2.getPatients().add(p1);
		t2.getPatients().add(p2);
		t2.getPatients().add(p3);
		
		
		
		t3.getPatients().add(p1);
		
		t4.getPatients().add(p1);
		t4.getPatients().add(p3);
		
		t5.getPatients().add(p2);
		t5.getPatients().add(p3);
		
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(t5);
		
		session.beginTransaction().commit();
		
		
		System.out.println("----- Done ----");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
