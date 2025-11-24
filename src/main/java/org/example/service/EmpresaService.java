package org.example.service;

import org.example.model.*;
import org.example.util.LectorArchivo;
import org.example.util.RutInvalidoException;

public class EmpresaService {

    private Empresa empresa;

    public EmpresaService(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {return empresa;}

    public void cargaEmpleado(String recurso){
        for (String[] fila : LectorArchivo.leerCSV(recurso)){
            try{
                if (fila.length < 12){
                    throw new IllegalArgumentException("Fila de empleados no esta completa");
                }
                Direccion dir = new Direccion(
                        fila[3], fila[4], fila[5], fila[6], fila[7], fila[8]);

                Rut rut = new Rut(fila[9]);

                Empleado e =  new Empleado(
                        fila[0], rut, fila[1], fila[2], dir, fila[10], fila[11]);

                empresa.agregarEmpleado(e);

            }catch (RutInvalidoException | IllegalArgumentException ex){
                System.out.println("Error de carga en empleado: " + ex.getMessage());
            }
        }
    }

    public void cargarProductos(String recurso){
        for (String[] fila : LectorArchivo.leerCSV(recurso)){
            try{
                if (fila.length < 5){
                    throw new IllegalArgumentException("Fila de productos no esta completa");
                }
                Double precio = Double.parseDouble(fila[3]);
                Productos p = new Productos(
                        fila[0], fila[1], fila[2], precio, fila[4]);
                empresa.agregarProductos(p);

            }catch (IllegalArgumentException ex){
                System.out.println("Error de carga en productos: " + ex.getMessage());
            }
        }
    }
}
