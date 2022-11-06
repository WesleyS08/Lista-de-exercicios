
import java.util.Scanner;

public class exercício_75 {
    
    public static void main(String[] args) {
        
    
    try (Scanner leitor = new Scanner(System.in)) {
	}
    
    int i, aux; 
    i = 0; aux = 0;
    
    // declarando o array  
        int[] vetor = new int[]{4,3,2,6,7,5,9,10,12,98,34,56,1};
        
        // ordenando com bubble sort
        
        System.out.println("Vetor ordenado - Metodo da bola (bubble sort)");
        
        System.out.println("Vetor desordenado: ");
	for(i = 0; i<13; i++){
		System.out.println(" "+vetor[i]);
	}
	System.out.println(" ");

	for(i = 0; i<13; i++){
		for(int j = 0; j<12; j++){
			if(vetor[j] > vetor[j + 1]){
				aux = vetor[j];
				vetor[j] = vetor[j+1];
				vetor[j+1] = aux;
			}
		}
	}
	System.out.println("Vetor organizado:");
	for(i = 0; i<13; i++){
		System.out.println(" "+vetor[i]);
	}
}
    
}