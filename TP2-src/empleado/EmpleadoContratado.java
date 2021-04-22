package empleado;

public class EmpleadoContratado extends Empleado{

	private int numeroContrato;
	private String medioDePago;
	
	public EmpleadoContratado() {
		this.numeroContrato = 0;
		this.medioDePago = "Undefined post";
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public float calcularSueldoBruto() {
		float sueldoBruto = this.getSueldoBasico();
		return sueldoBruto;
	}

	public float calcularRetenciones() {
		return 50;
	}

	public float calcularSueldoNeto() {
		float sueldoNeto = this.calcularSueldoBruto() - this.calcularRetenciones();
		return sueldoNeto;
	}

	
}
