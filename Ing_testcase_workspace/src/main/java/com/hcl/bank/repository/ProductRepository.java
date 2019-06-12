package com.hcl.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bank.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

	List<Products> findProductsByUserId(long userId);

}
