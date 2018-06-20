package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=ac.getBean("emp",Employee.class);
		
		System.out.println("Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		
		
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		System.out.println("--- Done ---");
		
	}

}
