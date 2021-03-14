package Manmohan_loves_pattern;
import java.util.Scanner;
class ManmohanPattern{
  public static void main(String[] or){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i, j;
    for(i = 0; i<n; ++i){
      if(i==0)
        System.out.println(1);
      else {
        for(j = 0; j<=i; j++){
          if(j==0 || j==i)
            System.out.print(i);
          else
            System.out.print(0);
        }
      System.out.println();
    }
  }
  }
}
