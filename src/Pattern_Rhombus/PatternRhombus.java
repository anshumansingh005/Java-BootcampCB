package Pattern_Rhombus;
import java.util.Scanner;
class PatternRhombus{
  public static void main(String[] ar){
     Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nsp = n -1;
        int nst = 1;
        int val = 1;
        int row = 1;
        while (row <= 2*n-1) {
            int temp = val;
            for (int csp = 1; csp <= nsp; csp = csp + 1)
                System.out.print("  "+"\t");
            for (int cst = 1; cst <= nst; cst = cst + 1) {
                System.out.print(temp + "\t");
                if (cst <= nst / 2)
                    temp = temp + 1;
                else
                    temp = temp - 1;
            }
            System.out.println();
            if (row <n ) {
                nsp = nsp - 1;
                nst = nst + 2;
                val = val + 1;
            } else {
                nsp = nsp + 1;
                nst = nst - 2;
                val = val - 1;
            }
            row = row + 1;
}
  }
}
