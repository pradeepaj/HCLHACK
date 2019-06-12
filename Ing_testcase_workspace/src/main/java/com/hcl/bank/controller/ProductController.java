package com.hcl.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.entity.Products;
import com.hcl.bank.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/add")
	public Products insertProduct(@RequestBody Products products) {
		return productService.craeteProduct(products);
	}
	
	@GetMapping("/products/{userId}")
	public List<Products> userProducts(@PathVariable ("userId") long userId){
		return productService.allProducts(userId);
	}

	

}
