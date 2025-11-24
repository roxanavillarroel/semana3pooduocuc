package org.example.model;

/**
 * Representa a una persona con su nombre, email, teléfono y dirección.
 */
public class Persona {


    private String nombre;
    private Rut rut;
    private String email;
    private String telefono;
    private Direccion direccion;

    public Persona(String nombre, Rut rut,  String email, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {return nombre;}
    public Rut getRut() {return rut;}
    public String getEmail() {return email;}
    public String getTelefono() {return telefono;}
    public Direccion getDireccion() {return direccion;}

    @Override
    public String toString() {
        return "Persona{" +
                ", nombre = " + nombre + '\'' +
                ", rut = " + rut + '\'' +
                ", email = " + email + '\'' +
                ", telefono = " + telefono + '\'' +
                ", direccion = " + direccion +
                '}';
    }
}

