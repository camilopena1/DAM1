package Tema3.Ruleta_Rusa;

public class JuegoMain {
    public static void main(String[] args) {
        int numeroJugadores=6;
        Juego juego = new Juego(numeroJugadores);
        juego.ronda();
    }
}
