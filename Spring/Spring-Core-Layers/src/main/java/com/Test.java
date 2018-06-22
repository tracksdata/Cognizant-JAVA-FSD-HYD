package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.employee.model.Employee;
import com.cts.employee.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(15000);
		
		EmployeeService empService=ac.getBean("empService",EmployeeService.class);
		
		empService.saveEmployee(emp);
		
		System.out.println("  --- Done ---");
		
	}

}
