package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a class Name: ");
		String clsName = sc.next();

		Class cl = Class.forName(clsName);

		Object obj = cl.newInstance(); // create object

		if (obj instanceof Student) {
			Student std = (Student) obj;
			std.studentData();
		}

		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			emp.empData();
		}

		if (obj instanceof Person) {
			Person p = (Person) obj;
			p.personData();
		}

	}

}
