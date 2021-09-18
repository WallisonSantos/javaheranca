package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class OrdenarListas {
  public static void main(String[] args) {

    Conta cc1 = new ContaCorrente(66, 55);
    cc1.deposita(100);

    Conta cc2 = new ContaCorrente(33, 22);
    cc2.deposita(200);

    Conta cc3 = new ContaPoupanca(44, 11);
    cc3.deposita(300);

    Conta cc4 = new ContaPoupanca(11, 00);
    cc4.deposita(400);

    List<Conta> listas = new ArrayList<>();
    listas.add(cc1);
    listas.add(cc2);
    listas.add(cc3);
    listas.add(cc4);

    for (Conta conta : listas) {
      System.out.println(conta);
    }

    NumeroDaConta nConta = new NumeroDaConta();

    listas.sort(nConta);

    System.out.println("*****************************************");

    for (Conta conta : listas) {
      System.out.println(conta.toString());
    }
  }
}

class NumeroDaConta implements Comparator<Conta> {

  @Override
  public int compare(Conta a, Conta b) {

    if (a.getNumero() < b.getNumero()) {
      return -1;
    }
    if (a.getNumero() > b.getNumero()) {
      return 1;
    }

    return 0;
  }
}