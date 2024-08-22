package Tema5.Herencia.Ejer2;

public class Perros {
    private String raza;
    private boolean pulgas;

    public Perros(String raza, boolean pulgas) {
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    

    public Perros() {
       
    }



    public void hacerSonido(){
        System.out.println("guau guau");
    }

    @Override
    public String toString() {
        return "Perros [pulgadas=" + pulgas + ", raza=" + raza + "]";
        
    }

    public String getRaza() {
        return raza;
    }

    public boolean isPulgadas() {
        return pulgas;
    }

    
    
}
