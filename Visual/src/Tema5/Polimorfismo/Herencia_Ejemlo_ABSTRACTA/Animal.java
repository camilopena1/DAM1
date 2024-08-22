package Tema5.Polimorfismo.Herencia_Ejemlo_ABSTRACTA;

public abstract class Animal implements Comparable<Animal>{
	String nombre;

	public void nombre() {
		System.out.println("nombre " + nombre);
	}

	public abstract void hacerRuido();

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Animal a){
		return this.nombre.compareTo(a.getNombre());
	}

	@Override
	public String toString() {
		return "nombre=" + nombre;
	}
	
}
