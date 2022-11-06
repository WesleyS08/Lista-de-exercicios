import java.util.Scanner;

public class exercício_68 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vet = new int[30];

            int menor = 99999, maior = 0, menor_dia = 0, maior_dia = 0;

            float prim_quinzena = 0;
            float seg_quinzena = 0;

            System.out.println("VALOR DE PLUVIOMÃ‰TRICO DO MÃŠS DE JUNHO: \n");
            for (int i = 1; i <= 30; i++) {

                System.out.println("DIGITE A MEDIDA EM MILÃMETROS DO DIA = " + i);
                vet[i] = scan.nextInt();

            }
            for (int i = 1; i <= 30; i++) {

                if (menor > vet[i]) {

                    menor = vet[i];
                    menor_dia = i;
                }

                if (maior < vet[i]) {

                    maior = vet[i];
                    maior_dia = i;

                }
            }
            for (int i = 1; i <= 15; i++) {
                prim_quinzena = prim_quinzena + vet[i];

            }
            for (int i = 16; i <= 30; i++) {
                seg_quinzena = seg_quinzena + vet[i];

            }
            prim_quinzena = prim_quinzena / 15;
            seg_quinzena = seg_quinzena / 15;

            System.out.println("O DIA QUE MENOS CHOVEU FOI DIA: \n" + menor_dia);
            System.out.println("O DIA QUE MAIS CHOVEU FOI DIA: \n" + maior_dia);
            System.out.println("A MÃ‰DIA DA PLUVIOMÃ‰TRICA DA PRIMEIRA QUINZENA FOI: \n" + prim_quinzena);
            System.out.println("A MÃ‰DIA DA PLUVIOMÃ‰TRICA DA SEGUNDA QUINZENA FOI:\n" + seg_quinzena);
        }

    }
}
