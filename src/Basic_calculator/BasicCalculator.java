package Basic_calculator;
import java.util.Scanner;
public class BasicCalculator{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    char ch;
    do{
      ch = sc.next().charAt(0);
      if(ch == '+'||ch== '-'|| ch=='*' || ch =='%'||ch == '/'){
        operation(ch);        
      } else {
        if(ch!='x'&& ch!='X')
          System.out.println("Invalid operation");
        }
    } while(ch!='x' && ch!='X');

  }

  public static void operation(char ch){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int res = 0;
    switch(ch){
      case '-':{
        res = a-b;
        break;
      }
      case '+': {
        res = a+b;
        break;
      }
      case '*' :{
        res = a*b;
        break;
      }
      case '/' :{
        res = a/b;
        break;
     }
     case '%':{
       res = a%b;
       break;
        }
    }
    System.out.println(res);
  }
}
