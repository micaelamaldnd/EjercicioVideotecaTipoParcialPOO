package ar.com.unpaz.model;

public class Pelicula {
	
	private String codigo;
	private String titulo;
	private String genero;
	private int anioEstreno;
	private boolean disponible;
	
	public Pelicula() {}
	
	public Pelicula(String codigo, String titulo, String genero, int anioEstreno, boolean disponible) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.anioEstreno = anioEstreno;
		this.disponible = disponible;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "Pelicula [codigo = " + codigo + ", titulo = " + titulo + ", genero = " + genero + ", anioEstreno = "
				+ anioEstreno + ", disponible = " + disponible + "]" + "\n----------------------------------------------------------------------------------------------------";
	}

	
	

}
