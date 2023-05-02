package com.example.demo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.CustomerController;
import com.example.demo.entity.CustomerEntity;

import jakarta.persistence.EntityManager;




@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	
	@Autowired
	EntityManager entityManager;
	
	
	public List<CustomerEntity> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<CustomerEntity> query =  currentSession.createQuery("select c from CustomerEntity c ",CustomerEntity.class);
		
		List<CustomerEntity> customers = query.getResultList();
	
		
		System.out.println(customers);
		
		return customers; 
	}
	
	
}	

