package com.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.entity.User;
import com.hcl.bank.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/{user.getId()}")
	public User insertUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping("/{name}/{password}")
	public String validateUser(@PathVariable String name, @PathVariable String password) {
		User user = userService.checkUser(name, password);
		if (user != null && user.getName().equals(name) && user.getPassword().equals(password)) {
			return "Valid User";
		} else {
			return "InValid User";
		}
	}

}
