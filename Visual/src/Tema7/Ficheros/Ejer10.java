package Tema7.Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer10 {
    public static void main(String[] args) {
        String archivoEntrada = "E:\\+--DAM1\\Programacion\\Visual\\src\\Tema7\\Ficheros\\Ejer10.java";
        String archivoSalida = "E:\\DAM1\\Programacion\\Visual\\src\\Tema7\\Ficheros\\Ejer11.java";
        /*
         * hola
         */
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            boolean dentroDeComentario = false;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (!dentroDeComentario) {
                    int indiceInicioComentario = linea.indexOf("/*");
                    int indiceFinComentario = linea.indexOf("*/");

                    if (indiceInicioComentario != -1) {
                        dentroDeComentario = true;
                        if (indiceFinComentario != -1) {
                            linea = linea.substring(0, indiceInicioComentario)
                                    + linea.substring(indiceFinComentario + 2);
                            dentroDeComentario = false;
                        } else {
                            linea = linea.substring(0, indiceInicioComentario);
                        }
                    } else {
                        indiceInicioComentario = linea.indexOf("//");
                        if (indiceInicioComentario != -1) {
                            linea = linea.substring(0, indiceInicioComentario);
                        }
                    }

                    if (!linea.isEmpty()) {
                        bw.write(linea);
                        bw.newLine();
                    }
                } else {
                    int indiceFinComentario = linea.indexOf("*/");
                    if (indiceFinComentario != -1) {
                        dentroDeComentario = false;
                        linea = linea.substring(indiceFinComentario + 2);
                        if (!linea.isEmpty()) {
                            bw.write(linea);
                            bw.newLine();
                        }
                    }
                }
            }

            System.out.println("Comentarios eliminados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
