package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta {

  // !Método Construtor herdado da classe mãe.
  // ? Classes filhas não possuem métodos construtores, porém podem herdar a
  // ? partir do Super, que deverá ser escrito exatamente igual ao da classe mãe
  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
    System.out.println("Estou Nascendo em ContaPoupanca, método Construtor obtido a partir da Super Class:");
  }

  // ?? Comportamento especifico para o método Saca dentro da classe ContaCorrente
  // ?? É usada para sobrescrever o método da classe mãe, indicando que o método
  // original foi alterado
  public void deposita(double valor) {
    System.out
        .println("Estou Nascendo em ContaPoupanca, método Deposita obtido a partir da Super Class com método abstrato");
    super.saldo = super.saldo + valor;
  }
}