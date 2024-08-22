package SaberYGanar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking {
    private List<Jugador> jugadores;

    public Ranking() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        ordenarPorPuntuacion(); // Después de agregar un jugador, ordenamos automáticamente el ranking
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void ordenarPorPuntuacion() {
        // Ordenar los jugadores por puntuación en orden descendente
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                return Integer.compare(jugador2.getPuntuacion(), jugador1.getPuntuacion());
            }
        });
    }

    public void mostrarRanking() {
        System.out.println("Ranking de Jugadores:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre() + " - Puntuación: " + jugadores.get(i).getPuntuacion());
        }
    }
    
    public void actualizarRanking(List<Jugador> jugadores) {
        // Actualizar la lista de jugadores en el ranking
        for (Jugador jugador : jugadores) {
            if (this.jugadores.contains(jugador)) {
                // Si el jugador ya está en el ranking, se actualiza su puntuación
                for (Jugador rankingJugador : this.jugadores) {
                    if (rankingJugador.getNombre().equals(jugador.getNombre())) {
                        rankingJugador.setPuntuacion(jugador.getPuntuacion());
                        break;
                    }
                }
            } else {
                // Si el jugador no está en el ranking, se agrega a la lista
                this.jugadores.add(jugador);
            }
        }

        // Ordenar los jugadores por puntuación en orden descendente
        ordenarPorPuntuacion();
    }
}
