package Tema5.Herencia.Ejer3;

public class Libros extends Biblioteca{
    private String autor;

    public Libros(int codigo, String titulo, String anioPublicacion, int numPag, String autor) {
        super(codigo, titulo, anioPublicacion, numPag);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libros [autor=" + autor + "]";
    }
    
}
