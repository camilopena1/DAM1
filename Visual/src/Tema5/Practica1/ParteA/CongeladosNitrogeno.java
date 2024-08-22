package Tema5.Practica1.ParteA;

public class CongeladosNitrogeno extends ProductosCongelados {
    String metodoCongelacion;
    int exposicionNitrogeno;

    public CongeladosNitrogeno(String fechaCaducida, int numLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, String metodoCongelacion, int exposicionNitrogeno) {
        super(fechaCaducida, numLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.exposicionNitrogeno = exposicionNitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getExposicionNitrogeno() {
        return exposicionNitrogeno;
    }

    public void setExposicionNitrogeno(int exposicionNitrogeno) {
        this.exposicionNitrogeno = exposicionNitrogeno;
    }

    @Override
    public String toString() {
        return super.toString() + "Metodo de Congelacion " + metodoCongelacion + "\n" +
                "Tiempo de exposicion " + exposicionNitrogeno + "\n";

    }

}
