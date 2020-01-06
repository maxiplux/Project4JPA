package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    EmployeeRepository repositry;
	
	@Override
	public Employee findEmployeById(int employeeNumber) {
		return repositry.findEmployeeById(employeeNumber);
	}
	
	public List<Employee> getEmployees(){
		Iterable<Employee> result = repositry.findAll();
		List<Employee> list = new ArrayList<>();
		for(Employee e:result) {
			list.add(e);
		}
		return list;
	}

	@Override
	public Employee findById(Long id) {
		return repositry.findOne(id);
	}

	@Override
	public Employee save(Employee employee) {
		repositry.save(employee);
		return employee;
	}

	@Override
	public void delete(Long employeeId) {
		repositry.delete(employeeId);
	}
	
	

}
