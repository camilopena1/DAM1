package Tema3.Ejercicios_Completos.DAWBANK;

public class CuentaBancaria {
    //Atributos
	private final String IBAN;
  private final String titular;
  private double saldo;
  
  //Constructor
  public CuentaBancaria(String IBAN, String titular) {
      this.IBAN = IBAN;
      this.titular = titular;
      this.saldo = 0;
  }
  
  //Metodos
  public String getIBAN() {
      return IBAN;
  }

  public String getTitular() {
      return titular;
  }

  public double getSaldo() {
      return saldo;
  }
  public void setSaldo(double saldo) {
  this.saldo = saldo;
}

  public void realizarIngreso(double cantidad) {
      if (cantidad > 0) {
          saldo += cantidad;
      }
  }

  public void realizarRetirada(double cantidad) {
      if (cantidad > 0) {
          if (saldo - cantidad >= -50) {
              saldo -= cantidad;

              if (cantidad > 3000) {
                  System.out.println("AVISO: Notificar a hacienda");
              }
          } else {
              System.out.println("AVISO: Saldo negativo");
          }
      }
  }

}
