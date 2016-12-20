package com.sanluis.springRestBoot.repository.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.springRestBoot.domain.Pais;
import com.sanluis.springRestBoot.repository.PaisDAO;

@Repository
public class PaisDAOImpl implements PaisDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional(readOnly=true)
	public ArrayList<Pais> getPaises() {
		
		Criteria c = currentSession().createCriteria(Pais.class);
		
		ArrayList<Pais> paises = (ArrayList<Pais>) c.list();
	
		
		return paises;
		
		
	}

}
