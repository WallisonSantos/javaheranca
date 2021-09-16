package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

public class Aula4 {

  public static void main(String[] args) throws SaldoException {
    /**
     * Aula 3
     */

    // int[] idade = new int[5];
    // Conta[] referencias = new Conta[5];
    Object[] referencias = new Object[5];

    ContaCorrente contac = new ContaCorrente(1234, 4321);
    ContaPoupanca contap = new ContaPoupanca(5678, 8765);

    // instanciar novo Cliente variavel cliente, fazer novo cliente acessar a
    // posição 2 do Objeto referencias, Qual ira apontar para o objeto cliente
    Cliente cliente = new Cliente();
    referencias[2] = cliente;

    referencias[0] = contac;
    referencias[1] = contap;

    // ? Olhar da Direita para a Esquerda:
    // ? Array na posição 1, será acessado pela variavel referencia do tipo Conta
    // ? Corrente. Isto dara um erro de compilação
    // ? Fazendo um cast você irá forçar o tipo para uma referencia mais especifica
    // Object referenciar = (ContaPoupanca) referencias[0]; // ! TYPE CAST

    // System.out.println(referencias[0].getNumero());
    // System.out.println(contac.getNumero());
    // System.out.println(contap.getNumero());

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}