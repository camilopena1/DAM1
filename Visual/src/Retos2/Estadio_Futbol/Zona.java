package Retos2.Estadio_Futbol;

public class Zona {
    private String nombreZona;
    private int numeroEntradas;
    private double precioEntrada;

    public Zona(String nombreZona, int numeroEntradas, double precioEntrada) {
        this.nombreZona = nombreZona;
        this.numeroEntradas = numeroEntradas;
        this.precioEntrada = precioEntrada;
    }

    public void venderEntrada(int numEntradas) {
        double entradasDisponible = (double) getNumeroEntradas();
        double precio = getPrecioEntrada();
        if (numEntradas < entradasDisponible) {
            System.out.println("EL precio de las entradas es " + precio * numEntradas);
            entradasDisponible-=numEntradas;
            setNumeroEntradas((int)entradasDisponible);
        } else if (numEntradas > entradasDisponible) {
            System.out.println("NO hay tantas entradas");
            
        }

    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public String getNombreZona() {
        return nombreZona;
    }

}
