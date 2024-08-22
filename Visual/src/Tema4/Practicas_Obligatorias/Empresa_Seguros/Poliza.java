package Tema4.Practicas_Obligatorias.Empresa_Seguros;

public class Poliza {
    private String nombre;
    private String nif;
    private int edad;
    private int cuotaMensual;

    public Poliza(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
        this.cuotaMensual = calcularCuotaMensual();
    }

    public void mostrarCuotaMensual() {
        System.out.println("La cuota mensual de la póliza para " + nombre + " es de " + cuotaMensual + " euros.");
    }

    public int calcularCuotaMensual() {
        if (edad < 18 || edad > 64) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 64 años.");
        } else if (edad < 30) {
            return 40;
        } else if (edad < 40) {
            return 50;
        } else if (edad < 50) {
            return 60;
        } else if (edad < 60) {
            return 70;
        } else {
            return 80;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public int getEdad() {
        return edad;
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }
}
