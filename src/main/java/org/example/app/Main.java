package org.example.app;

import org.example.model.*;
import org.example.util.RutInvalidoException;

/**
 * Clase principal
 * Muestra la información de la empresa y de sus empleados
 * @author Roxana Villarroel
 */

public class Main {
    public static void main(String[] args) {
        try {
            Direccion dirEmpresa = new Direccion("Av. Mackenna",
                    "#178",
                    "Chinquihue",
                    "Puerto Montt",
                    "Los Lagos",
                    "Chile");

            Rut rutEmpresa = new Rut("786784999-1");
            Empresa salmontt = new Empresa("SALMONTT",
                    rutEmpresa,
                    dirEmpresa);

            System.out.println("===========================================");
            System.out.println("   SISTEMA DE REGISTRO - EMPRESA SALMONTT  ");
            System.out.println("===========================================");

            System.out.println();
            System.out.println(" - EMPRESA SALMONERA");
            System.out.println(" Nombre: " + salmontt.getNombreEmpresa());
            System.out.println(" Rut: " + salmontt.getRut());
            System.out.println(" Direccion: " + salmontt.getDireccion().getCalle() + " " +
                    salmontt.getDireccion().getNumero() + ", " +
                    salmontt.getDireccion().getCiudad() + ", " +
                    salmontt.getDireccion().getComuna() + ", " +
                    salmontt.getDireccion().getRegion() + ", " +
                    salmontt.getDireccion().getPais());
            System.out.println();

            Direccion dirEmpleado = new Direccion("Matico",
                    "#198",
                    "Alerce",
                    "Puerto Montt",
                    "Los Lagos",
                    "Chile");
            Rut rutEmpleado = new Rut("20256949-8");

            Empleado empleado1 = new Empleado(
                    "Jose Villarroel",
                    "jmvg@salmontt.cl",
                    "+569 67894300",
                    dirEmpleado,
                    rutEmpleado,
                    "2024-06-11",
                    "Produccion");

            System.out.println(" - EMPLEADOR ");
            System.out.println(" Nombre: " + empleado1.getNombre());
            System.out.println(" Email: " + empleado1.getEmail());
            System.out.println(" Teléfono: " + empleado1.getTelefono());
            System.out.println(" RUT: " + empleado1.getRut());
            System.out.println(" Fecha de ingreso: " + empleado1.getFechaIngreso());
            System.out.println(" Dirección: " + empleado1.getDireccion().getCalle() + " " +
                    empleado1.getDireccion().getNumero() + ", " +
                    empleado1.getDireccion().getCiudad() + ", " +
                    empleado1.getDireccion().getComuna() + ", " +
                    empleado1.getDireccion().getRegion() + ", " +
                    empleado1.getDireccion().getPais());
            System.out.println(" Area de trabajo: " + empleado1.getAreaTrabajador());

            System.out.println();

            System.out.println(" " + empleado1.getNombre() + " trabaja en " +
                    salmontt.getNombreEmpresa() + " ubicada en " +
                    salmontt.getDireccion().getCiudad() + ", " +
                    salmontt.getDireccion().getRegion() + ", " +
                    salmontt.getDireccion().getPais());

        }catch (RutInvalidoException e) {
            System.out.println("Error en RUT: " + e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println(" Error al crear datos: " + e.getMessage());

        }
    }
}