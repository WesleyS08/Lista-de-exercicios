import java.util.Scanner;

public class exercício_26 {
    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)){;

        int n = 3;
        int v[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
            v[i] = ler.nextInt();
        }
        int soma = 0;
        for (i = 0; i < n; i++) {
            soma = soma + v[i];
        }
        System.out.printf("\n");
        for (i = 0; i < n; i++) {
            System.out.printf("\nSoma = %d\n", soma);
        }
    }
    }
}