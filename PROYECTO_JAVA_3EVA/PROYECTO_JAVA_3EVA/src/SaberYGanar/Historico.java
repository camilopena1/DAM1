package SaberYGanar;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Partida> partidas;

    public Historico() {
        this.partidas = new ArrayList<>();
    }

    public void agregarPartida(Partida partida) {
        partidas.add(partida);
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void mostrarHistorial() {
        System.out.println("Historial de Partidas:");
        for (Partida partida : partidas) {
            System.out.println("Jugadores: ");
            for (Jugador jugador : partida.getJugadores()) {
                System.out.print(jugador.getNombre() + " ");
            }
            System.out.println("- Puntuaciones:");
            for (Jugador jugador : partida.getJugadores()) {
                System.out.print(jugador.getNombre() + ": " + jugador.getPuntuacion() + " ");
            }
            System.out.println();
        }
    }
}
