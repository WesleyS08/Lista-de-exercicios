import java.util.Scanner;

public class exercício_10 {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {
            
               System.out.println("Informe um numero menor que 32 para converte-lo para binario");
               int numero = tec.nextInt();
               if((numero <= 32) && (numero > 1)){
               String binario = Integer.toBinaryString(numero);
               System.out.println(binario);
               }else{
               System.out.println("O numero informado precisa ser menor que 32");
               }
        }
    }
}
