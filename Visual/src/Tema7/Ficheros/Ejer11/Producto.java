package Tema7.Ficheros.Ejer11;

public class Producto {
    private String nombre;
    private int cantida;
    private int precio;
    
    public Producto(String nombre, int cantida, int precio) {
        this.nombre = nombre;
        this.cantida = cantida;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantida=" + cantida + ", precio=" + precio + "]";
    }
    
}
