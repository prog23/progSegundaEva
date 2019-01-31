package Juego;

import java.awt.Graphics;


public abstract class Juego {
	
	private Lienzo lienzo;
	
	public Juego(Lienzo lienzo) {
		this.lienzo = lienzo;
	}
	
	public Lienzo getLienzo() {
		return lienzo;
	}
	
	public abstract void Siguiente(long ns);
		
	public abstract void render(Graphics g);
	
}
