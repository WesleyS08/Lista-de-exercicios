
import java.util.Scanner;

public class exercício_79 {
 public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        String nomeCompleto;
        
        System.out.println("Digite seu nome completo:");
        nomeCompleto = entrada.nextLine();

        int espaco = nomeCompleto.indexOf(" ");
        System.out.printf("Primeiro nome extraído: \"%s\"%n",nomeCompleto.substring(0,espaco));
        entrada.close();
    }   
}
