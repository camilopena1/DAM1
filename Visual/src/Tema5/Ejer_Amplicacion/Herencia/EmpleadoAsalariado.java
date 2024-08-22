package Tema5.Ejer_Amplicacion.Herencia;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleados {

    private int sueldoBase;
    private double porcentanjeSueldo;
    private double sueldoTotal;

    public EmpleadoAsalariado(String dNI, String nombre, String apellido, String anioContratacion,
            int sueldoBase, double porcentanjeSueldo) {
        super(dNI, nombre, apellido, anioContratacion);
        this.sueldoBase = sueldoBase;
        calcularSueldo();
        
    }
    
    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPorcentanjeSueldo() {
        return porcentanjeSueldo;
    }

    public void setPorcentanjeSueldo(double porcentanjeSueldo) {
        this.porcentanjeSueldo = porcentanjeSueldo;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public void calcularSueldo(){
        LocalDate fechaACtual = LocalDate.now();
        int anioActual=fechaACtual.getYear();
        int anioContratacion=Integer.parseInt(getAnioContratacion());
        int aniosEmpresa=anioActual-anioContratacion;
        if (aniosEmpresa>=2 && aniosEmpresa<=3) {
            setPorcentanjeSueldo(0.07);  
        }else if (aniosEmpresa>=4 && aniosEmpresa<=8){
            setPorcentanjeSueldo(0.11);
        }else if (aniosEmpresa>=9 && aniosEmpresa<=15){
            setPorcentanjeSueldo(0.17);

        }
        setSueldoTotal(sueldoBase*porcentanjeSueldo);
    }

    @Override
    public double getSalario() {
        return sueldoTotal;
    }


}
