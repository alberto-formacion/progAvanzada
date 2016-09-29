package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer nAlumno;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String telefono;

	public Integer getnAlumno() {
		return nAlumno;
	}

	public void setnAlumno(Integer nAlumno) {
		this.nAlumno = nAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
