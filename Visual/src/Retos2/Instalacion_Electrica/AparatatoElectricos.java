package Retos2.Instalacion_Electrica;

public class AparatatoElectricos {
    private String nombre;
    private int consumo;
    private static int consumoTotal;
    private boolean encendido;
    public AparatatoElectricos(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
        encendido = false;
    }

    public int getConsumo() {
        return consumo;
    }
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public static int getConsumoTotal() {
        return consumoTotal;
    }
    public static void setConsumoTotal(int consumoTotal) {
        AparatatoElectricos.consumoTotal = consumoTotal;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public void enciende(){
        if (!isEncendido()) {
            setEncendido(true);
            setConsumoTotal(getConsumo()+getConsumoTotal());
        }else{
            System.out.println("el parato esta encendido");
        }
       
    }
    public void apaga(){
        if (isEncendido()) {
            setEncendido(false);
            setConsumoTotal(getConsumoTotal()-getConsumo());
        }
        
        
    }
    
    

    
    
    
}
