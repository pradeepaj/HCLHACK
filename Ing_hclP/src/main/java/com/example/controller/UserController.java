package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/message")
public class UserController {
@Autowired
private UserService userService;

@PostMapping("/createUser")
public String createUser(@RequestBody User user) {
	return userService.createUser(user);
	
}
}
