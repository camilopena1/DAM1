package Tema6.Colecciones.Ejer5;

public class Empleado {
//implements Comparable<Empleado>
    String nombre;
    String nSS;
    double sueldoBase;

    public Empleado (){

    }

    public Empleado(String nombre, String nSS, double sueldoBase) {
        this.nombre = nombre;
        this.nSS = nSS;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnSS() {
        return nSS;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public double calcularSuledo(){
        return sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", nSS=" + nSS + ", sueldoBase=" + sueldoBase + "]";
    }
    
}
