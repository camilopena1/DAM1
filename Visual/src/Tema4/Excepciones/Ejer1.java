package Tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.println("introduce un entero");
        int num=sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println(" has introducido un valor incorrecto");
        }
        
        sc.close();
    }
}
