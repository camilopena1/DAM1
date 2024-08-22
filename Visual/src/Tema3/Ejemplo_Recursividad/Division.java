 package Tema3.Ejemplo_Recursividad;

import java.util.Scanner;

public class Division {
	public static int division(int dividendo, int divisor) {
	    if (dividendo < divisor) {
	        return 0;
	    } else {
	        return 1 + division(dividendo - divisor, divisor);
	    }
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d=new Division();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dividendo:");
		int dividendo=sc.nextInt();
		System.out.println("Introduce divisor:");
		int divisor=sc.nextInt();
		System.out.println(d.division(dividendo,divisor));
		sc.close();
	}

}
