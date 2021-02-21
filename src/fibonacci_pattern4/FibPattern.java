package fibonacci_pattern4;
import java.util.Scanner;
class FibPattern{
  public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);
    int row, col, a=0,b=1,sum = 0;
    int N = sc.nextInt();
    for(row = 1; row<=N; row++){
      for(col =1; col<= row; col++){
        System.out.print(a+" ");
        sum = a+b;
        a = b;
        b = sum;
      }
      System.out.println();
    }

  }
}
