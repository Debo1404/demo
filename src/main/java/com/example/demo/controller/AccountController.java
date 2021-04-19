package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;
import com.example.demo.response.AccountResponse;
import com.example.demo.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AccountController {
	
	@Autowired
	AccountService demoService;

	@RequestMapping(value = "/account/create", method = RequestMethod.POST,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity saveData(@RequestBody AccountDTO accountDto) {
		//log.info("Request Received to read xml file from = {}");
		Account account = demoService.createAccount(accountDto);
		if (account!=null) {
			AccountResponse res = new AccountResponse("Saved Successfully", account.getId());
			return new ResponseEntity<>(res, HttpStatus.CREATED);
		}

		return ResponseEntity.noContent().build();

	}
}
