package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class ClasseNumber {
  public static void main(String[] args) {

    Integer number = Integer.valueOf(25); // AutoBoxing
    System.out.println(number.intValue()); // UnBoxing

    Double number1 = Double.valueOf(25); // AutoBoxing
    System.out.println(number1.doubleValue()); // UnBoxing

    Boolean boo = Boolean.valueOf(true); // AutoBoxing
    System.out.println(boo.booleanValue()); // Unboxing

    // Tipo mais Generico
    Number num = Float.valueOf(2.2f);
    System.out.println(num);

    List<Number> n = new ArrayList<>();
    n.add(10);
    n.add(23.3);
    n.add(23.3f);
    System.out.println(n);
  }
}