import java.util.Scanner;

public class exercício_16 {
    
   public static void main(String[] args) {
	
    {
        
       int n=0;
       int rn =0;
       System.out.println("Digite qualquer número:");
       
       try (Scanner in = new Scanner(System.in)) {
         n = in.nextInt();
      }
      
       while( n != 0 )
       {
           rn = rn * 10;
           rn = rn + n%10;
           n = n/10;
       }

       System.out.println("O número reverso é "+rn);
    }
 }
}
