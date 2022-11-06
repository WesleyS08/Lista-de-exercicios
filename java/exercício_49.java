import java.util.Scanner;

public class exercício_49 {
    public static void main(String[] args) {

        int n, c;
        boolean x;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um numero para saber se ele e primo ou nao: ");
            n = leitor.nextInt();
        }

        x = true;

        c = 2;

        while (x & c < n) {

            if (n % c == 0) {

                x = false;
            }

            c = c + 1;
        }

        if (x) {

            System.out.println("O numero digitado e PRIMO");
        } else {

            System.out.println("O numero digitado nao e PRIMO");
        }
    }

}
