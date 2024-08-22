package Tema7.Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer2 {
    public static void main(String[] args) {
        // Nombre del archivo que contiene los números primos
        String nombreArchivo = "E:\\DAM1\\Programacion\\Visual\\hola.txt";

        try {
            // Crear un FileReader para leer el archivo
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            // Leer y mostrar los números primos uno por uno
            String linea;
            System.out.println("Números primos leídos del archivo '" + nombreArchivo + "':");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar el archivo después de leer
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    }

