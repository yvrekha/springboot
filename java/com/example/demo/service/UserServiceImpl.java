package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
	public UserRepository userrepository;
	
	@Override
	public void save(UserEntity user) {
		userrepository.save(user);
		
		
	}

    @Override
	public List<UserEntity> getAllUsers() {
		return userrepository.findAll();
	
	}

    @Override
	public UserEntity getByUserName(String username) {
		
		return userrepository.findByUsername(username);
	}

}
