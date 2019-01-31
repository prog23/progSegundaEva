package Juego;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Lienzo extends JPanel {

	private Dimension d;
	private Thread t;
	private Juego juego;
	
	public Lienzo(int w, int h) {
		d = new Dimension(w, h);		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return d;
	}
	
	public void iniciarAnimacion() {
		t = new Thread(new Runnable() {   //clase anonima imprementando una interfaz funcional landa
			@Override
			public void run() {
				long t0 = System.nanoTime(), t1, t;
				while(true) {
					t1 = System.nanoTime();
					t = t1 - t0;
					t0 = t1;
					juego.Siguiente(t);
					repaint();
				}
			}
		});
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		juego.render(g);
	}
}
