package com.dao.implementation;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Asad;
import com.services.AsadCRUDService;

@Repository
public class AsadCRUDDaoImpl implements AsadCRUDDao {
	
	@Autowired
	private AsadCRUDService as;
	
	@Autowired
	private SessionFactory sf;

	@Override
	public void add(Asad asad) {
		Session session = sf.getCurrentSession();
		
		session.save(asad);
		
		
	}

	@Override
	public List<Asad> getAsad() {
		Session session = sf.getCurrentSession();
		List<Asad> a = session.createQuery("from Asad",Asad.class).getResultList();
		
		
		return a;
	}

	@Override
	public int deleteAsad(int id) {
		Session session = sf.getCurrentSession();
		String sql = "delete from Asad where id="+id;
		Query query = session.createQuery(sql);
		 int d = query.executeUpdate();
		 
		
		
		return d;
	}


}
