package com.sanluis.MVC.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.MVC.dao.CdDAO;
import com.sanluis.MVC.domain.Cd;

@Repository
public class CdDAOImpl implements CdDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional(readOnly=true)
	public List<Cd> getCds() {
		EntityManager em = currentSession().getEntityManagerFactory().createEntityManager();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<Cd> criteria = builder.createQuery(Cd.class);
		
		Root<Cd> root = criteria.from(Cd.class);
		
		criteria.select(root);
		
		return em.createQuery(criteria).getResultList();
	}

}
