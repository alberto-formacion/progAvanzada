package main;

public class CdWrapper {
	private final String titulo;
	private final Integer anyo;

	public CdWrapper(String titulo, Integer anyo) {
		this.titulo = titulo;
		this.anyo = anyo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public Integer getAnyo() {
		return anyo;
	}
}
