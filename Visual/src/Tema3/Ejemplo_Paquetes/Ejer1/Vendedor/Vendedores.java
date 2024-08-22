package Tema3.Ejemplo_Paquetes.Ejer1.Vendedor;

import java.util.Date;

public class Vendedores {
    private String numeroVendedor;
    private String nombre;
    private Date fechaAlta;
    private double comision;

    public Vendedores() {
    }

    public Vendedores(String numeroVendedor, String nombre, Date fechaAlta, double comision) {
        this.numeroVendedor = numeroVendedor;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.comision = comision;
    }

    public String getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(String numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String toString() {
        return "Vendedores [numeroVendedor=" + numeroVendedor + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta
                + ", comision=" + comision + "]";
    }

}
