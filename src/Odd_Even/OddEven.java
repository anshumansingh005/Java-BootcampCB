package Odd_Even;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- >0){
            int sumEven = 0, sumOdd = 0;
            int CarNum = sc.nextInt();
            while(CarNum >0){

                int digit = CarNum%10;
                if((digit^1) == digit+1)    //True if carNum is even and False if odd
                    sumEven +=digit;
                else
                    sumOdd +=digit;
                CarNum /= 10;
            }

            if(sumEven%4 == 0|| sumOdd%3 ==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
