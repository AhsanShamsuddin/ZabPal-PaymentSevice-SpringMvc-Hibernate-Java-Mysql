package com.dao.implementation;

import java.util.List;

import com.model.Asad;


public interface AsadCRUDDao {
	public void add(Asad asad);
	List<Asad> getAsad();
	int deleteAsad(int id);

}
