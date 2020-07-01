package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.ArsalanCRUDao;
import com.model.Arsalan;

@Service
public class ArsalanCRUDServiceImpl implements ArsalanCRUDService {
	
	@Autowired
	private ArsalanCRUDao dao;

	@Override
	@Transactional
	public void add(Arsalan arsalan) {
		
		dao.add(arsalan);
	}

	@Override
	@Transactional
	public List<Arsalan> getArsalan () {
		
		return dao.getArsalan();
	}

	@Override
	@Transactional
	public int deleteArsalan(int arid) {
		
		return dao.deleteArsalan(arid);
	}


}
