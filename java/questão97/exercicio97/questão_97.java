package exercicio97;

import java.util.Scanner;

public class questão_97 {
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)) {
            int matriz[][] = new int[5][5];
            int matriz2[] = new int[10];
            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.printf("Qual o elemento da Linha " + (l) + " e coluna " + (c) + ": ");
                    matriz[l][c] = numero.nextInt();
                }
            }
            System.out.println(" ");
            System.out.printf("Os numeros digitados foram");
            System.out.println(" ");
            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.print(matriz[l][c] + " ");
                }
                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.printf("Lembre-se as diagonal são substituídas automaticamente ! ");
            System.out.println(" ");
            System.out.println("");
            System.out.println(" ");
            System.out.printf("Digite as linhas e colunas que deseja mudar! ");
            System.out.println(" ");
            System.out.println("");
            System.out.printf("Digite a primeira linha que deseja: ");
            int x = numero.nextInt();
            System.out.printf("Digite a segunda linha que deseja: ");
            int y = numero.nextInt();
            System.out.printf("Digite a primeira coluna que deseja: ");
            int x1 = numero.nextInt();
            System.out.printf("Digite a segunda coluna que deseja: ");
            int y1 = numero.nextInt();

            matriz2[0] = matriz[0][0];
            matriz2[1] = matriz[1][1];
            matriz2[2] = matriz[2][2];
            matriz2[3] = matriz[3][3];
            matriz2[4] = matriz[4][4];
            matriz2[5] = matriz[0][4];
            matriz2[6] = matriz[1][3];
            matriz2[7] = matriz[2][2];
            matriz2[8] = matriz[3][1];
            matriz2[9] = matriz[4][0];

            primeira linha = new primeira();

            linha.x = x;
            linha.y = y;
            linha.x1 = x1;
            linha.y1 = y1;
            linha.matriz = matriz;
            linha.matriz2 = matriz2;

            segundalinha segundalinha = new segundalinha();
            segundalinha.x = x;
            segundalinha.y = y;
            segundalinha.x1 = x1;
            segundalinha.y1 = y1;
            segundalinha.matriz = matriz;
            segundalinha.matriz2 = matriz2;

            terceiralinha terceiralinha = new terceiralinha();
            terceiralinha.x = x;
            terceiralinha.y = y;
            terceiralinha.x1 = x1;
            terceiralinha.y1 = y1;
            terceiralinha.matriz = matriz;
            terceiralinha.matriz2 = matriz2;

            quartalinha quartalinha = new quartalinha();
            quartalinha.x = x;
            quartalinha.y = y;
            quartalinha.x1 = x1;
            quartalinha.y1 = y1;
            quartalinha.matriz = matriz;
            quartalinha.matriz2 = matriz2;

            quintalinha quintalinha = new quintalinha();

            quintalinha.x = x;
            quintalinha.y = y;
            quintalinha.x1 = x1;
            quintalinha.y1 = y1;
            quintalinha.matriz = matriz;
            quintalinha.matriz2 = matriz2;

            if (x == 1) {
                if (y == 1) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            linha.opção1();
                        } else if (y1 == 2) {
                            linha.opção2();
                        } else if (y1 == 3) {
                            linha.opção3();
                        } else if (y1 == 4) {
                            linha.opção4();

                        } else if (y1 == 5) {
                            linha.opção5();
                        } else {
                            linha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            linha.opção6();
                        } else if (y1 == 2) {
                            linha.opção7();
                        } else if (y1 == 3) {
                            linha.opção8();
                        } else if (y1 == 4) {
                            linha.opção9();
                        } else if (y1 == 5) {
                            linha.opção10();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            linha.opção11();
                        } else if (y1 == 2) {
                            linha.opção12();
                        } else if (y1 == 3) {
                            linha.opção13();
                        } else if (y1 == 4) {
                            linha.opção14();
                        } else if (y1 == 5) {
                            linha.opção15();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            linha.opção16();
                        } else if (y1 == 2) {
                            linha.opção17();
                        } else if (y1 == 3) {
                            linha.opção18();
                        } else if (y1 == 4) {
                            linha.opção19();
                        } else if (y1 == 5) {
                            linha.opção20();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            linha.opção21();
                        } else if (y1 == 2) {
                            linha.opção22();
                        } else if (y1 == 3) {
                            linha.opção23();
                        } else if (y1 == 4) {
                            linha.opção24();
                        } else if (y1 == 5) {
                            linha.opção25();
                        } else {
                            linha.opção00();
                        }
                    }
                } else if (y == 2) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            linha.opção26();
                        } else if (y1 == 2) {
                            linha.opção27();
                        } else if (y1 == 3) {
                            linha.opção28();
                        } else if (y1 == 4) {

                            linha.opção29();
                        } else if (y1 == 5) {
                            linha.opção30();
                        } else {
                            linha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            linha.opção31();
                        } else if (y1 == 2) {
                            linha.opção32();
                        } else if (y1 == 3) {
                            linha.opção33();
                        } else if (y1 == 4) {
                            linha.opção34();
                        } else if (y1 == 5) {
                            linha.opção35();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            linha.opção36();
                        } else if (y1 == 2) {
                            linha.opção37();
                        } else if (y1 == 3) {
                            linha.opção38();
                        } else if (y1 == 4) {
                            linha.opção39();
                        } else if (y1 == 5) {
                            linha.opção40();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            linha.opção41();
                        } else if (y1 == 2) {
                            linha.opção42();
                        } else if (y1 == 3) {
                            linha.opção43();
                        } else if (y1 == 4) {
                            linha.opção44();
                        } else if (y1 == 5) {
                            linha.opção45();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            linha.opção46();
                        } else if (y1 == 2) {
                            linha.opção47();
                        } else if (y1 == 3) {
                            linha.opção48();
                        } else if (y1 == 4) {
                            linha.opção49();
                        } else if (y1 == 5) {
                            linha.opção50();
                        } else {
                            linha.opção00();
                        }
                    }
                } else if (y == 3) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            linha.opção51();
                        } else if (y1 == 2) {
                            linha.opção52();
                        } else if (y1 == 3) {
                            linha.opção53();
                        } else if (y1 == 4) {
                            linha.opção54();

                        } else if (y1 == 5) {
                            linha.opção55();
                        } else {
                            linha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            linha.opção56();
                        } else if (y1 == 2) {
                            linha.opção57();
                        } else if (y1 == 3) {
                            linha.opção58();
                        } else if (y1 == 4) {
                            linha.opção59();
                        } else if (y1 == 5) {
                            linha.opção60();
                        } else {
                            linha.opção00();

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            linha.opção61();
                        } else if (y1 == 2) {
                            linha.opção62();
                        } else if (y1 == 3) {
                            linha.opção63();
                        } else if (y1 == 4) {
                            linha.opção64();
                        } else if (y1 == 5) {
                            linha.opção65();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            linha.opção66();
                        } else if (y1 == 2) {
                            linha.opção67();
                        } else if (y1 == 3) {
                            linha.opção68();
                        } else if (y1 == 4) {
                            linha.opção69();
                        } else if (y1 == 5) {
                            linha.opção70();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            linha.opção71();
                        } else if (y1 == 2) {
                            linha.opção72();
                        } else if (y1 == 3) {
                            linha.opção73();
                        } else if (y1 == 4) {
                            linha.opção74();
                        } else if (y1 == 5) {
                            linha.opção75();
                        } else {
                            linha.opção00();
                        }
                    }
                } else if (y == 4) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            linha.opção76();
                        } else if (y1 == 2) {
                            linha.opção77();
                        } else if (y1 == 3) {
                            linha.opção78();
                        } else if (y1 == 4) {

                            linha.opção79();
                        } else if (y1 == 5) {
                            linha.opção80();
                        } else {
                            linha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            linha.opção81();
                        } else if (y1 == 2) {
                            linha.opção82();

                        } else if (y1 == 3) {
                            linha.opção83();
                        } else if (y1 == 4) {
                            linha.opção84();
                        } else if (y1 == 5) {
                            linha.opção85();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            linha.opção86();
                        } else if (y1 == 2) {
                            linha.opção87();
                        } else if (y1 == 3) {
                            linha.opção88();
                        } else if (y1 == 4) {
                            linha.opção89();
                        } else if (y1 == 5) {
                            linha.opção90();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            linha.opção91();
                        } else if (y1 == 2) {
                            linha.opção92();
                        } else if (y1 == 3) {
                            linha.opção93();
                        } else if (y1 == 4) {
                            linha.opção94();
                        } else if (y1 == 5) {
                            linha.opção95();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            linha.opção96();
                        } else if (y1 == 2) {
                            linha.opção97();
                        } else if (y1 == 4) {
                            linha.opção98();
                        } else if (y1 == 5) {
                            linha.opção99();
                        } else {
                            linha.opção00();
                        }
                    }
                } else if (y == 5) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            linha.opção100();
                        } else if (y1 == 2) {
                            linha.opção101();
                        } else if (y1 == 3) {
                            linha.opção102();
                        } else if (y1 == 4) {
                            linha.opção103();

                        } else if (y1 == 5) {
                            linha.opção104();
                        } else {
                            linha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            linha.opção105();
                        } else if (y1 == 2) {
                            linha.opção106();
                        } else if (y1 == 3) {
                            linha.opção107();
                        } else if (y1 == 4) {
                            linha.opção108();
                        } else if (y1 == 5) {
                            linha.opção109();
                        } else {

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            linha.opção110();
                        } else if (y1 == 2) {
                            linha.opção111();
                        } else if (y1 == 3) {
                            linha.opção112();
                        } else if (y1 == 4) {
                            linha.opção113();
                        } else if (y1 == 5) {
                            linha.opção114();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            linha.opção115();
                        } else if (y1 == 2) {
                            linha.opção116();
                        } else if (y1 == 3) {
                            linha.opção117();
                        } else if (y1 == 4) {
                            linha.opção118();
                        } else if (y1 == 5) {
                            linha.opção119();
                        } else {
                            linha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            linha.opção120();
                        } else if (y1 == 2) {
                            linha.opção121();
                        } else if (y1 == 3) {
                            linha.opção122();
                        } else if (y1 == 4) {
                            linha.opção123();
                        } else if (y1 == 5) {
                            linha.opção12();
                        } else {
                            linha.opção00();
                        }
                    }
                }

            } else if (x == 2) {
                if (y == 1) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            segundalinha.opção1();
                        } else if (y1 == 2) {
                            segundalinha.opção2();
                        } else if (y1 == 3) {
                            segundalinha.opção3();
                        } else if (y1 == 4) {
                            segundalinha.opção4();

                        } else if (y1 == 5) {
                            segundalinha.opção5();
                        } else {
                            segundalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            segundalinha.opção6();
                        } else if (y1 == 2) {
                            segundalinha.opção7();
                        } else if (y1 == 3) {
                            segundalinha.opção8();
                        } else if (y1 == 4) {
                            segundalinha.opção9();
                        } else if (y1 == 5) {
                            segundalinha.opção10();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            segundalinha.opção11();
                        } else if (y1 == 2) {
                            segundalinha.opção12();
                        } else if (y1 == 3) {
                            segundalinha.opção13();
                        } else if (y1 == 4) {
                            segundalinha.opção14();
                        } else if (y1 == 5) {
                            segundalinha.opção15();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            segundalinha.opção16();
                        } else if (y1 == 2) {
                            segundalinha.opção17();
                        } else if (y1 == 3) {
                            segundalinha.opção18();
                        } else if (y1 == 4) {
                            segundalinha.opção19();
                        } else if (y1 == 5) {
                            segundalinha.opção20();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            segundalinha.opção21();
                        } else if (y1 == 2) {
                            segundalinha.opção22();
                        } else if (y1 == 3) {
                            segundalinha.opção23();
                        } else if (y1 == 4) {
                            segundalinha.opção24();
                        } else if (y1 == 5) {
                            segundalinha.opção25();
                        } else {
                            segundalinha.opção00();
                        }
                    }
                } else if (y == 2) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            segundalinha.opção26();
                        } else if (y1 == 2) {
                            segundalinha.opção27();
                        } else if (y1 == 3) {
                            segundalinha.opção28();
                        } else if (y1 == 4) {

                            segundalinha.opção29();
                        } else if (y1 == 5) {
                            segundalinha.opção30();
                        } else {
                            segundalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            segundalinha.opção31();
                        } else if (y1 == 2) {
                            segundalinha.opção32();
                        } else if (y1 == 3) {
                            segundalinha.opção33();
                        } else if (y1 == 4) {
                            segundalinha.opção34();
                        } else if (y1 == 5) {
                            segundalinha.opção35();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            segundalinha.opção36();
                        } else if (y1 == 2) {
                            segundalinha.opção37();
                        } else if (y1 == 3) {
                            segundalinha.opção38();
                        } else if (y1 == 4) {
                            segundalinha.opção39();
                        } else if (y1 == 5) {
                            segundalinha.opção40();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            segundalinha.opção41();
                        } else if (y1 == 2) {
                            segundalinha.opção42();
                        } else if (y1 == 3) {
                            segundalinha.opção43();
                        } else if (y1 == 4) {
                            segundalinha.opção44();
                        } else if (y1 == 5) {
                            segundalinha.opção45();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            segundalinha.opção46();
                        } else if (y1 == 2) {
                            segundalinha.opção47();
                        } else if (y1 == 3) {
                            segundalinha.opção48();
                        } else if (y1 == 4) {
                            segundalinha.opção49();
                        } else if (y1 == 5) {
                            segundalinha.opção50();
                        } else {
                            segundalinha.opção00();
                        }
                    }
                } else if (y == 3) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            segundalinha.opção51();
                        } else if (y1 == 2) {
                            segundalinha.opção52();
                        } else if (y1 == 3) {
                            segundalinha.opção53();
                        } else if (y1 == 4) {
                            segundalinha.opção54();

                        } else if (y1 == 5) {
                            segundalinha.opção55();
                        } else {
                            segundalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            segundalinha.opção56();
                        } else if (y1 == 2) {
                            segundalinha.opção57();
                        } else if (y1 == 3) {
                            segundalinha.opção58();
                        } else if (y1 == 4) {
                            segundalinha.opção59();
                        } else if (y1 == 5) {
                            segundalinha.opção60();
                        } else {
                            segundalinha.opção00();

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            segundalinha.opção61();
                        } else if (y1 == 2) {
                            segundalinha.opção62();
                        } else if (y1 == 3) {
                            segundalinha.opção63();
                        } else if (y1 == 4) {
                            segundalinha.opção64();
                        } else if (y1 == 5) {
                            segundalinha.opção65();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            segundalinha.opção66();
                        } else if (y1 == 2) {
                            segundalinha.opção67();
                        } else if (y1 == 3) {
                            segundalinha.opção68();
                        } else if (y1 == 4) {
                            segundalinha.opção69();
                        } else if (y1 == 5) {
                            segundalinha.opção70();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            segundalinha.opção71();
                        } else if (y1 == 2) {
                            segundalinha.opção72();
                        } else if (y1 == 3) {
                            segundalinha.opção73();
                        } else if (y1 == 4) {
                            segundalinha.opção74();
                        } else if (y1 == 5) {
                            segundalinha.opção75();
                        } else {
                            segundalinha.opção00();
                        }
                    }
                } else if (y == 4) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            segundalinha.opção76();
                        } else if (y1 == 2) {
                            segundalinha.opção77();
                        } else if (y1 == 3) {
                            segundalinha.opção78();
                        } else if (y1 == 4) {

                            segundalinha.opção79();
                        } else if (y1 == 5) {
                            segundalinha.opção80();
                        } else {
                            segundalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            segundalinha.opção81();
                        } else if (y1 == 2) {
                            segundalinha.opção82();

                        } else if (y1 == 3) {
                            segundalinha.opção83();
                        } else if (y1 == 4) {
                            segundalinha.opção84();
                        } else if (y1 == 5) {
                            segundalinha.opção85();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            segundalinha.opção86();
                        } else if (y1 == 2) {
                            segundalinha.opção87();
                        } else if (y1 == 3) {
                            segundalinha.opção88();
                        } else if (y1 == 4) {
                            segundalinha.opção89();
                        } else if (y1 == 5) {
                            segundalinha.opção90();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            segundalinha.opção91();
                        } else if (y1 == 2) {
                            segundalinha.opção92();
                        } else if (y1 == 3) {
                            segundalinha.opção93();
                        } else if (y1 == 4) {
                            segundalinha.opção94();
                        } else if (y1 == 5) {
                            segundalinha.opção95();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            segundalinha.opção96();
                        } else if (y1 == 2) {
                            segundalinha.opção97();
                        } else if (y1 == 4) {
                            segundalinha.opção98();
                        } else if (y1 == 5) {
                            segundalinha.opção99();
                        } else {
                            segundalinha.opção00();
                        }
                    }
                } else if (y == 5) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            segundalinha.opção100();
                        } else if (y1 == 2) {
                            segundalinha.opção101();
                        } else if (y1 == 3) {
                            segundalinha.opção102();
                        } else if (y1 == 4) {
                            segundalinha.opção103();

                        } else if (y1 == 5) {
                            segundalinha.opção104();
                        } else {
                            segundalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            segundalinha.opção105();
                        } else if (y1 == 2) {
                            segundalinha.opção106();
                        } else if (y1 == 3) {
                            segundalinha.opção107();
                        } else if (y1 == 4) {
                            segundalinha.opção108();
                        } else if (y1 == 5) {
                            segundalinha.opção109();
                        } else {

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            segundalinha.opção110();
                        } else if (y1 == 2) {
                            segundalinha.opção111();
                        } else if (y1 == 3) {
                            segundalinha.opção112();
                        } else if (y1 == 4) {
                            segundalinha.opção113();
                        } else if (y1 == 5) {
                            segundalinha.opção114();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            segundalinha.opção115();
                        } else if (y1 == 2) {
                            segundalinha.opção116();
                        } else if (y1 == 3) {
                            segundalinha.opção117();
                        } else if (y1 == 4) {
                            segundalinha.opção118();
                        } else if (y1 == 5) {
                            segundalinha.opção119();
                        } else {
                            segundalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            segundalinha.opção120();
                        } else if (y1 == 2) {
                            segundalinha.opção121();
                        } else if (y1 == 3) {
                            segundalinha.opção122();
                        } else if (y1 == 4) {
                            segundalinha.opção123();
                        } else if (y1 == 5) {
                            segundalinha.opção12();
                        } else {
                            segundalinha.opção00();
                        }
                    }
                }

            } else if (x == 3) {
                if (y == 1) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            terceiralinha.opção1();
                        } else if (y1 == 2) {
                            terceiralinha.opção2();
                        } else if (y1 == 3) {
                            terceiralinha.opção3();
                        } else if (y1 == 4) {
                            terceiralinha.opção4();

                        } else if (y1 == 5) {
                            terceiralinha.opção5();
                        } else {
                            terceiralinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            terceiralinha.opção6();
                        } else if (y1 == 2) {
                            terceiralinha.opção7();
                        } else if (y1 == 3) {
                            terceiralinha.opção8();
                        } else if (y1 == 4) {
                            terceiralinha.opção9();
                        } else if (y1 == 5) {
                            terceiralinha.opção10();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            terceiralinha.opção11();
                        } else if (y1 == 2) {
                            terceiralinha.opção12();
                        } else if (y1 == 3) {
                            terceiralinha.opção13();
                        } else if (y1 == 4) {
                            terceiralinha.opção14();
                        } else if (y1 == 5) {
                            terceiralinha.opção15();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            terceiralinha.opção16();
                        } else if (y1 == 2) {
                            terceiralinha.opção17();
                        } else if (y1 == 3) {
                            terceiralinha.opção18();
                        } else if (y1 == 4) {
                            terceiralinha.opção19();
                        } else if (y1 == 5) {
                            terceiralinha.opção20();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            terceiralinha.opção21();
                        } else if (y1 == 2) {
                            terceiralinha.opção22();
                        } else if (y1 == 3) {
                            terceiralinha.opção23();
                        } else if (y1 == 4) {
                            terceiralinha.opção24();
                        } else if (y1 == 5) {
                            terceiralinha.opção25();
                        } else {
                            terceiralinha.opção00();
                        }
                    }
                } else if (y == 2) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            terceiralinha.opção26();
                        } else if (y1 == 2) {
                            terceiralinha.opção27();
                        } else if (y1 == 3) {
                            terceiralinha.opção28();
                        } else if (y1 == 4) {

                            terceiralinha.opção29();
                        } else if (y1 == 5) {
                            terceiralinha.opção30();
                        } else {
                            terceiralinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            terceiralinha.opção31();
                        } else if (y1 == 2) {
                            terceiralinha.opção32();
                        } else if (y1 == 3) {
                            terceiralinha.opção33();
                        } else if (y1 == 4) {
                            terceiralinha.opção34();
                        } else if (y1 == 5) {
                            terceiralinha.opção35();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            terceiralinha.opção36();
                        } else if (y1 == 2) {
                            terceiralinha.opção37();
                        } else if (y1 == 3) {
                            terceiralinha.opção38();
                        } else if (y1 == 4) {
                            terceiralinha.opção39();
                        } else if (y1 == 5) {
                            terceiralinha.opção40();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            terceiralinha.opção41();
                        } else if (y1 == 2) {
                            terceiralinha.opção42();
                        } else if (y1 == 3) {
                            terceiralinha.opção43();
                        } else if (y1 == 4) {
                            terceiralinha.opção44();
                        } else if (y1 == 5) {
                            terceiralinha.opção45();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            terceiralinha.opção46();
                        } else if (y1 == 2) {
                            terceiralinha.opção47();
                        } else if (y1 == 3) {
                            terceiralinha.opção48();
                        } else if (y1 == 4) {
                            terceiralinha.opção49();
                        } else if (y1 == 5) {
                            terceiralinha.opção50();
                        } else {
                            terceiralinha.opção00();
                        }
                    }
                } else if (y == 3) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            terceiralinha.opção51();
                        } else if (y1 == 2) {
                            terceiralinha.opção52();
                        } else if (y1 == 3) {
                            terceiralinha.opção53();
                        } else if (y1 == 4) {
                            terceiralinha.opção54();

                        } else if (y1 == 5) {
                            terceiralinha.opção55();
                        } else {
                            terceiralinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            terceiralinha.opção56();
                        } else if (y1 == 2) {
                            terceiralinha.opção57();
                        } else if (y1 == 3) {
                            terceiralinha.opção58();
                        } else if (y1 == 4) {
                            terceiralinha.opção59();
                        } else if (y1 == 5) {
                            terceiralinha.opção60();
                        } else {
                            terceiralinha.opção00();

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            terceiralinha.opção61();
                        } else if (y1 == 2) {
                            terceiralinha.opção62();
                        } else if (y1 == 3) {
                            terceiralinha.opção63();
                        } else if (y1 == 4) {
                            terceiralinha.opção64();
                        } else if (y1 == 5) {
                            terceiralinha.opção65();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            terceiralinha.opção66();
                        } else if (y1 == 2) {
                            terceiralinha.opção67();
                        } else if (y1 == 3) {
                            terceiralinha.opção68();
                        } else if (y1 == 4) {
                            terceiralinha.opção69();
                        } else if (y1 == 5) {
                            terceiralinha.opção70();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            terceiralinha.opção71();
                        } else if (y1 == 2) {
                            terceiralinha.opção72();
                        } else if (y1 == 3) {
                            terceiralinha.opção73();
                        } else if (y1 == 4) {
                            terceiralinha.opção74();
                        } else if (y1 == 5) {
                            terceiralinha.opção75();
                        } else {
                            terceiralinha.opção00();
                        }
                    }
                } else if (y == 4) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            terceiralinha.opção76();
                        } else if (y1 == 2) {
                            terceiralinha.opção77();
                        } else if (y1 == 3) {
                            terceiralinha.opção78();
                        } else if (y1 == 4) {

                            terceiralinha.opção79();
                        } else if (y1 == 5) {
                            terceiralinha.opção80();
                        } else {
                            terceiralinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            terceiralinha.opção81();
                        } else if (y1 == 2) {
                            terceiralinha.opção82();

                        } else if (y1 == 3) {
                            terceiralinha.opção83();
                        } else if (y1 == 4) {
                            terceiralinha.opção84();
                        } else if (y1 == 5) {
                            terceiralinha.opção85();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            terceiralinha.opção86();
                        } else if (y1 == 2) {
                            terceiralinha.opção87();
                        } else if (y1 == 3) {
                            terceiralinha.opção88();
                        } else if (y1 == 4) {
                            terceiralinha.opção89();
                        } else if (y1 == 5) {
                            terceiralinha.opção90();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            terceiralinha.opção91();
                        } else if (y1 == 2) {
                            terceiralinha.opção92();
                        } else if (y1 == 3) {
                            terceiralinha.opção93();
                        } else if (y1 == 4) {
                            terceiralinha.opção94();
                        } else if (y1 == 5) {
                            terceiralinha.opção95();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            terceiralinha.opção96();
                        } else if (y1 == 2) {
                            terceiralinha.opção97();
                        } else if (y1 == 4) {
                            terceiralinha.opção98();
                        } else if (y1 == 5) {
                            terceiralinha.opção99();
                        } else {
                            terceiralinha.opção00();
                        }
                    }
                } else if (y == 5) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            terceiralinha.opção100();
                        } else if (y1 == 2) {
                            terceiralinha.opção101();
                        } else if (y1 == 3) {
                            terceiralinha.opção102();
                        } else if (y1 == 4) {
                            terceiralinha.opção103();

                        } else if (y1 == 5) {
                            terceiralinha.opção104();
                        } else {
                            terceiralinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            terceiralinha.opção105();
                        } else if (y1 == 2) {
                            terceiralinha.opção106();
                        } else if (y1 == 3) {
                            terceiralinha.opção107();
                        } else if (y1 == 4) {
                            terceiralinha.opção108();
                        } else if (y1 == 5) {
                            terceiralinha.opção109();
                        } else {

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            terceiralinha.opção110();
                        } else if (y1 == 2) {
                            terceiralinha.opção111();
                        } else if (y1 == 3) {
                            terceiralinha.opção112();
                        } else if (y1 == 4) {
                            terceiralinha.opção113();
                        } else if (y1 == 5) {
                            terceiralinha.opção114();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            terceiralinha.opção115();
                        } else if (y1 == 2) {
                            terceiralinha.opção116();
                        } else if (y1 == 3) {
                            terceiralinha.opção117();
                        } else if (y1 == 4) {
                            terceiralinha.opção118();
                        } else if (y1 == 5) {
                            terceiralinha.opção119();
                        } else {
                            terceiralinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            terceiralinha.opção120();
                        } else if (y1 == 2) {
                            terceiralinha.opção121();
                        } else if (y1 == 3) {
                            terceiralinha.opção122();
                        } else if (y1 == 4) {
                            terceiralinha.opção123();
                        } else if (y1 == 5) {
                            terceiralinha.opção124();
                        } else {
                            terceiralinha.opção00();
                        }
                    }
                }

            } else if (x == 4) {
                if (y == 1) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quartalinha.opção1();
                        } else if (y1 == 2) {
                            quartalinha.opção2();
                        } else if (y1 == 3) {
                            quartalinha.opção3();
                        } else if (y1 == 4) {
                            quartalinha.opção4();

                        } else if (y1 == 5) {
                            quartalinha.opção5();
                        } else {
                            quartalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quartalinha.opção6();
                        } else if (y1 == 2) {
                            quartalinha.opção7();
                        } else if (y1 == 3) {
                            quartalinha.opção8();
                        } else if (y1 == 4) {
                            quartalinha.opção9();
                        } else if (y1 == 5) {
                            quartalinha.opção10();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quartalinha.opção11();
                        } else if (y1 == 2) {
                            quartalinha.opção12();
                        } else if (y1 == 3) {
                            quartalinha.opção13();
                        } else if (y1 == 4) {
                            quartalinha.opção14();
                        } else if (y1 == 5) {
                            quartalinha.opção15();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quartalinha.opção16();
                        } else if (y1 == 2) {
                            quartalinha.opção17();
                        } else if (y1 == 3) {
                            quartalinha.opção18();
                        } else if (y1 == 4) {
                            quartalinha.opção19();
                        } else if (y1 == 5) {
                            quartalinha.opção20();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quartalinha.opção21();
                        } else if (y1 == 2) {
                            quartalinha.opção22();
                        } else if (y1 == 3) {
                            quartalinha.opção23();
                        } else if (y1 == 4) {
                            quartalinha.opção24();
                        } else if (y1 == 5) {
                            quartalinha.opção25();
                        } else {
                            quartalinha.opção00();
                        }
                    }
                } else if (y == 2) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quartalinha.opção26();
                        } else if (y1 == 2) {
                            quartalinha.opção27();
                        } else if (y1 == 3) {
                            quartalinha.opção28();
                        } else if (y1 == 4) {

                            quartalinha.opção29();
                        } else if (y1 == 5) {
                            quartalinha.opção30();
                        } else {
                            quartalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quartalinha.opção31();
                        } else if (y1 == 2) {
                            quartalinha.opção32();
                        } else if (y1 == 3) {
                            quartalinha.opção33();
                        } else if (y1 == 4) {
                            quartalinha.opção34();
                        } else if (y1 == 5) {
                            quartalinha.opção35();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quartalinha.opção36();
                        } else if (y1 == 2) {
                            quartalinha.opção37();
                        } else if (y1 == 3) {
                            quartalinha.opção38();
                        } else if (y1 == 4) {
                            quartalinha.opção39();
                        } else if (y1 == 5) {
                            quartalinha.opção40();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quartalinha.opção41();
                        } else if (y1 == 2) {
                            quartalinha.opção42();
                        } else if (y1 == 3) {
                            quartalinha.opção43();
                        } else if (y1 == 4) {
                            quartalinha.opção44();
                        } else if (y1 == 5) {
                            quartalinha.opção45();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quartalinha.opção46();
                        } else if (y1 == 2) {
                            quartalinha.opção47();
                        } else if (y1 == 3) {
                            quartalinha.opção48();
                        } else if (y1 == 4) {
                            quartalinha.opção49();
                        } else if (y1 == 5) {
                            quartalinha.opção50();
                        } else {
                            quartalinha.opção00();
                        }
                    }
                } else if (y == 3) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quartalinha.opção51();
                        } else if (y1 == 2) {
                            quartalinha.opção52();
                        } else if (y1 == 3) {
                            quartalinha.opção53();
                        } else if (y1 == 4) {
                            quartalinha.opção54();

                        } else if (y1 == 5) {
                            quartalinha.opção55();
                        } else {
                            quartalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quartalinha.opção56();
                        } else if (y1 == 2) {
                            quartalinha.opção57();
                        } else if (y1 == 3) {
                            quartalinha.opção58();
                        } else if (y1 == 4) {
                            quartalinha.opção59();
                        } else if (y1 == 5) {
                            quartalinha.opção60();
                        } else {
                            quartalinha.opção00();

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quartalinha.opção61();
                        } else if (y1 == 2) {
                            quartalinha.opção62();
                        } else if (y1 == 3) {
                            quartalinha.opção63();
                        } else if (y1 == 4) {
                            quartalinha.opção64();
                        } else if (y1 == 5) {
                            quartalinha.opção65();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quartalinha.opção66();
                        } else if (y1 == 2) {
                            quartalinha.opção67();
                        } else if (y1 == 3) {
                            quartalinha.opção68();
                        } else if (y1 == 4) {
                            quartalinha.opção69();
                        } else if (y1 == 5) {
                            quartalinha.opção70();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quartalinha.opção71();
                        } else if (y1 == 2) {
                            quartalinha.opção72();
                        } else if (y1 == 3) {
                            quartalinha.opção73();
                        } else if (y1 == 4) {
                            quartalinha.opção74();
                        } else if (y1 == 5) {
                            quartalinha.opção75();
                        } else {
                            quartalinha.opção00();
                        }
                    }
                } else if (y == 4) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quartalinha.opção76();
                        } else if (y1 == 2) {
                            quartalinha.opção77();
                        } else if (y1 == 3) {
                            quartalinha.opção78();
                        } else if (y1 == 4) {

                            quartalinha.opção79();
                        } else if (y1 == 5) {
                            quartalinha.opção80();
                        } else {
                            quartalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quartalinha.opção81();
                        } else if (y1 == 2) {
                            quartalinha.opção82();

                        } else if (y1 == 3) {
                            quartalinha.opção83();
                        } else if (y1 == 4) {
                            quartalinha.opção84();
                        } else if (y1 == 5) {
                            quartalinha.opção85();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quartalinha.opção86();
                        } else if (y1 == 2) {
                            quartalinha.opção87();
                        } else if (y1 == 3) {
                            quartalinha.opção88();
                        } else if (y1 == 4) {
                            quartalinha.opção89();
                        } else if (y1 == 5) {
                            quartalinha.opção90();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quartalinha.opção91();
                        } else if (y1 == 2) {
                            quartalinha.opção92();
                        } else if (y1 == 3) {
                            quartalinha.opção93();
                        } else if (y1 == 4) {
                            quartalinha.opção94();
                        } else if (y1 == 5) {
                            quartalinha.opção95();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quartalinha.opção96();
                        } else if (y1 == 2) {
                            quartalinha.opção97();
                        } else if (y1 == 4) {
                            quartalinha.opção98();
                        } else if (y1 == 5) {
                            quartalinha.opção99();
                        } else {
                            quartalinha.opção00();
                        }
                    }
                } else if (y == 5) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quartalinha.opção100();
                        } else if (y1 == 2) {
                            quartalinha.opção101();
                        } else if (y1 == 3) {
                            quartalinha.opção102();
                        } else if (y1 == 4) {
                            quartalinha.opção103();

                        } else if (y1 == 5) {
                            quartalinha.opção104();
                        } else {
                            quartalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quartalinha.opção105();
                        } else if (y1 == 2) {
                            quartalinha.opção106();
                        } else if (y1 == 3) {
                            quartalinha.opção107();
                        } else if (y1 == 4) {
                            quartalinha.opção108();
                        } else if (y1 == 5) {
                            quartalinha.opção109();
                        } else {

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quartalinha.opção110();
                        } else if (y1 == 2) {
                            quartalinha.opção111();
                        } else if (y1 == 3) {
                            quartalinha.opção112();
                        } else if (y1 == 4) {
                            quartalinha.opção113();
                        } else if (y1 == 5) {
                            quartalinha.opção114();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quartalinha.opção115();
                        } else if (y1 == 2) {
                            quartalinha.opção116();
                        } else if (y1 == 3) {
                            quartalinha.opção117();
                        } else if (y1 == 4) {
                            quartalinha.opção118();
                        } else if (y1 == 5) {
                            quartalinha.opção119();
                        } else {
                            quartalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quartalinha.opção120();
                        } else if (y1 == 2) {
                            quartalinha.opção121();
                        } else if (y1 == 3) {
                            quartalinha.opção122();
                        } else if (y1 == 4) {
                            quartalinha.opção123();
                        } else if (y1 == 5) {
                            quartalinha.opção12();
                        } else {
                            quartalinha.opção00();
                        }
                    }
                }

            } else if (x == 5) {
                if (y == 1) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quintalinha.opção1();
                        } else if (y1 == 2) {
                            quintalinha.opção2();
                        } else if (y1 == 3) {
                            quintalinha.opção3();
                        } else if (y1 == 4) {
                            quintalinha.opção4();

                        } else if (y1 == 5) {
                            quintalinha.opção5();
                        } else {
                            quintalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quintalinha.opção6();
                        } else if (y1 == 2) {
                            quintalinha.opção7();
                        } else if (y1 == 3) {
                            quintalinha.opção8();
                        } else if (y1 == 4) {
                            quintalinha.opção9();
                        } else if (y1 == 5) {
                            quintalinha.opção10();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quintalinha.opção11();
                        } else if (y1 == 2) {
                            quintalinha.opção12();
                        } else if (y1 == 3) {
                            quintalinha.opção13();
                        } else if (y1 == 4) {
                            quintalinha.opção14();
                        } else if (y1 == 5) {
                            quintalinha.opção15();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quintalinha.opção16();
                        } else if (y1 == 2) {
                            quintalinha.opção17();
                        } else if (y1 == 3) {
                            quintalinha.opção18();
                        } else if (y1 == 4) {
                            quintalinha.opção19();
                        } else if (y1 == 5) {
                            quintalinha.opção20();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quintalinha.opção21();
                        } else if (y1 == 2) {
                            quintalinha.opção22();
                        } else if (y1 == 3) {
                            quintalinha.opção23();
                        } else if (y1 == 4) {
                            quintalinha.opção24();
                        } else if (y1 == 5) {
                            quintalinha.opção25();
                        } else {
                            quintalinha.opção00();
                        }
                    }
                } else if (y == 2) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quintalinha.opção26();
                        } else if (y1 == 2) {
                            quintalinha.opção27();
                        } else if (y1 == 3) {
                            quintalinha.opção28();
                        } else if (y1 == 4) {

                            quintalinha.opção29();
                        } else if (y1 == 5) {
                            quintalinha.opção30();
                        } else {
                            quintalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quintalinha.opção31();
                        } else if (y1 == 2) {
                            quintalinha.opção32();
                        } else if (y1 == 3) {
                            quintalinha.opção33();
                        } else if (y1 == 4) {
                            quintalinha.opção34();
                        } else if (y1 == 5) {
                            quintalinha.opção35();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quintalinha.opção36();
                        } else if (y1 == 2) {
                            quintalinha.opção37();
                        } else if (y1 == 3) {
                            quintalinha.opção38();
                        } else if (y1 == 4) {
                            quintalinha.opção39();
                        } else if (y1 == 5) {
                            quintalinha.opção40();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quintalinha.opção41();
                        } else if (y1 == 2) {
                            quintalinha.opção42();
                        } else if (y1 == 3) {
                            quintalinha.opção43();
                        } else if (y1 == 4) {
                            quintalinha.opção44();
                        } else if (y1 == 5) {
                            quintalinha.opção45();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quintalinha.opção46();
                        } else if (y1 == 2) {
                            quintalinha.opção47();
                        } else if (y1 == 3) {
                            quintalinha.opção48();
                        } else if (y1 == 4) {
                            quintalinha.opção49();
                        } else if (y1 == 5) {
                            quintalinha.opção50();
                        } else {
                            quintalinha.opção00();
                        }
                    }
                } else if (y == 3) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quintalinha.opção51();
                        } else if (y1 == 2) {
                            quintalinha.opção52();
                        } else if (y1 == 3) {
                            quintalinha.opção53();
                        } else if (y1 == 4) {
                            quintalinha.opção54();

                        } else if (y1 == 5) {
                            quintalinha.opção55();
                        } else {
                            quintalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quintalinha.opção56();
                        } else if (y1 == 2) {
                            quintalinha.opção57();
                        } else if (y1 == 3) {
                            quintalinha.opção58();
                        } else if (y1 == 4) {
                            quintalinha.opção59();
                        } else if (y1 == 5) {
                            quintalinha.opção60();
                        } else {
                            quintalinha.opção00();

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quintalinha.opção61();
                        } else if (y1 == 2) {
                            quintalinha.opção62();
                        } else if (y1 == 3) {
                            quintalinha.opção63();
                        } else if (y1 == 4) {
                            quintalinha.opção64();
                        } else if (y1 == 5) {
                            quintalinha.opção65();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quintalinha.opção66();
                        } else if (y1 == 2) {
                            quintalinha.opção67();
                        } else if (y1 == 3) {
                            quintalinha.opção68();
                        } else if (y1 == 4) {
                            quintalinha.opção69();
                        } else if (y1 == 5) {
                            quintalinha.opção70();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quintalinha.opção71();
                        } else if (y1 == 2) {
                            quintalinha.opção72();
                        } else if (y1 == 3) {
                            quintalinha.opção73();
                        } else if (y1 == 4) {
                            quintalinha.opção74();
                        } else if (y1 == 5) {
                            quintalinha.opção75();
                        } else {
                            quintalinha.opção00();
                        }
                    }
                } else if (y == 4) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quintalinha.opção76();
                        } else if (y1 == 2) {
                            quintalinha.opção77();
                        } else if (y1 == 3) {
                            quintalinha.opção78();
                        } else if (y1 == 4) {

                            quintalinha.opção79();
                        } else if (y1 == 5) {
                            quintalinha.opção80();
                        } else {
                            quintalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quintalinha.opção81();
                        } else if (y1 == 2) {
                            quintalinha.opção82();

                        } else if (y1 == 3) {
                            quintalinha.opção83();
                        } else if (y1 == 4) {
                            quintalinha.opção84();
                        } else if (y1 == 5) {
                            quintalinha.opção85();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quintalinha.opção86();
                        } else if (y1 == 2) {
                            quintalinha.opção87();
                        } else if (y1 == 3) {
                            quintalinha.opção88();
                        } else if (y1 == 4) {
                            quintalinha.opção89();
                        } else if (y1 == 5) {
                            quintalinha.opção90();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quintalinha.opção91();
                        } else if (y1 == 2) {
                            quintalinha.opção92();
                        } else if (y1 == 3) {
                            quintalinha.opção93();
                        } else if (y1 == 4) {
                            quintalinha.opção94();
                        } else if (y1 == 5) {
                            quintalinha.opção95();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quintalinha.opção96();
                        } else if (y1 == 2) {
                            quintalinha.opção97();
                        } else if (y1 == 4) {
                            quintalinha.opção98();
                        } else if (y1 == 5) {
                            quintalinha.opção99();
                        } else {
                            quintalinha.opção00();
                        }
                    }
                } else if (y == 5) {
                    if (x1 == 1) {
                        if (y1 == 1) {
                            quintalinha.opção100();
                        } else if (y1 == 2) {
                            quintalinha.opção101();
                        } else if (y1 == 3) {
                            quintalinha.opção102();
                        } else if (y1 == 4) {
                            quintalinha.opção103();

                        } else if (y1 == 5) {
                            quintalinha.opção104();
                        } else {
                            quintalinha.opção00();
                        }

                    } else if (x1 == 2) {
                        if (y1 == 1) {
                            quintalinha.opção105();
                        } else if (y1 == 2) {
                            quintalinha.opção106();
                        } else if (y1 == 3) {
                            quintalinha.opção107();
                        } else if (y1 == 4) {
                            quintalinha.opção108();
                        } else if (y1 == 5) {
                            quintalinha.opção109();
                        } else {

                        }
                    } else if (x1 == 3) {
                        if (y1 == 1) {
                            quintalinha.opção110();
                        } else if (y1 == 2) {
                            quintalinha.opção111();
                        } else if (y1 == 3) {
                            quintalinha.opção112();
                        } else if (y1 == 4) {
                            quintalinha.opção113();
                        } else if (y1 == 5) {
                            quintalinha.opção114();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 4) {
                        if (y1 == 1) {
                            quintalinha.opção115();
                        } else if (y1 == 2) {
                            quintalinha.opção116();
                        } else if (y1 == 3) {
                            quintalinha.opção117();
                        } else if (y1 == 4) {
                            quintalinha.opção118();
                        } else if (y1 == 5) {
                            quintalinha.opção119();
                        } else {
                            quintalinha.opção00();
                        }
                    } else if (x1 == 5) {
                        if (y1 == 1) {
                            quintalinha.opção120();
                        } else if (y1 == 2) {
                            quintalinha.opção121();
                        } else if (y1 == 3) {
                            quintalinha.opção122();
                        } else if (y1 == 4) {
                            quintalinha.opção123();
                        } else if (y1 == 5) {
                            quintalinha.opção12();
                        } else {
                            quintalinha.opção00();
                        }
                    }
                }

            }
        }
    }

}
