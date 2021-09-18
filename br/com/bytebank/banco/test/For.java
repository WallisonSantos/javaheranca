package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

public class For {

  public static void main(String[] args) throws SaldoException {

    // FQN (Full Qualified Name) é nome completo da classe, composto pelo
    // nome do pacote e o nome da classe. FQN = Nome Pacote + Nome Simples da Classe

    /**
     * Aula 1
     */

    // ? Arrays
    int[] idade = new int[5];

    for (int i = 0; i < idade.length; i++) {
      idade[i] = i * i;
    }

    for (int i = 0; i < idade.length; i++) {
      System.out.println(idade[i]);
    }
  }
}