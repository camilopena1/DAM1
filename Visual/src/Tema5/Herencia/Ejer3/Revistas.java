package Tema5.Herencia.Ejer3;

public class Revistas extends Biblioteca{
    private int numRevista;

    public Revistas(int codigo, String titulo, String anioPublicacion, int numPag, int numRevista) {
        super(codigo, titulo, anioPublicacion, numPag);
        this.numRevista = numRevista;
    }

    public int getNumRevista() {
        return numRevista;
    }

    public void setNumRevista(int numRevista) {
        this.numRevista = numRevista;
    }

    @Override
    public String toString() {
        return "Revistas [numRevista=" + numRevista + "]";
    }
    
}
