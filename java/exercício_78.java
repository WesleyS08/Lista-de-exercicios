
import javax.swing.JOptionPane;

public class exercício_78 {
    public static void main(String args[]){
      
        String texto = JOptionPane.showInputDialog("Digite algo: ");

        //contar o tamanho de caracteres que existe na string (conta o espaço)
        int stringTamanho = texto.length();

       JOptionPane.showMessageDialog(null,"Tamanho da String(texto): " + stringTamanho);

       //Contar o tamanho de caracteres que existe na string (nao conta os espaço)
        int stringTamanhosemEspaco = texto.replace(" ", "").length();
        JOptionPane.showMessageDialog(null,"Tamanho da String(texto) sem espaços: " + stringTamanhosemEspaco);
    }
    
}
