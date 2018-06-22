package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.emp.model.Employee;

@SpringBootApplication
@ComponentScan("com.cts.emp.model")
public class BootdemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(BootdemoApplication.class, args);
		
		Employee emp=ac.getBean("emp",Employee.class);
		
		System.out.println("----- Id: "+emp.getEmpId());
		System.out.println("----- Name: "+emp.getEmpName());
		

	
	}
}
