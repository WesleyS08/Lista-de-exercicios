import java.util.Scanner;

public class exercício_13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            float r1, r2, rp, r;
            
            System.out.println("DIGITE PRIMEIRO NUMERO:");
            r1 = scan.nextFloat();
            
            System.out.println("DIGITE SEGUNDO NUMERO:");
            r2 = scan.nextFloat();
            
            System.out.println("DIGITE TERCEIRO NUMERO:");
            float r3 = scan.nextFloat();
            
            rp = 1 / r1 + 1 / r2;
        
        
            rp = 1 / rp;
        
        
            r = rp + r3;
        
            System.out.println("A RESISTENCIA Ã‰: " + r);
        }
}
}
