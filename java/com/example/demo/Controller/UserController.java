package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;
	
	

	@GetMapping("/save")
	public void save(@RequestBody UserEntity user) {
		userservice.save(user);
	}
	
	@GetMapping("/allusers")
	public List<UserEntity> getAllUSers(){
		return userservice.getAllUsers();
	}
	
	@GetMapping("/{username}")
	public UserEntity getByUsername(@PathVariable String  username) {
		return userservice.getByUserName(username);
	}
}

