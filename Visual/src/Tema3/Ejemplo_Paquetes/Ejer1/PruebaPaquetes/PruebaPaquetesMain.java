package Tema3.Ejemplo_Paquetes.Ejer1.PruebaPaquetes;

import java.util.Date;

import Tema3.Ejemplo_Paquetes.Ejer1.Producto.Productos;
import Tema3.Ejemplo_Paquetes.Ejer1.Vendedor.Vendedores;

public class PruebaPaquetesMain {
    public static void main(String[] args) {
        Vendedores vendedor1 = new Vendedores("1", "camilo", new Date(), 2.0);
        Vendedores vendedor2 = new Vendedores("2", "camila", new Date(), 2.0);
        Productos[] vectorProductos = new Productos[5];
        vectorProductos[0] = new Productos("25100","Lecheentera",0.78,800,1000);
        vectorProductos[1] = new Productos("25200", "Pan integral", 1.2, 500, 200);
        vectorProductos[2] = new Productos("25300", "Yogur natural", 0.99, 700, 150);
        vectorProductos[3] = new Productos("25400", "Manzanas", 0.5, 1000, 300);
        vectorProductos[4] = new Productos("25500", "Huevos", 1.5, 400, 50);
        System.out.println(vendedor1.toString());
        for (int i = 0; i < vectorProductos.length; i++) {
            System.out.println(vectorProductos[i].toString());
        }
    }
}
