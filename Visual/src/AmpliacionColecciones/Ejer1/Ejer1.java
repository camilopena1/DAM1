package AmpliacionColecciones.Ejer1;

import java.util.*;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<String, Double>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
        
        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<Integer> listaCantidad = new ArrayList<>();
        String productoIntroducido = "";
        int cantidadIntroducidad = 0;
        do {
            
            System.out.print("Producto ");
            productoIntroducido = sc.nextLine();
            if (!productoIntroducido.equals("fin")) {
                System.out.print("Cantidad ");
                cantidadIntroducidad = sc.nextInt();
                if (listaProductos.contains(productoIntroducido)) {
                    int posicion = listaProductos.indexOf(productoIntroducido);
                    listaCantidad.set(posicion, listaCantidad.get(posicion)+ cantidadIntroducidad);
                }else{
                listaProductos.add(productoIntroducido);
                listaCantidad.add(cantidadIntroducidad);
            }
            }
            sc.nextLine();

        } while (!productoIntroducido.equals("fin"));
        System.out.println("introduce un codigo de descuento(INTRO si no tiene ninguna)");
        String codDescuento=sc.nextLine();

        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("-----------------------------------");
        double total = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            String producto = listaProductos.get(i);
            double precio = productos.get(producto);
            int cantidad = listaCantidad.get(i);
            double subtotal = precio * cantidad;
            total += subtotal;
            System.out.printf("%-8s %7.2f %6d %7.2f\n", producto, precio, cantidad,
                    subtotal);
        }
        double descuento =0;
        if (codDescuento.equals("ECODTO")) {
            descuento=total/10.0;
            total-=descuento;
            
        }
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f", total);
        sc.close();
    }
}
