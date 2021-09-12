package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

public class Teste {

  public static void main(String[] args) throws SaldoException {

    // FQN (Full Qualified Name) é nome completo da classe, composto pelo
    // nome do pacote e o nome da classe. FQN = Nome Pacote + Nome Simples da Classe

    String nome = "Wallison"; // objeto literal
    // String nome = new String("Wallison");

    System.out.println(nome.getBytes());
  }
}