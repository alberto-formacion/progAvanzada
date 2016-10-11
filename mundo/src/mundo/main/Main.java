package mundo.main;

import java.util.List;

import mundo.model.vo.Ciudad;
import mundo.model.vo.Idioma;
import mundo.model.vo.Pais;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		Criteria c = s.createCriteria(Pais.class);
		
		//c.createAlias("ciudades", "c");
		
		//c.add(Restrictions.gt("c.populacion", 4000000));
		
		//c.createCriteria("ciudades").add(Restrictions.gt("populacion", 4000000));
		
		c.add(
				Restrictions.or(
						Restrictions.eq("continente", "Europe"), 
						Restrictions.eq("continente", "Asia")));
		
		c.setFirstResult(0);
		c.setMaxResults(10);
		
		List<Pais> paises = c.list();
		
		for(Pais p : paises){
			System.out.println(p.getNombre());
		}
		
		s.getTransaction().commit();
		
		/*c.setFetchMode("ciudades", FetchMode.JOIN);
		c.setFetchMode("idiomas", FetchMode.JOIN);
		
		List<Pais> paises = c.list();
		
		System.out.println(paises.get(0).getCapital().getNombre());
		
		s.getTransaction().commit();
		
		for(Pais p : paises){
			System.out.println("El pais " + p.getNombre() + " tiene estas ciudades:");
			for(Ciudad ciudad : p.getCiudades()){
				System.out.println(ciudad.getNombre());
			}
			
			System.out.println("Y se hablan estos idiomas");
			
			for(Idioma idioma : p.getIdiomas()){
				System.out.println(idioma.getId().getIdioma());
			}
		}*/

	}

}
