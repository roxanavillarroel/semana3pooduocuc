package org.example.model;

import java.util.Objects;

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

    public Direccion(){ }
    public String getCalle() {return calle;}
    public void setCalle(String calle) {this.calle = calle;}

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getComuna() {return comuna;}
    public void setComuna(String comuna) {this.comuna = comuna;}

    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public String getRegion() {return region;}
    public void setRegion(String region) {this.region = region;}

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", comuna='" + comuna + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
