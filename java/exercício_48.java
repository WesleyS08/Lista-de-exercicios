import java.util.Scanner;

public class exercício_48 {
    public static void main(String[] args) {

        try (Scanner numero = new Scanner(System.in)){

        System.out.printf("Digite o numero que deseja saber se é primo: ");
        int primo = numero.nextInt();
        int total = 0;
        for (int c = 1; c <= primo; c++) {
            if (primo % c == 0) {
                total++;
            }
        }
        if (total == 2) {
            System.out.printf("O numero: " + primo + " É um numero primo");
        } else {
            System.out.printf("Não é um numero primo!");
        }

    }
}
}