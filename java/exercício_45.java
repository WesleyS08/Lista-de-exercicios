import java.util.Scanner;
public class exercício_45 {
    public static void main(String[] args) {  
    
        int num1, num2, num3, num4, num5, media;
        
        media = 0;
        
      try (Scanner leitor = new Scanner(System.in)) {
        System.out.println("Digite um numero ");
        num1 = leitor.nextInt();
        
        System.out.println("Digite mais um ");
        num2 = leitor.nextInt();

        System.out.println("Digite mais um ");
        num3 = leitor.nextInt();

        System.out.println("Digite mais um ");
        num4 = leitor.nextInt();

        System.out.println("Digite mais um ");
        num5 = leitor.nextInt();
      }
      
      media = ((num1 + num2 + num3 + num4 + num5) / 5);
      
      System.out.println("MEDIA = " + media);
              
    }
}
