package Inverted_Hourglass;
import java.util.Scanner;
public class Hourglass{
    public static void main(String[] arg) {
      Scanner sc = new Scanner(System.in);
int i,j;
	int n= sc.nextInt();
	
	int k;
   for(i=0;i<=n*2;i++)
    {
        for(j=n;j>0;j--)
        {
            if(i>=(n-j) && i<=(n+j))
            System.out.print(j+ " ");
            else
            System.out.print("  ");
        }
        for(j=n-1;j>=i;j--)
        {
            System.out.print("  ");
		}
        for(j=n;j<i;j++)
        {
            System.out.print("  ");
        }
        if(i<=5)
        k=Math.abs(n-i);
        else
        k=Math.abs(i-n);
        for(j=n;j>=0;j--)
        {
            if(i>=(n-j) && i<=(n+j))
            {
              System.out.print( k+ " ");
                k++;
            }
        }

        System.out.println();
    }
    }
}
