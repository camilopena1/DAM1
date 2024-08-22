package Tema3.ejercicios_ejemplos;

public class Punto_1 {
    // Atributos de la clase
    int x, y;

    // Constructor para inicializar las coordenadas
    public Punto_1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para imprimir las coordenadas
    public void imprimirCoordenadas() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

    // Método para modificar las coordenadas
    public void modificarCoordenadas(int nuevoX, int nuevoY) {
        // Se modifican las coordenadas
        this.x = nuevoX;
        this.y = nuevoY;
    }

    // Método para operar sobre las coordenadas
    public void operarCoordenadas(int sumaX, int restaY) {
        // Se realizan operaciones sobre las coordenadas
        this.x += sumaX;
        this.y -= restaY;
    }

    // Método para imprimir las coordenadas de manera diferente
    public void imprime() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Método para modificar ambas coordenadas
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar el punto en la cantidad (dx, dy) indicada
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto_1 p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
