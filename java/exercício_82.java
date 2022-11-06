
import java.util.Arrays;
import java.util.Comparator;

public class exercício_82 {
         
    public static void main(String[] args) {  
        
        String palavra = "eu gosto de paralelepipedo";
        
        String longest = Arrays.stream(palavra.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        
        System.out.println(longest);
    
}
}
