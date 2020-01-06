package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Employee;

import java.util.List;

public interface EmployeeService {
	
	Employee findEmployeById(int employeeNumber);
	
	Employee findById(Long id);
	
	Employee save(Employee employee);
	
	void delete(Long employeeId);
	
	List<Employee> getEmployees();

}
