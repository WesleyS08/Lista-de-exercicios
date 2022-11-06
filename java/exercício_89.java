

import javax.swing.JOptionPane;

public class exercício_89 {
 
public static void main(String[] args) { 
     
        
        String nome1 = JOptionPane.showInputDialog(null, "Digite seu nome ");
        String nome2 = JOptionPane.showInputDialog(null, "Digite seu ultimo sobrenome: ");
        
        // extrair substring      
        
        System.out.println("Seu nome abreviado: " + nome2 + ", " + (nome1.substring(0,1)) + ". " );
      
}
}
    
