package Tema3.Ejercicios_Completos.Tren;

public class Billetes {
    private String ciudadOrigen;
    private String ciudadDestino;
    private String fecha;
    private double precio;
    private double precioConIva;
    private final double iva = 21.0;
    private String horaSalida;
    private String horaLlegada;

    public Billetes(String ciudadoOrigen, String ciudadDestino, String fecha) {
        this.ciudadOrigen = ciudadoOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fecha = fecha;
        precio = 20;
        horaSalida = "10:00";
        horaLlegada = "11:15";
    }

    public void calcularPrecioIva() {
        double precio = getPrecio();
        double montoIva;
        montoIva = (precio * iva) / 100;
        precio += montoIva;
        setPrecioConIva(precio);
    }

    public void setPrecioConIva(double precioConIva) {
        this.precioConIva = precioConIva;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "Origen: " + ciudadOrigen + "\t \tHora de salida: " + horaSalida + "\n" +
                "Destino: " + ciudadDestino + "\t Hora de llegada: " + horaLlegada + "\n" +
                "---------------------------------------------------------\n" +
                "Fecha: " + fecha + "\t Precion con IVA " + precioConIva + "\n" +
                "---------------------------------------------------------";
    }
}
