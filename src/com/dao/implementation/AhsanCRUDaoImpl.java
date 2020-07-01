package com.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Ahsan;
import com.services.AhsanCRUDService;

@Repository
public class AhsanCRUDaoImpl implements AhsanCRUDao{

	@Autowired
	private AhsanCRUDService ahs;
	
	@Autowired
	private SessionFactory s;
	
	@Override
	public void add(Ahsan ahsan) {
		Session session = s.getCurrentSession();
		
		session.save(ahsan);
	}

	@Override
	public List<Ahsan> getAhsan() {
		Session session = s.getCurrentSession();
		
		List<Ahsan> ah = session.createQuery("from Ahsan", Ahsan.class).getResultList();
		
		return ah;
	}

	@Override
	public int deleteAhsan(int aid) {
		Session session = s.getCurrentSession();
		
	    String sql="delete from Ahsan where id="+aid;    

	    Query query = session.createQuery(sql);
	    int q = query.executeUpdate();
	    
		return q;
	}

}
