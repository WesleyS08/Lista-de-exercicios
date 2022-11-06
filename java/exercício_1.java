
import java.util.Scanner;

public class exercício_1 {
    public static void main(String[] args) {

        try (Scanner b = new Scanner(System.in)) {
            System.out.println("Digite a base do seu retângulo: ");
            double base = b.nextDouble();

            System.out.println("Digite a altura do seu retângulo: ");
            double altura = b.nextDouble();

            double area = base * altura;
            double perimetro = 2 * (base + altura);

            System.out.println("O perimetro do seu retrangulo é: " + perimetro);
            System.out.println("A area do seu retrngulo é: " + area);
        }

    }
}
 