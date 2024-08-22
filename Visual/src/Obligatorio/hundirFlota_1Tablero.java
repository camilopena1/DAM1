package Obligatorio;

import java.util.Random;
import java.util.Scanner;

public class hundirFlota_1Tablero {
    private static int filas;
    private static int columnas;
    private static int intentos;
    private static String[][] tablero;
    private static Scanner scanner;

    private static void inicializarJuego() {
        intentos = filas + columnas + 5;
        tablero = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ".";
            }
        }
    }

    private static void mostrarTablero() {
        System.out.print("    ");
        for (int i = 0; i < columnas; i++) {
            System.out.printf("[%2d] ", i);
        }
        System.out.println();
    
        for (int i = 0; i < filas; i++) {
            System.out.printf("[%c] ", (char) ('A' + i)); // Letra de la fila entre corchetes
            for (int j = 0; j < columnas; j++) {
                String contenido = tablero[i][j];
                int espacios = 4 - contenido.length(); // Ajustar la anchura de la celda
                String espaciosFormat = "%-" + espacios + "s";
                System.out.printf(espaciosFormat + "%s ", "", contenido);
            }
            System.out.println();
        }
        System.out.println();
    }
    

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
    
        while (intentos > 0) {
            mostrarTablero();
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Ingresa fila y columna para disparar (separados por espacio): ");
    
            try {
                String[] input = scanner.nextLine().split(" ");
                int filaDisparo = input[0].toUpperCase().charAt(0) - 'A';
                int columnaDisparo = Integer.parseInt(input[1]);
    
                if (filaDisparo >= 0 && filaDisparo < filas && columnaDisparo >= 0 && columnaDisparo < columnas) {
                    if (realizarDisparo(filaDisparo, columnaDisparo)) {
                        System.out.println("¡Barco impactado!");
                        if (haGanado()) {
                            System.out.println("¡Felicidades! ¡Has hundido todos los barcos!");
                            break;
                        }
                    } else {
                        System.out.println("Agua. ¡Sigue intentándolo!");
                    }
    
                    intentos--;
                } else {
                    System.err.println("Coordenadas fuera de los límites del tablero. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Entrada no válida. Debes ingresar una letra seguida de un número separados por espacio.");
            }
            scanner.close();
        }
    
        // No cerramos el Scanner para evitar cerrar la entrada estándar del programa.
    }

    private static boolean realizarDisparo(int fila, int columna) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            System.out.println("Disparo fuera de los límites del tablero. Inténtalo de nuevo.");
            return false;
        }

        if (!tablero[fila][columna].equals(".")) {
            tablero[fila][columna] = "X"; // Marcar el barco como impactado
            return true;
        }

        return false;
    }

    private static boolean haGanado() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!tablero[i][j].equals(".") && !tablero[i][j].equals("X")) {
                    return false; // Aún hay barcos no hundidos
                }
            }
        }
        return true; // Todos los barcos han sido hundidos
    }

    private static void colocarBarcosAleatorios() {
        colocarBarco(5, "B5");
        colocarBarco(5, "B5");
        colocarBarco(3, "B3");
        colocarBarco(3, "B3");
        colocarBarco(3, "B3");
        colocarBarco(2, "B2");
        colocarBarco(2, "B2");
        colocarBarco(2, "B2");
        colocarBarco(2, "B2");
        colocarBarco(2, "B2");
    }

    private static void colocarBarco(int longitud, String etiqueta) {
        Random random = new Random();
        boolean barcoColocado = false;

        while (!barcoColocado) {
            int filaInicial = random.nextInt(filas);
            int columnaInicial = random.nextInt(columnas);
            boolean horizontal = random.nextBoolean();

            if (puedeColocarBarco(filaInicial, columnaInicial, longitud, horizontal)) {
                colocarBarcoEnTablero(filaInicial, columnaInicial, longitud, horizontal, etiqueta);
                barcoColocado = true;
            }
        }
    }

    private static boolean puedeColocarBarco(int fila, int columna, int longitud, boolean horizontal) {
        if (horizontal) {
            if (columna + longitud > columnas) {
                return false;
            }
            for (int i = 0; i < longitud; i++) {
                if (!tablero[fila][columna + i].equals(".")) {
                    return false;
                }
            }
        } else {
            if (fila + longitud > filas) {
                return false;
            }
            for (int i = 0; i < longitud; i++) {
                if (!tablero[fila + i][columna].equals(".")) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void colocarBarcoEnTablero(int fila, int columna, int longitud, boolean horizontal, String etiqueta) {
        if (horizontal) {
            for (int i = 0; i < longitud; i++) {
                tablero[fila][columna + i] = etiqueta;
            }
        } else {
            for (int i = 0; i < longitud; i++) {
                tablero[fila + i][columna] = etiqueta;
            }
        }
    }

    private static void inicializarVariables() {
        scanner = new Scanner(System.in);
        boolean filasBoolean = false;
        boolean columnasBoolean = false;
        System.out.println("Introduce el numero de filas y columnas");
        System.out.println("minimo 10 maximo 15");
        do {
            System.out.println("Introduce el numero de filas");
            filas = scanner.nextInt();
            filasBoolean = comprobarFilasYColumnas(filas);
        } while (filasBoolean);
        do {
            System.out.println("Introduce el numero de columnas");
            columnas = scanner.nextInt();
            columnasBoolean = comprobarFilasYColumnas(columnas);
        } while (columnasBoolean);
    }

    private static boolean comprobarFilasYColumnas(int comprobarFila) {
        int min = 10;
        int max = 15;
        if (comprobarFila >= min && comprobarFila <= max) {
            return false; // El valor está dentro del rango válido
        } else {
            throw new IllegalArgumentException("Error: el valor está fuera del rango permitido.");
        }
    }

    public static void main(String[] args) {
        inicializarVariables();
        inicializarJuego();
        colocarBarcosAleatorios();
        jugar();
        
        // Cerrar el Scanner al final del programa.
        scanner.close();
    }
}
