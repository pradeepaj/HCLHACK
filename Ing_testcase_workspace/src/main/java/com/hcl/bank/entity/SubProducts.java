package com.hcl.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubProducts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sp_id;
	private String sp_name;
	
	@ManyToOne
	private Products products;

	public SubProducts() {
		
	}

	public SubProducts(long sp_id, String sp_name) {
		super();
		this.sp_id = sp_id;
		this.sp_name = sp_name;
	}

	public long getSp_id() {
		return sp_id;
	}

	public void setSp_id(long sp_id) {
		this.sp_id = sp_id;
	}

	public String getSp_name() {
		return sp_name;
	}

	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	
}
