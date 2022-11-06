import java.util.Scanner;

public class exercício_28 {
    public static void main(String []args){ 
		   

        System.out.println("introduza a letra:"); 
        try (Scanner read = new Scanner(System.in)) {
            String N=read.next();
            char c=N.charAt(0);
     
            System.out.println(N);

             switch(c){ 

            case'a': 
            case'e': 
            case'i': 
            case'o': 
            case'u': 

               System.out.println("a letra "+N+" é uma vogal"); 
               break; 
              default: 
               System.out.println("a letra "+N+" é uma consoante"); 
              }
        } 

      }
}
