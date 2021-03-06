package empleado;

public class EmpleadoPermanente extends Empleado{

	private int cantidadDeHijos;
	private int antiguedad;

    public EmpleadoPermanente() {
        this.cantidadDeHijos = 0;
        this.antiguedad = 0;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float calcularSueldoBruto() {
        float sueldoBruto = this.getSueldoBasico() + this.salarioFamiliar() + (50 * this.getAntiguedad());
        return sueldoBruto;
    }

    private float salarioFamiliar() {

        float cobroFamiliar= 0;
        if (this.getEstadoCivil() == "Casado") {
            cobroFamiliar = this.getCantidadDeHijos() * 150 + 100;
        }else {
            cobroFamiliar = this.getCantidadDeHijos() * 150;
        }

        return cobroFamiliar;
    }

	public float calcularRetenciones() {
		float retenciones =(float) ((0.10 * this.calcularSueldoBruto()) + (20 * this.getCantidadDeHijos()) + (0.15 * this.calcularSueldoBruto()));
		return retenciones;
	}

	public float calcularSueldoNeto() {
		float sueldoNeto = this.calcularSueldoBruto() - this.calcularRetenciones();
		return sueldoNeto;
	}



}
