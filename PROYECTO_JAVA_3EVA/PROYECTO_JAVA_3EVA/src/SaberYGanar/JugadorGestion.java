package SaberYGanar;

import java.util.ArrayList;
import java.util.List;

public class JugadorGestion {
    private List<Jugador> jugadoresRegistrados;

    public JugadorGestion() {
        this.jugadoresRegistrados = new ArrayList<>();
    }

    public void registrarJugador(Jugador jugador) {
        // Validar si ya existe un jugador con el mismo nombre antes de registrar
        if (!existeJugador(jugador.getNombre())) {
            jugadoresRegistrados.add(jugador);
        } else {
            System.out.println("Ya existe un jugador con el nombre " + jugador.getNombre() + ".");
        }
    }

    public List<Jugador> getJugadoresRegistrados() {
        return jugadoresRegistrados;
    }

    public Jugador buscarJugador(String nombre) {
        for (Jugador jugador : jugadoresRegistrados) {
            if (jugador.getNombre().equals(nombre)) {
                return jugador;
            }
        }
        System.out.println("No se encontró ningún jugador con el nombre " + nombre + ".");
        return null;
    }

    public void eliminarJugador(String nombre) {
        Jugador jugador = buscarJugador(nombre);
        if (jugador != null) {
            jugadoresRegistrados.remove(jugador);
            System.out.println("El jugador " + nombre + " ha sido eliminado del sistema.");
        } else {
            System.out.println("No se puede eliminar. Jugador no encontrado.");
        }
    }

    private boolean existeJugador(String nombre) {
        for (Jugador jugador : jugadoresRegistrados) {
            if (jugador.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
