package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

public class Teste {

  public static void main(String[] args) throws SaldoException {

    // FQN (Full Qualified Name) é nome completo da classe, composto pelo
    // nome do pacote e o nome da classe. FQN = Nome Pacote + Nome Simples da Classe
    ContaCorrente cc = new ContaCorrente(123, 321);
    Seguro seg = new Seguro();
    Calculador calc = new Calculador();

    cc.deposita(100);
    cc.saca(140);

    calc.Registra(cc);
    calc.Registra(seg);
  }
}