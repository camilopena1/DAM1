package Tema5.Herencia.Ejer5;

public class Vecino extends Persona {
    private String codigoVecino;
    private String codigoVivienda;
    private String finca;
    private static double couta;

    public Vecino(String codigoVecino, String codigoVivienda, String finca, String nombre, int edad) {
        super(finca, edad);
        this.codigoVecino = codigoVecino;
        this.codigoVivienda = codigoVivienda;
        this.finca = finca;
    }

    public Vecino() {
    }

    public String getCodigoVecino() {
        return codigoVecino;
    }

    public void setCodigoVecino(String codigoVecino) {
        this.codigoVecino = codigoVecino;
    }

    public String getCodigoVivienda() {
        return codigoVivienda;
    }

    public void setCodigoVivienda(String codigoVivienda) {
        this.codigoVivienda = codigoVivienda;
    }

    public String getFinca() {
        return finca;
    }

    public void setFinca(String finca) {
        this.finca = finca;
    }

    public static double getCouta() {
        return couta;
    }

    public static void setCouta(double couta) {
        Vecino.couta = couta;
    }

    public boolean codigoValido(String codigo) {

        if (codigo.charAt(0) == 'V' && codigo.length() == 5) {
            return true;
        } else {
            return false;
        }

    }

    public static void actualizarCuata(double cuotaNueva) {
        setCouta(cuotaNueva);
    }

    @Override
    public String toString() {
        return "Vecino [codigoVecino=" + codigoVecino + ", codigoVivienda=" + codigoVivienda + ", finca=" + finca + "]";
    }
    
}
