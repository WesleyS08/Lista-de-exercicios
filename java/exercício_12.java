import java.util.Scanner;

public class exercício_12 {
    public static void main(String[] args) {  
    
        double metros, km; 
        
          try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite velocidade em m/s: ");
              metros = leitor.nextDouble();
        }
          
          km = (metros * 3.6);
          
          System.out.println("A velocidade : " + metros );
          System.out.println("equivale a : " + km + "km/h." );
          
        }
}
