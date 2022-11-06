import java.util.Scanner;

public class exercício_58 {
    public static void main(String[] args) {

        try (Scanner numero = new Scanner(System.in)) {
            System.out.printf("Digite a quantidade de termos que deseja: ");
            int termos = numero.nextInt();

            double divisor = 1;
            double quoeciente = 0.0;
            double dividendo = 0.0;

            for (; dividendo <= termos; dividendo++)
                ;
            {
                if (dividendo % 2 == 0) {
                    quoeciente += 1 / divisor;
                    divisor += 2;
                } else {
                    quoeciente -= (1 / divisor);
                    divisor += 2;
                }

            }
            System.out.println(quoeciente);
            double resultado = ((float) quoeciente) * 4;
            System.out.printf("O PI usando: " + termos + " é ≈ " + resultado);

        }
    }
}