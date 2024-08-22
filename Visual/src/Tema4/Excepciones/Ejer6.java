package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        double [] vector = new double [10];
        Scanner sc = new Scanner(System.in);
        int contador=0;
        while(contador<10){
            try {
                System.out.println("Introduce un valor");
                double valor=sc.nextDouble();
                vector[contador]=valor;
                contador++;
            } catch (InputMismatchException e) {
                System.out.println(e);
                sc.nextLine();
            }
            sc.close();
        }
    }
}
