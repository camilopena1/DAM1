package Tema6.Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        HashMap<String, String> sinonimos = new HashMap<String, String>();
        sinonimos.put("caliente", "hot");
        sinonimos.put("rojo", "red");
        sinonimos.put("ardiente", "hot");
        sinonimos.put("verde", "green");
        sinonimos.put("agujetas", "stiff");
        sinonimos.put("abrasador", "hot");
        sinonimos.put("hierro", "iron");
        sinonimos.put("caliente", "hot");
        Scanner sc = new Scanner(System.in);
        String palabra;
        do {
            System.out.print("Introduce una palabra (o escribe 'salir' para terminar): ");
            palabra = sc.nextLine();

            // Verificar si la palabra existe en el diccionario
            if (sinonimos.containsKey(palabra)) {
                String sinonimo = sinonimos.get(palabra);
                System.out.print("Sinónimos de '" + palabra + "': ");
                mostrarSinonimos(sinonimos, sinonimo);
            } else if (!palabra.equals("salir")) {
                System.out.println("No conozco esa palabra.");
            }
        } while (!palabra.equals("salir"));
        sc.close();
    }

    public static void mostrarSinonimos(HashMap<String, String> sinonimos, String palabra) {
        boolean haySinonimos = false;
        for (String clave : sinonimos.keySet()) {
            if (sinonimos.get(clave).equals(palabra)) {
                if (haySinonimos) {
                    System.out.print(", ");
                }
                System.out.print(clave);
                haySinonimos = true;
            }
        }
        if (!haySinonimos) {
            System.out.print("No conozco sinónimos de esa palabra.");
        }
        System.out.println();
    }
}
