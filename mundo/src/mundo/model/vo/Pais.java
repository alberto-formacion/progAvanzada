package mundo.model.vo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Pais {
	
	@Id
	@Column(name="code")
	private String codigo;
	
	@Column(name="name")
	private String nombre;
	
	@Column(name="continent")
	private String continente;
	
	@Column(name="region")
	private String region;

	@Column(name="surfaceArea")
	private Float superficie;
	
	@Column(name="indepYear")
	private Integer anyoIndependencia;
	
	@Column(name="lifeExpectancy")
	private Float esperanzaVida;
	
	@Column(name="GNP")
	private Float GNP;
	
	@Column(name="GNPOld")
	private Float GNPOld;
	
	@Column(name="localname")
	private String nombreLocal;
	
	@Column(name="governmentForm")
	private String tipoGobierno;
	
	@Column(name="headOfState")
	private String cabezaEstado;
	
	@Column(name="code2")
	private String codigo2;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="capital")
	private Ciudad capital;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pais")
	private Set<Ciudad> ciudades;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.codigoPais")
	private Set<Idioma> idiomas;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Float superficie) {
		this.superficie = superficie;
	}

	public Integer getAnyoIndependencia() {
		return anyoIndependencia;
	}

	public void setAnyoIndependencia(Integer anyoIndependencia) {
		this.anyoIndependencia = anyoIndependencia;
	}

	public Float getEsperanzaVida() {
		return esperanzaVida;
	}

	public void setEsperanzaVida(Float esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	public Float getGNP() {
		return GNP;
	}

	public void setGNP(Float gNP) {
		GNP = gNP;
	}

	public Float getGNPOld() {
		return GNPOld;
	}

	public void setGNPOld(Float gNPOld) {
		GNPOld = gNPOld;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getTipoGobierno() {
		return tipoGobierno;
	}

	public void setTipoGobierno(String tipoGobierno) {
		this.tipoGobierno = tipoGobierno;
	}

	public String getCabezaEstado() {
		return cabezaEstado;
	}

	public void setCabezaEstado(String cabezaEstado) {
		this.cabezaEstado = cabezaEstado;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}

	public Ciudad getCapital() {
		return capital;
	}

	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public Set<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Set<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	
	
}
