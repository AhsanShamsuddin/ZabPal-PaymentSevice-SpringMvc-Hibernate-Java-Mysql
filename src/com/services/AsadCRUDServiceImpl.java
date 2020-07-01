package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.implementation.AsadCRUDDao;
import com.model.Asad;

@Service
public class AsadCRUDServiceImpl implements AsadCRUDService {
	
	@Autowired 
	private AsadCRUDDao dao;
	

	@Override
	@Transactional
	public void add(Asad asad) {
		dao.add(asad);
		
	}

	@Override
	@Transactional
	public List<Asad> getAsad() {
		
		return dao.getAsad();
	}

	@Override
	@Transactional
	public int deleteAsad(int id) {
		
		return dao.deleteAsad(id);
	}

}
