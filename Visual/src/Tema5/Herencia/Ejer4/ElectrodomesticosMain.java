package Tema5.Herencia.Ejer4;

public class ElectrodomesticosMain {
    public static void main(String[] args) {
        Electrodomesticos[] losElectrodomesticos = new Electrodomesticos[3];
        losElectrodomesticos[0] = new Lavadoras(200, "blanco", 'A', 30);
        losElectrodomesticos[1] = new Televisiones(500, "negro", 'C', 20, 50, true);
        losElectrodomesticos[2] = new Electrodomesticos(300, 20);
        double precioElectrodomesticos = 0;
        double precioTeles = 0;
        double precioLavadoras = 0;

        for (int i = 0; i < losElectrodomesticos.length; i++) {
           
            System.out.println(losElectrodomesticos[i].getPrecioBase());

            if (losElectrodomesticos[i] instanceof Lavadoras) {
                precioLavadoras += losElectrodomesticos[i].precioFinal();
                precioElectrodomesticos+=precioLavadoras;
            } else if (losElectrodomesticos[i] instanceof Televisiones) {
                precioTeles += losElectrodomesticos[i].precioFinal();
                precioElectrodomesticos+=precioTeles;
            } else if (losElectrodomesticos[i] instanceof Electrodomesticos){
                precioElectrodomesticos += losElectrodomesticos[i].precioFinal();
            }

        }
        System.out.println("El precio de las lavadoras es "+precioLavadoras);
        System.out.println("El precio de las teles es "+precioTeles);
        System.out.println("El precio de los electrodomesticos es "+precioElectrodomesticos);
    }
}
