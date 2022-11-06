import java.util.Scanner;

public class exercício_11 {
    public static void main(String[] args) {
        try (Scanner b = new Scanner(System.in)) {
            System.out.println("Digite a nota da primeira prova:");
            double prova1 = b.nextDouble();
            System.out.println("Digite o valor da segunda nota: ");
            double prova2 = b.nextDouble();
            System.out.println("Digite a nota da terceira prova: ");
            double prova3 = b.nextDouble();
            System.out.println("Digite o valor da quarta prova: ");
            double prova4 = b.nextDouble();

            double bi1 = (prova1 + prova2) / 2;
            double bi2 = (prova3 + prova4) / 2;
            double Semes = (bi1 + bi2) / 2;

            System.out.println("A nota do Semestre é:" + Semes);
        }

    }
}