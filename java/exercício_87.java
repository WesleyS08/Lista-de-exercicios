import java.util.Scanner;

public class exercício_87 {
    public static void main(String[] args) {
        try (Scanner texto = new Scanner(System.in)) {
            System.out.print("Digite a sua primeira palavra: ");
            String palavra = texto.nextLine();
            System.out.print("Digite a sua segunga palavra: ");
            String palavra1 = texto.nextLine();

            if (palavra.equalsIgnoreCase(palavra1)) {
                System.out.print("os textos " + palavra + " e " + palavra1 + " são iguais");
            } else {
                System.out.print("os textos " + palavra + " e " + palavra1 + " são diferentes");
            }
        }

    }

}

                                        
