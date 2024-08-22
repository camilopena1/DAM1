package Tema5.Practica1.ParteA;

public class ProductosRefrigerados extends Productos{
    int codigo;
    String fechaEnvasado;
    int temperaturaMantenimiento;
    String paisOrigen;
    
    public ProductosRefrigerados(String fechaCaducida, int numLote, int codigo, String fechaEnvasado,
            int temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducida, numLote);
        this.codigo = codigo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductosRefrigerados [codigo=" + codigo + ", fechaEnvasado=" + fechaEnvasado
                + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", paisOrigen=" + paisOrigen + "]";
    }

}
