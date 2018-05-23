package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("d:/myfiles/emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee emp = (Employee) ois.readObject();
			System.out.println("EMpId: " + emp.getEmpId());
			System.out.println("name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("Info: "+emp.getInfo());
			// System.out.println("-------------------------------------");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
