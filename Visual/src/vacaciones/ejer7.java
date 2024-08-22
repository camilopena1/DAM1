package vacaciones;

import java.util.Random;

public class ejer7 {
    public static void main(String[] args) {
        int[] carton = generarCarton();
        mostrarCarton(carton);
    }
    public static int[] generarCarton() {
        int[] carton = new int[15];
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int numeroAleatorio;
            boolean repetido;

            do {
                // Genera un número aleatorio entre 1 y 90
                numeroAleatorio = random.nextInt(90) + 1;
                repetido = false;

                // Comprueba si el número generado ya está en el cartón
                for (int j = 0; j < i; j++) {
                    if (carton[j] == numeroAleatorio) {
                        repetido = true;
                        break;
                    }
                }

            } while (repetido);

            carton[i] = numeroAleatorio;
        }

        return carton;
    }
    public static void mostrarCarton(int[] carton) {
        System.out.println("Cartón del Bingo:");
        for (int i = 0; i < carton.length; i++) {
            System.out.print(carton[i] + " ");
        }
    }
}
