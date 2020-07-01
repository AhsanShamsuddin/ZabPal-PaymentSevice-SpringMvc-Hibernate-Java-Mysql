package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.userda;
import com.model.ETransaction;
import com.model.user;

@Service
public class serviceuser implements userI {

	@Autowired
	private userda dao;
	
	@Override
	@Transactional
	public void addUser(user u) {
		
		dao.addUser(u);
	}

	@Override
	@Transactional
	public user checks(user u) {
		
		return dao.ee(u);
	}

	@Override
	@Transactional
	public List<user> getData() {
		
		return dao.getData();
	}

	@Override
	@Transactional
	public int updateUser(int id,user u) {
		return dao.updateUser(id,u);
	}

	@Override
	@Transactional
	public void depositamount(int id,user u, int amount) {
		dao.depositamount(id,u,amount);
	}

	@Override
	@Transactional
	public void withdrawamount(int id, user u, int amount) {
		dao.withdrawamount(id, u, amount);
	}

	@Override
	@Transactional
	public int deleteUser(int id) {
		return dao.deleteUser(id);
	}

	@Override
	@Transactional
	public int countUsers(user u) {
		return dao.countUser(u);
		
	}

	@Override
	@Transactional
	public List<ETransaction> getRequests() {
		return dao.getRequests();
	}

}
