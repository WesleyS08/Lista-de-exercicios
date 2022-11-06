
public class exercício_100 {
    public static void main(String[] args) {
        int i, j;
        int[][] mat1 = new int[3][3];
        int n1 = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat1[i][j] = i + j * 2;
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                n1 += mat1[i][j];
            }
        }
        System.out.println("A PERMUTAÇÃO DOS N EH:" + n1);
    }
}
