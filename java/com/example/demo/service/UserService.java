package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;


@Service
public interface UserService {
	
	public void save(UserEntity user);
	public List<UserEntity> getAllUsers();
	public UserEntity getByUserName(String username);
	
	

}
