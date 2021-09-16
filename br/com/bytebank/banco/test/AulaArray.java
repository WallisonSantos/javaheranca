package br.com.bytebank.banco.test;

import java.util.ArrayList;
import br.com.bytebank.banco.model.*;

public class AulaArray {
  public static void main(String[] args) {

    // Uma lista de referencias do Tipo Conta - Generics
    // podendo especificar um tipo Object
    ArrayList<Conta> list = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(2344, 89765);
    Conta dd = new ContaCorrente(5433, 7655);
    Conta ee = new ContaCorrente(231, 3335);
    Conta ff = new ContaCorrente(20321, 3463);

    // Adicionar Contas instanciadas ao Array list
    list.add(cc);
    list.add(dd);
    list.add(ee);
    list.add(ff);
    // list.add(cliente); -- nao compila

    System.out.println("O numero de elementos: " + list.size());

    Conta ref = list.get(0);

    System.out.println(ref.getNumero());

    list.remove(0);

    System.out.println("O numero de elementos: " + list.size());

    for (int i = 0; i < list.size(); i++) { // forma mais antiga
      Conta conta = list.get(i);
      System.out.println(conta);
    }

    System.out.println("******************************************************");

    // usando o forEach forma mais atual
    // Para cada elemento do tipo conta da LIST, executar ...{}
    for (Conta conta : list) {
      System.out.println(conta);
    }
  }
}