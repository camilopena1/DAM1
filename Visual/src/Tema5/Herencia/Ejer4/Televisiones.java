package Tema5.Herencia.Ejer4;

public class Televisiones extends Electrodomesticos {
    private double pulgadas;
    private boolean sintonizarTDT;

    public Televisiones() {
        super();
        this.pulgadas = 20;
        this.sintonizarTDT = false;

    }

    public Televisiones(int precioBase, int peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.sintonizarTDT = false;
    }

    public Televisiones(int precioBase, String color, char consumoEnergetico, int peso, double pulgadas,boolean sintonizarTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizarTDT = sintonizarTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizarTDT() {
        return sintonizarTDT;
    }
    @Override
    public double precioFinal(){
        double precioFinal=super.precioFinal();
        if (getPulgadas()>40 && isSintonizarTDT()== true){
            return precioFinal*1.30+50;        }

        return precioFinal;

    }
}
