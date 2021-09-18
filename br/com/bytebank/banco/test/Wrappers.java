package br.com.bytebank.banco.test;

import java.util.List;
import java.util.ArrayList;

public class Wrappers {

  public static void main(String[] args) {

    int val = 25;

    Character charReference = Character.valueOf('A');
    System.out.println(charReference.charValue());

    Integer idadeReference = Integer.valueOf(val);
    System.out.println(idadeReference.intValue());

    Double doubleReference = Double.valueOf(val);
    System.out.println(doubleReference.doubleValue());

    Float floatReference = Float.valueOf(val);
    System.out.println(floatReference.floatValue());

    Boolean booleanReference = Boolean.FALSE;
    System.out.println(booleanReference.booleanValue());

    Number numberReference = Double.valueOf(val);
    System.out.println(numberReference.doubleValue());

    List<Number> numList = new ArrayList<>();
    numList.add(numberReference);
    numList.add(22);
    numList.add(floatReference);
    System.out.println(numList.size() + " " + numList.get(0));

    List<Object> refs = new ArrayList<>();
    refs.add(Double.valueOf(30.9));
    refs.add(Integer.valueOf(10));
    refs.add(Float.valueOf(13.4f));
  }
}
