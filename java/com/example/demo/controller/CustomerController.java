package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.CustomerServiceImpl;
import com.example.demo.entity.CustomerEntity;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
		
		@Autowired
		CustomerServiceImpl customerhelper;
		
		@GetMapping("/display")
		public List<CustomerEntity> findAll(){
			
			return customerhelper.findAll();
		}
	}

	
