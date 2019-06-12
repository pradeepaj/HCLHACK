package com.bank.customer.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.app.entity.Customer;
import com.bank.customer.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);

	}

	@Override
	public List<Customer> fectAllCustomer() {

		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(long id) {
	
		return customerRepository.findById(id).get();
	}

	@Override
	public void deleteCustomer(long id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	Customer c1 = customerRepository.findById(customer.getCustomerId()).get();
	c1.setName(customer.getName());
	c1.setBalance(customer.getBalance());
	return c1;
	}

//	@Override
//	public Customer updateCustomer(long id,double balance,String name) {
//		Customer c1=customerRepository.findById(id).get();
//		c1.setBalance(balance);
//		c1.setName(name);
//		return c1;
//	}

}
