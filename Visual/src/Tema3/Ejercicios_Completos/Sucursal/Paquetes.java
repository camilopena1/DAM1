package Tema3.Ejercicios_Completos.Sucursal;

public class Paquetes {
    private int referenciaEnvio;
    private double peso;
    private String dniRemitente;
    private int prioridadEnvio;
    private int precioEnvio;

    public Paquetes(int referenciaEnvio, double peso, String dniRemitente, int prioridadEnvio) {
        this.referenciaEnvio = referenciaEnvio;
        this.peso = peso;
        this.dniRemitente = dniRemitente;
        this.prioridadEnvio = prioridadEnvio;
        precioEnvio = 0;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridadEnvio() {
        return prioridadEnvio;
    }

    public void setPrioridadEnvio(int prioridadEnvio) {
        this.prioridadEnvio = prioridadEnvio;
    }

    public void setPrecioEnvio(int precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public void mostrarPaquete() {
        System.out.println("----------------------------------------");
        System.out.println("Referencia de Envio: " + referenciaEnvio);
        System.out.println("Dni remitente: " + dniRemitente);
        System.out.println("Peso del Paquete: " + peso);
        System.out.println("Prioridad del envio: " + prioridadEnvio);
        System.out.println("Precio Envio: " + precioEnvio);
        System.out.println("----------------------------------------");
    }
}
