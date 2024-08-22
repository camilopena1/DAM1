package Tema5.Herencia.Ejer2;

public class Gatos extends Mascotas {
    private boolean peloLargo;
    private String color;

    public Gatos(boolean peloLargo, String color,String nombre, String fechaNacimiento) {
        super(nombre,fechaNacimiento);
        this.peloLargo = peloLargo;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println("miau");
    }

    @Override
    public String toString() {
        return "Gatos [color=" + color + ", peloLargo=" + peloLargo + "]";
    }
    

}
