package Print_Armstrong;
import java.util.Scanner;
import java.lang.Math;
class PrintArmstrong{
  public static void main(String[] rha){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    Armstrong(n1, n2);
  }
  static void Armstrong(int n1, int n2){
    for(int i = n1+1; i<n2;++i){
      int x = i;
      int n= 0;
      while(x!=0){
        x/= 10;
        ++n;
      }
     int power = 0;
     x = i;
     while(x!=0){
      int digit = x%10;
      power += Math.pow(digit, n);
      x/=10;
     }
     if(power==i){
      System.out.println(i+" ");
     }
    }     
  }
}
