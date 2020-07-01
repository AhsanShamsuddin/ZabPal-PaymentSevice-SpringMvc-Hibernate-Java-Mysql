package com.services;

import java.util.List;

import com.model.Asad;

public interface AsadCRUDService {
	public void add(Asad asad);
	List<Asad> getAsad();
	int deleteAsad(int id);

}
