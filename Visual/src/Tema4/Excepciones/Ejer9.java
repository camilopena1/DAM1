package Tema4.Excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas = pedirFila(sc);
        int numColumna = pedirColumna(sc);
        int[][] array = new int[numColumna][numFilas];
        cargarArray(array, sc);
        mostrarArray(array);
        ordenarArray(array);
        mostrarArray(array);
    }

    public static int pedirFila(Scanner sc) {
        boolean estado = true;
        int numfilas = 0;
        do {
            try {
                System.out.println("Intrtoduce el numero de filas entre (2-4)");
                numfilas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("error invalido");
            } catch (Exception e) {
                System.out.println("Errorr");
            }

            if (numfilas < 2 || numfilas > 4) {
                estado = true;
                System.out.println("numero de fila incorrectoS");
            } else {
                estado = false;
            }

        } while (estado);
        return numfilas;
    }

    public static int pedirColumna(Scanner sc) {
        boolean estado = true;
        int numColumna = 0;
        do {
            try {
                System.out.println("Intrtoduce el numero de columnas entre (2-4)");
                numColumna = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("error invalido");
            } catch (Exception e) {
                System.out.println("Errorr");
            }

            if (numColumna < 2 || numColumna > 4) {
                estado = true;
                System.out.println("numero de columnas incorrectoS");
            } else {
                estado = false;
            }

        } while (estado);
        return numColumna;
    }

    public static void cargarArray(int[][] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean estado = false;
                do {
                    try {
                        System.out.println("introduce un valor");
                        array[i][j] = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("error invalido");
                        System.out.println("vuelve a introducirlo");
                        estado = true;
                    } catch (IllegalArgumentException e1) {
                        System.out.println("el numero no puede ser negativo o 0");
                        System.out.println("vuelve a introducirlo");
                        estado = true;
                    }
                } while (estado);

            }
        }
    }

    public static void mostrarArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(":"+array[i][j] +"\t");
            }
            System.out.println();
        }
    }
    public static void ordenarArray(int [][] array){
        for (int[] fila : array) {
            Arrays.sort(fila);
        }
    }
}
