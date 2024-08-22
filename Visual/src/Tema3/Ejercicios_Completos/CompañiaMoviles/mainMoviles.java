package Tema3.Ejercicios_Completos.CompañiaMoviles;

public class mainMoviles {
    
    public static void main(String[] args) {
        Moviles movil1 = new Moviles("666666", Tarifa.GATO);
        Moviles movil2 = new Moviles("555555", Tarifa.TIGRE);
        
        movil1.llamar(120);
        movil2.llamar(140);
        
        movil1.resumenFactura();
        movil2.resumenFactura();

        movil1.reiniciarFactura();
        movil2.reiniciarFactura();
        // mostrar factura despues del reinicio
        movil1.resumenFactura();
        movil2.resumenFactura();
        
    }

}
