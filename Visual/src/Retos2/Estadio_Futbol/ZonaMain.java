package Retos2.Estadio_Futbol;

import java.util.Scanner;

public class ZonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona zona1 = new Zona("1. Fondo Sur", 500, 10);
        Zona zona2 = new Zona("2. Fondo norte", 700, 10);
        Zona zona3 = new Zona("3. Preferencia alta", 300, 25);
        Zona zona4 = new Zona("4. Preferencia baja", 250, 40);
        
        ejecutarMenu(sc, zona1, zona2, zona3, zona4);

        sc.close();
    }

    private static void ejecutarMenu(Scanner sc, Zona zona1, Zona zona2, Zona zona3, Zona zona4) {
        int opcion;

        do {
            System.out.println("1. Mostrar numero de entradas libres de cada zona");
            System.out.println("2. Mostrar precio por entrada en cada zona");
            System.out.println("3. Vender entradas");
            System.out.println("4. Salir");
            System.out.println("Introduce la opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEntradasDisponibles(zona1);
                    mostrarEntradasDisponibles(zona2);
                    mostrarEntradasDisponibles(zona3);
                    mostrarEntradasDisponibles(zona4);
                    break;
                case 2:
                    mostrarPrecios(zona1);
                    mostrarPrecios(zona2);
                    mostrarPrecios(zona3);
                    mostrarPrecios(zona4);
                    break;
                case 3:
                    venderEntradas(sc, zona1);
                    venderEntradas(sc, zona2);
                    venderEntradas(sc, zona3);
                    venderEntradas(sc, zona4);
                    break;
                case 4:
                    System.out.println("bye bye");
                    break;
                default:
                    System.err.println("Opcion Incorrecta");
                    break;
            }
        } while (opcion != 4);
    }

    private static void mostrarEntradasDisponibles(Zona zona) {
        System.out.println("Entradas disponibles de " + zona.getNombreZona() + " son " + zona.getNumeroEntradas());
    }

    private static void mostrarPrecios(Zona zona) {
        System.out.println("El precio de entrada de la zona " + zona.getNombreZona() + " es " + zona.getPrecioEntrada());
    }

    private static void venderEntradas(Scanner sc, Zona zona) {
        int numEntradas;
        System.out.println("Cuantas entradas quieres comprar para " + zona.getNombreZona() + "?");
        numEntradas = sc.nextInt();
        zona.venderEntrada(numEntradas);
    }
}
