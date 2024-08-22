package Tema5.Herencia.Ejer2;

public class Mascotas {
    private String nombre;
    private String fechaNacimiento;

    
    public Mascotas(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Mascotas [fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + "]";
    }
    

}
