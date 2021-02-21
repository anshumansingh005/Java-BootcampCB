import java.util.*;

public class Lower1{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char a = sc.next().charAt(0);
    int s = a;
    if(s>='a' && s<='z'){
      System.out.print("LOWERCASE");
    }
     else if(s>='A' && s<='Z'){
      System.out.print("UPPERCASE");

     }
    else
      System.out.print("Invalid");
    }
}
