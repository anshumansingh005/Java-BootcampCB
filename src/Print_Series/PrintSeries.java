package Print_Series;
import java.util.Scanner;
public class PrintSeries{
  public static void main(String[] we){
    Scanner sc = new Scanner(System.in);
    int n1= sc.nextInt();
    int n2 = sc.nextInt();
    int i = 1, count = 0;
    while(count<n1){
      int num = (3*i)+2;
      i++;
      if((num% n2) ==0){ }

      else{
        System.out.println(num);
        count++;
      }
    }
  }
}
