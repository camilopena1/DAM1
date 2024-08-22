package Tema5.Polimorfismo.Herencia_Ejemlo_ABSTRACTA;

public class Gato extends Animal {
    public Gato() {
    }

    public Gato(String n) {
        super.nombre = n;
    }

    @Override
    public void hacerRuido() {
        System.out.println("guauuuu guaauau");

    }
}
