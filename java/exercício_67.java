
import java.util.Scanner;

public class exercício_67 {
    public static void main(String[] args) {  
    try (Scanner scan = new Scanner(System.in)) {
        int[] vet3 = new int[10];
        int[] vet = new int[10];
        int j, k, menor = 99999, maior = 0;
        int menor2 = 99999;
        int maior2 = 0;
        
        
        
        for(int i = 0; i < 10; i++){
        
        System.out.println("Digite o valor do vetor 1 da posiÃ§Ã£o = " +i);
        vet[i] = scan.nextInt();
        
        }
        
        for(int i = 0; i < 10; i++){
        
        if(menor > vet[i]){
        
        menor = vet[i];
        
        }
        if(maior < vet[i]){
        
        maior = vet[i];
        
        
        }
        }
        
        
        
        for(j = 0; j < 10; j++){
        
        System.out.println("Digite o valor do vator 2 da posiÃ§Ã£o = " + j);
        vet[j] = scan.nextInt();
        
        }
        
        for(j = 0; j < 10; j++){
        
        if(menor2 > vet[j]){
        
        menor2 = vet[j];
        
        
        }
        if(maior2 < vet[j]){
        
        maior2 = vet[j];
        
        
        }
        
        }
        vet3[10] = maior;
        vet3[11] = maior2;
        for(k = 0; k < 10; k++){
        
        System.out.println("Digite o valor do vator 3 da posição = " + k);
        vet3[k] = scan.nextInt();
        
        
        }
        for(k = 0; k < 12; k++){
        System.out.println( vet3[k]);
        }
    }
}
}
