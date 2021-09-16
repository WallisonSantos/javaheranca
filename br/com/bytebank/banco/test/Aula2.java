package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.*;

public class Aula2 {

  public static void main(String[] args) throws SaldoException {

    /**
     * Aula 2
     */

    // ? Criando 3 Objects = 1 Array object, 2 ContaCorrente Object,
    // ? Criado 2 Contas,
    // ? Criado ref. cc1(array), cc2(array), contas, cc1, cc2. e ref

    /**
     * ? ESTE SERÁ O OBJETO ARRAY DE DADOS, COM 5 POSIÇÕES (REFS. DE conta) // ? Em
     * cada posição o valor padrão das refs. serão Null. // ? conta = [
     * |null|null|null|null|null| ]
     */
    ContaCorrente[] conta = new ContaCorrente[5];

    // ? AGORA CRIADO Os OBJETOs CONTA CORRENTE
    ContaCorrente cc1 = new ContaCorrente(22, 11);
    ContaCorrente cc2 = new ContaCorrente(44, 33);

    /**
     * ?Atribuir cc1 e cc2 dentro do objeto Array conta
     */
    conta[0] = cc1;
    conta[1] = cc2;

    // Acessar a posição
    System.out.println(conta[1].getNumero());

    ContaCorrente ref = conta[1];

    System.out.println(ref.getNumero());

  }
}