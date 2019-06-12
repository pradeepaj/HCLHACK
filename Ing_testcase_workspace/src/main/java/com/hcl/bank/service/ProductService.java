package com.hcl.bank.service;

import java.util.List;

import com.hcl.bank.entity.Products;

public interface ProductService {

	Products craeteProduct(Products products);

	List<Products> allProducts(long userId);

}
