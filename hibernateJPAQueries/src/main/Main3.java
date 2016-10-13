package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Cd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration()
				.setProperty("hibernate.connection.driver_class",
						"com.mysql.jdbc.Driver")
				.setProperty("hibernate.connection.url",
						"jdbc:mysql://localhost:3306/cdcol")
				.setProperty("hibernate.dialect",
						"org.hibernate.dialect.MySQLDialect")
				.setProperty("hibernate.connection.username", "root")
				.setProperty("hibernate.connection.password", "")
				.setProperty("hibernate.show_sql", "true")
				.setProperty("hibernate.current_session_context_class",
						"thread").addAnnotatedClass(Cd.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.getCurrentSession();

		s.beginTransaction();

		EntityManager em = s.getEntityManagerFactory().createEntityManager();

		// PASO 1: Crear CriteriaBuilder y CriteriaQuery
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteria = builder.createQuery(Object[].class);

		// PASO 2: Configurar la clausula FROM
		Root<Cd> root = criteria.from(Cd.class);

		// PASO 3: Configurar la clausula SELECT
		Path<String> titulo = root.get("titulo");
		Path<Integer> anyo = root.get("anyo");
		
		//criteria.select(builder.array(titulo, anyo));
		criteria.multiselect(titulo, anyo);

		// PASO 4: Cofigurar los criterios o predicates
		Predicate tituloB = builder.like(root.get("titulo"), "%b%");

		// PASO 5: Configurar la clausula WHERE usando los predicates
		criteria.where(tituloB);

		// PASO 4 y 5 Juntos
		// criteria.where(builder.like(root.get("titulo"), "%b%"));

		// PASO 6: Ejecutar la Query
		List<Object[]> cds = em.createQuery(criteria).getResultList();

		s.getTransaction().commit();

		for (Object[] cd : cds) {
			System.out.println(cd[0]);
		}

	}
}
