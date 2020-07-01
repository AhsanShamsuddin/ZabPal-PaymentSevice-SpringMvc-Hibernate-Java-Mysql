package com.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.AdminDAO;
import com.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO dao;

	@Override
	@Transactional
	public Admin checkAdmin(Admin admin) {
		
		return dao.checkAdmin(admin);
	}

	
}
