package com.hcl.bank.service;

import com.hcl.bank.entity.User;

public interface UserService {

	User createUser(User user);

	User checkUser(String name, String password);

}
