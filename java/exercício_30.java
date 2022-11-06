import java.util.Scanner;

public class exercício_30 {
    public static void main(String[] args) {  
        try (Scanner scan = new Scanner(System.in)) {
           
            String letra;
            char[] alga = {'a', 'g'};
            float litrosA, litrosG;
            double precoG = 2.70, precoA = 1.90, precoF;
            
            System.out.println("Alcool ou gasolina?\n");
            System.out.println("A - Alcool.\n");
            letra = scan.next();
            
            System.out.println("G - gasolina.\n");
            letra = scan.next();
            
            if(letra.equals(alga)){
            
            System.out.println("Alcool escolhido.");
            System.out.println("Quantos litros vai colocar no tanque?\n");
            litrosA= scan.nextFloat();
            
            if(litrosA > 0 && litrosA < 25){
            
            precoF = precoA *litrosA - (precoA * litrosA * 0.02);
            System.out.println("Preço: " +precoF);
            
            } else {
            
            precoF = precoA *litrosA - (precoA * litrosA * 0.04);
            System.out.println("Preço: " + precoF);
            
            }
            
            } else if(letra.equals('g')){
            
            System.out.println("Gasolina escolhida.\n");
            System.out.println("Quantos litros vai colocar no tanque?\n");
            litrosG = scan.nextFloat();
            
            if(litrosG > 0 && litrosG < 25){
            
            precoF = precoG * litrosG - (precoG * litrosG * 0.03);
            System.out.println("Preço: " + precoF);
            
            } else {
            
            precoF = precoG * litrosG - (precoG * litrosG * 0.05);
            System.out.println("Preço: " + precoF);
            
            }
            }
        }
    }
}
