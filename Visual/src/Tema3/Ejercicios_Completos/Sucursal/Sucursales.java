package Tema3.Ejercicios_Completos.Sucursal;

public class Sucursales {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursales(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void calcularPrecioEnvio(Paquetes[] paquetesArray) {
        for (Paquetes paquete : paquetesArray) {
            int prioridadEnvio = paquete.getPrioridadEnvio();
            int precioEnvio;
            if (prioridadEnvio == 0) {
                precioEnvio = 0;
            } else if (prioridadEnvio == 1) {
                precioEnvio = 10;
            } else {
                precioEnvio = 20;
            }
            paquete.setPrecioEnvio(precioEnvio);
        }
    }

    public void mostrarSucursal(){
        System.out.println("Numero de la sucursal "+numeroSucursal);
        System.out.println("Numero de la direccion "+direccion);
        System.out.println("Numero de la ciudad "+ciudad);

    }

}
