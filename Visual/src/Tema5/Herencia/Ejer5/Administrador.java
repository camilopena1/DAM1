package Tema5.Herencia.Ejer5;

public class Administrador extends Persona {
    private String codigoAdmin;
    private String finca;
    private int numVecinos;
    private float salario;

    public Administrador(String nombre, int edad, String codigoAdmin, String finca, int numVecinos, float salario) {
        super(nombre, edad);
        this.codigoAdmin = codigoAdmin;
        this.finca = finca;
        this.numVecinos = numVecinos;
        this.salario = salario;
    }

    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public void setCodigoAdmin(String codigoAdmin) {
        this.codigoAdmin = codigoAdmin;
    }

    public String getFinca() {
        return finca;
    }

    public void setFinca(String finca) {
        this.finca = finca;
    }

    public int getNumVecinos() {
        return numVecinos;
    }

    public void setNumVecinos(int numVecinos) {
        this.numVecinos = numVecinos;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean codigoValido(String codigo) {

        if (codigo.charAt(0) == 'A' && codigo.length() == 5) {
            return true;
        } else {
            return false;
        }

    }
    public void salarioMaximo(){
        double salarioMaximo=(getNumVecinos()/2)*Vecino.getCouta();
        System.out.println("El salario maximo es "+salarioMaximo);

    }

    @Override
    public String toString() {
        return "Administrador [codigoAdmin=" + codigoAdmin + ", finca=" + finca + ", numVecinos=" + numVecinos
                + ", salario=" + salario + "]";
    }
    
}
