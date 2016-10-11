package main;


import java.util.List;

import model.Alumno;
import model.Centro;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration()
			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/centroestudios")
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

		/*s.beginTransaction();
		
		Criteria c = s.createCriteria(Centro.class);*/
		
		//c.setFetchMode("alumnos", FetchMode.JOIN);
		
		/*List<Centro> centros = c.list();
		
		s.getTransaction().commit();
		
		for(Centro centro:centros){
			System.out.println(centro.getNombreCentro());
			for(Alumno alumno: centro.getAlumnos()){
				System.out.println(alumno.getNombre() + " " + alumno.getApellidos());
			}
		}*/
		
		s.beginTransaction();
		
		Criteria cAlumnos = s.createCriteria(Alumno.class);
		
		cAlumnos.setFetchMode("centro", FetchMode.JOIN);
		
		List<Alumno> alumnos = cAlumnos.list();

		s.getTransaction().commit();
		
		for(Alumno a : alumnos){
			System.out.println(a.getNombre() + " esta en el centro " + a.getCentro().getNombreCentro());
		}
	}

}
