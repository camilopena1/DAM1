package SaberYGanar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JugadorGestion jugadorManager = new JugadorGestion();
        Ranking rankingManager = new Ranking();
        Historico historicoManager = new Historico();

        boolean continuar = true;
        while (continuar) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    jugarPartida(jugadorManager, rankingManager, historicoManager, scanner);
                    break;
                case 2:
                    rankingManager.mostrarRanking();
                    break;
                case 3:
                    historicoManager.mostrarHistorial();
                    break;
                case 4:
                    gestionarJugadores(jugadorManager, scanner);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("------------------------->| Opciones del juego |<-------------------------");
        System.out.println("\n   » —— ╫ ▶︎ ╫ —— « Jugar Partida\t(1)\r\n\n" + "   » —— ╫ ♛ ╫ —— « Ranking\t\t(2)\r\n\n"
                + "   » —— ╫ ✎ ╫ —— « Histórico\t\t(3) \r\n\n" + "   » —— ╫ 👤 ╫ —— « Jugadores\t\t(4) \r\n\n"
                + "   » —— ╫ ❈ ╫ —— « Salir\t\t(5)");
        System.out.println();
        System.out.print("Elige una opción: ");
    }

    public static void jugarPartida(JugadorGestion jugadorManager, Ranking rankingManager, Historico historicoManager, Scanner scanner) {
        System.out.println("Iniciando nueva partida...");

        // Obtener información para iniciar la partida
        System.out.print("Introduce el número de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Nombre del jugador " + (i+1) + ": ");
            String nombre = scanner.nextLine();
            Jugador jugador = jugadorManager.buscarJugador(nombre);
            if (jugador != null) {
                jugadores.add(jugador);
            } else {
                System.out.println("El jugador " + nombre + " no está registrado.");
                return;
            }
        }

        System.out.print("Introduce el número de rondas: ");
        int numRondas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear una nueva partida
        Partida partida = new Partida(jugadores, numRondas);

        // Realizar cada ronda de la partida
        for (int i = 0; i < numRondas; i++) {
            System.out.println("Ronda " + (i + 1) + ":");
            partida.jugarRonda();
        }

        // Mostrar puntuaciones finales y al ganador
        System.out.println("Partida terminada.");
        System.out.println("Puntuaciones finales:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntuacion());
        }
        rankingManager.actualizarRanking(jugadores);
        historicoManager.agregarPartida(partida);
    }


    public static void gestionarJugadores(JugadorGestion jugadorManager, Scanner scanner) {
        // Aquí iría la lógica para gestionar los jugadores, utilizando el objeto de JugadorManager
        System.out.println("¡Función no implementada!");
    }
}
