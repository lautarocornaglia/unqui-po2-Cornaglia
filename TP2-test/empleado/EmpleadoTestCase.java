package empleado;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTestCase {


    public EmpleadoTemporal empleadoTemporal;
    public EmpleadoPermanente empleadoPermanente;
    public EmpleadoContratado empleadoContratado;

    @BeforeEach
    void setUp() throws Exception{
        this.empleadoTemporal = new EmpleadoTemporal();
        this.empleadoPermanente = new EmpleadoPermanente();
        this.empleadoContratado = new EmpleadoContratado();


        this.empleadoTemporal.setSueldoBasico(900);
        this.empleadoTemporal.setCantDeHorasExtras(15);
        this.empleadoTemporal.setFechaDeNacimiento(LocalDate.parse("21/08/1997",this.empleadoTemporal.getFmt()));

        this.empleadoPermanente.setSueldoBasico(900);
        this.empleadoPermanente.setEstadoCivil("Casado");
        this.empleadoPermanente.setCantidadDeHijos(3);
        this.empleadoPermanente.setAntiguedad(0);

        this.empleadoContratado.setSueldoBasico(1000);
    }


    @Test

    public void testCalcularEdad() {
        assertEquals(23,this.empleadoTemporal.calcularEdad());


    }

    @Test

    public void testCobroDeHorasExtras() {
        assertEquals(600,this.empleadoTemporal.cobroDeHorasExtras());
    }

    @Test

    public void testCalcularSueldoBrutoEmpleadoTemporal() {
        assertEquals(1500,this.empleadoTemporal.calcularSueldoBruto() );

    }

    @Test

    public void testCalcularRetencionesEmpleadoTemporal() {
        assertEquals(375,this.empleadoTemporal.calcularRetenciones() );

    }

    @Test

    public void testCalcularSueldoNetoEmpleadoTemporal() {
        assertEquals(1125,this.empleadoTemporal.calcularSueldoNeto());

    }

    @Test

    public void testCalcularSueldoBrutoEmpleadoPermanente() {
        assertEquals( 1450,this.empleadoPermanente.calcularSueldoBruto());

    }

    @Test

    public void testCaclcularRetencionesEmpleadoPermanente() {
    	assertEquals(422.5,this.empleadoPermanente.calcularRetenciones());
    }
    
    @Test
    
    public void testCalculcarSueldoNetoEmpleadoPermanente() {
    	assertEquals(1027.5,this.empleadoPermanente.calcularSueldoNeto());
    }
    
    @Test
    
    public void testCalcularSueldoBrutoEmpleadoContratado() {
    	assertEquals(1000, this.empleadoContratado.calcularSueldoBruto());
    }
    
    @Test
    
    public void testCalcularRetencionesEmpleadoContratado() {
    	assertEquals(50, this.empleadoContratado.calcularRetenciones());
    }
    
    @Test
    
    public void testCalcularSueldoNetoEmpleadoContratado() {
    	assertEquals(950, this.empleadoContratado.calcularSueldoNeto());
    }
}