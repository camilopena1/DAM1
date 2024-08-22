package Tema7.Ficheros.Ejer11;

import java.io.*;

public class produMain {
    public static void main(String[] args) {
        String fichero="productos.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter (fichero,true));
            Producto p1 = new Producto("taza", 2, 10);
            Producto p2 = new Producto("tazo", 2, 10);
            Producto p3 = new Producto("tazi", 2, 10);
            bw.write(p1.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
