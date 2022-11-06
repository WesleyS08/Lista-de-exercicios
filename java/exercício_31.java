import java.util.Scanner;

public class exercício_31 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite quantos passes foram tentados: ");
            int pt = ler.nextInt();
            System.out.println("Digite a quantidade de passes completos: ");
            int pc = ler.nextInt();
            System.out.println("Digite o numero de jardas passadas: ");
            int jp = ler.nextInt();
            System.out.println("Digite o numero de passes para touchdown: ");
            int pto = ler.nextInt();
            System.out.println("Digite a quantidade de interceptações lançadas: ");
            int pi = ler.nextInt();

            double pt1 = ((((pc / pt) - 0.3) * 5 + ((jp / pt) - 3) * 0.25 + (pto / pt) * 20 + 3.375 - ((pi / pt) * 25))
                    / 6) * 100;
            if (pt1 >= 158.3) {
                System.out.println("O jogador deve uma pontuação perfeita de: " + pt1);

            } else {
                System.out.println("O jogador deve uma pontuação de: " + pt1);
            }
        }
    }
}
