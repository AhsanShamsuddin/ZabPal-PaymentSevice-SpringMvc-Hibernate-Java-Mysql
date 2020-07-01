package com.dao.implementation;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.ETransaction;
import com.model.user;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@Repository
public class ETransactionDAOImpl implements ETransactionDAO{

	public String RID;
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public void maketrans(ETransaction etransaction) {
		Session session = sf.getCurrentSession();
		
		session.save(etransaction);
		
	}

	@Override
	public List<user> getEmails() {
		Session session = sf.getCurrentSession();
		
		List<user> u = session.createQuery("from user", user.class).getResultList();
		
		return u;
	}

	@Override
	public int acceptRequest(user u, int rid, int amount) {
		Session session = sf.getCurrentSession();
		
		u.add(u.getTotal_balance(), amount);
	    String sql="update user set Total_balance='"+u.getTotal_balance()+"' where id="+rid+"";    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();

	    return q;
	}

	@Override
	public int deleteRequest(int id) {
		Session session = sf.getCurrentSession();
		
	    String sql="delete from ETransaction where tid="+id;    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

}
