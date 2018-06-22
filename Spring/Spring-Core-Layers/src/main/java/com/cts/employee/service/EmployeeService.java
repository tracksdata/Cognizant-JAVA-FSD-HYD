package com.cts.employee.service;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee emp);

	Employee findById(int empId);

	List<Employee> findByName(String empName);

}