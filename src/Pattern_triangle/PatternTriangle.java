package Pattern_triangle;
import java.util.Scanner;
public class PatternTriangle {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
{
for(int space=i;space<=n-1;space++)
{
System.out.print("\t");
}
int j;
for(j=i;j<=2*i-1;j++){
  System.out.print(j+"\t");
}
j--;
for(;j>i;j--){
System.out.print(j-1 +"\t");
}
System.out.println();

}

    }
}
