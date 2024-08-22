package Tema3.Ejercicios_Completos.Tren;

public class Asientos {
    private String letraAsiento;
    private int fila;

    public Asientos(String letraAsieto, int fila) {
        this.letraAsiento = letraAsieto;
        this.fila = fila;
    }

    public Asientos() {

    }

    public String comprobarLetra(boolean respuestaVentana, boolean ruestaMarcha) {
        String letra;
        if (respuestaVentana == true && ruestaMarcha == true) {
            letra = "A";
        } else if (respuestaVentana == true && ruestaMarcha == false) {
            letra = "C";
        } else if (respuestaVentana == false && ruestaMarcha == true) {
            letra = "B";
        } else {
            letra = "D";
        }

        return letra;

    }

    public void setLetraAsiento(String letraAsiento) {
        this.letraAsiento = letraAsiento;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String toString() {
        return "Asiento Fila: " + fila + "\t\t Posicion: " + letraAsiento;
    }

}
