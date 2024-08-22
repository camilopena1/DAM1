package Tema6.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        ArrayList<String> nombres= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombres");
        for (int i = 0; i < 2; i++) {
            nombres.add(sc.nextLine());
        }

        System.err.println("LISTA DE NOMBRES:");
        for (String name : nombres) {
            System.out.println(name);
        }
        sc.close();
        
    }
}
