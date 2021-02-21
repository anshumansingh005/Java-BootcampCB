package LCM;
import java.util.Scanner;
public class LCM{

  public static void main(String[] arhs){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2= sc.nextInt();
   System.out.println(findLCM(n1, n2));
  }
  static public int findLCM(int a, int b){
    return(a/gcd(a,b))*b;
  }
  static int gcd(int a, int b){
    if(a == 0 )
        return b;
    return gcd(b%a, a);

  }
}
