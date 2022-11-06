
import java.util.Scanner;

public class exercício_54 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número");
            int i, n1 = sc.nextInt();

            i = 1;
            for (i = 1; i * (i + 1) * (i + 2) <= n1; i++) {
                if (i * (i + 1) * (i + 2) == n1) {
                    System.out.println("É um número triangular");
                } else {
                    System.out.println("Não é triangular");
                }

            }
        }
    }
}
