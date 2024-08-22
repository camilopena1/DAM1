package Tema3.Ejemplo_Recursividad;
import java.util.Scanner;

public class Sumpares {
	
	public static int sumaPares(int a, int b) {
	    if (a > b) {
	        return 0;
	    } else if (a % 2 == 0) {
	        return a + sumaPares(a + 2, b);
	    } else {
	        return sumaPares(a + 1, b);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
		Sumpares sump=new Sumpares();
		System.out.println("Introduce dos numeros:");
		System.out.println("Numero 1:");
		int numero1=sc.nextInt();
		System.out.println("Numero 2:");
		int numero2=sc.nextInt();
        System.out.println("Suma es: " + sump.sumaPares(numero1,numero2));

	}

}
