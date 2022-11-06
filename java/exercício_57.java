
import java.util.Scanner;

public class exercício_57 {

    public static void main(String[] args) {

        double n, s, a, b, c, d;
        n = 0;

        a = Math.pow(2, 2);
        b = Math.pow(3, 3);
        c = Math.pow(4, 4);
        d = Math.pow(5, 5);
        n = Math.pow(n, n);

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um valor para N: ");
            n = leitor.nextDouble();
        }

        n = Math.pow(n, n);

        s = 1 + (1 / a) + (1 / b) + (1 / c) + (1 / d) + (1 / d);

        System.out.println("S para um numero N resulta em: " + s);

    }
}
