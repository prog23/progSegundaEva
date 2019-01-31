package PracticaHerencias1;

import java.awt.Color;

public class Vehiculo {

	private double velocidad;
	private Color color;
	private double direccion;
	
	public Vehiculo(double velocidad, Color color, double direccion) {
		this.velocidad=velocidad;
		this.color=color;
		this.direccion=direccion;
	}
	
	public void mover() {
		System.out.println("Me estoy moviendo");
	}
}
