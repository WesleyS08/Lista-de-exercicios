package exercicio97;

public class terceiralinha {

    int x;
    int y;
    int x1;
    int y1;
    int[][] matriz;
    int matriz2[];
    int linhas[] = new int[6];
    int linha2[] = new int[6];
    int coluna[] = new int[6];
    int coluna2[] = new int[6];

    void opção00() {
        System.out.println("\n Digite um numero valido\n");
    }

    void opção1() {

        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];
        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção2() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção3() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção4() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção5() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção6() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção7() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção8() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[1][0];
        linha2[1] = matriz[1][1];
        linha2[2] = matriz[1][2];
        linha2[3] = matriz[1][3];
        linha2[4] = matriz[1][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[1][0] = linhas[0];
        matriz[1][1] = linhas[1];
        matriz[1][2] = linhas[2];
        matriz[1][3] = linhas[3];
        matriz[1][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção9() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção10() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção11() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção12() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção13() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção14() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção15() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção16() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção17() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção18() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção19() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção20() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção21() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção22() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção23() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção24() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção25() {
        linhas[0] = matriz[0][0];
        linhas[1] = matriz[0][1];
        linhas[2] = matriz[0][2];
        linhas[3] = matriz[0][3];
        linhas[4] = matriz[0][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[0][0] = linha2[0];
        matriz[0][1] = linha2[1];
        matriz[0][2] = linha2[2];
        matriz[0][3] = linha2[3];
        matriz[0][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção26() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];
        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção27() {

        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção28() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção29() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção30() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção31() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção32() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção33() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção34() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção35() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção36() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção37() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção38() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção39() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção40() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção41() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção42() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção43() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção44() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção45() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção46() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção47() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção48() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção49() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção50() {
        linhas[0] = matriz[1][0];
        linhas[1] = matriz[1][1];
        linhas[2] = matriz[1][2];
        linhas[3] = matriz[1][3];
        linhas[4] = matriz[1][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[1][0] = linha2[0];
        matriz[1][1] = linha2[1];
        matriz[1][2] = linha2[2];
        matriz[1][3] = linha2[3];
        matriz[1][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção51() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];
        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção52() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];
        ;

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção53() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção54() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }
    }

    void opção55() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção56() {

        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção57() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção58() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção59() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];

        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção60() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção61() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção62() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção63() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção64() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção65() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção66() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção67() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];
        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção68() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção69() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção70() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção71() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção72() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }
    }

    void opção73() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção74() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];
        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção75() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[2][0];
        linha2[1] = matriz[2][1];
        linha2[2] = matriz[2][2];
        linha2[3] = matriz[2][3];
        linha2[4] = matriz[2][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[2][0] = linhas[0];
        matriz[2][1] = linhas[1];
        matriz[2][2] = linhas[2];
        matriz[2][3] = linhas[3];
        matriz[2][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção76() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção77() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção78() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção79() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção80() {

        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][0];
        coluna[1] = matriz[1][0];
        coluna[2] = matriz[2][0];
        coluna[3] = matriz[3][0];
        coluna[4] = matriz[4][4];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][0] = coluna2[0];
        matriz[1][0] = coluna2[1];
        matriz[2][0] = coluna2[2];
        matriz[3][0] = coluna2[3];
        matriz[4][0] = coluna2[4];
        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção81() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];
        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção82() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção83() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção84() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção85() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];
        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção86() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção87() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção88() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção89() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção90() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção91() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção92() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção93() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção94() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção95() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção96() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção97() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção98() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção99() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção100() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[3][0];
        linha2[1] = matriz[3][1];
        linha2[2] = matriz[3][2];
        linha2[3] = matriz[3][3];
        linha2[4] = matriz[3][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[3][0] = linhas[0];
        matriz[3][1] = linhas[1];
        matriz[3][2] = linhas[2];
        matriz[3][3] = linhas[3];
        matriz[3][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção101() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção102() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção103() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção104() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção105() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção106() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção107() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção108() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção109() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção110() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][1];
        coluna[1] = matriz[1][1];
        coluna[2] = matriz[2][1];
        coluna[3] = matriz[3][1];
        coluna[4] = matriz[4][1];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][1] = coluna2[0];
        matriz[1][1] = coluna2[1];
        matriz[2][1] = coluna2[2];
        matriz[3][1] = coluna2[3];
        matriz[4][1] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção111() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção112() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção113() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção114() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção115() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][2];
        coluna[1] = matriz[1][2];
        coluna[2] = matriz[2][2];
        coluna[3] = matriz[3][2];
        coluna[4] = matriz[4][2];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][2] = coluna2[0];
        matriz[1][2] = coluna2[1];
        matriz[2][2] = coluna2[2];
        matriz[3][2] = coluna2[3];
        matriz[4][2] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção116() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção117() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção118() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção119() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção120() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][3];
        coluna[1] = matriz[1][3];
        coluna[2] = matriz[2][3];
        coluna[3] = matriz[3][3];
        coluna[4] = matriz[4][3];

        coluna2[0] = matriz[0][4];
        coluna2[1] = matriz[1][4];
        coluna2[2] = matriz[2][4];
        coluna2[3] = matriz[3][4];
        coluna2[4] = matriz[4][4];

        matriz[0][3] = coluna2[0];
        matriz[1][3] = coluna2[1];
        matriz[2][3] = coluna2[2];
        matriz[3][3] = coluna2[3];
        matriz[4][3] = coluna2[4];

        matriz[0][4] = coluna[0];
        matriz[1][4] = coluna[1];
        matriz[2][4] = coluna[2];
        matriz[3][4] = coluna[3];
        matriz[4][4] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção121() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][0];
        coluna2[1] = matriz[1][0];
        coluna2[2] = matriz[2][0];
        coluna2[3] = matriz[3][0];
        coluna2[4] = matriz[4][0];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][0] = coluna[0];
        matriz[1][0] = coluna[1];
        matriz[2][0] = coluna[2];
        matriz[3][0] = coluna[3];
        matriz[4][0] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção122() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][1];
        coluna2[1] = matriz[1][1];
        coluna2[2] = matriz[2][1];
        coluna2[3] = matriz[3][1];
        coluna2[4] = matriz[4][1];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][1] = coluna[0];
        matriz[1][1] = coluna[1];
        matriz[2][1] = coluna[2];
        matriz[3][1] = coluna[3];
        matriz[4][1] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção123() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][2];
        coluna2[1] = matriz[1][2];
        coluna2[2] = matriz[2][2];
        coluna2[3] = matriz[3][2];
        coluna2[4] = matriz[4][2];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][2] = coluna[0];
        matriz[1][2] = coluna[1];
        matriz[2][2] = coluna[2];
        matriz[3][2] = coluna[3];
        matriz[4][2] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção124() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        coluna[0] = matriz[0][4];
        coluna[1] = matriz[1][4];
        coluna[2] = matriz[2][4];
        coluna[3] = matriz[3][4];
        coluna[4] = matriz[4][4];

        coluna2[0] = matriz[0][3];
        coluna2[1] = matriz[1][3];
        coluna2[2] = matriz[2][3];
        coluna2[3] = matriz[3][3];
        coluna2[4] = matriz[4][3];

        matriz[0][4] = coluna2[0];
        matriz[1][4] = coluna2[1];
        matriz[2][4] = coluna2[2];
        matriz[3][4] = coluna2[3];
        matriz[4][4] = coluna2[4];

        matriz[0][3] = coluna[0];
        matriz[1][3] = coluna[1];
        matriz[2][3] = coluna[2];
        matriz[3][3] = coluna[3];
        matriz[4][3] = coluna[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

    void opção125() {
        linhas[0] = matriz[2][0];
        linhas[1] = matriz[2][1];
        linhas[2] = matriz[2][2];
        linhas[3] = matriz[2][3];
        linhas[4] = matriz[2][4];

        linha2[0] = matriz[4][0];
        linha2[1] = matriz[4][1];
        linha2[2] = matriz[4][2];
        linha2[3] = matriz[4][3];
        linha2[4] = matriz[4][4];

        matriz[2][0] = linha2[0];
        matriz[2][1] = linha2[1];
        matriz[2][2] = linha2[2];
        matriz[2][3] = linha2[3];
        matriz[2][4] = linha2[4];

        matriz[4][0] = linhas[0];
        matriz[4][1] = linhas[1];
        matriz[4][2] = linhas[2];
        matriz[4][3] = linhas[3];
        matriz[4][4] = linhas[4];

        matriz[0][0] = matriz2[5];
        matriz[1][1] = matriz2[6];
        matriz[2][2] = matriz2[7];
        matriz[3][3] = matriz2[8];
        matriz[4][4] = matriz2[9];
        matriz[0][4] = matriz2[0];
        matriz[1][3] = matriz2[1];
        matriz[2][2] = matriz2[2];
        matriz[3][1] = matriz2[3];
        matriz[4][0] = matriz2[4];

        System.out.println("\n A matriz ficou \n");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }

    }

}
