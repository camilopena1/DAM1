package SaberYGanar;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Jugador> jugadores;
    private int numeroRondas;
    private int rondasJugadas;

    public Partida(List<Jugador> jugadores, int numeroRondas) {
        this.jugadores = jugadores;
        this.numeroRondas = numeroRondas;
        this.rondasJugadas = 0;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumeroRondas() {
        return numeroRondas;
    }

    public void setNumeroRondas(int numeroRondas) {
        this.numeroRondas = numeroRondas;
    }

    public int getRondasJugadas() {
        return rondasJugadas;
    }

    public void setRondasJugadas(int rondasJugadas) {
        this.rondasJugadas = rondasJugadas;
    }

    public void jugarRonda() {
        if (rondasJugadas < numeroRondas) {
            for (Jugador jugador : jugadores) {
                // Aquí iría la lógica para que cada jugador responda una pregunta
                // Puedes llamar a métodos de otras clases para generar preguntas y calcular puntajes
            }
            rondasJugadas++;
        } else {
            System.out.println("La partida ha terminado.");
        }
    }

    public boolean partidaTerminada() {
        return rondasJugadas >= numeroRondas;
    }
}
