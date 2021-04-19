package com.example.demo.dto;

import com.example.demo.model.Customer;

import lombok.Data;

@Data
public class AccountDTO {

	private Integer id;
	private Customer customerId;	
	private String name;	
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
