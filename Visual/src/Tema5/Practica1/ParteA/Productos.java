package Tema5.Practica1.ParteA;

public class Productos {
    String fechaCaducida;
    int numLote;
    
    public Productos(String fechaCaducida, int numLote) {
        this.fechaCaducida = fechaCaducida;
        this.numLote = numLote;
    }

    public String getFechaCaducida() {
        return fechaCaducida;
    }

    public void setFechaCaducida(String fechaCaducida) {
        this.fechaCaducida = fechaCaducida;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Nº de Lote......." + numLote + "\n";
    }

}
