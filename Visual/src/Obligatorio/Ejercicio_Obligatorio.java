package Obligatorio;

import java.util.Scanner;

public class Ejercicio_Obligatorio {
	private static Scanner teclado = new Scanner(System.in);

	public static void menu() {
		System.out.println(" 1. VOLUNTARIO:Rellenar un array con los 100 primeros n�meros enteros y\r\n" +
				"los muestre en pantalla en orden ascendente.");
		System.out.println("2. VOLUNTARIO:Rellenar un array con los 100 primeros n�meros enteros y\r\n" +
				"los muestre en pantalla en orden descendente.\r\n" +
				"");
		System.out.println("3. Rellenar un array con los n�meros pares comprendidos entre 1 y 100 y\r\n" +
				"los muestre en pantalla en orden ascendente.\r\n" +
				"");
		System.out.println("4. VOLUNTARIO:Rellenar un array con los n�meros impares comprendidos\r\n" +
				"entre 1 y 100 y los muestre en pantalla en orden ascendente.\r\n" +
				"");
		System.out.println("5. Rellenar un array con los n�meros primos comprendidos entre 1 y 100 y\r\n" +
				"los muestre en pantalla en orden ascendente.\r\n" +
				"");
		System.out.println("6. Leer 10 n�meros por teclado, los almacene en un array y muestre la\r\n" +
				"suma, resta, multiplicaci�n y divisi�n de todos.\r\n" +
				"");
		System.out.println("7. Leer 10 n�meros por teclado, los almacene en un array y los ordene de\r\n" +
				"forma ascendente.\r\n" +
				"");
		System.out.println("8. VOLUNTARIO: Leer 10 n�meros por teclado, 5 para un array y 5 para otro\r\n" +
				"array distinto. Mostrar los 10 n�meros en pantalla mediante un solo array");
		System.out.println("9. Leer 5 n�meros por teclado, los copie a otro array multiplicados por 2 y\r\n" +
				"muestre el segundo array ordenado.\r\n" +
				"");
		System.out.println("10. VOLUNTARIO:Leer 5 n�meros por teclado, los copie a otro array\r\n" +
				"multiplicados por 2 y los muestre todos ordenados usando un tercer\r\n" +
				"array.\r\n" +
				"");
		System.out.println("11. Rellenar un array con los 100 primeros n�meros pares y muestre su\r\n" +
				"suma.\r\n" +
				"");
		System.out.println("12. Leer 10 n�meros por teclado, los almacene en un array y muestre la\r\n" +
				"media.");
		System.out.println("13. VOLUNTARIO:Almacenar en un array una cantidad de n�meros dados\r\n" +
				"(tanto positivos como negativos) y mostrarlos ordenados.\r\n" +
				"");
		System.out.println("14.Rellenar un array con 20 n�meros y luego busque un n�mero concreto.\r\n" +
				"");
		System.out.println("15. Construir un programa en java que permita encontrar el n�mero\r\n" +
				"mayor y el n�mero menor de una serie de n�meros ingresados por\r\n" +
				"teclado, como primera entrada se le dar� el tama�o del arreglo y luego\r\n" +
				"los datos, tambi�n se debe indicar cuantas veces se repiten tanto el\r\n" +
				"mayor como el menor");
		System.out.println("16. Crea un programa que cree un array de tama�o 30 y lo rellene con\r\n" +
				"valores\r\n" +
				"aleatorios entre 0 y 9 (utiliza Math.random()*100). Luego ordena los\r\n" +
				"valores del array y los mostrar� por pantalla\r\n" +
				"");
		System.out.println("17.Necesitamos crear un programa para mostrar el ranking de puntuaciones\r\n" +
				"de un torneo de ajedrez con 8 jugadores. Se le pedir� al usuario que\r\n" +
				"introduzca las puntuaciones de todos los jugadores (habitualmente valores\r\n" +
				"entre 100 y 280,de tipo entero) y luego muestre las puntuaciones en\r\n" +
				"orden descendente (de la m�s alta a la m�s baja)");
		System.out.println("18. Crea un programa que pida dos cadenas de texto por teclado y luego\r\n" +
				"indique si son iguales, adem�s de si son iguales sin diferenciar entre\r\n" +
				"may�sculas y min�sculas.\r\n" +
				"");
		System.out.println("19. Funcion que pida 7 palabras por teclado y las muestre ordenadas\r\n" +
				"alfabeticamente");
		System.out.println("----------------------------------------------------------------------------");
		int opcion=0;
		do {
			System.out.println("Eige un ejercicio");
			 opcion = teclado.nextInt();
			if (opcion <= 0 || opcion >= 20) {
				System.out.println("opcion incorrecta");
				System.out.println("Introducela de nuevo");
				 opcion = teclado.nextInt();
			}
		} while (opcion <= 0 || opcion >= 20);
		opcionEjercicio(opcion);

	}

