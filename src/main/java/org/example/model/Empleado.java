package org.example.model;

/**
 * Representa a un empleado de la empresa
 * Hereda de Persona e incluye RUT, fecha de ingreso y área de trabajo
 *
 */

public class Empleado extends Persona{

    private Rut rut;
    private String fechaIngreso;
    private String areaTrabajador;

    public Empleado(String nombre, String email, String telefono, Direccion direccion, Rut rut, String fechaIngreso, String areaTrabajador) {
        super(nombre, email, telefono, direccion);
        this.rut = rut;
        this.fechaIngreso = fechaIngreso;
        this.areaTrabajador = areaTrabajador;
    }

    public Rut getRut() {return rut;}
    public void setRut(Rut rut) {this.rut = rut;}

    public String getFechaIngreso() {return fechaIngreso;}
    public void setFechaIngreso(String fechaIngreso) {this.fechaIngreso = fechaIngreso;}

    public String getAreaTrabajador() {return areaTrabajador;}
    public void setAreaTrabajador (String areaTrabajador) {this.areaTrabajador = areaTrabajador;}

    @Override
    public String toString() {

        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", direccion=" + getDireccion() +
                ", rut=" + rut +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", areaTrabajador='" + areaTrabajador + '\'' +
                '}';
    }
}
