package Sprial_Clockwise;
import java.util.Scanner;
public class SpiralClockwise {
    public static void Printing(int[][] arr) {
        int mincol = 0;
        int minrow = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;

        while(minrow<=maxrow && mincol<=maxcol) {
            for(int col = mincol; col<=maxcol; col++)
                System.out.print(arr[minrow][col] + ", ");
            minrow++;

            for(int row=minrow; row<=maxrow; row++)
            {
                System.out.print(arr[row][maxcol]+", ");

            }
            maxcol--;
            if(minrow<=maxrow){
                for(int col=maxcol; col>=mincol; col--)
                {
                    System.out.print(arr[maxrow][col]+", ");

                }
                maxrow--;}
            if(mincol<=maxcol){
                for(int row=maxrow; row>=minrow; row--)
                {
                    System.out.print(arr[row][mincol]+", ");

                }
                mincol++;}
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        Printing(arr);
    }
}