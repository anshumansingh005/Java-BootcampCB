package Pascal_triangle;
import java.util.Scanner;
class PascalTriangle{
  public static void main(String[] we){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printTriangle(n);
  }

  static void printTriangle(int n){
    for(int line = 1; line<=n; line++){
      int c = 1;
      for(int i =1 ; i<=line; i++){
        System.out.print(c + "\t");
        c = c * (line-i) / i;
      }
      System.out.println();
    }
  }
}
