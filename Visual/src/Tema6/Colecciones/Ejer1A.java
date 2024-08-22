package Tema6.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1A {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        while (error) {
            error = false;
            System.out.println("pon 0 para salir");
            System.out.println("pide un numero");
            int num = sc.nextInt();
            if (num == 0) {
                System.err.println("adios");

            } else {
                error = true;
                numeros.add(num);
            }
        }
        int suma = 0;
        for (Integer integer : numeros) {
            suma += integer;
        }
        double media=(double) suma / numeros.size();
        int mayorMedia=0;
        for (Integer integer : numeros) {
            if (integer>media){
                mayorMedia++;    
            }
        }
        System.out.println("la suma " + suma);
        System.out.println("la media "+media);
        System.out.println("mayor que media "+mayorMedia);
        
        sc.close();
    }
}
