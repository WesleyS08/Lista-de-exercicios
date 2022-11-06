
import java.util.Scanner;

public class exercício_55 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int numero1, numero2, contador1, contador2;
            contador1 = 0;
            contador2 = 0;

            System.out.print("Digite o primeiro numero: ");
            numero1 = ler.nextInt();
            System.out.print("Digite o segundo numero: ");
            numero2 = ler.nextInt();

            for (int i = 1; i < numero1; i++) {
                if (numero1 % i == 0) {
                    contador1 = contador1 + i;
                }
            }
            if (contador1 == numero2) {
                for (int i = 1; i < numero2; i++) {
                    if (numero2 % i == 0) {
                        contador2 = contador2 + i;
                    }
                }

                if (contador2 == numero1) {
                    System.out.print("Sao amigos");
                } else {
                    System.out.print("Nao sao amigos");
                }
            } else {
                System.out.print("Nao sao amigos");
            }
        }
    }
}
