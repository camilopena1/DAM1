package prueba;

import java.util.Scanner;

public class mainPrueba {
    public static void main(String[] args) {

        PreguntaLetras pregunta = new PreguntaLetras("Adivina la palabra oculta");

        System.out.println(pregunta.getEnunciado());
        System.out.println("Palabra oculta: " + pregunta.getPalabraOculta());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu respuesta: ");
        String respuesta = scanner.nextLine();

        if (pregunta.responder(respuesta)) {
            System.out.println("¡Respuesta correcta!");
            System.out.println("La palabra seleccionada era: " + pregunta.getPalabraSeleccionada());
        } else {
            System.out.println("Respuesta incorrecta.");
            System.out.println("La palabra seleccionada era: " + pregunta.getPalabraSeleccionada());
        }

        scanner.close();
    }
}
