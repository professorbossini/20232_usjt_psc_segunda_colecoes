public class VetorDinamico {
  private int qtde;
  private int cap;
  private int [] elementos;

  public VetorDinamico(){
    qtde = 0;
    cap = 4;
    elementos = new int [cap];
  }
  public void adicionar (int e){
    elementos[qtde] = e;
    qtde++;
  }

  public void exibir(){
    System.out.printf(
      "Qtde: %d\nCap: %d\n",
      qtde, cap
    );
    for (int e : elementos){
      System.out.printf("%d ", e);
    }
  }

}
