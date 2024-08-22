package Tema5.Herencia.Ejer2;

public class Loros extends Mascotas{
    private String origen;
    private boolean habla;

    public Loros(String origen, boolean habla,String nombre, String fechaNacimiento) {
        super(nombre,fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    public void hacerSonido(){
        System.out.println("hola");
    }

    @Override
    public String toString() {
        return "Loros [habla=" + habla + ", origen=" + origen + "]";
    }
    
}
