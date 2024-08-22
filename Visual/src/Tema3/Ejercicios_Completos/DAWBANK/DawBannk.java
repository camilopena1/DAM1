package Tema3.Ejercicios_Completos.DAWBANK;

import java.util.Scanner;

public class DawBannk {
    public static Scanner sc = new Scanner(System.in);

	public static void mostrarMenu(CuentaBancaria cuenta) {
		System.out.println("\n----- Menú Principal -----");
		System.out.println("1. Datos de la cuenta");
		System.out.println("2. IBAN");
		System.out.println("3. Titular");
		System.out.println("4. Saldo");
		System.out.println("5. Ingreso");
		System.out.println("6. Retirada");
		System.out.println("7. Movimientos");
		System.out.println("8. Salir");
		System.out.println("---------------------------");
	}

	public static void mostrarDatosCuenta(CuentaBancaria cuenta) {
		System.out.println("\nIBAN: " + cuenta.getIBAN());
		System.out.println("Titular: " + cuenta.getTitular());
		System.out.println("Saldo: " + cuenta.getSaldo() + " euros");
	}

	public static boolean validarIBAN(String cadena) {
		String patron = "[A-Za-z]{2}\\d{22}";
		return cadena.matches(patron);
	}

	public static void main(String[] args) {
		int opcion;
		String numCuenta = "0000";
		while (validarIBAN(numCuenta)==false) {
            System.out.println("\nIntroduce el IBAN (mayúsculas): ");
            numCuenta = sc.next();
        }
        // TITULAR
        System.out.println("Nombre del titular: ");
        String nombreApellido = sc.next();

        CuentaBancaria cuenta = new CuentaBancaria(numCuenta, nombreApellido);
		do {
		
			mostrarMenu(cuenta);
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();


			switch (opcion) {
			case 1:
				mostrarDatosCuenta(cuenta);
				break;
			case 2:
				System.out.println("IBAN: " + cuenta.getIBAN());
				break;
			case 3:
				System.out.println("Titular: " + cuenta.getTitular());
				break;
			case 4:
				System.out.println("Saldo: " + cuenta.getSaldo() + " euros");
				break;
			case 5:
				System.out.print("Ingrese la cantidad a ingresar: ");
				double cantidadIngreso = sc.nextDouble();
				cuenta.realizarIngreso(cantidadIngreso);
				break;
			case 6:
				System.out.print("Ingrese la cantidad a retirar: ");
				double cantidadRetirada = sc.nextDouble();
				cuenta.realizarRetirada(cantidadRetirada);
				break;
			case 7:

				break;
			case 8:
				System.out.println("\nSaliendo del programa. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
				break;
			}
		} while (opcion != 8);

		sc.close();
	}
    
}
