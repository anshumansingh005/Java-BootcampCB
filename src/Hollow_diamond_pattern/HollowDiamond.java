import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int nst = (n/2) + 1;
    int nsp = -1;
    int rows = 1;
    while(rows <= n){
      int cst =1;
      while(cst <= nst){
        System.out.print("*\t");
        cst++;
      }
      int csp =1;
        while(csp<= nsp){
          System.out.print(" \t");
          csp++;
        }

      cst = 1;
      if(rows == 1 || rows == n)
		 	cst = 2;

        while(cst <= nst){
          System.out.print("*\t");
          cst++;
        }
         if(rows <= n/2){ 
            nsp += 2;
            nst--;
        }
		else{
            nsp -= 2;
            nst++;
        }
        rows++;
        System.out.println();
    }
  }
}
