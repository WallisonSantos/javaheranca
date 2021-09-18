package br.com.bytebank.banco.test;

import java.util.List;
import java.util.ArrayList;

public class AulaArray {
  public static void main(String[] args) {

    // int[] idades = new int[5];
    // String[] nome = new String[10];

    int idade = 29;

    Integer idadeR = Integer.valueOf(idade); // AutoBoxing: Criando o objeto
    int valor = idadeR.intValue(); // Unboxing: pedindo o valor primitivo

    List<Integer> numeros = new ArrayList<Integer>();
    numeros.add(valor);

    String a = "10";
    Integer ss = Integer.valueOf(a); // Parsear
    System.out.println(ss);

    // int numero = Integer.parseInt(a);

  }
}