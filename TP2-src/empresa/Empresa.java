package empresa;

import java.time.LocalDate;
import java.util.ArrayList;

import ReciboDeHaberes.ReciboDeHaberes;
import empleado.Empleado;

public class Empresa {
	
	private String nombre;
	private int CUIT;
	ArrayList<ReciboDeHaberes> listaDeReciboDeSueldos;
	ArrayList<Empleado> listaDeEmpleados;
	
	public ArrayList<Empleado> getListaDeEmpleados() {
		return listaDeEmpleados;
	}


	public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}
	
	public Empresa() {
		this.nombre = "Undefine post";
		this.CUIT = 0;
		this.listaDeEmpleados = new ArrayList<Empleado>();
		this.listaDeReciboDeSueldos = new ArrayList<ReciboDeHaberes>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCUIT() {
		return CUIT;
	}


	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}


	public float calcularSueldoNetoTotal() {
		float sueldoNetoTotal = 3;
		return sueldoNetoTotal;
	}
	
	public float montoTotalDeRetenciones() {
        float totalDeRetenciones = 0;
        for(int i=0; i< this.listaDeEmpleados.size() ; i++) {
            totalDeRetenciones = totalDeRetenciones + this.listaDeEmpleados.get(i).calcularRetenciones();

        }
        return totalDeRetenciones;
    }


	public float montoTotalDeSueldoNeto() {
		float totalDeSueldoNeto = 0;
        for(int i=0; i< this.listaDeEmpleados.size() ; i++) {
        	totalDeSueldoNeto = totalDeSueldoNeto + this.listaDeEmpleados.get(i).calcularSueldoNeto();

        }
        return totalDeSueldoNeto;
	}


	public float montoTotalDeSueldoBruto() {
		float totalDeSueldoBruto = 0;
        for(int i=0; i< this.listaDeEmpleados.size() ; i++) {
        	totalDeSueldoBruto = totalDeSueldoBruto + this.listaDeEmpleados.get(i).calcularSueldoBruto();

        }
        return totalDeSueldoBruto;
	}
	
	public void liquidacionDeSueldos() {
		for (int i=0; i < this.listaDeEmpleados.size(); i++) {
			String nombreDeEmpleado = this.listaDeEmpleados.get(i).getNombre();
			String direccion = this.listaDeEmpleados.get(i).getDireccion();
			float sueldoNeto = this.listaDeEmpleados.get(i).calcularSueldoNeto();
			float sueldoBruto = this.listaDeEmpleados.get(i).calcularSueldoBruto();
			LocalDate fechaDeEmision = LocalDate.now();
			ReciboDeHaberes recibo = new ReciboDeHaberes(nombreDeEmpleado, direccion, sueldoNeto, sueldoBruto, fechaDeEmision);
			this.listaDeReciboDeSueldos.add(recibo);
		}
	}

	
}

