package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        try {
            int num = sc.nextInt();

            if (ponerla(num)) {
                System.out.println("La pusiste");
            } else {
                System.err.println("F por ti");
            }
        } catch (InputMismatchException e) {
            System.out.println(e);

        } 
        sc.close();
    }

    public static boolean ponerla(int a) {
        if (a >= 16) {
            return true;
        } else
            return false;
    }
}
