package com.dao.implementation;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Ahsan;

public interface AhsanCRUDao {
	public void add(Ahsan ahsan);
	List<Ahsan> getAhsan();
	int deleteAhsan(int aid);

}
