package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.AhsanCRUDao;
import com.model.Ahsan;

@Service
public class AhsanCRUDServiceImpl implements AhsanCRUDService{

	@Autowired
	private AhsanCRUDao dao;
	
	@Override
	@Transactional
	public void add(Ahsan ahsan) {
		dao.add(ahsan);
	}

	@Override
	@Transactional
	public List<Ahsan> getAhsan() {
		return dao.getAhsan();
	}

	@Override
	@Transactional
	public int deleteAhsan(int aid) {
		return dao.deleteAhsan(aid);
	}
	
	

}
