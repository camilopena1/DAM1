package Tema4.Excepciones.Ejer8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GatoMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Gato gato1 = new Gato("sol", 1);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Introduce el nombre del gato");
                String nombre=sc.nextLine();
                System.out.println(gato1);
                gato1.setNombre("a");
                System.out.println(gato1);
            } catch (InputMismatchException e) {
                System.out.println("Error de valor");
            } catch (Exception e) {
                System.out.println("Errorrr");
            }

        }
        sc.close();
    }
}
