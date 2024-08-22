package vacaciones;

import java.util.Scanner;

public class ejer2 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] numeros = new int[4][5];

        System.out.println("Introduce 20 números enteros:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }

        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("Suma total: " + sumaTotal);
    }

}