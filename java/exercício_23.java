import java.util.Scanner;

public class exercício_23 {
    public static void main(String[] args) {
        try (Scanner b = new Scanner(System.in)) {
            System.out.println("Digite um valor: ");
            int numero = b.nextInt();
            if (numero / 2 == 0) {
                System.out.println("O valor:" + numero + " é par");
            } else {
                System.out.println("O valor" + numero + "é impar");
            }
        }
    }
}