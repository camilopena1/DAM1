package Tema3.Ejercicios_Completos.ExpoCoches;

import java.util.Scanner;

public class MainZona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona salaPrincipal = new Zona("Sala Principal", 1000);
        Zona compraVenta = new Zona("Compra-Venta", 200);
        Zona zonaVIP = new Zona("Zona VIP", 25);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                mostrarEntradasLibres(salaPrincipal, compraVenta, zonaVIP);
                break;
            case 2:
                venderEntradas(salaPrincipal, compraVenta, zonaVIP);
                break;
            case 3:
                System.out.println("Bye bye!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }

        } while (opcion != 3);
        sc.close();

    }

    private static void mostrarEntradasLibres(Zona zona1, Zona zona2, Zona zona3) {
        System.out.println("Entradas disponibles en " + zona1.getNombre() + ": " + zona1.getEntradasDisponibles());
        System.out.println("Entradas disponibles en " + zona2.getNombre() + ": " + zona2.getEntradasDisponibles());
        System.out.println("Entradas disponibles en " + zona3.getNombre() + ": " + zona3.getEntradasDisponibles());
    }

    private static void venderEntradas(Zona zona1, Zona zona2, Zona zona3) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la zona para la venta:");
        System.out.println("1. " + zona1.getNombre());
        System.out.println("2. " + zona2.getNombre());
        System.out.println("3. " + zona3.getNombre());

        int opcionZona = scanner.nextInt();

        if (opcionZona >= 1 && opcionZona <= 3) {
            System.out.print("Ingrese la cantidad de entradas a vender: ");
            int cantidad = scanner.nextInt();

            switch (opcionZona) {
            case 1:
                zona1.venderEntradas(cantidad);
                break;
            case 2:
                zona2.venderEntradas(cantidad);
                break;
            case 3:
                zona3.venderEntradas(cantidad);
                break;
            }
        } else {
            System.out.println("Opción de zona no válida.");
        }
        scanner.close();
    }

}
