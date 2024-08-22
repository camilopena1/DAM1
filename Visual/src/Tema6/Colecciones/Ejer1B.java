package Tema6.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1B {
    public static void main(String[] args) {
        ArrayList<Integer> primeros = new ArrayList<>();
        ArrayList<Integer> ultimos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numeros");
        for (int i = 0; i < 5; i++) {
           primeros.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            ultimos.add(sc.nextInt());
         }
         boolean iguales=primeros.equals(ultimos);
         if(iguales){
             System.out.println("son iguales");
         }else{
             System.out.println("no lo son");
         }
         sc.close();
    }
}
