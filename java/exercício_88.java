

import java.util.Scanner;

public class exercício_88 {
    public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite uma palavra:");
			String palavra = sc.nextLine();
			System.out.println(palavra.toUpperCase());
		}
       
	}
}
