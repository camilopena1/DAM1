package Tema7.Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer1 {
public static void main(String[] args) {
    // Nombre del archivo donde se guardarán los números primos
        String nombreArchivo = "src\\hola.txt";
        try {
            // Crear un FileWriter para escribir en el archivo
            FileWriter archivo = new FileWriter(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            // Iterar a través de los números del 1 al 500
            for (int numero = 1; numero <= 500; numero++) {
                // Verificar si el número es primo
                if (esPrimo(numero)) {
                    // Escribir el número primo en el archivo
                    escritor.println(numero);
                }
            }

            // Cerrar el archivo después de escribir
            escritor.close();
            System.out.println("Los números primos se han guardado en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

   // E:\DAM1\Programacion\Visual
}
public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
}
