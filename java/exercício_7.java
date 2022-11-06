import javax.swing.JOptionPane;

public class exercício_7 {
    public static void main(String[] args) {
        
           
           int dias,mes;
           int idade;
           int anoAtual;
           int idadeAnos;
           
          idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:  "));
           
          anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
          
          idadeAnos = anoAtual - idade;
          
          mes = idadeAnos * 12;
          dias =(idadeAnos * 365);
          JOptionPane.showMessageDialog(null,"Quantos anos você viveu : " +idadeAnos);
           JOptionPane.showMessageDialog(null,"Quantos dias você viveu : " +dias);
       JOptionPane.showMessageDialog(null,"Quantos meses você viveu : " +mes);
       
}
}