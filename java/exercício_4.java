import java.util.Scanner;

public class exercício_4 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double[] lado;
            double perimetro = 0;
            lado = new double[3];
            for (int i = 0; i < 3; i++) {
                int contador = i + 1;
                System.out.println("Digite o " + contador + " lado: ");
                lado[i] = ler.nextDouble();
                perimetro = perimetro + lado[i];
            }
            System.out.println("O perimetro do triangulo e:" + perimetro);
        }
    }
}
