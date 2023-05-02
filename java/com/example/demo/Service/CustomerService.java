package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.CustomerEntity;


@Service
public interface CustomerService {
	
	public List<CustomerEntity> findAll();

}
