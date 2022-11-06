import java.util.Scanner;

public class exercício_24 {
    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
            int n = 3; 
            int v[] = new int[n]; 
            int i;

            for (i = 0; i < n; i++) {
                System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
                v[i] = ler.nextInt();

            }
            for (i = 0; i < n; i++) {
                int maior = v[0];
                if (v[i] > maior)
                    maior = v[i];

                for (i = 0; i < n; i++) {
                    if (v[i] == maior)
                        System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
                    else
                        System.out.printf("v[%d] = %2d\n", i, v[i]);
                }

            }
        }
    }
}