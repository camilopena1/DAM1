package vacaciones;

import java.util.Scanner;

public class ejer6 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese la cantidad de personas: ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Datos para la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Altura (en metros): ");
            double altura = teclado.nextDouble();
            System.out.print("Peso (en kilogramos): ");
            double peso = teclado.nextDouble();

            double imc = peso / (altura * altura);

            System.out.println("Persona: " + nombre);
            System.out.println("IMC: " + imc);
            System.out.println("Estado: " + obtenerEstadoIMC(imc) + "\n");
        }
    }

    public static String obtenerEstadoIMC(double imc) {
        if (imc < 18.5) {
            return "Infrapeso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
