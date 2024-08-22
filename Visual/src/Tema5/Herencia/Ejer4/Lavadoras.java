package Tema5.Herencia.Ejer4;

public class Lavadoras extends Electrodomesticos {
    private final int cargaDefecto=5;
    private int carga;

    

    public Lavadoras(int carga) {
        super();
        this.carga = carga;
    }

    public Lavadoras(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = cargaDefecto;
    }

    public Lavadoras(int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = cargaDefecto;
    }

    public int getCarga() {
        return carga;
    }
    @Override
    public double precioFinal(){
        double precioFinal=super.precioFinal();
        if (getCarga()>30) {
            precioFinal+=50;
        }

        return precioFinal;
    }
    
}
