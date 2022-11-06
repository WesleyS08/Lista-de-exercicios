import java.util.Scanner;

public class exercício_29 {
    public static void main(String[] args) {
        try (Scanner resul = new Scanner(System.in)){;

        System.out.printf("Digite o seu salario:");
        double salario = resul.nextDouble();

        double desconto = salario * 0.89;
        double total = salario - desconto;

        if (total <= 334.29) {
            System.out.printf("Seu salario é" + salario + "e com desconto ficou:" + desconto);
        } else {
            double novosalario = salario - 334.29;
            System.out.printf("O salario" + salario
                    + "ultrapassou o limite de desconto de R$:334.29 então o novo dalario ficou:" + novosalario);
        }
    }
    }
}