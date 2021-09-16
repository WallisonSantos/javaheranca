package br.com.bytebank.banco.model;

public class StorageCount {

  private Object[] referencia;
  private int posicaoLivre; // ? POSIÇÃO LIVRE NO MEU ARRAY DE OBJ.

  public StorageCount() { // ? MÉTODO CONSTRUTOR
    this.referencia = new Object[10]; // ? INSTANCIA UMA NOVA CONTA, COM 10 POSIÇÕES, A PARTIR DA REF. DO ARRAY
    this.posicaoLivre = 0; // DEFAULT POSIÇÃO
  }

  public void add(Object ref) { // ? MÉTODO DA CLASS, QUE TEM PARAMS TIPO CONTA RECEBENDO A CONTA PASSADA POR
                                // ? PARAMS
    this.referencia[this.posicaoLivre] = ref; // ? APONTA PARA A POSIÇÃO 0 NO OBJ. ARRAY REF. A PARTIR DA CONTA
                                              // PASSADA
    this.posicaoLivre = this.posicaoLivre + 1; // ? INCREMENTA MAIS UMA POSIÇÃO TODA VEZ QUE É CHAMADO
  }

  public int getSize() { // ? METODO QUE IRA TRAZER QTD DE POSIÇOES
    return this.posicaoLivre;
  }

  public Object getReferenceCount(int ref) {
    return this.referencia[ref];
  }
}
