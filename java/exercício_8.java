import java.util.Scanner;

public class exercício_8 {
    
 public static void main(String[] args) {
      
    float far, cel;    
    
      try (Scanner leitor = new Scanner(System.in)) {
        System.out.print ("Digte a temperatura em graus Fahrenheit: ");
        far = leitor.nextFloat();
      }
          
      cel = (far - 32) * 5/9;
      
      System.out.println("A temperatura dada em graus celsius é : " + cel);
      
    }
  }