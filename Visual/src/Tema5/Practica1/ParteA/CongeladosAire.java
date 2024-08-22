package Tema5.Practica1.ParteA;

public class CongeladosAire extends ProductosCongelados {
    // porcentaje del aire
    int nitrogeno;
    int oxigeno;
    int co2;
    int vaporAgua;

    public CongeladosAire(String fechaCaducida, int numLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, int nitrogeno, int oxigeno, int co2, int vaporAgua) {
        super(fechaCaducida, numLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vaporAgua = vaporAgua;
    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(int vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "Porcentaje Vapor de Agua " + vaporAgua + "\n" +
                "Porcentaje nitrogeno " + nitrogeno + "\n" +
                "Porcentaje CO2 " + co2 + "\n" +
                "Porcentaje oxigeno " + oxigeno + "\n";

    }

}
