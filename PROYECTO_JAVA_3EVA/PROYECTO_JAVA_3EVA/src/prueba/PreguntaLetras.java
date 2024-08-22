package prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PreguntaLetras extends Pregunta {
    private static final String archivo_diccionario = "E:\\DAM1\\Programacion\\PROYECTO_JAVA_3EVA\\PROYECTO_JAVA_3EVA\\diccionario.txt";
    private List<String> palabras;
    private String palabraSeleccionada;
    private String palabraOculta;

    public PreguntaLetras(String enunciado) {
        super(enunciado);
        this.palabras = cargarPalabrasDesdeArchivo(archivo_diccionario);
        if (!palabras.isEmpty()) {
            seleccionarPalabra();
            ocultarLetras();
        } else {
            System.out.println("No se encontraron palabras en el diccionario.");
        }

    }

    public boolean responder(String respuesta) {
        return respuesta.equalsIgnoreCase(palabraSeleccionada);
    }

    private static List<String> cargarPalabrasDesdeArchivo(String nombreArchivo) {
        List<String> palabras = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                palabras.add(linea.trim());
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
        return palabras;
    }

    private void seleccionarPalabra() {
        Random random = new Random();
        palabraSeleccionada = palabras.get(random.nextInt(palabras.size()));
    }

    private void ocultarLetras() {
        int letrasOcultas = palabraSeleccionada.length() / 3;
        StringBuilder palabraConAsteriscos = new StringBuilder(palabraSeleccionada);
        Random random = new Random();
        for (int i = 0; i < letrasOcultas; i++) {
            int indiceOculto = random.nextInt(palabraSeleccionada.length());
            while (palabraConAsteriscos.charAt(indiceOculto) == '*') {
                indiceOculto = random.nextInt(palabraSeleccionada.length());
            }
            palabraConAsteriscos.setCharAt(indiceOculto, '*');
        }
        palabraOculta = palabraConAsteriscos.toString();
    }
    public String getPalabraSeleccionada() {
        return palabraSeleccionada;
    }

    public String getPalabraOculta() {
        return palabraOculta;
    }

}
