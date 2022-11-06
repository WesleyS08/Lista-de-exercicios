import java.util.Scanner;

public class exercício_36 {
    public static void main(String[] args) {

        try (Scanner nota = new Scanner(System.in)){

        System.out.printf("Digite a nota da primeira prova: ");
        Float nota1 = nota.nextFloat();
        System.out.printf("Digite a nota da segunda nota: ");
        float nota2 = nota.nextFloat();
        System.out.printf("Digite a nota da Terceira prova: ");
        float nota3 = nota.nextFloat();
        System.out.printf("Digite a nota da Quarta prova: ");
        float nota4 = nota.nextFloat();
        System.out.printf("Digite a nora da Ultima prova: ");
        float nota5 = nota.nextFloat();

        int media = 70;

        if (nota1 >= media) {
            if (nota2 >= media)
                if (nota3 >= media)
                    if (nota4 >= media)
                        if (nota5 >= media)
                            System.out.printf("Voce passou em todas as provas!");
        }

        if (nota1 >= media) {
            if (nota2 >= media)
                if (nota3 < media)
                    if (nota4 >= media)
                        if (nota5 < media)
                            System.out.printf("B – passou em I, II e IV, mas não em III ou V.");
        }

        if (nota1 >= media) {
            if (nota2 >= media)
                if (nota3 >= media)
                    if (nota4 >= media)
                        if (nota5 < media)
                            System.out.printf("C – passou em I e II, III ou IV, mas não em V.");
        } else {
            System.out.printf("Reprovado - outra situação");
        }
    }
}
}
