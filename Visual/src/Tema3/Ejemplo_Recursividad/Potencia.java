package Tema3.Ejemplo_Recursividad;

import java.util.Scanner;

public class Potencia {
	public static int elevado(int numero, int exponente) {
		if(exponente==0) {
			return 1;
		}
		else {
			return numero * elevado(numero,exponente-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Llamar a la misma clase para cumplir la funcion
		//Potencia EXP=new Potencia();
		System.out.println("Introduce un numero y su exponente:");
		System.out.println("Numero:");
		int numero=sc.nextInt();
		System.out.println("Exponente:");
		int expo=sc.nextInt();
		//Llamar al mismo fichero no tiene sentido si podriamos llamar directamente al metodo porque esta en la misma clase 
		//System.out.println("El numero "+numero+" elevado al exponente "+expo+" es igual a "+EXP.elevado(numero,expo));
		System.out.println("El numero "+numero+" elevado al exponente "+expo+" es igual a "+elevado(numero,expo));
		
		sc.close();
	}

}
