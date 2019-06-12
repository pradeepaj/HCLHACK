package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeRepository.save(employee);
		

	}

	@Override
	public List<Employee> sortbyName(String firstName, String lastName) {
		return employeeRepository.findByFirstNameAndLastName(firstName,lastName);
	}

	@Override
	public List<Employee> sortByLastNameNot(String lastName) {
		return employeeRepository.findByLastnameNot(lastName);
	}

	

	
}
