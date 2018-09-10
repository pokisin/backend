package com.winki.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winki.demo.dao.UserRepository;
import com.winki.demo.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}
	
	
}
