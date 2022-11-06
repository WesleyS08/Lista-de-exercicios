

import javax.swing.JOptionPane;

public class exercício_77 {
    
    
    public static void main(String[] args) { 
     
        
        String palavra = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        
        String inverso = new StringBuilder(palavra).reverse().toString();
        
        
        System.out.println(inverso);
      
}
}
