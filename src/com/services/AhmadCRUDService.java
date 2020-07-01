package com.services;

import java.util.List;

import com.model.Ahmad;

public interface AhmadCRUDService {
	public void add(Ahmad ahmad);
	List<Ahmad> getAhmad();
	int deleteAhmad (int arid);
}
