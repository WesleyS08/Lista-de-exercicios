import java.util.Scanner;
public class exercício_38 {
        public static void main(String[] args) { 
            
            int bissexto; 
            
             try (Scanner leitor = new Scanner(System.in)) {
                System.out.println("Digite um ano para saber se e bissexto ou nao: ");
                 bissexto = leitor.nextInt();
            }
        
             if(bissexto % 4 == 0 & bissexto % 100 > 0 | bissexto % 4 == 0 & bissexto % 100 == 0 & bissexto % 400 == 0){
                 
                 System.out.println("O ano " + bissexto + " e bissexto." );
             
             }else{
                 
                 System.out.println("O ano nao é bissexto.");
             
             }
        
        }
}
