package Tema6.Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ejer6 {
    public static void main(String[] args) {
        
		LinkedList<String> paises= new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales= new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		//para poder insertar una lista en otra
		//necesitaremos un iterador para cada lista
		
		ListIterator<String> itPaises= paises.listIterator();
		
		ListIterator<String> itCapis= capitales.listIterator();
		
		while (itCapis.hasNext()) { //mientras haya elementos en la Lista de Capis
			
			if(itPaises.hasNext()) itPaises.next();
			
			//con itPaises.next nos situamos con el puntero detras de españa
		
			itPaises.add(itCapis.next());//como ya estamos situados donde queremos en paises
			
			//podemos insertar la capital correspondiente
			//con esto ya hemos colocado las capis en su lugar
		
		}
		//para ver como queda nuestra lista de paises
		
		System.out.println(paises);
		
		//------Ahora temos que hacer el borrado pero OJO!!!
		//------ nuestros punteros o cursores de los iteradores 
		//------ Ahora se encuentran al final porque los hemos movido!!!
		
		// Tenemos que reiniciar el iterador de capitales, es decir pornerlo al ppio
	
		itCapis=capitales.listIterator(); // con esto lo situamos al inicio otra vez
		
		while (itCapis.hasNext()) {
			itCapis.next(); //con esto pasamos a la siguiente posición
			
			if (itCapis.hasNext()) { //una vez pasado los 2 primeros elementos elimino el que acabo de pasar
				itCapis.next();
				itCapis.remove();
			}
			//todo lo que esta dentro del if lo va a hacer mientras haya más elementos
		}
		
		System.out.println(capitales);
    } 
}
