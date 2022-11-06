import java.util.Scanner;

public class exercício_2 {
  public static void main(String[] args) {

    float lado, area, perimetro;

    try (Scanner leitor = new Scanner(System.in)) {
      System.out.println("Digite o valor de um dos lados do quadrado: ");
      lado = leitor.nextShort();
    }

    area = (lado * lado);

    perimetro = (lado * 4);

    System.out.println("A AREA do quadrado é : " + area);

    System.out.println("O PERIMETRO do quadrado é : " + perimetro);

  }
}