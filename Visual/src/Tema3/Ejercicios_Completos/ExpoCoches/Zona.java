package Tema3.Ejercicios_Completos.ExpoCoches;

public class Zona {
    private String nombre;
    private int entradasDisponibles;

    public Zona(String nombre, int entradasDisponibles) {
        this.nombre = nombre;
        this.entradasDisponibles = entradasDisponibles;
    }

    public void venderEntradas(int cantidad) {
        if (cantidad > 0 && cantidad <= entradasDisponibles) {
            entradasDisponibles -= cantidad;
            System.out.println(
                    "Venta realizada correctamente. Entradas restantes en " + nombre + ": " + entradasDisponibles);
        } else {
            System.out.println("No hay suficientes entradas disponibles para realizar la venta en " + nombre + ".");
        }
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

}
