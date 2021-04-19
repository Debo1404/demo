package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository demoRepository;

	
	
	@Override
	public Account createAccount(AccountDTO accountDto) {
		Account response = null;
		if(accountDto != null) {
			Account account = getAccount(accountDto);
			response = demoRepository.save(account);
		}
		return response;
		
	}



	private Account getAccount(AccountDTO accountDto) {
		
		 Account account = new Account(); 
		 account.setAddress(accountDto.getAddress()); 
		 account.setName(accountDto.getName());
		 account.setCustomerId(accountDto.getCustomerId());
		return account;
		 
	}

}
