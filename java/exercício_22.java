import javax.swing.JOptionPane;

public class exercício_22 {

    static int modulo;

    public static void main(String[] args) {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

        if (x < 0) {
            modulo = modulo % x * (-1);
        } else {
            modulo = modulo % x;
        }

        JOptionPane.showMessageDialog(null, "O modulo de " + x + " é: " + modulo);
    }
}
