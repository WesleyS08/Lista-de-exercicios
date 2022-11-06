
public class exercício_53 {

    public static void main(String[] args) {

        double A = 5000000;

        double B = 7000000;

        int ANOS = 0;

        while (A < B) {

            ANOS++;

            A = (A + 0.03) * A;
            B = (B + 0.02) * B;
        }
        System.out.println("Qntd de anos " + ANOS);

    }
}
