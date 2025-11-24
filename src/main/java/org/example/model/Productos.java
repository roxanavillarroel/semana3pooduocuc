package org.example.model;

public class Productos {

    private String codigo;
    private String nombre;
    private String tipoSalmon;
    private double precio;
    private String mercadoDestino;


    public Productos(String codigo, String nombre, String tipoSalmon, double precio, String mercadoDestino) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoSalmon = tipoSalmon;
        this.precio = precio;
        this.mercadoDestino = mercadoDestino;
    }

    public String getCodigo() {return codigo; }
    public String getNombre() {return nombre; }
    public String getTipoSalmon() { return tipoSalmon; }
    public double getPrecio() { return precio; }
    public String getMercadoDestino() { return mercadoDestino; }

    @Override
    public String toString() {
        return codigo + " | "  + nombre + " | " + tipoSalmon + " | $ " + precio + " | " + mercadoDestino;
    }
}
