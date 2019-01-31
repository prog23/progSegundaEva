package JuegoPelota;

public class Pelota {
	private float vx;
	private float vy;
	private float x;
	private float y;
	private int diametro;
	
	public Pelota (int radio, float x, float d, float v) {
		this.x = x - radio;
		this.y = y - radio;
		vx = v * (float) Math.cos(d);
		vy = v * (float) Math.sin (d);
	}
}