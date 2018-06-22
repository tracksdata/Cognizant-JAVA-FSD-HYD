package com.cts.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public void saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

	@Override
	public Employee findById(int empId) {
		return empDao.findById(empId);
	}

	@Override
	public List<Employee> findByName(String empName) {

		return empDao.findByName(empName);
	}

}
