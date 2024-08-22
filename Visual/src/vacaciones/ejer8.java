package vacaciones;

import java.util.Scanner;

public class ejer8 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de Euros (positiva): ");
        double euros = teclado.nextDouble();

        if (euros <= 0) {
            System.out.println("Error: La cantidad de Euros debe ser un valor positivo.");
            return;
        }

        System.out.print("Ingrese la divisa (LIBRA, DOLAR o YEN): ");
        String divisa = teclado.next().toUpperCase();

        double cambio;

        switch (divisa) {
            case "LIBRA":
                cambio = euros * 0.86;
                break;
            case "DOLAR":
                cambio = euros * 1.12;
                break;
            case "YEN":
                cambio = euros * 120.31;
                break;
            default:
                System.out.println("Error: Divisa no vÃ¡lida. Las opciones son LIBRA, DOLAR o YEN.");
                return;
        }

        System.out.println("La cantidad de " + euros + " Euros es equivalente a " + cambio + " " + divisa);
    }
}
