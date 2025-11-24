package org.example.model;

/**
 * Representa a un empleado de la empresa
 * Hereda de Persona e incluye RUT, fecha de ingreso y área de trabajo
 *
 */

public class Empleado extends Persona{

    private String fechaIngreso;
    private String areaTrabajador;

    public Empleado(String nombre, Rut rut, String email, String telefono, Direccion direccion, String fechaIngreso, String areaTrabajador) {
        super(nombre, rut, email, telefono, direccion);

        this.fechaIngreso = fechaIngreso;
        this.areaTrabajador = areaTrabajador;
    }
    public String getFechaIngreso() {return fechaIngreso;}
    public String getAreaTrabajador() {return areaTrabajador;}

    @Override
    public String toString() {

        return "Empleado{" +
                "nombre = " + getNombre() + '\'' +
                ", rut = "  + getRut() +
                ", email = " + getEmail() + '\'' +
                ", telefono = " + getTelefono() + '\'' +
                ", direccion = " + getDireccion() +
                ", fechaIngreso = " + fechaIngreso + '\'' +
                ", areaTrabajador = " + areaTrabajador + '\'' +
                '}';
    }
}
