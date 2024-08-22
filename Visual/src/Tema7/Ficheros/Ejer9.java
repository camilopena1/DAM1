package Tema7.Ficheros;

import java.io.*;

public class Ejer9 {
    public static void main(String[] args) {
        String fichero1 = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\hola1.txt";
        String fichero2 = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\hola2.txt";
        String fichero3 = "E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\hola3.txt";

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero3));

            String lineaFichero1 = br1.readLine();
            String lineaFichero2 = br2.readLine();

            while (lineaFichero1 != null || lineaFichero2 != null) {
                if (lineaFichero1 != null) {
                    bw.write(lineaFichero1);
                    bw.newLine();
                    lineaFichero1 = br1.readLine();
                }
                if (lineaFichero2 != null) {
                    bw.write(lineaFichero2);
                    bw.newLine();
                    lineaFichero2 = br2.readLine();
                }

            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("hechoooooo");

        } catch (FileNotFoundException e) {
            System.out.println("fichero no encontrado");

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
