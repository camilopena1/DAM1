package Tema4.Practicas_Obligatorias.Polideportivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre="";
        int numeroSocio=0;
        int horaReserva=0;
        try {
            System.out.println("Introduce el nombre ");
             nombre = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("error");
        }
        try {
            System.out.println("introduce el numero de socio");
             numeroSocio = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("dato invalido");
        }

       try {
        System.out.println("introduce la hora de la reserva las franjas horarias son (6-7-8)");
        System.out.println("Dura una hora");
        horaReserva = sc.nextInt();
       } catch (InputMismatchException e) {
       System.out.println(e);
       }
       
        
        boolean confirmacionReserva = comprobarHoraLibre(horaReserva);
        if (confirmacionReserva) {
            ReservaPolideportivo reserva2 = new ReservaPolideportivo(horaReserva,nombre,numeroSocio);
            System.out.println("reserva hecha");
        }
        
        sc.close();
    }

    public static boolean comprobarHoraLibre(int hora) {

        if (hora == 6 && ReservaPolideportivo.isTramo6() == false) {
            System.out.println("hora libre");
            return true;
        } else if (hora == 7 && ReservaPolideportivo.isTramo7() == false) {
            System.out.println("hora libre");
            return true;
        } else if (hora == 8 && ReservaPolideportivo.isTramo8() == false) {
            System.out.println("hora libre");
            return true;
        } else {
            System.out.println("hora no disponible");
            return false;
        }
        

    }
}
