import java.util.Scanner;

public class exercício_59 {
    public static void main(String[] args) {

        try (Scanner numero = new Scanner(System.in)) {
            System.out.printf("Digite a quantidade de termos que deseja: ");
            int termos = numero.nextInt();
            int inicial = termos;
            int vezes = termos;
            int divisor = 1 * termos;

            for (int n = 1; n < vezes; n++) {
                int multi = inicial * (termos - 1);
                inicial = multi;
                termos--;

                System.out.println("O resultado da fatorial " + vezes + " é de: " + (1 + (multi / divisor)));

            }
        }
    }
}
