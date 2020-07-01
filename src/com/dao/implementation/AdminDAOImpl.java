package com.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO{

	@Autowired
	private SessionFactory s;
	
	@Override
	public Admin checkAdmin(Admin admin) {
		
		Session session = s.getCurrentSession();
		Query<Admin> q = session.createQuery("from Admin where username=:Username",Admin.class);
		
		q.setParameter("Username",admin.getUsername());
		
		Admin adm = q.getSingleResult();
		
		if(adm.getUsername().equals(admin.getUsername()) && adm.getPassword().equals(admin.getPassword()))
		{
			return adm;
		}
		else{
			return null;
		}
	}

}
