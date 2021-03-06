package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.Cliente;

public class OrdenarString {
  public static void main(String[] args) {

    Conta contaW = new ContaCorrente(111, 222);
    Cliente clienteW = new Cliente();
    clienteW.setNome("Wallison");
    contaW.setTitular(clienteW);
    contaW.deposita(100);
    System.out.println("********* Cliente: " + clienteW.getNome() + ", Conta: " + contaW + "*********");

    Conta contaK = new ContaPoupanca(112, 223);
    Cliente clienteK = new Cliente();
    clienteK.setNome("Kareen");
    contaK.setTitular(clienteK);
    contaK.deposita(100);
    System.out.println("********* Cliente: " + clienteK.getNome() + ", Conta: " + contaK + "*********");

    List<Conta> listas = new ArrayList<>();
    listas.add(contaW);
    listas.add(contaK);

    System.out.println(listas);

    TitularComparator titular = new TitularComparator();
    listas.sort(titular);

    for (Conta conta : listas) {
      System.out
          .println("Conta: " + conta.getAgencia() + ", " + conta.getAgencia() + ", " + conta.getTitular().getNome());
    }
  }
}

class TitularComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta a, Conta b) {

    // ? Pegar o Titular das referencias a e b e devolver o nome desse titular

    String nomeA = a.getTitular().getNome();
    String nomeB = b.getTitular().getNome();

    return nomeA.compareTo(nomeB); // aqui já irá retornar 0 - ou +
  }
}