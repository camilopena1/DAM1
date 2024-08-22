package Tema6.Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean si=true;
        do{
        menu();
        opcion(sc,numeros);
        }while(si);
    }

    public static void menu() {
        System.out.println("1 mostrar valores");
        System.out.println("2 introducir valor al final");
        System.out.println("3 introducir valor en una posicion");
        System.out.println("4 salir");
        System.out.println("Introduce una opcion");
    }

    public static void opcion(Scanner sc,ArrayList<Integer> array) {
        int opcion = sc.nextInt();
        switch (opcion) {
        case 1:
            mostrarValores(array);
            break;
        case 2:
            introducirValor(array);
            break;
        case 3:
            introducirValorPosicion(array);
            break;
        case 4:
            salir();
        }
    }
    public static void mostrarValores(ArrayList<Integer> array){
        if(array.isEmpty()){
            System.out.println("no hay nada");
        }
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
    public static void introducirValor(ArrayList<Integer> array){
        System.out.println("introduce un valor numerico");
        int valor=sc.nextInt();
        array.add(valor);
    }
    public static void introducirValorPosicion(ArrayList<Integer> array){
        System.out.println("Introduce un valor");
        int valor=sc.nextInt();
        System.out.println("introduce en que posicion quieres que se introduzca");
        int posicion=sc.nextInt();
        if (posicion>0 && posicion <=array.size()){
            array.add(posicion-1,valor);
        }else
        System.out.println("Fuera de limites");

    }
    public static void salir(){
        System.out.println("bye");
    }
}
