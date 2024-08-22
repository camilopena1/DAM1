package Tema5.Ejer_Amplicacion.Herencia;

public class EmpleadoComision extends Empleados {
    private int sueldoBase;
    private int numeroClientes;
    private double comisioCliente;
    private double sueldoTotal;

    public EmpleadoComision(String dNI, String nombre, String apellido, String anioContratacion, int sueldoBase,
            int numeroClientes, double comisioCliente) {
        super(dNI, nombre, apellido, anioContratacion);
        sueldoBase = 950;
        this.numeroClientes = numeroClientes;
        this.comisioCliente = comisioCliente;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public double getComisioCliente() {
        return comisioCliente;
    }

    public void setComisioCliente(double comisioCliente) {
        this.comisioCliente = comisioCliente;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    @Override
    public double getSalario() {
        return sueldoTotal;
    }

}
