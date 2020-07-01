package com.dao.implementation;

import java.util.List;

import com.model.ETransaction;
import com.model.user;

public interface ETransactionDAO {
	void maketrans(ETransaction etransaction);
	List<user> getEmails();
	int acceptRequest(user u, int rid, int amount); 
	int deleteRequest(int id);
}
