

import java.util.Scanner;

public class exercício_90 {
   public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String frase;
            int j;
            j=0;
            char array[];
            System.out.print("Digite uma palavra: ");
            frase = ler.next();
            int length = frase.length();
            array = new char[length];
            for(int i=0; i<length; i++){
                char caracter = frase.charAt(i);
                if(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u'){
                    array[j] = caracter;
                    j++;
                }
            }
            for(int i=0; i<length; i++){
                char caracter = frase.charAt(i);
                if(caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u'){
                        array[j] = caracter;
                        j++;
                    }
            }
   
            for(int i=0; i<length; i++){
                System.out.print(array[i]);
            }
        }
    }  
}
