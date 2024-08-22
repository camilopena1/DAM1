package Tema3.Ejemplo_Recursividad;
import java.util.Scanner;

public class suma_N_numeros {

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        suma_N_numeros sum = new suma_N_numeros(); 
        System.out.println("Introduce un numero:");
        int numero=sc.nextInt(); 
        System.out.println("Suma de los números son: " + sum.suma(numero));
    }
}

