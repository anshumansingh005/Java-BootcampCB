package Pattern_zeroes;
import java.util.Scanner;
class PatternZero{
  public static void main(String[] we){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<=n; i++){
      for(int j= 1; j<=i; j++){
          if((j==1)||(j==i))
            System.out.print(i+"\t");
          else
            System.out.print("0\t");
      }
      System.out.println();
    }
  }
}
