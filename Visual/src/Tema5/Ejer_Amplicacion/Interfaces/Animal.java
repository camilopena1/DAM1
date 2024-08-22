package Tema5.Ejer_Amplicacion.Interfaces;

public abstract class Animal implements IAnimal{
    private String nombre;

    public Animal() {
    }

    public abstract void tipoAnimal();

    public String getNombre (){
        return nombre;
    }

}
