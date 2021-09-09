public class ContaCorrente extends Conta implements Tributavel {

  // !Método Construtor herdado da classe mãe.
  // ? Classes filhas não possuem métodos construtores, porém podem herdar a
  // ? partir do Super, que deverá ser escrito exatamente igual ao da classe mãe
  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
    System.out.println("Estou Nascendo em ContaCorrente, método Construtor obtido a partir da Super Class:");
  }

  @Override
  public double getValorImposto() {
    return super.saldo * 0.01;
  }

  // The type ContaPoupanca must implement the inherited abstract method
  // Conta.deposita(double)Java(67109264)
  @Override
  public void deposita(double valor) {
    System.out
        .println("Estou Nascendo em ContaCorrente, método Deposita obtido a partir da Super Class com método abstrato");
    super.saldo = super.saldo + valor;
  }

  // ?? Comportamento especifico para o método Saca dentro da classe ContaCorrente
  // ?? É usada para sobrescrever o método da classe mãe, indicando que o método
  // original foi alterado.
  @Override
  public boolean saca(double valor) {
    System.out
        .println("Estou Nascendo em ContaCorrente, método Saca obtido a partir da Super Class com método abstrato");
    double valorSacar = valor + 0.2;
    return super.saca(valorSacar);
  }
}