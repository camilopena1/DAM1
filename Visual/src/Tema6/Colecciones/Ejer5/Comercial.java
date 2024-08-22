package Tema6.Colecciones.Ejer5;

public class Comercial extends Empleado{
    int comision;
    public Comercial(){

    }
    
    public Comercial(String nombre, String nSS, double sueldoBase, int comision) {
        super(nombre, nSS, sueldoBase);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }
    public void setComision(int comision) {
        this.comision = comision;
    }
    public double calcularSuledo(){
        return comision;
    }

    @Override
    public String toString() {
        return super.toString() +"Comercial [comision=" + comision + "]";
    }
    
}
