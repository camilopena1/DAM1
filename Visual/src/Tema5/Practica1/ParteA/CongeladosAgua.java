package Tema5.Practica1.ParteA;

public class CongeladosAgua extends ProductosCongelados{
    int gramosSal;

    public CongeladosAgua(String fechaCaducida, int numLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, int gramosSal) {
        super(fechaCaducida, numLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.gramosSal = gramosSal;
    }

    public int getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(int gramosSal) {
        this.gramosSal = gramosSal;
    }

    @Override
    public String toString() {
        return super.toString() + "Salinidad" + gramosSal + "\n";
    }
    
}
