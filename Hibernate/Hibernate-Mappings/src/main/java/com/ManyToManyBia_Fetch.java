package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.Patient;
import com.manytomany.Test;

public class ManyToManyBia_Fetch {

	public static void main(String[] args) {

		// Hibernate configuration code
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Patient p = session.get(Patient.class, 3);

		System.out.println("Paient Id: " + p.getPatientId());
		System.out.println("Name: " + p.getPatientName());

		// list all tests done on yop of patient id 1

		double total = 0.0;
		for (Test t : p.getTests()) {
			System.out.println("Test Id: " + t.getTestId());
			System.out.println("Test Name: " + t.getTestName());
			System.out.println("Price: " + t.getPrice());
			total = total + t.getPrice();
			System.out.println("-------------------------------");

		}
		System.out.println("Final Bill: " + total);
		
		
		
		System.out.println("-----------------  Test Data -------------------");
		
		Test t=session.get(Test.class, 102);
		
		System.out.println("-- Test Id: "+t.getTestId());
		System.out.println("Test Name: "+t.getTestName());
		System.out.println("Price: "+t.getPrice());
		
		// Display all patients assigned to test id 100
		
		double patientBillAmt=0.0;
		int count=0;
		for(Patient pat:t.getPatients()) {
			System.out.println("Patient Id: "+pat.getPatientId());
			System.out.println("Name: "+pat.getPatientName());
			System.out.println("------------------------------------");
			count++;
		}
		
		patientBillAmt=count*t.getPrice();
		System.out.println("Total Patients taken: "+count);
		System.out.println("Test Total AMount: "+patientBillAmt);
		

		System.out.println("----- Done ----");

	}

}
