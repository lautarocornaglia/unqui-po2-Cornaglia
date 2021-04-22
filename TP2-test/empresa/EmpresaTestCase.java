package empresa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import empleado.EmpleadoContratado;
import empleado.EmpleadoPermanente;
import empleado.EmpleadoTemporal;

class EmpresaTestCase {

	private Empresa empresa;
	private EmpleadoTemporal empleadoTemporal;
	private EmpleadoPermanente empleadoPermanente;
	private EmpleadoContratado empleadoContratado;
	
	@BeforeEach
	
	void SetUp() throws Exception{
		this.empresa = new Empresa();
		this.empleadoContratado = new EmpleadoContratado();
		this.empleadoPermanente = new EmpleadoPermanente();
		this.empleadoTemporal = new EmpleadoTemporal();
		
		this.empresa.listaDeEmpleados.add(empleadoContratado);
		this.empresa.listaDeEmpleados.add(empleadoPermanente);
		this.empresa.listaDeEmpleados.add(empleadoTemporal);
		
		this.empleadoTemporal.setSueldoBasico(1100);
        this.empleadoTemporal.setCantDeHorasExtras(10);
        this.empleadoTemporal.setFechaDeNacimiento(LocalDate.parse("04/06/1998",this.empleadoTemporal.getFmt()));

        this.empleadoPermanente.setSueldoBasico(1000);
        this.empleadoPermanente.setEstadoCivil("Casado");
        this.empleadoPermanente.setCantidadDeHijos(2);
        this.empleadoPermanente.setAntiguedad(0);

        this.empleadoContratado.setSueldoBasico(1000);
        
        this.empresa.liquidacionDeSueldos(); 
	}
 	
	@Test
	
	public void testCalcularMontoTotalDeRetenciones() {
    	assertEquals(790, this.empresa.montoTotalDeRetenciones());
    }
	
	@Test
	
	public void testCalcularMontoTotalDeSueldoNeto() {
    	assertEquals(3110, this.empresa.montoTotalDeSueldoNeto());
    }
	
	@Test

	public void testCalcularMontoTotalDeSueldoBruto() {
		assertEquals(3900, this.empresa.montoTotalDeSueldoBruto());
	}
	
	@Test
	
	public void testLiquidacionesDeHaberes() {
		assertEquals(this.empresa.listaDeEmpleados.size(),this.empresa.listaDeReciboDeSueldos.size());
	}
}
