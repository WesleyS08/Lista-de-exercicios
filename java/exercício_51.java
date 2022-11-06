
import java.util.Scanner;
public class exercício_51 {
    
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int quant, anterior, atual, posterior, auxiliar;
            anterior = 0;
            atual = 1;
            
            System.out.print("Digite a quantidade de numeros da sequencia de Fibonacci: ");
            quant = ler.nextInt();
            for(int i=0; i < quant; i++){
                if(i == 0){
                    System.out.print(atual+", ");
                }else{
                    posterior = atual+anterior;
                    System.out.print(posterior+", ");
                    auxiliar = atual;
                    atual = posterior;
                    anterior = auxiliar;
                }
            }
        }
    }
}