	public static void opcionEjercicio(int opcion) {
		switch (opcion) {
			case 1:
				Ejercicio1();
				break;
			case 2:
				Ejercicio2();
				break;
			case 3:
				Ejercicio3();
				break;
			case 4:
				Ejercicio4();
				break;
			case 5:
				Ejercicio5();
				break;
			case 6:
				Ejercicio6();
				break;
			case 7:
				Ejercicio7();
				break;
			case 8:
				Ejercicio8();
				break;
			case 9:
				Ejercicio9();
				break;
			case 10:
				Ejercicio10();
				break;
			case 11:
				Ejercicio11();
				break;
			case 12:
				Ejercicio12();
				break;
			case 13:
				Ejercicio13();
				break;
			case 14:
				Ejercicio14();
				break;
			case 15:
				Ejercicio15();
				break;
			case 16:
				Ejercicio16();
				break;
			case 17:
				Ejercicio17();
				break;
			case 18:
				Ejercicio18();
				break;
			case 19:
				Ejercicio19();
				break;
		}

	}

	public static void Ejercicio1() {
		
		int Array[] = new int[100];

		for (int i = 0; i < Array.length; i++) {
			Array[i] = i;
			System.out.println(Array[i]);
		}
	}

	public static void Ejercicio2() {
		int Array[] = new int[100];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = i;
		}
		for (int i = 99; i < Array.length; i--) {
			if (i == 0) {
				break;
			}
			System.out.println(Array[i]);

		}
	}

	public static void Ejercicio3() {
		int Array[] = new int[100];
		for (int i = 1; i < Array.length; i++) {
			if (i % 2 == 0) {
				Array[i] = i;
				System.out.println(Array[i]);
			}
		}
	}

	public static void Ejercicio4() {
		int Array[] = new int[100];
		for (int i = 1; i < Array.length; i++) {
			if (i % 2 != 0) {
				Array[i] = i;
				System.out.println(Array[i]);
			}
		}
	}

	public static void Ejercicio5() {
		int Array[] = new int[100];
		for (int i = 1; i < Array.length; i++) {
			if (Array[i] % i == 0) {
				Array[i] = i;
				System.out.println(Array[i]);
			}
		}
	}

	public static void Ejercicio6() {
		int suma = 0;
		int resta = 0;
		int multiplicacion = 1;
		int division = 1;

		int Array[] = new int[10];

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Escribe 10 números para calcularlos");
			Array[i] = teclado.nextInt();
		}
		for (int i = 0; i < Array.length; i++) {
			suma += Array[i];

			if (i > 0) {
				resta -= Array[i];
				multiplicacion *= Array[i];
				division /= Array[i];
			}
		}
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicación es " + multiplicacion);
		System.out.println("El resultado de la division es " + division);

	}

	public static void Ejercicio7() {
		int Array[] = new int[10];

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Introduce 10 números para ordenarlos");
			Array[i] = teclado.nextInt();
		}

		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] > Array[j]) {

					int aux = Array[i];
					Array[i] = Array[j];
					Array[j] = aux;
					System.out.println(Array[i]);
				}
			}
		}
	}

	public static void Ejercicio8() {
		int array1[] = new int[5];
		int array2[] = new int[5];
		int array3[] = new int[10];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un numero");
			array1[i] = teclado.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Introduce un numero");
			array2[i] = teclado.nextInt();
		}
		int contador = 0;
		for (int i = 0; i < array3.length; i++) {

			if (i >= 5) {
				array3[i] = array2[contador];
				contador++;
			} else {
				array3[i] = array1[contador];
				contador++;
			}
			if (contador == 5) {
				contador = 0;
			}
		}
		for (int i : array3) {
			System.out.print(i + ",");
		}
	}

	public static void Ejercicio9() {
		int array1[] = new int[5];
		int array2[] = new int[5];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un numero");
			array1[i] = teclado.nextInt();
			array2[i] = array1[i] * 2;
		}
		for (int i : array2) {
			System.out.print(i + ",");
		}

	}

	public static void Ejercicio10() {

	}

	public static void Ejercicio11() {
		int array1[] = new int[50];
		int contador = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				array1[contador] = i;
				contador++;
			}
		}
	}

	public static void Ejercicio12() {

		int[] Array = new int[10];
		double total = 0;
		double media = 0;

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Introduce 10 n�meros para hacer su media");
			Array[i] = teclado.nextInt();
			total += Array[i];
		}
		media = total / Array.length;
		System.out.println("La media es " + media);
	}

	public static void Ejercicio13() {

	}

	public static void Ejercicio14() {

	}

	public static void Ejercicio15() {
		System.out.println("Introduce el tama�o del array:");
		int tamanio = teclado.nextInt();
		int min = 0;
		int max = 0;
		int contadorMax = 0;
		int contadorMin = 0;
		int Array[] = new int[tamanio];
		for (int i = 0; i < Array.length; i++) {
			System.out.println("introduce un numero");
			Array[i] = teclado.nextInt();
		}
		for (int i = 0; i < Array.length; i++) {

			if (Array[i] > max) {
				max = Array[i];
				if (max == Array[i]) {
					contadorMax++;
				}
			} else {
				min = Array[i];
				if (min == Array[i]) {
					contadorMin++;
				}
			}
		}
		System.out.println("El mayor se repite" + contadorMax);
		System.out.println("El mayor se repite" + contadorMin);

	}

	public static void Ejercicio16() {
		int Array[] = new int[5];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < (Array.length - 1); i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] > Array[j]) {
					int variableauxiliar = Array[i];
					Array[i] = Array[j];
					Array[j] = variableauxiliar;

				}
			}
		}
		for (int i : Array) {
			System.out.println(i);
		}

	}

	public static void Ejercicio17() {
		System.out.println("Cuantos jugadores sois");
		int numJugadores = teclado.nextInt();
		int Array[] = new int[numJugadores];
		int puntuaciones;
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Introduce las puntuaciones de los jugadores: ");
			puntuaciones = teclado.nextInt();

			while (puntuaciones < 100 || puntuaciones > 280) {
				System.out.println("puntuaciones incorrectas ");
				System.out.println("vuelve a introducirlas");
				puntuaciones = teclado.nextInt();
			}
			Array[i] = puntuaciones;
		}
		Array = ordenarArray(Array);
		System.out.println("                     ");
		for (int i = Array.length - 1; i >= 0; i--) {
			System.out.println(Array[i]);

		}

	}

	public static void Ejercicio18() {

		System.out.print("Introduce la primera cadena: ");
		String cadena1 = teclado.nextLine();

		System.out.print("Introduce la segunda cadena: ");
		String cadena2 = teclado.nextLine();

		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las cadenas son iguales (sin diferenciar mayúsculas y minúsculas).");
		} else {
			System.out.println("Las cadenas son diferentes (sin diferenciar mayúsculas y minúsculas).");
		}

		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales (diferenciando mayúsculas y minúsculas).");
		} else {
			System.out.println("Las cadenas son diferentes (diferenciando mayúsculas y minúsculas).");
		}
	}

	public static void Ejercicio19() {
		String cadena[] = new String[7];
		for (int i = 0; i < cadena.length; i++) {
			System.out.println("introduce un palabra");
			cadena[i] = teclado.nextLine();
		}

		System.out.println("                        ");
		cadena = ordenarArray(cadena);
		for (String string : cadena) {
			System.out.println(string);
		}

	}

	public static String[] ordenarArray(String[] lista) {
		for (int i = 0; i < lista.length - 1; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].compareToIgnoreCase(lista[j]) > 0) {
					// Intercambiamos valores
					String variableauxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = variableauxiliar;
				}
			}

		}
		return lista;
	}

	public static int[] ordenarArray(int[] arrayDesordenado) {
		for (int i = 0; i < arrayDesordenado.length - 1; i++) {
			for (int j = i + 1; j < arrayDesordenado.length; j++) {
				if (arrayDesordenado[j] < arrayDesordenado[i]) {
					int aux = arrayDesordenado[j];
					arrayDesordenado[j] = arrayDesordenado[i];
					arrayDesordenado[i] = aux;
				}
			}
		}
		return arrayDesordenado;
	}

	public static void main(String[] args) {
		menu();
	}

}
