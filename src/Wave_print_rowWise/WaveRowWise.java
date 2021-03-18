package Wave_print_rowWise;
import java.util.Scanner;
public class WaveRowWise {
    public static void waveDisplay(int[][] a){
        for (int i=0; i< a.length; i++){
            if (i%2==0 || i==0)
            {
                for (int j=0; j<a[0].length; j++)
                    System.out.print(a[i][j]+", ");
            }
            else
            {
                for (int j= a[0].length-1; j>=0; j--)
                    System.out.print(a[i][j]+", ");
            }
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m>=1 && m<=10 && n>=1 && n<=10) {
            int[][] a = new int[m][n];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            waveDisplay(a);
        }
    }
}
