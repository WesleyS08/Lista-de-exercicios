
import java.util.Scanner;

public class exercício_72 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            // declaraçao do vetor com 10 posições e seu conteúdo
            int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            // declaracao de variavel a ser digitada pelo usuário
            int num;

            // numero a ser procurado no vetor
            System.out.println("Digite um valor para procurar no vetor");
            num = leitor.nextInt();

            // leitura do vetor
            for (int i = 0; i < vetor.length; i++) {

                // se existir no vetor o número digitado
                if (vetor[i] == num) {
                    System.out.println("O índice do número digitado é " + i);
                }
                if (vetor[i] != num) {
                    System.out.println("nao tem esse numero");
                }
            }
        }
    }
}
