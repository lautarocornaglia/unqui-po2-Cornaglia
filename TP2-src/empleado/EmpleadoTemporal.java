package empleado;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {

    LocalDate fechaDeFin;
    int cantDeHorasExtras;


    public EmpleadoTemporal() {
        this.fechaDeFin = LocalDate.now();
        this.cantDeHorasExtras = 0;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public int getCantDeHorasExtras() {
        return cantDeHorasExtras;
    }

    public void setCantDeHorasExtras(int cantDeHorasExtras) {
        this.cantDeHorasExtras = cantDeHorasExtras;
    }

    public Integer cobroDeHorasExtras() {
        int pagoDeHorasExtras = this.cantDeHorasExtras * 40;
        return pagoDeHorasExtras;
    }

    public float calcularSueldoBruto() {
        float sueldoBruto = this.sueldoBasico + this.cobroDeHorasExtras();
        return sueldoBruto;
    }

    public float calcularRetenciones() {
    	float retenciones = this.calcularRetencionesObraSocial() + this.calcularAportesJubilatorios();
        return retenciones;
    }

    private float calcularAportesJubilatorios() {
		float aporteJubilatorio = (float) ((0.10 * this.calcularSueldoBruto()) + (5 * this.getCantDeHorasExtras()));
		return aporteJubilatorio;
	}

	private float calcularRetencionesObraSocial() {
		float obraSocial = 0;
		if(this.calcularEdad()>50) {
			obraSocial = (float) (0.10 * this.calcularSueldoBruto() + 25);
		} else {
			obraSocial = (float) (0.10 * this.calcularSueldoBruto());
		}
		return obraSocial;
	}

	public float calcularSueldoNeto() {
        float sueldoNeto= this.calcularSueldoBruto() - this.calcularRetenciones();
        return sueldoNeto;
    }

}