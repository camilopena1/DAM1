package Tema3.ejercicios_ejemplos;

public class Articulo_1 {
    String nombre;
    int precio;
    final int iva = 21;
    int cuantosQuedan;

    public Articulo_1(String nombre, int precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    public static void main(String[] args) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public static void mostrarArticulo(Articulo_1 articulo) {

        System.out.println("Nombre " + articulo.getNombre());
        System.out.println("Precio " + articulo.getPrecio());
        System.out.println("Cuantos quedan " + articulo.getCuantosQuedan());
    }
    // Método que devuelve el precio de venta al público (PVP) con iva incluido
    public double getPVP() {
        return precio * (1 + iva / 100.0);
    }

    // Método que devuelve el PVP con un descuento pasado como argumento
    public double getPVPDescuento(int descuentoPorcentaje) {
        double precioConDescuento = precio * (1 - descuentoPorcentaje / 100.0);
        return precioConDescuento * (1 + iva / 100.0);
    }

    // Método que actualiza los atributos tras vender una cantidad 'x'
    // Devuelve true si ha sido posible (false en caso contrario)
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Método que actualiza los atributos tras almacenar una cantidad 'x'
    // Devuelve true si ha sido posible (false en caso contrario)
    public boolean almacenar(int cantidad) {
        if (cantidad > 0) {
            cuantosQuedan += cantidad;
            return true;
        } else {
            return false;
        }
    }
}
