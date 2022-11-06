
import java.util.Scanner;

public class exercício_52 {
    public static void main(String[] args) {
		
        try (Scanner sc = new Scanner(System.in)) {
			int num1, num2, i, valorTermo;

			System.out.println("Digite o primeiro número:");
			num1 = sc.nextInt();

			System.out.println("Digite o segundo número:");
			num2 = sc.nextInt();

			System.out.println("Digite a quantidade de termos:");
			int t = sc.nextInt();

			if(t < 3)
				{
					System.out.println("A quantidade mínima de termos é 3");
				}

			System.out.println(num1);
			System.out.println(num2);

			for(i = 3; i < t; i++)  
				{
				if(i % 2 == 0)
					{
					valorTermo = num2 - num1;
					}
				else 
					{
					valorTermo = num2 + num1; 
					}
				System.out.println(valorTermo);
				num1 = num2; 
				num2 = valorTermo;
				}
		}

	}
}
