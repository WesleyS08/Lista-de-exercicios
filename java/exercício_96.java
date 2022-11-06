
import java.util.Scanner;

public class exercício_96 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int A[][] = new int[3][4];
            int B[][] = new int[3][4];

            int C[][] = new int[3][4];

            int D[][] = new int[3][4];

            System.out.println("PRIMEIRA MATRIZ!");

            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 4; ++j) {
                    System.out.printf("A[%d][%d]: \n", i, j);
                    A[i][j] = entrada.nextInt();
                }
            }

            System.out.println("SEGUNDA MATRIZ!");

            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 4; ++j) {
                    System.out.printf("B[%d][%d]: \n", i, j);
                    B[i][j] = entrada.nextInt();
                }
            }
            System.out.printf("SOMA DAS MATRIZ A e B!\n");

            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 4; ++j) {

                    C[i][j] = A[i][j] + B[i][j];
                    System.out.printf("%d\t", C[i][j]);
                }
                System.out.printf("\n");
            }

            System.out.println("\nDIFERENÇA DAS MATRIZ A e B!");
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 4; ++j) {
                    D[i][j] = A[i][j] - B[i][j];
                    System.out.printf("%d\t", D[i][j]);
                }
                System.out.printf("\n");
            }
        }
    }
}
