import javax.swing.JOptionPane;

public class exercício_33 {
    public static void main(String args[]){
        
        float x,y;
    
        x = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
       
            if (x == 0.0 && y == 0.0){ 
               JOptionPane.showMessageDialog(null,"Origem\n");
            }else if (x > 0 && y > 0){
                JOptionPane.showMessageDialog(null,"Quadrante 1\n");
            }else if (x < 0 && y > 0){
               JOptionPane.showMessageDialog(null,"Quadrante 2\n");
            }else if (x < 0 && y < 0){
                JOptionPane.showMessageDialog(null,"Quadrante 3\n");
            }else if (x > 0 && y < 0){
                JOptionPane.showMessageDialog(null,"Quadrante 4\n");
            }else if (x == 0){
                JOptionPane.showMessageDialog(null,"Eixo Y");
            }else if (y == 0){
                JOptionPane.showMessageDialog(null,"Eixo X"); 
            }
        }
}
