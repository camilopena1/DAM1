package Tema5.Ejer_Amplicacion.Herencia;

public abstract class Empleados {
    private String DNI;
    private String nombre;
    private String apellido;
    private String anioContratacion;

    public Empleados(String dNI, String nombre, String apellido, String anioContratacion) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioContratacion = anioContratacion;
    }
    

    public Empleados() {
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAnioContratacion() {
        return anioContratacion;
    }

    public void setAnioContratacion(String anioContratacion) {
        this.anioContratacion = anioContratacion;
    }


    @Override
    public String toString() {
        return "Empleados [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", anioContratacion="
                + anioContratacion + "]";
    }
    public abstract double getSalario();

}
