
import java.util.Scanner;

public class exercício_65 {

    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
            int[] array;
            int maior = 0, menor = 0, indiceMaior = 0, indiceMenor = 0;
            array = new int[20];
            for (int i = 0; i < 20; i++) {
                System.out.println("Digite um numero: ");
                array[i] = ler.nextInt();
                if (i == 0) {
                    maior = array[i];
                    menor = array[i];
                    indiceMenor = i + 1;
                    indiceMaior = i + 1;
                } else {
                    if (array[i] < menor) {
                        menor = array[i];
                        indiceMenor = i + 1;
                    } else {
                        if (array[i] > maior) {
                            maior = array[i];
                            indiceMaior = i + 1;
                        }
                    }
                }
            }
            System.out.println("O maior numero e :" + maior + " e sua posicao :" + indiceMaior);

            System.out.println("O maior numero e :" + menor + " e sua posicao :" + indiceMenor);
        }
    }

}
