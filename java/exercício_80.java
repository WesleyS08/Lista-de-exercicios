import java.util.Scanner;

public class exercício_80 {
    public static void main(String[] args) {
        try (Scanner texto = new Scanner(System.in)){

        System.out.println("Digite o seu texto: ");
        String texto1 = texto.nextLine();

        System.out.println("Digite o seu segundo texto: ");
        String texto2 = texto.nextLine();

        if (texto1 == texto2) {
            System.out.print("os textos são iguais");
        } else {
            System.out.print("Os texto são diferentes!");
        }

    }
}
}