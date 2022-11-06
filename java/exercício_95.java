
import java.util.Scanner;

public class exercício_95 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int matriz[][] = new int[6][6];

            for (int i = 0; i < 6; i++) {

                for (int j = 0; j < 6; j++) {

                    System.out.println("Digite um numero: ");
                    matriz[i][j] = leitor.nextInt();

                }
            }

            int[] vetor = new int[36];

            int indice;
            indice = 0;

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {

                    vetor[indice] = (matriz[i][j]);
                    indice++;
                }
            }
            System.out.println("Os numeros da Matriz mostrados em Vetor");

            for (int i = 0; i < indice; i++) {

                System.out.println(vetor[i]);
            }
        }

    }
}
