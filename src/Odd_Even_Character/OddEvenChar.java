package Odd_Even_Character;
import java.util.Scanner;
public class OddEvenChar {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word= str.toCharArray();
        for(int i=0;i<word.length;i++)
        {
            if(i%2==0)
                System.out.print((char)(word[i]+1));
            else
                System.out.print((char)(word[i]-1));
        }
    }
}
