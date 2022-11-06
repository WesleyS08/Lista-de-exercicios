import java.util.Scanner;

public class exercício_27 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double a, b, c, maior, menor1, menor2, media;
            System.out.println("Digite um numero: ");
            a = ler.nextDouble();
            System.out.println("Digite um numero: ");
            b = ler.nextDouble();
            System.out.println("Digite um numero: ");
            c = ler.nextDouble();
            if (b > a && b > c) {
                maior = b * 5;
                menor1 = a * 2.5;
                menor2 = c * 2.5;
            } else {
                if (c > a && c > b) {
                    maior = c * 5;
                    menor1 = a * 2.5;
                    menor2 = b * 2.5;
                } else {
                    maior = a * 5;
                    menor1 = b * 2.5;
                    menor2 = c * 2.5;
                }
            }

            media = (maior + menor1 + menor2) / (5 + 2.5 + 2.5);
            System.out.println("o media ponderada dos valores e: " + media);
        }
    }

}