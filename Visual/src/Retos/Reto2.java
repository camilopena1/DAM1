package Retos;

import java.util.Scanner;

public class Reto2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numEntradas;
        double precioEntrada=0;
        double descuento=0;
        String cineCampa;
        String diaSemana;
        double precio=0;
        System.out.println("Bienvenidos al cine ");
        System.out.println("cuantas entradas quiere");
        numEntradas=sc.nextDouble();
        System.out.println("que dia de la es?");
        sc.nextLine();
        diaSemana=sc.nextLine();
        System.out.println("tienes tarjeta CineCampa?");
        cineCampa=sc.nextLine();

        switch(diaSemana.toLowerCase()){
            case "lunes":
            case "martes":
            case "viernes":
            case "sabado":
            case "domingo":
                precioEntrada=8;
                precio=precioEntrada*numEntradas;
            break;
            case "miercoles":
                precioEntrada=5;
                precio=precioEntrada*numEntradas;
            break;
            case "jueves":
                double precioEntradaDoble=11;
                double precionEntradaSola=8;
                double doble=0;
                
                if(numEntradas%2!=0){
                    doble=numEntradas-1;
                    
                }
                precio=(precioEntradaDoble*doble)+(precionEntradaSola);
        }
        if (cineCampa.equals("s")){
            descuento=0.10;
        }
        descuento=precio*descuento;
        System.out.println("aqui tiene sus entradas ");
        System.out.println("Entradas individuales"+numEntradas);
        System.out.println("precio por entrada: "+precioEntrada);
        System.out.println("Total "+precio+" €");
        System.out.println("descuento "+descuento);
        System.out.println("A pagar "+(precio-descuento));
    sc.close();
    }
}