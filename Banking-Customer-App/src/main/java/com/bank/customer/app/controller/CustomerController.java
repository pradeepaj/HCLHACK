package com.bank.customer.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.app.entity.Customer;
import com.bank.customer.app.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/created")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer customer1 = customerService.saveCustomer(customer);
		return customer1;
	}

	@GetMapping("/all-customer")
	public List<Customer> getAllCustomer() {
		return customerService.fectAllCustomer();
	}

	@GetMapping("/customer-by/{id}")
	public Customer getCustomerById(@PathVariable long id) {
		return customerService.getCustomer(id);
	}
	@DeleteMapping("/delete-customer/{id}")
	public void deleteCustomerById(@PathVariable long id) {
		 customerService.deleteCustomer(id);
	}
//@PutMapping("/updateCustomer/{id}/{balance}/{name}")
//public Customer updateCustomer(@PathVariable long id,@PathVariable double balance,@PathVariable String name) {
//	return customerService.updateCustomer(id,balance,name);
//}
	
	@PutMapping("/updateCustomer/{customer.getid()}")
	public Customer updateCustomer(@RequestBody Customer customer) {
	return	customerService.updateCustomer(customer);
	}
}
