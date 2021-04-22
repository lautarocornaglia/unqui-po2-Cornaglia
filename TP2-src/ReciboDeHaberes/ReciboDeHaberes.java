package ReciboDeHaberes;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	String nombreDeEmpleado;
	String direccion;
	float sueldoNeto;
	float sueldoBruto;
	LocalDate fechaDeEmision;

	public ReciboDeHaberes(String nombreDeEmpleado, String direccion, float sueldoNeto, float sueldoBruto,LocalDate fechaDeEmision) {
		this.nombreDeEmpleado = "Undefined post";
		this.direccion = "Undefined post";
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = 0;
		this.sueldoNeto = 0;
	}

}
