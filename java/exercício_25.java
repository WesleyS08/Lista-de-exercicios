import java.util.Scanner;

public class exercício_25 {

   Scanner leitor = new Scanner(System.in);
   {

      System.out.println("Digite o mes que deseja saber a quantidade de dias: ");
      int mes = leitor.nextInt();

      if (mes == 1) {
         System.out.println("O mes de JANEIRO (1), possui 31 dias");
      } else if (mes == 2) {

         System.out.println("O mes de FEVEREIRO (2), possui 28 ou 29 dias");
      } else if (mes == 3) {

         System.out.println("O mes de MARÇO (3), possui 31 dias");
      } else if (mes == 4) {

         System.out.println("O mes de ABRIL (4), possui 30 dias");
      } else if (mes == 5) {

         System.out.println("O mes de MAIO (5), possui 31 dias");
      } else if (mes == 6) {

         System.out.println("O mes de JUNHO (6), possui 30 dias");
      } else if (mes == 7) {

         System.out.println("O mes de JULHO (7), possui 31 dias");
      } else if (mes == 8) {

         System.out.println("O mes de AGOSTO (8), possui 31 dias");
      } else if (mes == 9) {

         System.out.println("O mes de SETEMBRO (9), possui 30 dias");
      } else if (mes == 10) {

         System.out.println("O mes de OUTUBRO (10), possui 31 dias");
      } else if (mes == 11) {

         System.out.println("O mes de NOVEMBRO (11), possui 30 dias");
      } else if (mes == 12) {

         System.out.println("O mes de DEZEMBRO (12), possui 31 dias");
      } else {
         System.out.println("O ano só tem 12 mes");
      }

   }
}
