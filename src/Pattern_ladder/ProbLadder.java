package Pattern_ladder;
import java.util.*;
public class ProbLadder {
    public static void main(String args[]) {
        // Your Code Here
   Scanner sc = new Scanner(System.in)     ;
   int N = sc.nextInt();
int i, j, k = 1;  

for (i = 1; i <= N; i++)   
{  

for (j = 1; j< i + 1; j++)   
{  
System.out.print(k++ + " ");  
}  

System.out.println();  
}  
    }
}

