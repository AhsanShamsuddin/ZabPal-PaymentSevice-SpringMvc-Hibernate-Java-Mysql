package com.services;

import java.util.List;

import com.model.Ahsan;

public interface AhsanCRUDService {
	
	public void add(Ahsan ahsan);
	List<Ahsan> getAhsan();
	int deleteAhsan(int aid);

}
