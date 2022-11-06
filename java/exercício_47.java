import java.util.Scanner;
public class exercício_47 {
    public static void main(String[] args) { 
        
        int a, b, resto; 
        
        
         try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um valor para A: ");
             a = leitor.nextInt();
                
                resto = a;
                
             System.out.println("Digite um valor para B: ");
             b = leitor.nextInt();
        }    
         
         while(resto >= b){
         
             resto = (resto - b);
                     
         }
         
         System.out.println("O resto dessa divisao e: " + resto);
         
         
    }
}
