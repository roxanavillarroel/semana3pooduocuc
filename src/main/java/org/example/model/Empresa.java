package org.example.model;

/**
 * Representa la empresa SALMONTT con nombre, RUT y dirección.
 * Contiene la información general de la organización.
 */

public class Empresa {

    private String nombreEmpresa;
    private Rut rut;
    private Direccion direccion;

    public Empresa(String nombreEmpresa, Rut rut, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.rut = rut;
        this.direccion = direccion;
    }

    public Empresa() {}

    public String getNombreEmpresa() {return nombreEmpresa;}
    public void setNombreEmpresa(String nombreEmpresa) {this.nombreEmpresa = nombreEmpresa;}

    public Rut getRut() {return rut;}
    public void setRut(Rut rut) {this.rut = rut;}

    public Direccion getDireccion() {return direccion;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", rut=" + rut +
                ", direccion=" + direccion +
                '}';
    }
}
