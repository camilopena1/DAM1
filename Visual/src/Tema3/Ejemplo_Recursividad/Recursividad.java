package Tema3.Ejemplo_Recursividad;
import java.util.*;

public class Recursividad {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso de cada m�todo
        System.out.print("Introduce el n�mero final para la suma: ");
        int n = scanner.nextInt();
        System.out.println("Suma de los primeros " + n + " n�meros: " + sumaPrimerosNumeros(n));

        System.out.print("Introduce el primer valor para la suma de pares: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo valor para la suma de pares: ");
        int b = scanner.nextInt();
        System.out.println("Suma de los n�meros pares entre " + a + " y " + b + ": " + sumaPares(a, b));

        System.out.print("Introduce el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Introduce el divisor: ");
        int divisor = scanner.nextInt();
        System.out.println("Resultado de la divisi�n: " + divisionEntera(dividendo, divisor));

        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        System.out.println("Potencia de " + base + " elevado a " + exponente + ": " + calcularPotencia(base, exponente));

        System.out.print("Introduce un n�mero para imprimir cifras en orden inverso: ");
        int numero = scanner.nextInt();
        System.out.print("Cifras en orden inverso: ");
        imprimirCifrasEnOrdenInverso(numero);
        System.out.println();

        System.out.print("Introduce el primer n�mero para calcular el m�ximo com�n divisor: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo n�mero para calcular el m�ximo com�n divisor: ");
        int num2 = scanner.nextInt();
        System.out.println("M�ximo com�n divisor de " + num1 + " y " + num2 + ": " + calcularMaximoComunDivisor(num1, num2));

        scanner.close();
    }

    // M�todo para sumar los primeros n n�meros de forma recursiva
    static int sumaPrimerosNumeros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaPrimerosNumeros(n - 1);
        }
    }

    // M�todo para sumar los n�meros pares entre a y b de forma recursiva
    static int sumaPares(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return (a % 2 == 0 ? a : 0) + sumaPares(a + 1, b);
        }
    }

    // M�todo para dividir dos n�meros enteros de forma recursiva
    static int divisionEntera(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + divisionEntera(dividendo - divisor, divisor);
        }
    }

    // M�todo para calcular la potencia de un n�mero de forma recursiva
    static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    // M�todo para imprimir las cifras de un n�mero en orden inverso de forma recursiva
    static void imprimirCifrasEnOrdenInverso(int numero) {
        if (numero == 0) {
            return;
        } else {
            System.out.print(numero % 10 + " ");
            imprimirCifrasEnOrdenInverso(numero / 10);
        }
    }

    // M�todo para calcular el m�ximo com�n divisor de dos n�meros de forma recursiva
    static int calcularMaximoComunDivisor(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calcularMaximoComunDivisor(num2, num1 % num2);
        }
    }
}
