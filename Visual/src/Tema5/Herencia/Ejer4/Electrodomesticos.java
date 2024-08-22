package Tema5.Herencia.Ejer4;

public class Electrodomesticos {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomesticos() {
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean comprobarLetra(char letra) {
        boolean comprobacion = false;
        switch (letra) {
            case 'A':
                comprobacion = true;
                break;
            case 'B':
                comprobacion = true;
                break;
            case 'C':
                comprobacion = true;
                break;
            case 'D':
                comprobacion = true;
                break;
            case 'E':
                comprobacion = true;
                break;
            case 'F':
                comprobacion = true;
                break;
            default:
                System.out.println("Letra incorrecta");
                break;
        }

        return comprobacion;
    }

    public void comprobarColor(String color) {

    }

    public double precioFinal() {
        double precioFinal = 0;
        double precioBase = getPrecioBase();
        char letra = getConsumoEnergetico();
        int peso = getPeso();
        switch (letra) {
            case 'A':
                precioFinal = 100;
                break;
            case 'B':
                precioFinal = 80;

                break;
            case 'C':
                precioFinal = 60;

                break;
            case 'D':
                precioFinal = 50;
                break;
            case 'E':
                precioFinal = 30;
                break;
            case 'F':
                precioFinal = 10;
                break;
            default:
                System.out.println("mal");
                break;
        }
        if (peso >= 0 && peso < 20) {
            precioFinal += 10;
        } else if (peso >= 20 && peso < 50) {
            precioFinal += 50;
        } else if (peso >= 50 && peso < 80) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal + precioBase;
    }

}
