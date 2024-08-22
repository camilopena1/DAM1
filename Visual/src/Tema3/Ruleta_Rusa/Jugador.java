package Tema3.Ruleta_Rusa;

public class Jugador {
    private static int contadorJugadores = 0;
    private int id = 0;
    private String nombre;
    private boolean vivo;

    public Jugador() {
        id=++contadorJugadores;
        nombre = "Jugador";
        vivo = true;
    }

    public void disparar(Revolver r) {
        System.out.println("El " + nombre + " " + id + " se apunta con la pistola");
        if (r.disparar()) {
            setVivo(false);
            System.out.println("El " + nombre + " " + id + " ha muerto...");
        } else {
            System.out.println("El " + nombre + " " + id + " se ha librado...");
        }

    }
    
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getId() {
        return id;
    }
    

}
