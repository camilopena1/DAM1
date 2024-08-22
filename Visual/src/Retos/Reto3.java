package Retos;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int numFilas = sc.nextInt();
        sc.nextLine();
        System.out.println("Elige el caracter de la piramide");
        String caracter=sc.nextLine();
        System.out.println();
        for (int altura = 1 ;altura <=numFilas;altura++){
            for (int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            for(int asteriscos =1; asteriscos<=(altura*2)-1;asteriscos++){
                System.out.print(caracter);
            }
            System.out.println();
        }
        sc.close();
    }
}
