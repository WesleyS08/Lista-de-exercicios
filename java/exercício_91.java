
import java.util.Scanner;

public class exercício_91 {
    
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
    
    int[] somaLinha = new int[5];
    int[] somaColuna = new int[5];
    int l=5, c=5, soma;
    int i,j;
    int[][] matriz = new int [l][c];
    
    //Preenchendo a matriz
        for(i = 0; i< l; i++){
            for(j = 0; j <c; j++){
                System.out.printf("Linha: [%d] coluna: [%d]: \n",i,j);
                matriz[i][j] = scan.nextInt();
            }
    
        }
        
        //Soma das linhas
        
        for(i = 0; i < l; i++){
           soma = 0;
            for(j =0; j <c; j++){
                soma = soma + matriz[i][j];
            }
            somaLinha[i] = soma;
        }
        
        //Soma das colunas
        
        for(j =0; j <c; j++){
            soma =0;
            for(i =0; i <l; i++){
                soma = soma + matriz[i][j];
            }
            somaColuna[j] = soma;   
        }
        
        //Imprimindo
        
        System.out.println("Matriz: ");
        
        for(i =0; i <l; i++){
            for(j =0; j <c; j++){
                    System.out.println(matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("\nVetor com a soma das linhas: ");
        for(i =0; i <l; i++){
            System.out.println("Linha " + i + ": " + somaLinha[i]);
        }
        
        System.out.println("Vetor com a soma das colunas: ");
        for(j =0; j <c; j++){
            System.out.println("Coluna " + j + ": " +  somaColuna[j]);
        }
    }
}
