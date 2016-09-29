package main;


import java.util.List;

import model.Alumno;
import model.Centro;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration()
			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdcol")
			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
			.setProperty("hibernate.connection.username", "root")
			.setProperty("hibernate.connection.password", "")
			.setProperty("hibernate.show_sql", "true")
			.setProperty("hibernate.current_session_context_class", "thread")
			.setProperty("hibernate.hbm2ddl.auto", "update")
			.addAnnotatedClass(Alumno.class)
			.addAnnotatedClass(Centro.class);
			
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.getCurrentSession();

		s.beginTransaction();
		
		Criteria c = s.createCriteria(Alumno.class);
		
		List<Alumno> alumnos = c.list();
		
		s.getTransaction().commit();
		
		for(Alumno alumno:alumnos){
			
		}
	}

}
