package Point;

public class Point {
	
	int x;
	int y;
	float alto;
	float largo;
	

	public Point(int x, int y) {
		setX(x);
		setY(y);
		this.largo = 0;
		this.alto = 0;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void moverPuntos(int x1, int y1) {
		this.setX(x1);
		this.setY(y1);
	}

	public void sumarPunto(Point puntoDeSuma) {
		this.setX(x + puntoDeSuma.getX());
		this.setY(y + puntoDeSuma.getY());
	}
}
