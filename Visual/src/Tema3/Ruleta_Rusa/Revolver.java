package Tema3.Ruleta_Rusa;

import java.util.Random;

public class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6)+1;
        posicionBala = random.nextInt(6)+1;
    }

    public boolean disparar() {
        if (posicionActual == posicionBala) {
            return true;

        } else {
            if (posicionActual == 6) {
                setPosicionActual(0);
            }
            posicionActual++;
            return false;
        }
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }


    @Override
    public String toString() {

        return "Estas en la posicion " + posicionActual + " Y la bala esta en la posicion " + posicionBala;
    }
}
