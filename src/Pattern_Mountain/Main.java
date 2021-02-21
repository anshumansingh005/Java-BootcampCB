import java.util.*;
public class Main {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
    int i, j, k = 1;
    int n = sc.nextInt();
   
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
            {
                System.out.print(k + "  ");
                k++;
            }
        for (j = 1; j <= 2*n - 1 - 2*i; j++)
            System.out.print("  ");
        for (j = 1; j <= i; j++)
            {
                k--;
                if (k == n)
                    continue;
               System.out.print(k + "  ");
            }
        System.out.println();
    }
    }
}
