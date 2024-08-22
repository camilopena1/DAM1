package Obligatorio;


public class prubas {
   
    
    public static void main(String[] args) {    
        int columnas=10;
        int filas=10;
        String[][] tablero= new String [filas][columnas];
     // Encabezado de las columnas (números)
    System.out.print("     ");
    for (int i = 1; i <= columnas; i++) {
        System.out.printf("[%2d] ", i);
    }
    System.out.println(); // Nueva línea después del encabezado de las columnas

    // Inicializar el tablero con puntos
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            tablero[i][j] = ".";
        }
    }

    // Cuerpo del tablero con letras como encabezado de fila
    for (int i = 0; i < filas; i++) {
        char letraFila = (char) ('A' + i);
        System.out.printf("[%c]   ", letraFila); // Encabezado de fila (letras)
        for (int j = 0; j < columnas; j++) {
            System.out.print(tablero[i][j]);  // Sin corchetes alrededor de los puntos
            if (j < columnas - 1) {
                System.out.print("    ");  // Espacio entre las celdas
            }
        }
        System.out.println(); // Nueva línea después de cada fila
    }
}
        
}
