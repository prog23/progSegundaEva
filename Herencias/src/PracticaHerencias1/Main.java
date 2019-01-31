package PracticaHerencias1;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		
		Coche citroen= new Coche (100, Color.RED, 90, 3);
		citroen.mover();
		Vehiculo v = citroen;
		v.mover();

	}

}
