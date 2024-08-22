package ejercicio05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		FileReader fichero;
		String[] linea;
		ArrayList <Alumno> alumnos = new ArrayList<>();
		
		//abrimos el fichero
		try {
			
			//abrimos el fichero
			fichero = new FileReader("/Users/david/Desktop/Documentos_Ficheros/alumnos_notas.txt");
			
			//Creamos un buffer
			BufferedReader br = new BufferedReader(fichero);
			
			//Creamos un bucle para convertir la linea del fichero en un objeto de tipo alumno
			while(br.ready()) {
				
				//Variables
				String nombre;
				ArrayList <Integer> notas = new ArrayList<>();
				
				//Separamos la linea por espacios
				linea=br.readLine().split(" ");
				
				//Guardamos la primera posicion en el nombre y las siguiente en notas
				nombre=linea[0]+" "+linea[1];
				for(int i=2;i<linea.length;i++) {
					notas.add(Integer.parseInt(linea[i]));
				}
				
				//Creamos un objeto alumno en el arraylist de alumnos
				alumnos.add(new Alumno(nombre,notas));
			}
			
			fichero.close();
		} catch(IOException e) {
			System.out.println("Error al leer el fichero");
		}
		
		//Ordenamos el array por nombre
		Collections.sort(alumnos);
		
		//Mostamos los alumnos con la nota media
		System.out.println("Lista de alumnos");
		System.out.println("================");
		System.out.println("Media | Nombre");
		System.out.println("================");
		for(int i=0;i<alumnos.size();i++) {
			System.out.println(alumnos.get(i).media()+" | "+alumnos.get(i).getNombre());
		}
	}
}
