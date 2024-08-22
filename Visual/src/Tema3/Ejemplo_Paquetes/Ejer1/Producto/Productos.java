package Tema3.Ejemplo_Paquetes.Ejer1.Producto;

public class Productos {
    private String codigo;
    private String tipo;
    private double precio;
    private int stokActual;
    private int stokMinimo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStokActual() {
        return stokActual;
    }

    public void setStokActual(int stokActual) {
        this.stokActual = stokActual;
    }

    public int getStokMinimo() {
        return stokMinimo;
    }

    public void setStokMinimo(int stokMinimo) {
        this.stokMinimo = stokMinimo;
    }

    public Productos() {
    }

    public Productos(String codigo, String tipo, double precio, int stokActual, int stokMinimo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
        this.stokActual = stokActual;
        this.stokMinimo = stokMinimo;
    }

    public String toString() {
        return "Productos [codigo=" + codigo + ", tipo=" + tipo + ", precio=" + precio + ", stokActual=" + stokActual
                + ", stokMinimo=" + stokMinimo + "]";
    }

}
