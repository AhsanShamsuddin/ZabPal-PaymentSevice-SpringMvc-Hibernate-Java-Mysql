package com.services;

import java.util.List;

import com.model.ETransaction;
import com.model.user;

public interface ETransactionService {
	void maketrans(ETransaction etransaction);
	List<user> getEmails();
	int acceptRequest(user u, int rid, int amount); 
	int deleteRequest(int id);

}
