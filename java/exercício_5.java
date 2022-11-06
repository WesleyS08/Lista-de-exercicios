import java.util.Scanner;

public class exercício_5 {
    public static void main(String[] args) {  
    
        int num, sucessor;
    
      try (Scanner leitor = new Scanner(System.in)) {
        System.out.println("Digite um numero: ");
        num = leitor.nextInt();
      }
      
      sucessor = num +1;
      
      System.out.println("O sucessor de " + num + " e: " + sucessor);
     
      
    }
}
