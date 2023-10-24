public class Exemplo2Vetores {
  public static void main(String[] args) {
    //notas de alunos
    int [] notas = new int[]{4, 10, 6, 7};
    String [] livros = new String[];
    //exibir as notas
    for (int i = 0; i < notas.length; ++i){
      System.out.println(notas[i]);
    }

    //enhanced for (java 5 em diante)
    //for each (foreach)
    for (int nota : notas){
      System.out.println(nota);
    }

    //acumulador
    int soma = 0;
    for (int i = 0; i < notas.length; i++){
      soma = soma + notas[i];
    }
    System.out.println(soma);

    //soma com o enhanced for


  }
}
