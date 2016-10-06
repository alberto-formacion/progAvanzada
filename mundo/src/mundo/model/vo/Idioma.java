package mundo.model.vo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import mundo.model.vo.ids.IdiomaId;

@Entity
@Table(name="countryLanguage")
public class Idioma {

	@EmbeddedId
	private IdiomaId id;
	
	@Column(name="isOfficial")
	private Character oficial;
	
	@Column(name="percentage")
	private Float porcentage;

	public IdiomaId getId() {
		return id;
	}

	public void setId(IdiomaId id) {
		this.id = id;
	}

	public Character getOficial() {
		return oficial;
	}

	public void setOficial(Character oficial) {
		this.oficial = oficial;
	}

	public Float getPorcentage() {
		return porcentage;
	}

	public void setPorcentage(Float porcentage) {
		this.porcentage = porcentage;
	}
	
	
}
