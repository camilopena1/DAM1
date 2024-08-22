package Tema7.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce una ruta del sistema de archivos (ruta vacía para salir): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Saliendo del programa...");
                break;
            }

            try {
                File ruta = new File(input);
                muestraInfoRuta(ruta);
            } catch (FileNotFoundException e) {
                System.out.println("La ruta especificada no existe.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta especificada no existe.");
        }

        if (ruta.isFile()) {
            System.out.println("[A] " + ruta.getName() + " - Tamaño: " + ruta.length()
                    + " bytes - Última modificación: " + obtenerFechaFormateada(ruta.lastModified()));
        } else {
            System.out.println("[*] " + ruta.getName() + " (directorio)");
            File[] archivos = ruta.listFiles();
            Arrays.sort(archivos, Comparator.comparing(File::getName));
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("[*] " + archivo.getName() + " - Tamaño: " + archivo.length()
                            + " bytes - Última modificación: " + obtenerFechaFormateada(archivo.lastModified()));
                } else {
                    System.out.println("[A] " + archivo.getName() + " - Tamaño: " + archivo.length()
                            + " bytes - Última modificación: " + obtenerFechaFormateada(archivo.lastModified()));
                }
            }
        }
    }

    public static String obtenerFechaFormateada(long milisegundos) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatoFecha.format(milisegundos);
    }
}
