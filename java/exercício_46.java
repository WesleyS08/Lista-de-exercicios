import java.util.Scanner;
public class exercício_46 {
    public static void main(String[] args) { 
        
        int a, b, divisao; 
        divisao = 0;
        
         try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor para A: ");
             a = leitor.nextInt();

             System.out.println("Digite o valor para B: ");
             b = leitor.nextInt();
        }    
         
         while(a >= b){
         
             divisao = (divisao + 1);
             a = (a - b);
         
         }

         System.out.println("O quociente calculado é: " + divisao);
    }
}
