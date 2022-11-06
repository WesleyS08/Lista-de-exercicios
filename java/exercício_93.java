import java.util.Scanner;

public class exercício_93 {
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)){
        int matriz[][];

        int somadiagronal = 0;
        int sum_diagonalSegun = 0;

        matriz = new int[5][5];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf("Qual o elemento da Linha " + (l) + " e coluna " + (c) + " da Matriz: ");
                matriz[l][c] = numero.nextInt();

            }

        }
        System.out.println(" ");
        System.out.printf("Os numeros digitados foram:");
        System.out.println(" ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

        sum_diagonalSegun += matriz[0][4];
        sum_diagonalSegun += matriz[1][3];
        sum_diagonalSegun += matriz[2][2];
        sum_diagonalSegun += matriz[3][1];
        sum_diagonalSegun += matriz[4][0];

        somadiagronal += matriz[0][0];
        somadiagronal += matriz[1][1];
        somadiagronal += matriz[2][2];
        somadiagronal += matriz[3][3];
        somadiagronal += matriz[4][4];


        System.out.println(" ");
        System.out.println("A soma da diagonal principal é: " + somadiagronal + " e a soma da diagonal secundária é "
                + sum_diagonalSegun);
    }
}
}