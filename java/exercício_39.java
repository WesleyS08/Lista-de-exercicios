import javax.swing.JOptionPane;
public class exercício_39 {
    public static void main(String[] args) {
       
        int numAgen;
        int agencia1 = 4;
        int agencia2 = 8;
        int agencia3 = 7;
        int agencia4 = 0;
        int idv;
        int dv;

        String entrada = "Informe os quadro dígitos da sua conta";
        numAgen = Integer.parseInt(JOptionPane.showInputDialog(entrada));

        idv = 11 - (agencia1 * 5 + agencia2 *4 + agencia3 *3 + agencia4*2) % 11;

        switch (idv) {
            case 10:
                dv = 'X';
                break;
            case 11:
                dv = '0';
                break;
            default:
                dv = idv + '0';
                break;
        }

        JOptionPane.showMessageDialog(null, "O numêro da agência é " + numAgen + "-" + dv);
   }
}
