package org.example.app;

import org.example.model.*;
import org.example.service.EmpresaService;
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
            Empresa empresa = new Empresa("SALMONTT", rutEmpresa, dirEmpresa);
            EmpresaService empresaService = new EmpresaService(empresa);

            empresaService.cargaEmpleado("data/empleados.csv");
            empresaService.cargarProductos("data/productos.csv");

            System.out.println("===========================================");
            System.out.println("   SISTEMA DE REGISTRO - EMPRESA SALMONTT  ");
            System.out.println("===========================================");

            System.out.println();
            System.out.println(" - EMPRESA SALMONERA");
            System.out.println(" Nombre: " + empresa.getNombreEmpresa());
            System.out.println(" Rut: " + empresa.getRut());
            System.out.println(" Direccion: " + empresa.getDireccion());
            System.out.println();

           System.out.println("EMPLEADOS DESTACADOS DEL MES | NOVIEMBRE 2025: ");
           for (Empleado emp : empresa.getEmpleados()) {
               System.out.println("- " + emp.getNombre() + " | " + emp.getAreaTrabajador() + " | " + emp.getRut());
           }
           System.out.println();

            System.out.println("PRODUCTOS DISPONIBLES: ");
            for (Productos p : empresa.getProductos()){
                System.out.println(" - " + p);
            }
        }catch (RutInvalidoException e) {
            System.out.println("Error en RUT: " + e.getMessage());
        }
    }
}