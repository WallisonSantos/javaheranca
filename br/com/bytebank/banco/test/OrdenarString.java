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
    Cliente ClienteW = new Cliente();
    ClienteW.setNome("Wallison");
    contaW.setTitular(ClienteW);
    contaW.deposita(100);

    List<Conta> listas = new ArrayList<>();
    listas.add(contaW);
  }
}