package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
@Autowired
private UserRepository userRepository;

@Override
public User createUser(User user) {
	return userRepository.save(user);
	
}

@Override
public String createUser(User user) {
	// TODO Auto-generated method stub
	return null;
}
}