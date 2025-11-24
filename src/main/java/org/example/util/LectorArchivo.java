package org.example.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {

    public static List<String []> leerCSV(String recurso){
        List<String []> lineas = new ArrayList<>();

        try{
            ClassLoader loader = LectorArchivo.class.getClassLoader();
            InputStream is = loader.getResourceAsStream(recurso);

            if(is == null){
                System.out.println("No se encontro el archivo "+recurso);
                return lineas;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))){
                String linea;

                while ((linea = br.readLine()) != null){
                    if(!linea.trim().isEmpty()){
                        lineas.add(linea.split(";"));
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Error al leer el archivo "+ e.getMessage());
        }
        return lineas;
    }
}
