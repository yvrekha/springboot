package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.DAO.CustomerDAOImpl;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDAOImpl customerdetails;
	
	public List<CustomerEntity> findAll(){
		
		return customerdetails.findAll();
	}


}
