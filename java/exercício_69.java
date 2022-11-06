import java.util.Scanner;

public class exercício_69 {
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)) {
            int n = 15;
            int a = 1;
            int vetor[] = new int[n];
            int vezes[] = new int[a];

            for (int c = 0; c < n; c++) {
                System.out.printf("Digite um valor para a posição %d: ", (c + 1), n);
                vetor[c] = numero.nextInt();
            }
            System.out.printf("Os numeros digitados foram:");
            for (int mostra = 0; mostra < n; mostra++) {
                System.out.println(vetor[mostra]);
            }

            System.out.printf("Digite o numero que deseja verificar: ");
            vezes[a] = numero.nextInt();

            if (vezes.equals(vetor)) {
                System.out.printf("o numero: " + vezes + "se encontra nos numeros digitados");
            } else {
                System.out.println("Numero não encontrado");
            }
        }
    }
}