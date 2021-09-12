package br.com.bytebank.banco.model;

public class Seguro implements Tributavel {
  @Override
  public double getValorImposto() {
    return 42;
  }
}
