package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		
	
			
			ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
			
			Employee emp1=(Employee)ac.getBean("emp");
			Employee emp2=(Employee)ac.getBean("emp");
			
			System.out.println("Emp Name: "+emp1.getEmpName());
			System.out.println("Emp Name: "+emp2.getEmpName());
			
//			
//			System.out.println("Id: "+emp.getEmpId());
//			System.out.println("Name: "+emp.getEmpName());
//			System.out.println("Salary: "+emp.getSalary());
//			
			System.out.println("-- Done ---");
			
			
		
		
	}

}
