package ejercicio05;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private ArrayList <Integer> notas = new ArrayList <Integer> () ;
	
	public Alumno (String nombre, ArrayList <Integer> notas) {
		this.nombre=nombre;
		this.notas=notas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private double total() {
		double total=0;
		for (int i=0;i<notas.size();i++) {
			total+=notas.get(i);
		}
		return total;
	}
	
	public double media() {
		return total()/notas.size();
	}
	
	//Funcion para ordenar los Alumnos con sort
	@Override
	public int compareTo(Alumno a) {
		return (this.nombre.compareTo(a.getNombre()));
	}
}
