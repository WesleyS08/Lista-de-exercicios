import java.util.Scanner;

public class exercício_21 {

    public static void main(String[] args) {

        int num;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            num = leitor.nextInt();
        }

        if (num < 0) {

            System.out.println("numero " + num + " = NEGATIVO");

        } else {

            System.out.println("numero " + num + " = POSITIVO");
        }

    }
}
