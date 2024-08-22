package Tema5.Herencia.Ejer3;

public class Biblioteca {
    private int codigo;
    private String titulo;
    private String anioPublicacion;
    private int numPag;
    
    public Biblioteca(int codigo, String titulo, String anioPublicacion, int numPag) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.numPag = numPag;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion
                + ", numPag=" + numPag + "]";
    }

    
}
