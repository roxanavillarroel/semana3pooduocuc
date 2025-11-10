package org.example.util;

/**
 * Excepción para cuando el formato del RUT no es válido.
 */

public class RutInvalidoException extends Exception{
    public RutInvalidoException(String message) {
        super(message);
    }
}
