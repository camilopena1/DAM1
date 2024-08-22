package Tema3.ejercicios_ejemplos;

public class Rectangulo_1 {
    class Rectangulo {
        int x1, y1, x2, y2;
    
        // Constructor
        Rectangulo(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    
        String obtenerCoordenadas() {
            return "Coordenadas: (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")";
        }
    
        int obtenerPerimetro() {
            return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
        }
    
        int obtenerArea() {
            return Math.abs(x2 - x1) * Math.abs(y2 - y1);
        }
    }
    
    public class Main {
        public void main(String[] args) {
            // Instancia dos objetos Rectangulo
            Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
            Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);
    
            // Muestra las propiedades del primer rectángulo
            System.out.println("Rectángulo 1:");
            System.out.println(rectangulo1.obtenerCoordenadas());
            System.out.println("Perímetro: " + rectangulo1.obtenerPerimetro());
            System.out.println("Área: " + rectangulo1.obtenerArea());
    
            // Muestra las propiedades del segundo rectángulo
            System.out.println("\nRectángulo 2:");
            System.out.println(rectangulo2.obtenerCoordenadas());
            System.out.println("Perímetro: " + rectangulo2.obtenerPerimetro());
            System.out.println("Área: " + rectangulo2.obtenerArea());
    
            // Modifica las coordenadas
            rectangulo1.x1 = 2;
            rectangulo1.y1 = 3;
            rectangulo1.x2 = 8;
            rectangulo1.y2 = 7;
    
            rectangulo2.x1 = 1;
            rectangulo2.y1 = 1;
            rectangulo2.x2 = 4;
            rectangulo2.y2 = 6;
    
            // Muestra las propiedades actualizadas del primer rectángulo
            System.out.println("\nRectángulo 1 (después de la modificación):");
            System.out.println(rectangulo1.obtenerCoordenadas());
            System.out.println("Perímetro: " + rectangulo1.obtenerPerimetro());
            System.out.println("Área: " + rectangulo1.obtenerArea());
    
            // Muestra las propiedades actualizadas del segundo rectángulo
            System.out.println("\nRectángulo 2 (después de la modificación):");
            System.out.println(rectangulo2.obtenerCoordenadas());
            System.out.println("Perímetro: " + rectangulo2.obtenerPerimetro());
            System.out.println("Área: " + rectangulo2.obtenerArea());
        }
    }
}
