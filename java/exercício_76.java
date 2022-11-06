import java.util.Scanner;

public class exercício_76 {
    public static void main(String[] args) {
        try (Scanner palavra = new Scanner(System.in)){
        int total = 0;

        System.out.print("Digite uma palavra: ");
        String verificar = palavra.nextLine();

        for (int i = 0; i < verificar.length(); i++) {
            char c = verificar.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                    || c == 'U') {
                total++;
            }

        }

        System.out.printf("A palavra " + verificar + " possuem um total de: " + total + " de vogais");
    }
    }
}
