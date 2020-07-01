package com.dao.implementation;

import java.util.List;

import com.model.Arsalan;

public interface ArsalanCRUDao {
	public void add(Arsalan arsalan);
	List<Arsalan> getArsalan();
	int deleteArsalan(int arid);

}
