package Tema6.Colecciones.Ejer8;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> arryElemento;

    public Carrito() {
        arryElemento = new ArrayList<>();
    }

    public void agrega(Elemento elemento) {
        arryElemento.add(elemento);
    }

    public int numeroElementos() {
        return arryElemento.size();
    }

    public double importeTotal() {
        double importeTotal = 0;
        for (Elemento elemento : arryElemento) {
            importeTotal = elemento.calcularSubtotal();
        }
        return importeTotal;
    }

    @Override
    public String toString() {
        String carritoContent = "";
        for (Elemento elemento : arryElemento) {
            carritoContent += elemento.toString() + "\n";
        }
        return carritoContent;
    }
}
