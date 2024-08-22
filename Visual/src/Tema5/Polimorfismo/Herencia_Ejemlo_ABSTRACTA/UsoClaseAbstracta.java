package Tema5.Polimorfismo.Herencia_Ejemlo_ABSTRACTA;

import java.util.*;
public class UsoClaseAbstracta {
	public static void main(String[] args) {
		Animal perro1 = new Perro("Pedro");
		Animal gato1 = new Gato("ryu");
		Animal gato2 = new Gato("sarnoso");
		Animal gato3 = new Gato("aa");
		ArrayList <Animal>listaAnimales = new ArrayList<>();
		listaAnimales.add(perro1);
		listaAnimales.add(gato1);
		listaAnimales.add(gato2);
		listaAnimales.add(gato3);

		Collections.sort(listaAnimales);
		for (Animal animal : listaAnimales) {
			System.out.println(animal);
		}

		

	}

}
