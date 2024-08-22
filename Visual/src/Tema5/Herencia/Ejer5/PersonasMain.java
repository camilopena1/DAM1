package Tema5.Herencia.Ejer5;

import java.util.Scanner;

public class PersonasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vecino vecino1 = new Vecino("V1234", "1", "finca 1", "camilo", 20);
        System.out.println(" introduce el dni");
        String dni = sc.nextLine();
        boolean comprobarDni=true;
        while (comprobarDni) {
            comprobarDni=false;
            comprobarDni=vecino1.dniValido(dni);
            if (comprobarDni== false) {
                System.out.println("Erro al introducir el dni");
            }
        }
        vecino1.setDni(dni);
        vecino1.esMayorDeEdad();
        Administrador admin1 = new Administrador("camila", 16,"A1234", "finca camila", 3,100);
        if (admin1.esMayorDeEdad()==false) {
            admin1.setEdad(18);
        }
        
        sc.close();

    }
}
