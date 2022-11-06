
public class exercício_63 {

    public static void main(String[] args) {

        int soma;
        soma = 0;

        // declaração dos dois vetores
        int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vet = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // somando dois vetores
        for (int x = 0; x < vetor.length; x++) {

            soma = (vetor[x] + vet[x]);

            System.out.println(soma);
        }
    }
}