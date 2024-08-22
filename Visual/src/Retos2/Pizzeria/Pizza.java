package Retos2.Pizzeria;

public class Pizza {
    private String tipo;
    private String tamanio;
    private String estado;
    private static int numeroPizzas = 0;
    private static int totalPedidas = 0;

    public Pizza(String tipo, String tamanio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        estado = "pedida";
        numeroPizzas++;
    }

    public void servirPizza() {
        String estadoPizza = getEstado();
        if (estadoPizza.equals("servida"))
            System.out.println("esa pizza ya se ha servido");
        else {
            estado = "servida";
            totalPedidas++;
        }

    }

    public String getEstado() {
        return estado;
    }

    public void mostrarPizza() {
        System.out.println("Pizza " + tipo + " " + tamanio + ", " + estado);
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getNumeroPizzas() {
        return numeroPizzas;
    }

}
