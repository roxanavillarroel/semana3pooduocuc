package org.example.model;

import org.example.util.RutInvalidoException;

/**
 * Representa un RUT chileno válido (sin puntos y con guion).
 */

public class Rut {

    private String numero;

    public Rut(String numeroRUT) throws RutInvalidoException {

        if (!numeroRUT.matches("[0-9]+-[0-9kK]")){
            throw new RutInvalidoException("Formato de RUT no valido. Debe ingresar su Rut sin puntos y con guion.");
        }
        this.numero = numeroRUT.toUpperCase();
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
