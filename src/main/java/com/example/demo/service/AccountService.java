package com.example.demo.service;

import com.example.demo.dto.AccountDTO;
import com.example.demo.model.Account;

public interface AccountService {

	Account createAccount(AccountDTO accountDto);

}
