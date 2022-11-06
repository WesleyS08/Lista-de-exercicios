
import javax.swing.JOptionPane;

public class exercício_81 {
    public static void main (String args[]){
        
        
         String str = JOptionPane.showInputDialog("Digite algo: ");
		String result = str.replaceAll("\\s+","");
		JOptionPane.showMessageDialog(null,"O resultado escrito em espaço é: " + result);
    }
    
}
