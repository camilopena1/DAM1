package Retos2.Instalacion_Electrica;

public class AparatatoMain {
    public static void main(String[] args) {
        AparatatoElectricos bombilla = new AparatatoElectricos("Bombilla", 150);
        AparatatoElectricos plancha = new AparatatoElectricos("Plancha", 2000);
        mostrarConsumoTotal();
        plancha.enciende();
        bombilla.enciende();
        mostrarConsumoTotal();
        bombilla.apaga();
        mostrarConsumoTotal();
      


    }
    public static void mostrarConsumoTotal() {
        int consumoTotal = AparatatoElectricos.getConsumoTotal();
        System.out.println("El consumo total es: " + consumoTotal);
    }
}
