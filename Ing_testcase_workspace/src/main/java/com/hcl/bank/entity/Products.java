package com.hcl.bank.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long p_id;
	private String p_name;

	@ManyToOne
	private User user;
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<SubProducts> subProducts;


	public List<SubProducts> getSubProducts() {
		return subProducts;
	}

	public void setSubProducts(List<SubProducts> subProducts) {
		this.subProducts = subProducts;
	}

	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Products(long p_id, String p_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
	}

	

	public Products() {
		
	}

	
}
