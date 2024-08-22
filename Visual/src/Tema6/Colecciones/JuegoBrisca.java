package Tema6.Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class JuegoBrisca {
    public static void main(String[] args) {
        // Crear la baraja española con sus valores
        HashMap<String, Integer> valoresCartas = new HashMap<>();
        valoresCartas.put("as", 11);
        valoresCartas.put("tres", 10);
        valoresCartas.put("sota", 2);
        valoresCartas.put("caballo", 3);
        valoresCartas.put("rey", 4);
        // Cartas sin valor
        valoresCartas.put("dos", 0);
        valoresCartas.put("cuatro", 0);
        valoresCartas.put("cinco", 0);
        valoresCartas.put("seis", 0);
        valoresCartas.put("siete", 0);
        

        // Crear la lista de cartas
        ArrayList<Carta> mano = new ArrayList<>();

        // Crear un ArrayList para mantener un registro de las cartas ya seleccionadas
        ArrayList<String> cartasSeleccionadas = new ArrayList<>();

        // Generar una secuencia de 5 cartas aleatorias sin repetición
        String[] figuras = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
        String[] palos = {"oros", "copas", "espadas", "bastos"};
        Random random = new Random();
        while (mano.size() < 5) {
            int indiceFigura = random.nextInt(figuras.length);
            int indicePalo = random.nextInt(palos.length);
            String figura = figuras[indiceFigura];
            String palo = palos[indicePalo];
            String carta = figura + " de " + palo;
            if (!cartasSeleccionadas.contains(carta)) {
                mano.add(new Carta(figura, palo));
                cartasSeleccionadas.add(carta);
            }
        }

        // Calcular la suma de los puntos de las cartas
        int sumaPuntos = 0;
        for (Carta carta : mano) {
            sumaPuntos += valoresCartas.getOrDefault(carta.getFigura(), 0);
        }

        // Mostrar las cartas y la suma de puntos
        System.out.println("Cartas de la mano:");
        for (Carta carta : mano) {
            System.out.println(carta.getFigura() + " de " + carta.getPalo());
        }
        System.out.println("Suma de puntos: " + sumaPuntos);
    }
}

class Carta {
    private String figura;
    private String palo;

    public Carta(String figura, String palo) {
        this.figura = figura;
        this.palo = palo;
    }

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }
}
