package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	
	
	@Id							// primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private int cust_id;
	
	@Column(name = "cust_name")
	private String cust_name;
	
	
	@Column(name = "cust_address")
	private String cust_address;
	
	
	@Column(name = "cust_amount")
	private int cust_amount;

	
	
	public CustomerEntity() {
		
	}



	public int getCust_id() {
		return cust_id;
	}



	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}



	public String getCust_name() {
		return cust_name;
	}



	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}



	public String getCust_address() {
		return cust_address;
	}



	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}



	public int getCust_amount() {
		return cust_amount;
	}



	public void setCust_amount(int cust_amount) {
		this.cust_amount = cust_amount;
	}



	public CustomerEntity(int cust_id, String cust_name, String cust_address, int cust_amount) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.cust_amount = cust_amount;
	}
	
	
	

}
