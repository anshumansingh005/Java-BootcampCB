package Simple_Input;
import java.util.Scanner;
public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum>=0){
            int input = sc.nextInt();
            sum = sum + input;
            if (sum<0)
                break;
            System.out.println(input);
        }
    }
}
