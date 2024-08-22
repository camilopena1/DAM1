package Tema6.Colecciones.Ejer5;

public class Consultor extends Empleado{
    int precioHora;
    int numHoras;

    public Consultor(){
    }
    
    public Consultor(String nombre, String nSS, double sueldoBase, int precioHora, int numHoras) {
        super(nombre, nSS, sueldoBase);
        this.precioHora = precioHora;
        this.numHoras = numHoras;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public String toString() {
        return super.toString() +"Consultor [precioHora=" + precioHora + ", numHoras=" + numHoras + "]";
    }
    
}
