package com.example.demo.response;

import lombok.Data;

@Data
public class AccountResponse {

	private String message;
	private int id;

	public AccountResponse(String message, int id){
		this.message = message;
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
