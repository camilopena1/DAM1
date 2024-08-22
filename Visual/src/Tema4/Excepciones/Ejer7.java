package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce un numero");
                int a = sc.nextInt();
                imprimeNegativo(a);

            }

        } catch (InputMismatchException e) {
            System.out.println(" Valor invalido");
        }
        sc.close();
    }

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("P es negativo");
        }
        System.out.println("numero positivo");
    }

    public static void imprimeNegativo(int p) throws Exception {
        if (p >= 0) {
            throw new Exception("P es positivo");
            
        }
        System.out.println("numero negativo");

    }
}
