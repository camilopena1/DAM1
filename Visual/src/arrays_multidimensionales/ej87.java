package arrays_multidimensionales;

import java.util.Scanner;

public class ej87 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int filas = 0;
        int columnas = 0;
        int contadorMayor = 0;
        int contadorMenor = 0;
        int contadorIgual = 0;

        System.out.println("Cuantas filas quieres ponerle a la matriz?");
        filas = teclado.nextInt();

        System.out.println("Cuantas columnas quieres ponerle a la matriz?");
        columnas = teclado.nextInt();

        int[][] array = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {

                System.out.println("que valores quieres darle");
                array[f][c] = teclado.nextInt();

                if (array[f][c] > 0) {
                    contadorMayor++;
                } else if (array[f][c] < 0) {
                    contadorMenor++;
                } else if (array[f][c] == 0) {
                    contadorIgual++;
                }

            }

        }
        System.out.println("Hay " + contadorMayor + " valores mayor que 0");
        System.out.println("Hay " + contadorMenor + " valores menor que 0");
        System.out.println("Hay " + contadorIgual + " valores igual que 0");
        

    }
}
