package com.dao.implementation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.ETransaction;
import com.model.user;

@Repository
public class DaoImplement implements userda {

	@Autowired
	private SessionFactory s;
		
	@Override
	public void addUser(user u) {
	
		Session session = s.getCurrentSession();
		
		session.save(u);
				
	}

	@Override
	public user ee(user u) {
		Session session = s.getCurrentSession();
		Query<user> q = session.createQuery("from user where email=:Email",user.class);
		
		 q.setParameter("Email",u.getEmail());
		 
		 user use = q.getSingleResult();
		
		if(use.getEmail().equals(u.getEmail()) && use.getPassword().equals(u.getPassword()))
		{
			return use;
		}
		else{
			return null;
		}
	}

	@Override
	public List<user> getData() {
		Session session = s.getCurrentSession();
		
		List<user> u = session.createQuery("from user", user.class).getResultList();
		
		return u;
	}

	@Override
	public int updateUser(int id, user u) {
		Session session = s.getCurrentSession();
		
	    String sql="update user set First_Name='"+u.getFirstname()+"', Last_Name='"+u.getLastname()+"',Email='"+u.getEmail()+"',Password='"+u.getPassword()+"',Address='"+u.getAddress()+"',PhNum='"+u.getPhNumber()+"',CardNum='"+u.getCardnum()+"' where id="+id+"";    

		//session.update(u);
	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

	@Override
	public void depositamount(int id,user u,int amount) {		
		Session session = s.getCurrentSession();
		
		u.add(u.getTotal_balance(), amount);
	    String sql="update user set Total_balance='"+u.getTotal_balance()+"' where id="+id+"";    
	    Query query = session.createSQLQuery(sql);
	    query.executeUpdate();
	}

	@Override
	public void withdrawamount(int id, user u, int amount) {
		Session session = s.getCurrentSession();
		
		u.sub(u.getTotal_balance(), amount);
	    String sql="update user set Total_balance='"+u.getTotal_balance()+"' where id="+id+"";    
	    Query query = session.createSQLQuery(sql);
	    query.executeUpdate();
	}

	@Override
	public int deleteUser(int id) {
		Session session = s.getCurrentSession();
		
	    String sql="delete from user where id="+id;    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

	@Override
	public int countUser(user u) {
		Session session = s.getCurrentSession();
		
		String sql = "SELECT COUNT(id) FROM user";
	    Query query = session.createQuery(sql);
	    
	    return query.getFirstResult();
	}

	@Override
	public List<ETransaction> getRequests() {
		Session session = s.getCurrentSession();
		
		List<ETransaction> et = session.createQuery("from ETransaction", ETransaction.class).getResultList();
		
		return et;
	}

}
