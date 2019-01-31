package Biblioteca;

public class Ejemplar {
	
	private String codigo;
	private String titulo;
	private int año;
	
	public Ejemplar(String codigo, String titulo, int año) {	
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	@Override
	public String toString() {
		return "Ejemplar [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	
	
}
