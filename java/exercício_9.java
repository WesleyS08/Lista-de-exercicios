import javax.swing.JOptionPane;

public class exercício_9 {
    public static void main(String[] args) {
        
       double raio,altura,volume;
       
      raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o Raio:  "));
      altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura: "));
      volume = 3.14159 * raio * raio  * altura;
     
      JOptionPane.showMessageDialog(null,"Volume: " +volume);
    }
}
