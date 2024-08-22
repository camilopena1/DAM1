package Tema6.Colecciones.Ejer8;

public class MainCarrito {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("tarjeta", 1, 1));
        miCarrito.agrega(new Elemento("placa", 10, 1));
        System.out.println(miCarrito);
        System.out.println("hay " + miCarrito.numeroElementos());
        System.out.println("productos en la cesta");
        System.out.println("el total asciende a " + miCarrito.importeTotal() + "euros");
        System.out.println("continua la compra");
        miCarrito.agrega(new Elemento("samsunj", 1000, 2));
        miCarrito.agrega(new Elemento("iphone 15", 1500, 1));
        System.out.println(miCarrito);
        System.out.println("hay " + miCarrito.numeroElementos());
        System.out.println("productos en la cesta");
        System.out.println("el total asciende a " + miCarrito.importeTotal() + "euros");
    }
}
