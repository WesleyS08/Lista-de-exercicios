import java.util.Scanner;

public class exercício_17 {
    public static void main(String[] args) {
        try (Scanner b = new Scanner(System.in)) {
            System.out.println("Digite o valor que deseja:");
            int valor = b.nextInt();
            int total = valor;
            int celula = 100;
            int totalcelula = 0;

            while (true)
                if (total >= celula) {
                    total -= celula;
                    totalcelula++;
                } else {
                    if (totalcelula > 0) {
                        System.out.println("Total de " + totalcelula + "cédulas de R$" + celula);
                    }
                    if (celula == 100) {
                        celula = 50;
                    } else if (celula == 50) {
                        celula = 20;
                    } else if (celula == 20) {
                        celula = 5;
                    } else if (celula == 5) {
                        celula = 2;
                    } else if (celula == 2) {
                        celula = 1;
                    } else if (celula == 1) {
                        celula = 1;
                    }
                    totalcelula = 0;
                    if (total == 0) {
                        break;
                    }
                }
        }

    }
}