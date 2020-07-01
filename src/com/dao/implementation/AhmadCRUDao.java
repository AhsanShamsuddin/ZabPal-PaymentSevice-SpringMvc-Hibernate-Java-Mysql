package com.dao.implementation;

import java.util.List;

import com.model.Ahmad;

public interface AhmadCRUDao {
	public void add(Ahmad ahmad);
	List<Ahmad> getAhmad();
	int deleteAhmad (int arid);
}
