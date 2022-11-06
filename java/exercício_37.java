import java.util.Scanner;

public class exercício_37 {
    public static void main(String[] args) { 
        
        int tipo;
        double tpagar, area, sobra, valor;
        tpagar = 0; sobra = 0; valor = 0;
        
         try (Scanner leitor = new Scanner(System.in)) {
            System.out.println(" Cia de pulverizacao ");
            System.out.println("Escolha o Tipo desejado ");
            System.out.println("Tipo 1  ervas daninhas R$ 50,00 por acre ");
            System.out.println("Tipo 2  gafanhotos R$ 100,00 por acre ");
            System.out.println("Tipo 3  broca R$ 150,00 por acre ");
            System.out.println("Tipo 4  todos acima R$ 250,00 por acre ");
            
            System.out.println("Digite o numero referente a opcao desejada: ");
            tipo = leitor.nextInt();
            
            
                
                if (tipo <1 | tipo > 4){
                
                    System.out.println("OPCAO INVALIDA");
                    System.exit(0);
                }
                 
            System.out.println("Digite a quantidade de acres a serem pulverizados");
            area = leitor.nextDouble();
        }
         
        
        
            
            
            if (tipo == 1){
                
               valor = (area * 50);
            }
            
            if (tipo == 2){
            
                valor = (area * 100);
            }
            
            if (tipo == 3){
            
                valor = (area * 150);
            }

            if (tipo == 4){
            
                valor = (area * 250);
            }
            
        
            if (valor < 750.00){
            
                tpagar = valor;
            }
            
        // Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de 5%.
        
            if (area > 1000){
            
                valor = (valor - (valor * 0.05));
                
            } 
            
        // Se o tpgar for maior que 750,00 tem um desconto de 10% sobre o valor que ultrapassar os R$ 750,00.
        
            if (valor > 750.00){
             
                sobra = (valor - 750.00);
                
                sobra = (sobra - (sobra * 0.1));
                
                tpagar = (sobra + 750.00);
                
            }
        
        System.out.println("O valor a ser pago e de: R$ " + tpagar);
        
        
    }
}
