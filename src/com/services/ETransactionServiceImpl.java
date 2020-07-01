package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.ETransactionDAO;
import com.model.ETransaction;
import com.model.user;

@Service
public class ETransactionServiceImpl implements ETransactionService{

	@Autowired
	private ETransactionDAO dao;
	
	@Override
	@Transactional
	public void maketrans(ETransaction etransaction) {
		dao.maketrans(etransaction);
	}

	@Override
	@Transactional
	public List<user> getEmails() {
		return dao.getEmails();
	}

	@Override
	@Transactional
	public int acceptRequest(user u, int rid, int amount) {
		return dao.acceptRequest(u, rid, amount);
	}

	@Override
	@Transactional
	public int deleteRequest(int id) {
		return dao.deleteRequest(id);
	}

	
}
