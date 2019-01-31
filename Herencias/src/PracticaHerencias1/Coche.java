package PracticaHerencias1;

import java.awt.Color;

public class Coche extends Vehiculo {
	
	int numeroRuedas;

	public Coche(double velocidad, Color color, double direccion, int numeroRuedar) {
		super(velocidad, color, direccion);
		this.numeroRuedas = numeroRuedas;
		
	}
	
	public Coche(int numeroRuedas) {
		super(100, Color.BLACK, 90);
		this.numeroRuedas=numeroRuedas;
	}
	
	public Coche () {
		super(100, Color.blue, 90);
		this.numeroRuedas=numeroRuedas;
	}
	
	public Coche(double velocidad, Color color, double direccion) {
		super(velocidad, color, direccion);
		this.numeroRuedas=4;
	}
	
	public void tocarClaxon() {
		System.out.println("Estoy tocando el claxon (tocando el pito)");
		
	}
	
	@Override
	public void mover() {
		System.out.println("girando las hélices");
	}
	
	

}
