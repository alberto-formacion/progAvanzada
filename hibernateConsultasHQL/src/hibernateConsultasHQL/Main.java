package hibernateConsultasHQL;

import java.util.List;

import javax.persistence.Query;

import model.Cd;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Main {
	
	public static void main(String[] args){
		Configuration cfg = new Configuration()
		.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
		.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdcol")
		.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
		.setProperty("hibernate.connection.username", "root")
		.setProperty("hibernate.connection.password", "")
		.setProperty("hibernate.show_sql", "true")
		.setProperty("hibernate.current_session_context_class", "thread")
		.addAnnotatedClass(Cd.class);
		
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		Query q = s.createQuery("from Cd where titulo like :titulo");
		//org.hibernate.query.Query<Cd> q = s.createQuery("from Cd where titulo like :titulo",Cd.class);
		
		q.setParameter("titulo", "%B%");
		
		List<Cd> cds =  (List<Cd>) q.getResultList();
		//List<Cd> cds =  q.getResultList();
		
		for(Cd cd : cds){
			System.out.println(cd.getTitulo());
		}
		
		s.getTransaction().commit();
		
	}
	
}
