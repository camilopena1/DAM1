package Tema3.ejercicios_ejemplos;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public void imprime() {
        System.out.println("DNI: " + dni + " Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad);
    }

    // Método para verificar si la persona es mayor de edad
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    // Método para verificar si la persona es jubilada
    public boolean esJubilado() {
        return edad >= 65;
    }

    // Método para calcular la diferencia de edad entre dos personas
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }

    // Método para mostrar la información de la persona
    public void mostrarPersona() {
        imprime();
    }

}
