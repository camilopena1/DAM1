package Tema6.Colecciones.Ejer8;

public class Elemento {
    private String nombre;
    private double precio;
    private int cantidad;

    public Elemento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    @Override

    public String toString() {

        return nombre + " PVP: " + String.format("%.2f", precio) + " Unidades: " + cantidad + " Subtotal: "
                + String.format("%.2f", calcularSubtotal());

    }

}
