package ar.edu.unq.po2.prueba;

public class Punto {
	
	private float x;
	private float y;
	
	private void setXY(float x, float y) {
		this.setX(x);
		this.setX(y);

	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public Punto(float x, float y) {
		super();
		this.setXY(x, y);
	}
	
	
}
