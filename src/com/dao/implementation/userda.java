package com.dao.implementation;
import java.util.List;

import com.model.*;

public interface userda {
	void addUser(user u);

	int updateUser(int id,user u);
	
	user ee(user u);

	List<user> getData();
	
	List<ETransaction> getRequests(); 
	
	int deleteUser(int id); 
	
	void depositamount(int id,user u, int amount);
	
	void withdrawamount(int id,user u, int amount);
	
	int countUser(user u);

}
