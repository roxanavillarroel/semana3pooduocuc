package org.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la empresa SALMONTT con nombre, RUT y dirección.
 * Contiene la información general de la organización.
 */

public class Empresa {

    private String nombreEmpresa;
    private Rut rut;
    private Direccion direccion;

    private List<Empleado> empleados = new ArrayList<>();
    private List<Productos> productos = new ArrayList<>();

    public Empresa(String nombreEmpresa, Rut rut, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.rut = rut;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado e) {empleados.add(e);}
    public void agregarProductos(Productos p) {productos.add(p);}

    public List<Empleado> getEmpleados() {return empleados;}
    public List<Productos> getProductos() {return productos;}

    public String getNombreEmpresa() {return nombreEmpresa;}
    public  Rut getRut() {return rut;}
    public Direccion getDireccion() {return direccion;}

}
