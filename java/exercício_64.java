
public class exercício_64 {

    public static void main(String[] args) {

        // declaraçao do vetor com 10 posições e seu conteúdo
        int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        // imprimindo o maior valor
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.printf("Maior número é " + maior);
    }
}