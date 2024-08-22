package Tema4.Excepciones.Ejer8;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {

        int nombreGato = nombre.length();
        if (nombreGato < 3) {
            throw new Exception("Nombre muy pequeño");

        }
        if (edad < 0) {
            throw new Exception("Edad negativa");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        int nombreGato = nombre.length();
        if (nombreGato < 3) {
            throw new Exception("Nombre muy pequeño");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws Exception {
        if (edad < 0) {
            throw new Exception("Edad negativa");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato [edad=" + edad + ", nombre=" + nombre + "]";
    }

}
