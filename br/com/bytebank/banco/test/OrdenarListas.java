package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class OrdenarListas {
  public static void main(String[] args) {

    Conta cc1 = new ContaCorrente(22312, 234244);
    cc1.deposita(100);

    Conta cc2 = new ContaCorrente(22, 11);
    cc2.deposita(200);

    Conta cc3 = new ContaPoupanca(33, 44);
    cc3.deposita(300);

    Conta cc4 = new ContaPoupanca(55, 66);
    cc4.deposita(400);

    List<Conta> n = new ArrayList<>();
    n.add(cc1);
    n.add(cc2);
    n.add(cc3);
    n.add(cc4);

    for (Conta conta : n) {
      System.out.println(conta);
    }

    NumeroDaContaComparador comparador = new NumeroDaContaComparador();

    n.sort(comparador);

    System.out.println("*****************************************");

    for (Conta conta : n) {
      System.out.println(conta);
    }
  }
}

class NumeroDaContaComparador implements Comparator<Conta> {

  @Override
  public int compare(Conta c1, Conta c2) {
    if (c1.getNumero() < c2.getNumero()) {
      return -1;
    }
    if (c1.getNumero() > c2.getNumero()) {
      return 1;
    }
    return 0;
  }
}