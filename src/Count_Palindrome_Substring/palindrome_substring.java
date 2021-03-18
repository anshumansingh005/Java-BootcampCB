package Count_Palindrome_Substring;
import java.util.Scanner;
class palindrome_substring{
  public static void main(String[] sta){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(palindrome(str));
  }

  public static int palindrome(String str){
    int count = 0;
    for(int axis = 0; axis< str.length(); axis ++) {
      for (int orbit = 0; axis - orbit >= 0 && orbit + axis < str.length(); orbit++) {
        if (str.charAt(axis - orbit) == str.charAt(axis + orbit))
          count++;
        else
          break;
      }
    }
    for(double axis = 0.5; axis<str.length(); axis++){
      for(double orbit = 0.5; axis-orbit>=0&& axis+orbit<str.length();orbit++){
      if(str.charAt((int)(axis -orbit))==str.charAt((int)(axis+orbit)))
        count++;
      else
        break;
      }
    }
    return count;
  }

}
