package br.com.bytebank.banco.model;

public abstract class Conta {

  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total = 0;

  public Conta(int agencia, int numero) {
    Conta.total++;
    System.out.println("Estou Nascendo em Conta, método construtor: O total de contas é " + Conta.total);
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 0;
    System.out.println("Estou Nascendo em Conta, método construtor: Estou criando uma conta " + this.numero);
  }

  // ? Determinando que a implementação seja feita na classe que herdar esta
  public abstract void deposita(double valor);

  // ? Método de sacar padrão, que foi alterado na classe filha Conta Corrente !
  public void saca(double valor) throws SaldoException {

    if (this.saldo < valor) {

      throw new SaldoException("Saldo: " + this.saldo + ", valor: " + valor);

    }

    this.saldo -= valor;
  }

  // ? Definindo que o tipo da variavel será o objeto Conta da classe mãe,
  // ? Assim qualquer classe filha poderá ser atribuida neste método transfere.
  // ? este método irá funcionar para qualquer conta, poupança, Corrente...

  public void transfere(double valor, Conta destino) throws SaldoException {
    this.saca(valor);
    destino.deposita(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0) {
      System.out.println("Estou Nascendo em Conta, método getNumero: Nao pode valor menor igual a 0");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia <= 0) {
      System.out.println("Estou Nascendo em Conta, método getAgencia: Nao pode valor menor igual a 0");
      return;
    }
    this.agencia = agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public static int getTotal() {
    return Conta.total;
  }

}