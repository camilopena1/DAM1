package Obligatorio;

import java.util.Scanner;

public class maquinaExpendedora {
	private static String[] arrayBebidas = new String[] { "Agua", "Cocacola", "Cocacola Zero", "Cafe solo",
			"Cafe con leche" };
	private static String[] arrayComidas = new String[] { "Sandwich", "Empanada", "Patatas Fritas", "Pizza",
			"Hamburguesa" };
	private static char[] codigosBebidas = new char[] { 'A', 'B', 'C', 'D', 'E' };
	private static char[] codigosComidas = new char[] { 'F', 'G', 'H', 'I', 'J' };
	private static double[] precioBebidas = new double[] { 1.00, 1.40, 1.45, 0.65, 0.80 };
	private static double[] precioComidas = new double[] { 2.35, 1.75, 0.90, 5.65, 4.95 };
	private static final double[] MONEDAS_VALIDAS = { 0.10, 0.20, 0.50, 1, 2, 5 };
	private static final int OPCION_COMPRAR_COMIDA = 1;
	private static final int OPCION_COMPRAR_BEBIDA = 2;
	private static final int OPCION_SALIR = 3;
	private static Scanner teclado = new Scanner(System.in);

	public static void menu() {
		int opcion;
		do {
			System.out.println("Seleccione una opción:\n"
					+ "Comprar comida (" + OPCION_COMPRAR_COMIDA + ")\n"
					+ "Comprar bebida (" + OPCION_COMPRAR_BEBIDA + ")\n"
					+ "Salir (" + OPCION_SALIR + ")");
			opcion = teclado.nextInt();
			if (opcion < OPCION_COMPRAR_COMIDA || opcion > OPCION_SALIR) {
				System.out.println("Opción incorrecta, vuelve a introducirla");
			}

		} while (opcion < OPCION_COMPRAR_COMIDA || opcion > OPCION_SALIR);
		switch (opcion) {
			case OPCION_COMPRAR_COMIDA:
				menuComida();
				break;
			case OPCION_COMPRAR_BEBIDA:
				menuBebida();
				break;
			case OPCION_SALIR:
				salir();
			default:
				break;
		}

	}

	public static void menuComida() {
		int opcion;
		do {
			System.out.println(
					"Seleccione una opcion: \n"
							+ "Visualizar listado de comidas (1) \n"
							+ "Introducir código en la máquina expendedora (2) \n"
							+ "Volver atrás (3) \n"
							+ "Salir (4)");
			opcion = teclado.nextInt();
			if (opcion <= 0 || opcion >= 5) {
				System.out.println("Opcion Incorrecta, vuelve a introducirla");
			}

		} while (opcion <= 0 || opcion >= 5);
		switch (opcion) {
			case 1:
				visualizarComida();
				break;
			case 2:
				introducirCodigoComidas();
				break;
			case 3:
				volverAtras();
				break;
			case 4:
				salir();
				break;
		}
	}

	public static void menuBebida() {
		int opcion;
		do {
			System.out.println(
					"Seleccione una opcion: \n"
							+ "Visualizar listado de bebidas (1) \n"
							+ "Introducir código en la máquina expendedora (2) \n"
							+ "Volver atrás (3) \n"
							+ "Salir (4)");
			opcion = teclado.nextInt();
			if (opcion <= 0 || opcion >= 5) {
				System.out.println("Opcion Incorrecta, vuelve a introducirla");
			}

		} while (opcion <= 0 || opcion >= 5);
		switch (opcion) {
			case 1:
				visualizarBebida();
				break;
			case 2:
				introducirCodigoBebidas();
				break;
			case 3:
				volverAtras();
				break;
			case 4:
				salir();
				break;
		}
	}

	public static void introducirCodigoBebidas() {
		char inicioCodigo = codigosBebidas[0];
		char finCodigos = codigosBebidas[codigosBebidas.length - 1];
		char codigo;
		do {
			System.out.println("Introduce el Codigo");
			codigo = Character.toUpperCase(teclado.next().charAt(0));
			if (codigo < inicioCodigo || codigo > finCodigos) {
				System.out.println("Error en el codigo, vuelve a introducirlo");
			} else if (codigo == 'D' || codigo == 'E') {
				int cantidadAzucar;
				do {
					System.out.println("Seleccione la cantidad de azúcar (0 a 5)");
					cantidadAzucar = teclado.nextInt();
				} while (cantidadAzucar < 0 || cantidadAzucar > 5);

				System.out.println(cantidadAzucar + " de azúcar.");
			}
		} while (codigo < inicioCodigo || codigo > finCodigos);
		int contador = 0;
		while (codigosBebidas[contador] != codigo) {
			contador++;
		}
		double precio=precioBebidas[contador];
		System.out.println("precio: " + precio);
		introducirDinero(precio);
	}

