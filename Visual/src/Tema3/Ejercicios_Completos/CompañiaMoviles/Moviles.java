package Tema3.Ejercicios_Completos.CompañiaMoviles;

enum Tarifa {
    ELEFANTE(0.30),
    TIGRE(0.18),
    GATO(0.07);

    private double costoPorMinuto;

    Tarifa(double costoPorMinuto) {
        this.costoPorMinuto = costoPorMinuto;
    }

    public double getCostoPorMinuto() {
        return costoPorMinuto;
    }
}

public class Moviles {
    private String numero;
    private Tarifa tarifa;
    private double consumoTotal;

    public Moviles(String numero, Tarifa tarifa) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.consumoTotal = 0;
    }

    public void reiniciarFactura() {
        consumoTotal = 0;
    }

    public void llamar(int duracionSegundos) {
        double costoPorMinuto = tarifa.getCostoPorMinuto();
        double costoLlamada = duracionSegundos * costoPorMinuto / 60;
        consumoTotal += costoLlamada;
    }

    public void resumenFactura() {
        System.out.println("Número: " + numero);
        System.out.println("Tarifa: " + tarifa.name());
        System.out.println("Consumo total: " + consumoTotal + "€");
    }
}
