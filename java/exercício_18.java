import java.util.Scanner;

public class exercício_18 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int valor1, valor2, auxiliar;
            System.out.println("Digite a primeira variavel: ");
            valor1 = ler.nextInt();

            System.out.println("Digite a segunda variavel: ");
            valor2 = ler.nextInt();
            System.out.println("primeira variavel: " + valor1);
            System.out.println("segunda variavel: " + valor2);
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
            System.out.println("Permute");
            System.out.println("primeira variavel: " + valor1);
        
        System.out.println("segunda variavel: " + valor2);
    }
}
}
