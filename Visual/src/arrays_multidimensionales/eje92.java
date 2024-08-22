package arrays_multidimensionales;

import java.util.Scanner;

public class eje92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un nombre");
        String nombre=sc.nextLine();
        System.out.println("Pon el primero apellido");
        String apellido1=sc.nextLine();
        System.out.println("pon el segundo apellido");
        String apellido2 =sc.nextLine();

        nombre=primerasTresLetras(nombre);
        apellido1=primerasTresLetras(apellido1);
        apellido2=primerasTresLetras(apellido2);
        String clave=nombre+apellido1+apellido2;
        clave=clave.toUpperCase();
        System.out.println(clave);
        sc.close();
    }
    static String primerasTresLetras (String letras){
        String primerasTresLetras = letras.substring(0, Math.min(letras.length(), 3));


        return primerasTresLetras;
    }
}
