package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Customer")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String name;
private String password;
public User() {
	
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User(int userId, String name, String password) {
	super();
	this.userId = userId;
	this.name = name;
	this.password = password;
}
}
