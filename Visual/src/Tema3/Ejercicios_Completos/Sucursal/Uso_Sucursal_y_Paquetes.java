package Tema3.Ejercicios_Completos.Sucursal;

import java.util.Scanner;



public class Uso_Sucursal_y_Paquetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de la sucursal");
        int numeroSucursal = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la direccion");
        String direccion = sc.nextLine();
        System.out.println("Introduce la ciudad");
        String ciudad = sc.nextLine();
        System.out.println("Numero de paquetes  que vas a enviar");
        int numeroPaquetes = sc.nextInt();
        Sucursales sucursal1 = new Sucursales(numeroSucursal, direccion, ciudad);
        Paquetes[] paquetesArray = new Paquetes[numeroPaquetes];

        for (int i = 0; i < numeroPaquetes; i++) {
            System.out.println("Ingrese la información para el paquete " + (i + 1) + ":");

            System.out.print("Ingrese la referencia de envío: ");
            int referenciaEnvio = sc.nextInt();

            System.out.print("Ingrese el peso: ");
            double peso = sc.nextDouble();
            sc.nextLine(); // Consumir la nueva línea pendiente

            System.out.print("Ingrese el DNI del remitente: ");
            String dniRemitente = sc.nextLine();

            System.out.print("Ingrese la prioridad de envío: ");
            int prioridadEnvio = sc.nextInt();

            // Crear el objeto Paquetes con la información proporcionada y almacenarlo en el
            // array
            paquetesArray[i] = new Paquetes(referenciaEnvio, peso, dniRemitente, prioridadEnvio);

        }
        sucursal1.calcularPrecioEnvio(paquetesArray);
        System.out.println("----------------------------------------");
        sucursal1.mostrarSucursal();
        for (Paquetes paquete: paquetesArray){
            paquete.mostrarPaquete();
        }
        sc.close();
    }
}
