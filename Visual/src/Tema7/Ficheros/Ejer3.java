package Tema7.Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer3 {
    public static void main(String[] args) {
        String nombreArchivo = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\numeros.txt";

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String numero = lector.readLine();
            int numeroMenor=10000000;
            int numeroMayor = 0;
            while (numero != null) {
                int numeroConvertido = Integer.parseInt(numero);
                if (numeroConvertido > numeroMayor) {
                    numeroMayor = numeroConvertido;
                }
                if (numeroConvertido < numeroMenor) {
                    numeroMenor = numeroConvertido;
                }
                numero = lector.readLine();
            }
            System.out.println("El numero menor es " + numeroMenor);
            System.out.println("El numero mayor es " + numeroMayor);
            lector.close();
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }
}
