public class Calculador {

  private double totalImposto;

  public void Registra(Tributavel tribut) {
    double valor = tribut.getValorImposto();
    this.totalImposto = this.totalImposto + valor;
  }

  public double getTotalImposto() {
    return this.totalImposto;
  }
}
