package org.example.model;

/**
 * Representa una dirección con calle, número, comuna, ciudad, región y país.
 * Se utiliza para persona y empresa
 */

public class Direccion {

    private String calle;
    private String numero;
    private String comuna;
    private String ciudad;
    private String region;
    private String pais;

    public Direccion(String calle, String numero, String comuna, String ciudad, String region, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    public String getCalle() {return calle;}
    public String getNumero() {return numero;}
    public String getComuna() {return comuna;}
    public String getCiudad() {return ciudad;}
    public String getRegion() {return region;}
    public String getPais() {return pais;}

    @Override
    public String toString() {
        return  calle + ", " + numero + ", " +
                comuna + ", " +
                ciudad + ", " +
                region + ", " +
                pais;
    }
}
