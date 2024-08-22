package Tema7.Ficheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Ejer5 {
    public static void main(String[] args) {
        // Map para almacenar el nombre de cada alumno y sus notas
        Map<String, List<Double>> alumnosNotas = new HashMap<>();

        // Lectura del archivo
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\DAM1\\Programacion\\Visual\\Documentos_Ficheros\\alumnos_notas.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(" ");
                String nombreCompleto = partes[0] + " " + partes[1];
                List<Double> notas = new ArrayList<>();
                for (int i = 2; i < partes.length; i++) {
                    notas.add(Double.parseDouble(partes[i]));
                }
                alumnosNotas.put(nombreCompleto, notas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Calcular la nota media de cada alumno
        Map<String, Double> alumnosMedias = new TreeMap<>();
        for (Map.Entry<String, List<Double>> entry : alumnosNotas.entrySet()) {
            String nombre = entry.getKey();
            List<Double> notas = entry.getValue();
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            double media = suma / notas.size();
            alumnosMedias.put(nombre, media);
        }

        // Mostrar los resultados por pantalla
        for (Map.Entry<String, Double> entry : alumnosMedias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
