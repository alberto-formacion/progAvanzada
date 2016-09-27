package main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import model.Cd;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.getCurrentSession();

		s.beginTransaction();
		
		Criteria c = s.createCriteria(Cd.class);
		
		c.add(Restrictions.gt("anyo", 1995)).addOrder(Order.asc("anyo"));
		
		List<Cd> cds = c.list();
		
		s.getTransaction().commit();
		
		for(Cd cd:cds){
			System.out.println("El titulo es " + cd.getTitulo());
		}
	}

}
