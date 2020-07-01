package com.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Account;

@Repository
public class AccountDAOImpl implements AccountDAO{
	
	@Autowired
	private SessionFactory s;

	@Override
	public void addAccount(Account account) {
		Session session = s.getCurrentSession();
		session.save(account);
		
	}

	
}
