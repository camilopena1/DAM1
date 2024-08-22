package Tema3.ejercicios_ejemplos;

public class ejemploPunto {
    public static void main(String[] args) {
        Punto_1 punto1 = new Punto_1(5, 0);
        Punto_1 punto2 = new Punto_1(10, 10);
        Punto_1 punto3 = new Punto_1(-3, 7);

        // Imprimir coordenadas iniciales
        System.out.println("Coordenadas iniciales:");
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();

        // Modificar ambas coordenadas
        punto1.setXY(8, 2);

        // Desplazar los puntos
        punto2.desplaza(5, 3);
        punto3.desplaza(-1, 10);

        // Imprimir coordenadas modificadas
        System.out.println("\nCoordenadas modificadas:");
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();

        // Calcular y mostrar la distancia entre dos puntos
        double distanciaEntrePuntos = punto1.distancia(punto2);
        System.out.println("\nDistancia entre punto1 y punto2: " + distanciaEntrePuntos);
    }
}
