package com.example.demo.controller;

import java.util.List;

import org.hibernate.dialect.pagination.FirstLimitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeResponse;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/created/{employee.getId()}")
	public EmployeeResponse createEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.insertEmployee(employee);
		return new EmployeeResponse(200, "Employee inserted Sucessfully" + emp.getId());
	}

	@GetMapping("/employee/{firstName}/{lastName}")
	public List<Employee> sortEmployee(@PathVariable String firstName, @PathVariable String lastName) {
		return employeeService.sortbyName(firstName, lastName);
	}

	@GetMapping("/getemployee/{lastName}")
	public List<Employee> sortByLastName(@PathVariable String lastName) {
		return employeeService.sortByLastNameNot(lastName);
	}

}
