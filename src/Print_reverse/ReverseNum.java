package Print_reverse;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long rev = 0;
        while (num>0) {
            long digit= num%10;
            rev = (rev * 10) + digit;

            num = num/10;
        }

        System.out.print(rev);
    }
}
