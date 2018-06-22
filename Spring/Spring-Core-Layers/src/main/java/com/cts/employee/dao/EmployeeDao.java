package com.cts.employee.dao;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	Employee findById(int empId);

	List<Employee> findByName(String empName);

}