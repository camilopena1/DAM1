package Tema5.Ejer_Amplicacion.Interfaces;

public class Gato extends Animal implements Comparable <Gato>{

    public void tipoAnimal(){
    }
    public void sonido(){
        System.out.println("miauu");
    }
	@Override
	public int compareTo(Gato o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
