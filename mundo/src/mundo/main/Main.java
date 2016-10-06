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

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		Criteria c = s.createCriteria(Pais.class);
		
		c.setFetchMode("ciudades", FetchMode.JOIN);
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
		}

	}

}
