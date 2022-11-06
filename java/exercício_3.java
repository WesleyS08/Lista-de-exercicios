import java.util.Scanner;

public class exercício_3 {
	public static void main(String[] args) {
		double raio, area, perimetro, pi = 3.14;

		System.out.println("Insira o raio da circunferencia:");
		try (Scanner sc = new Scanner(System.in)) {
			raio = sc.nextInt();
		}
		area = pi * (raio * raio);
		perimetro = 2 * pi * raio;

		System.out.println("Area: " + area + "Perimetro: " + perimetro);

	}
}
