package br.com.bytebank.banco.test;

import java.util.ArrayList;
import br.com.bytebank.banco.model.*;

public class AulaEquals {
  public static void main(String[] args) {

    // Uma lista de referencias do Tipo Conta - Generics
    // podendo especificar um tipo Object
    ArrayList<Conta> list = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(2344, 89765);
    Conta dd = new ContaCorrente(231, 3335);

    // Adicionar Contas instanciadas ao Array list
    list.add(cc);
    list.add(dd);
    // list.add(cliente); -- nao compila

    boolean exist = list.contains(cc);

    System.out.println("Já existe ? " + exist);

    // usando o forEach forma mais atual
    // Para cada elemento do tipo conta da LIST, executar ...{}
    for (Conta conta : list) {
      System.out.println(conta);
    }
  }
}