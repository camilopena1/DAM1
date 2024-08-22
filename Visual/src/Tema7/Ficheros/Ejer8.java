package Tema7.Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;;

public class Ejer8 {
    public static void main(String[] args) {
        // Ejercicio 8 Implementa un programa que lea un documento de texto y muestre
        // por
        // pantalla algunos datos estadísticos: nº de líneas, nº de palabras, nº de
        // caracteres y cuál
        // es la palabra o palabras (si hay varias que se repitan el mismo número de
        // veces) más
        // común (y cuántas veces aparecen). Prueba el programa con los archivos de la
        // carpeta
        // ‘Libros’. (Se recomienda usar un HashMap para la cuenta de las palabras).
        // Se recomienda usar un iterador para recorrer el HashMap:
        // Por ejemplo; Iterator<Integer> valoresObj = t.values().iterator()
        // Nombre del archivo a procesar
        String nombreArchivo = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\Libros\\lazarillo.txt";

        // Llamada al método para procesar el archivo y mostrar estadísticas
        procesarArchivo(nombreArchivo);
    }

    public static void procesarArchivo(String nombreArchivo) {
        // Inicializar contadores
        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;

        // HashMap para almacenar palabras y su frecuencia
        HashMap<String, Integer> conteoPalabras = new HashMap<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Leer el archivo línea por línea
            while ((linea = lector.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length();

                // Dividir la línea en palabras y contarlas
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    numPalabras++;

                    // Actualizar el conteo de la palabra en el HashMap
                    conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
                }
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        // Mostrar estadísticas
        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de caracteres: " + numCaracteres);

        // Encontrar la palabra más común y su frecuencia
        String palabraMasComun = "";
        int frecuenciaMaxima = 0;

        Iterator<Map.Entry<String, Integer>> iterator = conteoPalabras.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entrada = iterator.next();
            if (entrada.getValue() > frecuenciaMaxima) {
                palabraMasComun = entrada.getKey();
                frecuenciaMaxima = entrada.getValue();
            }
        }

        System.out.println("Palabra más común: " + palabraMasComun);
        System.out.println("Aparece " + frecuenciaMaxima + " veces.");
    }
}
