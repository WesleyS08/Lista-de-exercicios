
import java.util.Scanner;

public class exercício_92 {
    
    public static void main(String args[]){
    
        boolean teste = false;
        int linha =5 , coluna = 5;
	int matriz [][] = new int [linha][coluna]; //Cria uma matriz 3x3 (3 linhas e 2 colunas)
	try (Scanner leitura = new Scanner(System.in)) {
		for (int i= 0; i < linha; i++){
		for (int j=0; j < coluna; j++){
			System.out.println("Digite o valor [" + (i+1) + ", " + (j+1) + "]:");
			matriz[i][j] = leitura.nextInt();	
		        }					
		}
	}
                
    for (int i= 0; i <linha; i++){		
		for (int j=0; j <coluna; j++){
			if ( (matriz[i][j]) == (matriz[j][i])){
                            teste = true;
			}else{
                            teste = false;
			}				
                    }
		}

		System.out.println();
		if (teste == true){
                    System.out.println("Matriz simetrica");
		}else{
                    System.out.println("A matriz nao eh simetrica");	
            }
	}	
}
