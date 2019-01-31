package Biblioteca;

public class Ejemplar {
	
	private String codigo;
	private String titulo;
	private int a�o;
	
	public Ejemplar(String codigo, String titulo, int a�o) {	
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�o = a�o;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getA�o() {
		return a�o;
	}

	@Override
	public String toString() {
		return "Ejemplar [codigo=" + codigo + ", titulo=" + titulo + ", a�o=" + a�o + "]";
	}
	
	
	
}
