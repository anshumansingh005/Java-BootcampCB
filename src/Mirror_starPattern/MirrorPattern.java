package Mirror_starPattern;
import java.util.Scanner;
public class MirrorPattern{
  public static void main(String[] er){
  // Your Code Here
     Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
    int i, j;
    int stars, spaces;
   
    
    
    stars = 1;
    spaces = rows/2;
    

    for(i=1; i<=rows; i++)  ///CHANGE
    {

        for(j=1; j<=spaces; j++)
            System.out.print("  ");   ///CHANGE
        
        
        for(j=1; j<stars*2; j++)
         System.out.print("* "); 
        
        System.out.println();
        
        if(i<=rows/2)  
        {
            spaces--;
            stars++;
        }
        else
        {
            spaces++;
            stars--;
        }
    }}
}
