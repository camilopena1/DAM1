package Tema4.Practicas_Obligatorias.Empresa_Seguros;

import java.util.Scanner;

public class PolizaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para los cálculos adicionales
        int totalRecaudado = 0;
        int sumaEdades = 0;
        int edadMinima = Integer.MAX_VALUE;
        int edadMaxima = Integer.MIN_VALUE;
        String nombreEdadMinima = "";
        String nombreEdadMaxima = "";

        while (true) {
            try {
                System.out.println("Introduce los datos del abonado:");
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("NIF: ");
                String nif = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer del scanner

                // Crear una instancia de Poliza
                Poliza poliza = new Poliza(nombre, nif, edad);
                poliza.mostrarCuotaMensual();

                // Calcular edades mínima y máxima
                if (edad < edadMinima) {
                    edadMinima = edad;
                    nombreEdadMinima = nombre;
                }
                if (edad > edadMaxima) {
                    edadMaxima = edad;
                    nombreEdadMaxima = nombre;
                }

                // Calcular suma de edades y total recaudado
                sumaEdades += edad;
                totalRecaudado += poliza.getCuotaMensual();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("¿Desea introducir otro abonado? (S/N): ");
            String respuesta = sc.nextLine().toUpperCase();
            if (!respuesta.equals("S")) {
                break;
            }
        }

        // Calcular la edad media
        double edadMedia = (double) sumaEdades / (double) (totalRecaudado / 40);

        // Mostrar resultados adicionales
        System.out.println("La persona de mayor edad es: " + nombreEdadMaxima + " con " + edadMaxima + " años.");
        System.out.println("La persona de menor edad es: " + nombreEdadMinima + " con " + edadMinima + " años.");
        System.out.println("La edad media de los abonados es: " + edadMedia + " años.");
        System.out.println("Total recaudado mensualmente: " + totalRecaudado + " euros.");
        sc.close();
    }
}
