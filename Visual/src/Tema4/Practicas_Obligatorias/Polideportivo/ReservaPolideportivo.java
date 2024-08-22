package Tema4.Practicas_Obligatorias.Polideportivo;

public class ReservaPolideportivo {
    private int horaReserva;
    private String nombre;
    private int numeroSocio;
    private static boolean tramo6;
    private static boolean tramo7;
    private static boolean tramo8;

    
    public ReservaPolideportivo(int horaReserva, String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        if (horaReserva==6) {
            tramo6=true;
        }else if (horaReserva==7) {
            tramo7=true;
        }else{
            tramo8=true;
        }
        this.horaReserva = horaReserva;
       
    }
    
    public ReservaPolideportivo() {
    }

    public void anularReserva(){
        horaReserva = 0; 
        nombre = null;
        numeroSocio = 0;
        
    }

    public int getHoraReserva() {
        return horaReserva;
    }
    public void setHoraReserva(int horaReserva) {
        this.horaReserva = horaReserva;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroSocio() {
        return numeroSocio;
    }
    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public static boolean isTramo6() {
        return tramo6;
    }

    public static void setTramo6(boolean tramo6) {
        ReservaPolideportivo.tramo6 = tramo6;
    }

    public static boolean isTramo7() {
        return tramo7;
    }

    public void setTramo7(boolean tramo7) {
        ReservaPolideportivo.tramo7 = tramo7;
    }

    public static boolean isTramo8() {
        return tramo8;
    }

    public void setTramo8(boolean tramo8) {
        ReservaPolideportivo.tramo8 = tramo8;
    }
    

    
    
}
