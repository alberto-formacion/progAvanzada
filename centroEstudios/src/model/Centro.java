package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="centros")
public class Centro {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer nCentro;
	
	@Column
	private String nombreCentro;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="centro")
	//@JoinColumn(name="centros_id")
	private Set<Alumno> alumnos;


	public Integer getnCentro() {
		return nCentro;
	}


	public void setnCentro(Integer nCentro) {
		this.nCentro = nCentro;
	}


	public String getNombreCentro() {
		return nombreCentro;
	}


	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}


	public Set<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
