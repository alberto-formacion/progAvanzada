package MVCompleto.model.impl;

import java.util.ArrayList;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import MVCompleto.model.PaisDAO;
import MVCompleto.vo.Pais;

@Repository
public class PaisDAOImpl implements PaisDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional(readOnly=true)
	public ArrayList<Pais> getPaises() {
		
		Criteria c = currentSession().createCriteria(Pais.class);
		
		ArrayList<Pais> paises = (ArrayList<Pais>) c.list();
	
		
		return paises;
		
		
	}

}
