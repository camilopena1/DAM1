package Tema5.Practica1.ParteA;

public class ProductosFrescos extends Productos{
    String fechaEnvasado;
    String paisOrigen;

    public ProductosFrescos(String fechaCaducida, int numLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducida, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
    

}
