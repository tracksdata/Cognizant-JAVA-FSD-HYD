package com.cts.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee emp) { 
		System.out.println("--- EmployeeDao: " + emp.getEmpName() + " saved to DB");
	}

	@Override
	public Employee findById(int empId) {
		return null;
	}

	@Override
	public List<Employee> findByName(String empName) {

		return null;
	}

}
