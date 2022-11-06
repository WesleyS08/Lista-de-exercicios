
import java.util.Random;

public class exercício_70 {
	public static void main(String args[]) {
		Random random = new Random();

		int[] numerosAleatorios = new int[100];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}

		System.out.print("Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
	}
}
