package com.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Ahmad;
import com.services.AhmadCRUDService;

@Repository
public class AhmadCRUDaoImpl implements AhmadCRUDao{

	@Autowired
	private AhmadCRUDService ahm;

	@Autowired
	private SessionFactory s;
	
	@Override
	public void add(Ahmad ahmad) {
		Session session = s.getCurrentSession();
		session.save(ahmad);
	}

	@Override
	public List<Ahmad> getAhmad() {
		Session session = s.getCurrentSession();
		
		List<Ahmad> ah = session.createQuery("from Ahmad" , Ahmad.class).getResultList();
		
		return ah;
	}

	@Override
	public int deleteAhmad(int arid) {
		Session session = s.getCurrentSession();
		
	    String sql="delete from Ahmad where id="+arid;    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

}
