package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	Employee insertEmployee(Employee employee);

	List<Employee> sortbyName(String firstName, String lastName);

	List<Employee> sortByLastNameNot(String lastName);

}
