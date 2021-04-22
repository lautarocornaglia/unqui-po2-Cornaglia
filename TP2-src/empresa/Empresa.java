package empresa;

import java.util.ArrayList;

import ReciboDeHaberes.ReciboDeHaberes;
import empleado.Empleado;

public class Empresa {
	
	String nombre;
	int CUIT;
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
	
}

