package Tema3.Ejercicios_Completos.Tren;

import java.util.Scanner;

public class MainTren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean respuestaVentanaBoleean, respuestaMarchaBoleean;
        System.out.println("Indica la ciudad de origen:");
        String ciudadOrigen = sc.nextLine();
        System.out.println("Indica la ciudad de destino:");
        String ciudadDestino = sc.nextLine();
        System.out.println("Indica la (fecha dd/mm/aaaa):");
        String fecha = sc.nextLine();
        System.out.println("Quires ventana?(si/no):");
        String respuestaVentana = sc.nextLine().toLowerCase();
        System.out.println("Quieres ir en sentido de la marcha?(si/no)");
        String respuestaMarcha = sc.nextLine().toLowerCase();
        System.out.println("Indica la fila de del asiento");
        int asientoFila = sc.nextInt();
        if (respuestaVentana.equals("si")) {
            respuestaVentanaBoleean = true;
        } else {
            respuestaVentanaBoleean = false;
        }
        if (respuestaMarcha.equals("si")) {
            respuestaMarchaBoleean = true;

        } else {
            respuestaMarchaBoleean = false;
        }

        Asientos asiento1 = new Asientos();

        String letraAsiento = asiento1.comprobarLetra(respuestaVentanaBoleean, respuestaMarchaBoleean);
        asiento1.setFila(asientoFila);
        asiento1.setLetraAsiento(letraAsiento);
        Billetes billete1 = new Billetes(ciudadOrigen, ciudadDestino, fecha);
        System.out.println(billete1.toString());
        System.out.println(asiento1.toString());
        sc.close();

    }

}
