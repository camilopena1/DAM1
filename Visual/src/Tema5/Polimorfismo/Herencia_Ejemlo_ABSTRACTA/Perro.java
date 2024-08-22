package Tema5.Polimorfismo.Herencia_Ejemlo_ABSTRACTA;

public class Perro extends Animal {
	public Perro() {
	}

	public Perro(String n) {
		super.nombre = n;
	}

	@Override
	public void hacerRuido() {
		System.out.println("guauuuu guaauau");

	}

}
