
import java.util.Random;
import java.util.Scanner;

public class exercício_99 {
    public static void main(String[] args, Object Key) {
        try (Scanner numero = new Scanner(System.in)) {

            Random random = new Random();

            System.out.println("\n Digite o tamano da lista dos homens!");

            System.out.println("\n Digite a quantidade de linhas que deseja: ");
            int linhome = numero.nextInt();

            System.out.println("\n Digite o tamano da lista dos mulheres!");

            System.out.println("\n Digite a quantidade de linhas que deseja: ");
            int linmulheres = numero.nextInt();
            int v = 0;
            int homens[] = new int[linhome];
            int mulheres[] = new int[linmulheres];
            int casamento[] = new int[linhome];

            for (int vezes = 0; vezes <= linhome; vezes++) {
                homens[vezes] = random.nextInt(18) + 30;
            }
            for (int i = 0; i <= linmulheres; i++) {
                mulheres[i] = random.nextInt(18) + 30;
            }

            System.out.println("As idades dos homens ficaram: ");
            for (int vezes = 0; vezes <= linhome; vezes++) {
                System.out.println(homens[v]);
                v++;
            }
            System.out.println("As idades dos mulhers ficaram: ");
            for (int vezes = 0; vezes <= linmulheres; vezes++) {
                System.out.println(mulheres[v]);
                v++;
            }

            for (int vv = 0; vv <= linhome; vv++) {
                casamento[vv] = homens[vv];

                int a = vv;
                int aa = 0;
                a++;
                for (int b = 0; b <= linhome; a++) {
                    casamento[a] = mulheres[aa];
                    aa++;
                }
            }

            int cassamento = combinations(casamento, 2);
            System.out.println("\n As possiveis combinações de casamento são! \n");
            for (int i= 0; i < casamento.length; i++){
                System.out.println(i);
            }
        }

    }

    private static int combinations(int[] casamento, int i) {
        return 0;
    }
}