package com.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.User;
import com.hcl.bank.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
		
	}

	@Override
	public User checkUser(String name, String password) {
		return userRepository.findByNameAndPassword(name,password);
	}

}
