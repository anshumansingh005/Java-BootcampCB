package Shopping_game;
import java.util.Scanner;
public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- >0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int count = 0, AyushSum = 0, HarshitSum = 0;

            while(true){
                int Ayush = count*2+ 1;
                int Harshit = 2*count + 2;

                if(AyushSum<M)
                    AyushSum = Ayush + AyushSum;
                else {
                    System.out.println("Harshit");
                    break;
                }
                if(HarshitSum< N)
                    HarshitSum = HarshitSum + Harshit;
                else {
                    System.out.println("Aayush");
                    break;
                }
                count++;
            }
        }
    }
}
