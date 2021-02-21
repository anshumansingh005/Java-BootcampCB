package nthFibbonacci;
import java.util.Scanner;
public class nthFib{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      System.out.println(fib(N));
  }

  static int fib(int n){
    if(n<=1)
        return n;
    return fib(n-1)+fib(n-2);
  }
}
