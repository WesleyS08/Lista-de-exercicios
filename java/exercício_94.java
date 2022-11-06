
import java.util.Scanner;

public class exercício_94 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            // declarando a matriz
            int matriz[][] = new int[6][6];

            // adicionando valores na matriz

            for (int i = 0; i < 6; i++) {

                for (int j = 0; j < 6; j++) {

                    System.out.println("Digite um numero: ");
                    matriz[i][j] = leitor.nextInt();

                }
            }

            System.out.println("Digite um numero qualquer: ");
            int num = leitor.nextInt();

            // multiplicar matriz pelo numero digitado

            System.out.println("Resultados");

            for (int i = 0; i < 6; i++) {

                for (int j = 0; j < 6; j++) {

                    matriz[i][j] = (matriz[i][j] * num);
                    System.out.println(matriz[i][j]);
                }

            }
        }

    }

}
