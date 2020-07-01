package com.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Arsalan;
import com.services.ArsalanCRUDService;

@Repository
public class ArsalanCRUDaoImpl implements ArsalanCRUDao {
	
	@Autowired
	private ArsalanCRUDService ars;
	
	@Autowired
	private SessionFactory s;

	@Override
	public void add(Arsalan arsalan) {
		Session session = s.getCurrentSession();
		
		session.save(arsalan);
		
	}

	@Override
	public List<Arsalan> getArsalan() {
		Session session = s.getCurrentSession();
		
		List<Arsalan> ar = session.createQuery("from Arsalan" , Arsalan.class).getResultList();
		
		return ar;
	}

	@Override
	public int deleteArsalan(int arid) {
		Session session = s.getCurrentSession();
		
	    String sql="delete from Arsalan where id="+arid;    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

}
