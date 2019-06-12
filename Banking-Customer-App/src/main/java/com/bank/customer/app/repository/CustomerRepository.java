package com.bank.customer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.customer.app.entity.Customer;


public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
