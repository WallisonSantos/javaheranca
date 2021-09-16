package br.com.bytebank.banco.test;

import java.util.ArrayList;
import br.com.bytebank.banco.model.*;

public class AulaEquals {
  public static void main(String[] args) {

    // Uma lista de referencias do Tipo Conta - Generics
    // podendo especificar um tipo Object
    Conta cc1 = new ContaCorrente(22, 11);
    Conta cc2 = new ContaCorrente(22, 11);

    boolean equal = cc1.isEqual(cc2);
    System.out.println("É igual ? " + equal);
  }
}