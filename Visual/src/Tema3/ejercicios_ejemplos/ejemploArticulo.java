package Tema3.ejercicios_ejemplos;

public class ejemploArticulo {
    public static void main(String[] args) {
        Articulo_1 articulo = new Articulo_1("Producto", 100, 50);
        Articulo_1.mostrarArticulo(articulo);
        System.out.println("PVP con IVA: " + articulo.getPVP());
        System.out.println("PVP con descuento: " + articulo.getPVPDescuento(10));

        // Vender y almacenar
        System.out.println("Vender 20 unidades: " + articulo.vender(20));
        Articulo_1.mostrarArticulo(articulo);

        System.out.println("Almacenar 10 unidades: " + articulo.almacenar(10));
        Articulo_1.mostrarArticulo(articulo);
    }
}
