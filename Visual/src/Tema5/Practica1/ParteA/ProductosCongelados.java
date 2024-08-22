package Tema5.Practica1.ParteA;

public class ProductosCongelados extends Productos{
    String fechaEnvasado;
    String paisOrigen;
    int temperaturaMantenimiento;
    
    public ProductosCongelados(String fechaCaducida, int numLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento) {
        super(fechaCaducida, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
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

    public int getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperatura de Mantenimiento: " + temperaturaMantenimiento + "\n";
    }

}
