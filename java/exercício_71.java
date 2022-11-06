import java.util.Scanner;

public class exercício_71 {
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)) {
            int n = 10;
            int vetor[] = new int[n];
            int a = 0;

            for (int vezes = 0; vezes < n; vezes++) {
                System.out.printf("Digite um valor para a posição %d: ", (vezes + 1), n);
                vetor[vezes] = numero.nextInt();
            }
            System.out.printf("Os numeros digitados foram:");
            for (int mostra = 0; mostra < n; mostra++) {
                System.out.println(vetor[mostra]);
            }

            System.out.printf("Digite o numero que deseja verificar: ");
            int verificar = numero.nextInt();

            while (a < 10) {
                if (a == 9) {

                    if (verificar == vetor[a]) {
                        System.out.printf("O numero: " + verificar + " tem na lista");

                    }
                }
                if (a == 9) {
                    if (verificar != vetor[a]) {
                        System.out.printf("Não possue o numero na lista");
                    }
                }
                a++;
            }
        }
    }
}