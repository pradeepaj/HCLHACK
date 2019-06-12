package com.hcl.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.Products;
import com.hcl.bank.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public Products craeteProduct(Products products) {
		return productRepository.save(products);
		
	}
	@Override
	public List<Products> allProducts(long userId) {
	return productRepository.findProductsByUserId(userId);
		
	}
	

}
