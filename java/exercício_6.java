import java.util.Scanner;

public class exercício_6 {
    public static void main(String[] args) {

         try (Scanner b = new Scanner(System.in)) {;

        System.out.println("Digite o primeiro numero da operação: ");
        int num1 = b.nextInt();
        System.out.println("Digite o valor do segundo numero: ");
        int num2 = b.nextInt();

        System.out.println("A divisão dos numeros é: " + num1 / num2);
        System.out.println("O resto da divisão é: " + num1 % num2);

        }
    }
}