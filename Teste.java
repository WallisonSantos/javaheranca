public class Teste {

  public static void main(String[] args) {
    // Referencia cc ao um objeto do tipo

    ContaCorrente tributa = new ContaCorrente(222, 333);
    tributa.deposita(100);
    System.out.println(tributa.getValorImposto());

    Seguro seguro = new Seguro();
    System.out.println(seguro.getValorImposto());

    Calculador calc = new Calculador();
    calc.Registra(tributa);
    calc.Registra(seguro);

    System.out.println(calc.getTotalImposto());
  }
}