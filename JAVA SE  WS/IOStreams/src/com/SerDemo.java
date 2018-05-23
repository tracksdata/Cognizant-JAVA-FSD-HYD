package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("Ozvitha");
		emp.setSalary(486379);
		emp.setInfo("This employee from Pune");

		try {

			FileOutputStream fos = new FileOutputStream("d:/myfiles/emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);
			System.out.println("-- Writing is Done");

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
