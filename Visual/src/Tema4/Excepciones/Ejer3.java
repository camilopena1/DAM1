package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        double[] array = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("intruduce un numero para inicializar el array");

            try {
                array[i] = sc.nextDouble();
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Te has salido del array");
            } catch (InputMismatchException e2) {
                System.out.println("valor incorrecto");
            }

        }
        sc.close();
    }
}
