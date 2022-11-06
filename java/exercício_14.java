import java.util.Scanner;
import java.lang.Math;

public class exercício_14 {

   public static void main(String[] args) {
    try (Scanner b  = new Scanner(System.in)) {
    int distancia, velocidade; 
    System.out.print("Digite a distancia em metros: ");
    distancia = b.nextInt();
    System.out.print("Digite a velocidade permitida na rua: ");
    velocidade  = b.nextInt();

    double v = velocidade / 3.6;
    double velocidademedia  = (Math.pow(v, 2)- Math.pow(0 , 2)) /2 ; 
    double tempo = 2 *(velocidademedia - 0)/1;
    double t1 = Math.sqrt(tempo);
    double dis = (distancia / t1) - 3; 
    
    if (dis >= 60){
        double dist = dis / 60;
        System.out.print("O semaforo deve abrir: "+ dist +"minutos antes" );
    }else{
        System.out.print("O semaforo deve abrir: "+ dis +"s antes" );
    }


    
}
   }
}
