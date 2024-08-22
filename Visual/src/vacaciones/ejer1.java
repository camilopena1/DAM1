package vacaciones;
import java.util.Random;
import java.util.Scanner;

public class ejer1 {
    private static int[][] mesas;
    private static int numeroFilas = 2;
    private static int numeroColumnas = 10;

    private static void menu() {
        System.out.println("Estado actual de las mesas:");
        
        // Imprimir encabezado
        System.out.print("|Mesa num:  ");
        for (int i = 0; i < numeroColumnas; i++) {
            System.out.print(mesas[0][i] + " | ");
        }
        System.out.println();
        
        // Imprimir ocupación de las mesas
        System.out.print("|Ocupacion: ");
        for (int i = 0; i < numeroColumnas; i++) {
            System.out.print(mesas[1][i] + " | ");
        }
        System.out.println();
    }

    private static void gestionarEntradaClientesDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas para el grupo (-1 para salir): ");
        int cantidadPersonas = scanner.nextInt();

        while (cantidadPersonas != -1) {
            introducirClientesEnMesasConHueco(cantidadPersonas);
            menu();

            System.out.print("Ingrese la cantidad de personas para el siguiente grupo (-1 para salir): ");
            cantidadPersonas = scanner.nextInt();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        numeroDeMesas();
        introducirClientesAleatorios();
        menu();
        gestionarEntradaClientesDesdeConsola();

        System.out.println("Gracias por su vista.");
    }

    private static void numeroDeMesas() {
        mesas = new int[numeroFilas][numeroColumnas];

        for (int i = 0; i < numeroColumnas; i++) {
            mesas[0][i] = i + 1; // Número de mesa
            mesas[1][i] = 0; // Número de clientes (inicialmente 0)
        }
    }

    private static void introducirClientesAleatorios() {
        Random random = new Random();

        for (int i = 0; i < numeroColumnas; i++) {
            mesas[1][i] = random.nextInt(5); // Asignar un valor aleatorio entre 0 y 4
        }
    }

    private static void introducirClientesEnMesasConHueco(int cantidadPersonas) {
        for (int i = 0; i < numeroColumnas; i++) {
            int clientesEnMesa = mesas[1][i];

            if (clientesEnMesa + cantidadPersonas <= 4) {
                // Hay suficiente espacio en esta mesa para el grupo
                mesas[1][i] += cantidadPersonas;
                break; // Salir del bucle una vez que se ha colocado el grupo
            }
        }
    }
}

    

