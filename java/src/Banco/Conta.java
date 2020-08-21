
// -------------------------------------------------------------------------------
//
// Herança / Abstração e Polimorfismo em Java
//
//--------------------------------------------------------------------------------
//
// Treinamento em Java - OOP
// Academia de Algoritmos https://github.com/AcademiaDeAlgoritmos/grupo-de-estudos
// github: Mila Zangirolame
//
// -------------------------------------------------------------------------------

public class Conta {
  private int numero;
  double saldo;
  double limite;
  String person;


  public double getsaldo() {
        return this.saldo;
  }

  public void setsaldo(double saldo) {
        this.saldo = saldo;
  }

  // funções / métodos  da classe Conta
  void depositar(double valor){
      this.saldo += valor;
      System.out.println("Depositado: "+ valor);
  }

  void sacar(double valor){
      this.saldo -= valor;
  }

  void imprimeExtrato(){
      System.out.println("Saldo: "+this.saldo);
  }

}
