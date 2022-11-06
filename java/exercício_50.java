
import java.util.Scanner;

public class exercício_50 {

    public static void main(String[] args) {

        int n, lado1, lado2, lado3, lado4, lado5, lado6;
        lado1 = 1;
        lado2 = 2;
        lado3 = 3;
        lado4 = 4;
        lado5 = 5;
        lado6 = 6;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            n = leitor.nextInt();
        }

        if (n == 1 | n > 12) {

            System.out.println("Nao existe combinaçao");
        }

        if (n == 2) {

            System.out.println("combinaçao");
            System.out.println(lado1 + " " + lado1);

        }
        if (n == 3) {

            System.out.println("combinação");
            System.out.println(lado1 + " " + lado2);
            System.out.println(lado2 + " " + lado1);

        }
        if (n == 4) {

            System.out.println("combinaçao");
            System.out.println(lado1 + " " + lado3);
            System.out.println(lado2 + " " + lado2);
            System.out.println(lado3 + " " + lado1);

        }
        if (n == 5) {

            System.out.println("combinaçao");
            System.out.println(lado1 + " " + lado4);
            System.out.println(lado2 + " " + lado3);
            System.out.println(lado3 + " " + lado2);
            System.out.println(lado4 + " " + lado1);

        }
        if (n == 6) {

            System.out.println("combinaçao");
            System.out.println(lado1 + " " + lado5);
            System.out.println(lado5 + " " + lado1);
            System.out.println(lado2 + " " + lado4);
            System.out.println(lado4 + " " + lado2);
            System.out.println(lado5 + " " + lado1);
            System.out.println(lado1 + " " + lado5);

        }

        if (n == 7) {

            System.out.println("combinaçao");
            System.out.println(lado1 + " " + lado6);
            System.out.println(lado2 + " " + lado5);
            System.out.println(lado3 + " " + lado4);
            System.out.println(lado4 + " " + lado3);
            System.out.println(lado5 + " " + lado2);
            System.out.println(lado6 + " " + lado1);

        }
        if (n == 8) {

            System.out.println("combinaçao");
            System.out.println(lado4 + " " + lado4);
            System.out.println(lado6 + " " + lado2);
            System.out.println(lado3 + " " + lado5);
            System.out.println(lado2 + " " + lado6);
            System.out.println(lado5 + " " + lado3);

        }
        if (n == 9) {

            System.out.println("combinaçao");
            System.out.println(lado6 + " " + lado3);
            System.out.println(lado3 + " " + lado6);
            System.out.println(lado4 + " " + lado5);
            System.out.println(lado5 + " " + lado4);

        }

        if (n == 10) {

            System.out.println("combinaçao");
            System.out.println(lado5 + " " + lado5);
            System.out.println(lado6 + " " + lado4);
            System.out.println(lado4 + " " + lado6);

        }

        if (n == 11) {

            System.out.println("combinaçao");
            System.out.println(lado5 + " " + lado6);
            System.out.println(lado6 + " " + lado5);

        }

        if (n == 12) {

            System.out.println("combinaçao");
            System.out.println(lado6 + " " + lado6);
        }
    }

}
