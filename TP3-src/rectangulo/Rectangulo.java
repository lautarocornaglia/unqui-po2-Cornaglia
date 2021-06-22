package rectangulo;

import Point.Point;

public class Rectangulo {
	
	Point punto;
	Integer altura;
	Integer largo;
	Point puntoEspejo;
	
	
	public Point getPunto() {
		return punto;
	}

	public void setPunto(Point punto) {
		this.punto = punto;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getLargo() {
		return largo;
	}

	public void setLargo(Integer largo) {
		this.largo = largo;
	}

	public Point getPuntoEspejo() {
		return puntoEspejo;
	}

	public void setPuntoEspejo(Point puntoEspejo) {
		this.puntoEspejo = puntoEspejo;
	}

	public Rectangulo(Point punto , Integer largo ,Integer altura) {
		this.setPunto(punto);
		this.setAltura(altura);
		this.setLargo(largo);
		this.puntoEspejo = new Point(this.punto.getX()+this.getLargo(),this.punto.getY()+this.getAltura() );
		
	}

	public Integer obtenerArea() {
		return this.getAltura()*this.getLargo();
	}

	public Integer obtenerPerimetro() {
		Integer x = 2 * (this.getAltura()+this.getLargo());
		return x;
	}

	public String formaDelRectangulo() {
		
		String forma;
		
		if(this.getAltura()>this.getLargo()) {
			forma = "Es vertical";
		}else {
			forma = "Es horizontal";
		}
		
		return forma;
	}

}
