package Biblioteca;

public class Revista extends Ejemplar {
	private int numero;
	
	public Revista(String codigo, String titulo, int a�o, int numero) {
		super(codigo, titulo, a�o);
		this.numero = numero;
		
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return super.toString() + " Revista [numero=" + numero + "]";
	}
	
	

}
