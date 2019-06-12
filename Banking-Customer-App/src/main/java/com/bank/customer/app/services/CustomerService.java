package com.bank.customer.app.services;

import java.util.List;

import com.bank.customer.app.entity.Customer;


public interface CustomerService {

	Customer saveCustomer(Customer customer);

	List<Customer> fectAllCustomer();

	Customer getCustomer(long id);

	void deleteCustomer(long id);

	Customer updateCustomer(Customer customer);

//	Customer updateCustomer(long id, double balance, String name);


}
