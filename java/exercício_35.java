import java.util.Scanner;

public class exercício_35 {
    public static void main(String[] args) {  
    
        int num;
    
      try (Scanner leitor = new Scanner(System.in)) {
        System.out.println("Digite um numero de 1 a 7: ");
          num = leitor.nextInt();
    }
      
      if(num > 7 | num < 1 ){
          
          System.out.println("O numero digitado nao corresponde ao solicitado ");
          System.exit(0);
        }
      
      if(num == 1){
      
          System.out.println("DOMINGO");
      }
      if(num == 2){
      
          System.out.println("SEGUNDA");
      }
      if(num == 3){
      
          System.out.println("TERCA");
      }
      if(num == 4){
      
          System.out.println("QUARTA");
      }
      if(num == 5){
      
          System.out.println("QUINTA");
      }
      if(num == 6){
      
          System.out.println("SEXTA");
      }
      if(num == 7){
      
          System.out.println("SABADO");
      }      
      
    }
}
