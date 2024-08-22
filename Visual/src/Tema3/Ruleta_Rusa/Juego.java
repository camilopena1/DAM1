package Tema3.Ruleta_Rusa;

public class Juego {
    Jugador[] jugadores;
    Revolver revolver;

    public Juego(int numeroJugadores) {
        jugadores = new Jugador[numeroJugadores];
        revolver = new Revolver();
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador();
        }
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Turno del Jugador " + jugadores[i].getId());
            System.out.println(revolver.toString());
            jugadores[i].disparar(revolver);

            if (!jugadores[i].isVivo()) {
                finJuego();
                return;
            }
        }
    }

    public void finJuego() {
        System.out.println("El juego ha terminado");
    }

}
