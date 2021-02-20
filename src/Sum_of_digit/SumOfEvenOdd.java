package Sum_of_digit;
import java.util.Scanner;
public class SumOfEvenOdd{
  public static void main(String[] arhs){
    Scanner sc = new Scanner(System.in);  
    int N = sc.nextInt();
    sumOfDigits(N);
  }  
 public static void sumOfDigits(int N){
    int sumEven=0, sumOdd = 0,digitPlace = 1;
    while(N>0){
      int rem = N%10;
      if(digitPlace%2==0)
          sumEven += rem;
      else 
        sumOdd += rem;
      digitPlace++;
      N = N/10;
    }
    System.out.println(sumOdd);
    System.out.println(sumEven);
 }
}
