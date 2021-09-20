package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta {

  // !Método Construtor herdado da classe mãe.
  // ? Classes filhas não possuem métodos construtores, porém podem herdar a
  // ? partir do Super, que deverá ser escrito exatamente igual ao da classe mãe
  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
  }

  // ?? Comportamento especifico para o método Saca dentro da classe ContaCorrente
  // ?? É usada para sobrescrever o método da classe mãe, indicando que o método
  // original foi alterado
  public void deposita(double valor) {
    super.saldo = super.saldo + valor;
  }

  @Override
  public String toString() {
    return "Conta Poupanca, " + super.toString();
  }

}