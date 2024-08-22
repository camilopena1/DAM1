package vacaciones;

import java.util.Scanner;

public class ejer5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas cadenas vas a introducir?");
        int numeroCadenas = sc.nextInt();
        sc.nextLine();
        String[] arrayCadenas = new String[numeroCadenas];
        for (int i = 0; i < arrayCadenas.length; i++) {
            System.out.println("introduce una cadena ");
            String cadena = sc.nextLine();
            arrayCadenas[i] = cadena;
        }
        menu(arrayCadenas);
        sc.close();
    }

    private static void menu(String[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la opcion a elegir \n"
                + "1 : Longitudes \n"
                + "2 : Todas \n"
                + "3 : Comparacion\n"
                + "4 : Salir\t");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                longitudes(array);
                break;
            case 2:
                todas(array);
                break;
            case 3:
                comparacion(array);
                break;
            case 4:
                salir();
                break;

        }
        sc.close();
    }

    private static void longitudes(String[] array) {
        int longitud = 0;
        for (int i = 0; i < array.length; i++) {

            longitud += array[i].length();
        }
        System.out.println("la longitud de todas las cadenas es " + longitud);
        System.out.println();
        menu(array);
    }

    private static void todas(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String cadenaMayuscula=array[i].toUpperCase();
            System.out.print(cadenaMayuscula+"#");
        }
        System.out.println();
        menu(array);
    }

    private static void comparacion(String[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el primer valor (entre 0 y "+(array.length-1)+")");
        int opcion1=sc.nextInt();
        System.out.println("ingresa el segundo valor (entre 0 y "+(array.length-1)+")");
        int opcion2=sc.nextInt();
        String cadena1 ,cadena2;
        cadena1=array[opcion1];
        cadena2=array[opcion2];
        if(cadena1.equals(cadena2)){
            System.out.println("las cadenas son iguales");
        }else{
            System.out.println("las cadenas son diferentes");
        }
        sc.close();
        menu(array);
    }

    private static void salir() {
        System.out.println("bye bye");
    }

}
