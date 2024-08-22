package Tema7.Ficheros;

import java.io.*;
import java.util.*;

public class Ejer4 {
    public static void main(String[] args) {

        System.out.println("Pon la ruta del archivo para su lectura");
        // E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\usa_personas.txt
        String archivoA = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\usa_personas.txt";
        System.out.println("pon la ruta del archivo de escritura");
        String archivoB = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\usa_personas_sort.txt";
        try {
            //creamos el lector del archivo con su ruta y una lista para poder ordenar de manera mas facil
            BufferedReader lector = new BufferedReader(new FileReader(archivoA));
            List<String> lineas = new ArrayList<>();
            String linea;
            // recorremos el archivo si es diferente de null y lo introducimos en la lista
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
            lector.close();
            //ordenamos la lista
            Collections.sort(lineas);
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoB));
            
            for (String lineaOrdenada : lineas) {
                escritor.write(lineaOrdenada);
                escritor.newLine();
            }
            escritor.close();
            System.out.println("Se ha escrito correctamente");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
