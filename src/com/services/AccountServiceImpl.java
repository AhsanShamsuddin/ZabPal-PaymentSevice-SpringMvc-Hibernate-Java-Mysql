package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.implementation.AccountDAO;
import com.model.Account;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDAO adao;

	@Override
	@Transactional
	public void addAccount(Account account) {
		adao.addAccount(account);
	}
	
	

}
