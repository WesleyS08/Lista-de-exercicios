
public class exercício_62 {

     public static void main(String[] args) {

          int par;
          par = 0;

          // declaraçao do vetor com 10 posições e seu conteúdo
          int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

          // leitura do vetor
          for (int i = 0; i < vetor.length; i++) {

               // se existir no vetor número par
               if (vetor[i] % 2 == 0) {

                    System.out.println("Esses sao os numeros pares");
                    System.out.println(vetor[i]);

                    par = (par + 1);

               }

          }
          System.out.println("Quantidade = " + par);
     }
}
