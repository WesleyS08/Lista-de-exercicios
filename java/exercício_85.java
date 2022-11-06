
public class exercício_85 {
    int i = 16;
//String hexstr = Integer.toString(i, 16);


String hexstr = Integer.toHexString(i);

//ou (with leading zeroes and uppercase)


  public static void main(String args[]){
    int i = 16;
    System.out.print(Integer.toHexString( 0x10000 | i).substring(1).toUpperCase());
  }
}
