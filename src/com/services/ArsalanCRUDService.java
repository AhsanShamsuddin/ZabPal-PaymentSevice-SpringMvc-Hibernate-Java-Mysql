package com.services;

import java.util.List;


import com.model.Arsalan;

public interface ArsalanCRUDService {
	
	public void add(Arsalan arsalan);
	List<Arsalan> getArsalan();
	int deleteArsalan (int arid);

}
