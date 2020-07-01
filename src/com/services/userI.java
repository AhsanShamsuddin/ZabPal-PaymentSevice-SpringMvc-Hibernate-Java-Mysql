package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ETransaction;
import com.model.user;

public interface userI {

	void addUser(user u);
	
	int updateUser(int id,user u);

	user checks(user u);

	List<user> getData();
	
	List<ETransaction> getRequests(); 
	
	int deleteUser(int id); 
	
	void depositamount(int id,user u, int amount);
	
	void withdrawamount(int id,user u, int amount);
	
	int countUsers(user u);

}
