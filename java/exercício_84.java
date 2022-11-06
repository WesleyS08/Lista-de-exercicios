import java.util.Scanner;

public class exercício_84 {
    public static void main(String[] args) {
        try ( Scanner texto = new Scanner(System.in)){

        System.out.print("Digite sua palavra: ");
        String palavra = texto.nextLine();

        String invertida = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
            System.out.println("A palavra " + palavra + " é um palindrome");
        } else {
            System.out.println("A palavra " + palavra + " não é um palindrome");
        }
    }
}
}