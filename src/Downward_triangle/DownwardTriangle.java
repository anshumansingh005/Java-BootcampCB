package Downward_triangle;
import java.util.Scanner;
class DownwardTriangle{
  public static void main(String[] r){
     Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        int csp=0;
        while(row<=n){
            for(int space=1;space<=csp;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=nst;star++){
                System.out.print(" *");
            }
            row++;
            nst=nst-1;
            csp++;
            System.out.println();
        }

  }
}