	public static void introducirCodigoComidas() {
		char inicioCodigo = codigosComidas[0];
		char finCodigos = codigosComidas[codigosComidas.length - 1];
		char codigo;
		double precioCaliente = 0.25;
		do {
			System.out.println("Introduce el Codigo");
			codigo = Character.toUpperCase(teclado.next().charAt(0));
			if (codigo < inicioCodigo || codigo > finCodigos) {
				System.out.println("Error en el codigo, vuelve a introducirlo");
			}
		} while (codigo < inicioCodigo || codigo > finCodigos);
		int contador = 0;
		while (codigosComidas[contador] != codigo) {
			contador++;
		}
		boolean frioCaliente = frioCaliente();
		double precio=precioComidas[contador];
		if (frioCaliente == true) {
			precio+=precioCaliente;
			System.out.println("precio: " +precio);
		} else
			System.out.println("precio: " + precio);
		introducirDinero(precio);
	}

	public static void introducirDinero(double precio) {
		double dineroIntroducido = 0;
        double cambio;

        System.out.println("Billete máximo de 5 Euros");

        do {
            do {
                System.out.println("Introduce Dinero: dinero Introducido " + dineroIntroducido);
                while (!teclado.hasNextDouble()) {
                    System.out.println("Por favor, introduce un número válido.");
                    teclado.next(); // Limpiar el búfer del escáner
                }
    
                dineroIntroducido += teclado.nextDouble();

                if (!esMonedaValida(dineroIntroducido)) {
                    System.out.println("Has introducido una moneda no válida");
                }
            } while (!esMonedaValida(dineroIntroducido));
        } while (dineroIntroducido < precio);

        cambio = calcularCambio(dineroIntroducido, precio);
        System.out.println("Gracias por tu compra. Tu cambio es de " + cambio + " euros.");

        devolverCambio(cambio);
        menu();
    }

	public static boolean esMonedaValida(double cantidad) {
        for (double moneda : MONEDAS_VALIDAS) {
            if (Math.abs(cantidad - moneda) < 0.01) {
                return true;
            }
        }
        return false;
    }
	public static double calcularCambio(double dineroIntroducido, double precio) {
        return dineroIntroducido - precio;
    }
	public static void devolverCambio(double cambio) {
		int[] denominaciones = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] cantidadBilletesMonedas = new int[denominaciones.length];
	
	
		int cambioEnCentavos = (int) (cambio * 100);
	
		for (int i = 0; i < denominaciones.length; i++) {
			cantidadBilletesMonedas[i] = cambioEnCentavos / denominaciones[i];
			cambioEnCentavos %= denominaciones[i];
			System.out.println(cantidadBilletesMonedas[i] + " monedas de " + denominaciones[i] / 100 + " euros");
		}
	
		System.out.println("Se devolverán las siguientes monedas/billetes:");
	
		for (int i = 0; i < denominaciones.length; i++) {
			if (cantidadBilletesMonedas[i] > 0) {
				if (denominaciones[i] >= 100) {
					System.out.println(cantidadBilletesMonedas[i] + " billetes de " + denominaciones[i] / 100 + " euros");
				} else {
					System.out.println(cantidadBilletesMonedas[i] + " monedas de " + denominaciones[i] + " céntimos");
				}
			}
		}
	}

	public static boolean frioCaliente() {
		char respuesta;
		do {
			System.out.println("¿Quieres la comida Caliente? S/N");
			System.out.println("Se te va a cobrar un importe extra de 25 centimos");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
		} while (respuesta != 'S' && respuesta != 'N');

		return respuesta == 'S';

	}

	public static void visualizarBebida() {
		for (int i = 0; i < arrayBebidas.length; i++) {
			System.out.printf("%-20s %-10s %-10s%n", arrayBebidas[i], codigosBebidas[i], precioBebidas[i]);
		}
		introducirCodigoBebidas();
	}

	public static void visualizarComida() {
		for (int i = 0; i < arrayComidas.length; i++) {
			System.out.printf("%-20s %-10s %-10s%n", arrayComidas[i], codigosComidas[i], precioComidas[i]);
		}
		introducirCodigoComidas();
	}

	public static void volverAtras() {
		menu();
	}

	public static void salir() {
		System.out.println("Bye bye");
	}

	public static void main(String[] args) {
		menu();
	}
}