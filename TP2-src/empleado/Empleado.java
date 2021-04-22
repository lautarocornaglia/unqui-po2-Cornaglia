package empleado;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Empleado {

    String nombre;
    String direccion;
    String estadoCivil;
    LocalDate fechaDeNacimiento;
    float sueldoBasico;

    public Empleado() {
        this.nombre="Undefined post";
        this.direccion="Undefined post";
        this.estadoCivil="Undefined post";
        this.fechaDeNacimiento= LocalDate.now();
        this.sueldoBasico=0;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public float getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int calcularEdad() {
        Period diff = Period.between(this.getFechaDeNacimiento(),LocalDate.now());
        return diff.getYears();
    }

    public DateTimeFormatter getFmt() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fmt;
    }
    
    
    public abstract float calcularSueldoNeto();
    public abstract float calcularRetenciones();
    public abstract float calcularSueldoBruto();
    
}
