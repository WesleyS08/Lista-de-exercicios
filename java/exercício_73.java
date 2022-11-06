
import java.util.Arrays;

public class exercício_73 {

    public static void main(String[] args) {

        float soma, media;
        soma = 0;
        media = 0;

        // declarando o array de 20 numeros inteiros
        int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19 };

        // preparando os cálculos a serem feitos

        // a. A moda dos elementos no array (valor que mais se repete)

        Arrays.sort(vetor); // ordenar o vetor

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1])
                System.out.println("MODA = " + vetor[i]);
        }

        // b. A mediana dos elementos no array (elemento central)

        int a = 0;
        int direcao = (vetor.length - 1);
        int meio;
        meio = (a + direcao) / 2;
        System.out.println("MEDIANA = " + vetor[meio]);

        // c. A média (soma dos elementos / qnt de elementos)

        for (int i = 0; i < vetor.length; i++) {

            soma = (vetor[i] + soma);

        }

        media = (soma / 20);

        System.out.println("MEDIA = " + media);
    }

}
