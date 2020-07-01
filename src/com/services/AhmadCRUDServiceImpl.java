package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.AhmadCRUDao;
import com.model.Ahmad;

@Service
public class AhmadCRUDServiceImpl implements AhmadCRUDService{

	@Autowired
	private AhmadCRUDao dao;
	
	@Override
	@Transactional
	public void add(Ahmad ahmad) {
		dao.add(ahmad);
	}

	@Override
	@Transactional
	public List<Ahmad> getAhmad() {
		return dao.getAhmad();
	}

	@Override
	@Transactional
	public int deleteAhmad(int arid) {
		return dao.deleteAhmad(arid);
	}

	

}
