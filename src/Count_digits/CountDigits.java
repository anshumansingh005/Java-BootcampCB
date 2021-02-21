package Count_digits;
import java.util.Scanner;
class CountDigits{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int digit = sc.nextInt();
    int sum = 0, rem;
    while(n>0){
      rem = n%10;
      if(rem == digit)
        sum++;
      n /=10;
    }
    System.out.println(sum);
  }
}
