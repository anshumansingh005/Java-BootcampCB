package Print_Primes;
import java.util.Scanner;
import java.lang.Math;

public class PrintPrimes{
 public static void main(String args[]){   
    Scanner sc = new Scanner(System.in);
        
    int a  = 2, b, i, j,flag;
    
    b = sc.nextInt(); 
    if (a == 1) {
        System.out.println(a);
        a++;
        if (b >= 2) {
            System.out.println(a);
            a++;
        }
    }
    if (a == 2)
        System.out.println(a);
    if (a % 2 == 0)
        a++;
    for (i = a; i <= b; i = i + 2) {
 
         flag = 1;
           for (j = 2; j * j <= i; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
     if (flag == 1)
            System.out.println(i);
    }
}

}
